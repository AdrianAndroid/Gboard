package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: kph  reason: default package */
/* loaded from: classes.dex */
public final class kph implements kaz {
    private final Uri a;
    private final kcq b;

    public kph(kcq kcqVar, Uri uri, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = kcqVar;
        this.a = uri;
    }

    @Override // defpackage.kaz
    public final long a() {
        return this.b.o(this.a);
    }

    @Override // defpackage.kaz
    public final void b(InputStream inputStream, long j, long j2) {
        koo b;
        long o = this.b.o(this.a);
        if (j > o) {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j), Long.valueOf(o)));
        }
        if (j > 0) {
            b = new kpl(0);
        } else {
            b = kps.b();
        }
        OutputStream outputStream = (OutputStream) this.b.q(this.a, b);
        try {
            lyp.b(inputStream, outputStream);
            if (outputStream == null) {
                return;
            }
            outputStream.close();
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }
}
