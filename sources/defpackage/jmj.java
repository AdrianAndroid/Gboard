package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* renamed from: jmj  reason: default package */
/* loaded from: classes.dex */
public final class jmj implements koo {
    private final Uri a;

    public jmj(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.koo
    public final /* bridge */ /* synthetic */ Object a(kon konVar) {
        Object obj = konVar.f;
        try {
            kpo b = kpo.b();
            b.a = true;
            ZipInputStream zipInputStream = new ZipInputStream(b.a(konVar));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    Uri build = this.a.buildUpon().appendPath(kez.h(nextEntry)).build();
                    if (nextEntry.isDirectory()) {
                        ((kcq) obj).r(build);
                    } else {
                        OutputStream outputStream = (OutputStream) ((kcq) obj).q(build, kps.b());
                        try {
                            lyp.b(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (Throwable th) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                            }
                            throw th;
                        }
                    }
                } else {
                    zipInputStream.close();
                    return null;
                }
            }
        } catch (IOException e) {
            ((kcq) obj).x(this.a);
            throw e;
        }
    }
}
