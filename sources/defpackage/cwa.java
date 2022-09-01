package defpackage;

import android.net.Uri;
import android.os.CancellationSignal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: cwa  reason: default package */
/* loaded from: classes.dex */
final class cwa implements avj {
    private final idk a;
    private final Uri b;
    private final CancellationSignal c = new CancellationSignal();
    private final jls d;

    public cwa(jls jlsVar, idk idkVar, Uri uri, byte[] bArr, byte[] bArr2) {
        this.d = jlsVar;
        this.a = idkVar;
        this.b = uri;
    }

    @Override // defpackage.avj
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.avj
    public final void d() {
    }

    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        idn a = this.a.a(ctg.BITMOJI_IMAGE_OPEN_INPUTSTREAM);
        try {
            try {
                InputStream k = this.d.k(this.b, this.c);
                try {
                    ByteBuffer c = bfw.c(k);
                    k.close();
                    a.a();
                    this.a.e(ctd.BITMOJI_IMAGE_OPEN_INPUTSTREAM, true);
                    aviVar.b(c);
                } catch (Throwable th) {
                    try {
                        k.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } finally {
                a.a();
            }
        } catch (IOException | RuntimeException e) {
            this.a.e(ctd.BITMOJI_IMAGE_OPEN_INPUTSTREAM, false);
            aviVar.e(e);
        }
    }

    @Override // defpackage.avj
    public final void fh() {
        this.c.cancel();
    }

    @Override // defpackage.avj
    public final int g() {
        return 2;
    }
}
