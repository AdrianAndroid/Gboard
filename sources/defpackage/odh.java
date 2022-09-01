package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: odh  reason: default package */
/* loaded from: classes2.dex */
final class odh extends InputStream implements InputStreamRetargetInterface, nts {
    private final odg a;

    public odh(odg odgVar) {
        jdg.Q(odgVar, "buffer");
        this.a = odgVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((nze) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read() {
        odg odgVar = this.a;
        if (((nze) odgVar).a == 0) {
            return -1;
        }
        return odgVar.e();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int min = (int) Math.min(((nze) this.a).a, j);
        this.a.l(min);
        return min;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = ((nze) this.a).a;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i3, i2);
        this.a.k(bArr, i, min);
        return min;
    }
}
