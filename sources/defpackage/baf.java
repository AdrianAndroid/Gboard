package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: baf  reason: default package */
/* loaded from: classes.dex */
final class baf implements avj {
    private static final String[] a = {"_data"};
    private final Context b;
    private final azn c;
    private final azn d;
    private final Uri e;
    private final int f;
    private final int g;
    private final ava h;
    private final Class i;
    private volatile boolean j;
    private volatile avj k;

    public baf(Context context, azn aznVar, azn aznVar2, Uri uri, int i, int i2, ava avaVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = aznVar;
        this.d = aznVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = avaVar;
        this.i = cls;
    }

    @Override // defpackage.avj
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.avj
    public final void d() {
        avj avjVar = this.k;
        if (avjVar != null) {
            avjVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [avj] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        Uri uri;
        fws b;
        try {
            ?? r4 = 0;
            Cursor cursor = null;
            if (!Environment.isExternalStorageLegacy()) {
                if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(this.e);
                } else {
                    uri = this.e;
                }
                b = this.d.b(uri, this.f, this.g, this.h);
            } else {
                azn aznVar = this.c;
                Uri uri2 = this.e;
                try {
                    Cursor query = this.b.getContentResolver().query(uri2, a, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    String valueOf = String.valueOf(uri2);
                                    throw new FileNotFoundException("File path was empty in media store for: " + valueOf);
                                }
                                File file = new File(string);
                                query.close();
                                b = aznVar.b(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    String valueOf2 = String.valueOf(uri2);
                    throw new FileNotFoundException("Failed to media store entry for: " + valueOf2);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (b != null) {
                r4 = b.a;
            }
            if (r4 == 0) {
                String valueOf3 = String.valueOf(this.e);
                aviVar.e(new IllegalArgumentException("Failed to build fetcher for: " + valueOf3));
                return;
            }
            this.k = r4;
            if (this.j) {
                fh();
            } else {
                r4.f(atkVar, aviVar);
            }
        } catch (FileNotFoundException e) {
            aviVar.e(e);
        }
    }

    @Override // defpackage.avj
    public final void fh() {
        this.j = true;
        avj avjVar = this.k;
        if (avjVar != null) {
            avjVar.fh();
        }
    }

    @Override // defpackage.avj
    public final int g() {
        return 1;
    }
}
