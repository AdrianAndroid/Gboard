package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: kix  reason: default package */
/* loaded from: classes.dex */
public final class kix implements kja {
    public final ContentResolver b;
    public final Uri c;
    public volatile Map e;
    private final ContentObserver h;
    private static final Map g = new qo();
    public static final String[] a = {"key", "value"};
    public final Object d = new Object();
    public final List f = new ArrayList();

    private kix(ContentResolver contentResolver, Uri uri) {
        kiw kiwVar = new kiw(this);
        this.h = kiwVar;
        jdg.u(contentResolver);
        jdg.u(uri);
        this.b = contentResolver;
        this.c = uri;
        contentResolver.registerContentObserver(uri, false, kiwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        synchronized (kix.class) {
            for (kix kixVar : g.values()) {
                kixVar.b.unregisterContentObserver(kixVar.h);
            }
            g.clear();
        }
    }

    public static kix c(ContentResolver contentResolver, Uri uri) {
        kix kixVar;
        synchronized (kix.class) {
            Map map = g;
            kixVar = (kix) map.get(uri);
            if (kixVar == null) {
                try {
                    kix kixVar2 = new kix(contentResolver, uri);
                    try {
                        map.put(uri, kixVar2);
                    } catch (SecurityException unused) {
                    }
                    kixVar = kixVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return kixVar;
    }

    @Override // defpackage.kja
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        Map map2 = this.e;
        if (map2 == null) {
            synchronized (this.d) {
                map2 = this.e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) kki.c(new kiz() { // from class: kiv
                            @Override // defpackage.kiz
                            public final Object a() {
                                Map hashMap;
                                kix kixVar = kix.this;
                                Cursor query = kixVar.b.query(kixVar.c, kix.a, null, null, null);
                                if (query == null) {
                                    return Collections.emptyMap();
                                }
                                try {
                                    int count = query.getCount();
                                    if (count == 0) {
                                        return Collections.emptyMap();
                                    }
                                    if (count <= 256) {
                                        hashMap = new qo(count);
                                    } else {
                                        hashMap = new HashMap(count, 1.0f);
                                    }
                                    while (query.moveToNext()) {
                                        hashMap.put(query.getString(0), query.getString(1));
                                    }
                                    query.close();
                                    return hashMap;
                                } finally {
                                    query.close();
                                }
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.e = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return (String) map2.get(str);
    }
}
