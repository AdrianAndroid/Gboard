package defpackage;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.inputmethod.latin.R;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: aje  reason: default package */
/* loaded from: classes.dex */
public final class aje extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() == null) {
                return true;
            }
            if (ajd.a == null) {
                synchronized (ajd.b) {
                    if (ajd.a == null) {
                        ajd.a = new ajd(context);
                    }
                }
            }
            Class<?> cls = getClass();
            ajd ajdVar = ajd.a;
            try {
                Bundle bundle = ajdVar.e.getPackageManager().getProviderInfo(new ComponentName(ajdVar.e, cls), 128).metaData;
                String string = ajdVar.e.getString(R.string.f147940_resource_name_obfuscated_res_0x7f14004a);
                if (bundle == null) {
                    return true;
                }
                try {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls2 = Class.forName(str);
                            if (ajf.class.isAssignableFrom(cls2)) {
                                ajdVar.d.add(cls2);
                            }
                        }
                    }
                    for (Class cls3 : ajdVar.d) {
                        ajdVar.a(cls3, hashSet);
                    }
                    return true;
                } catch (ClassNotFoundException e) {
                    throw new ajg(e);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                throw new ajg(e2);
            }
        }
        throw new ajg();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
