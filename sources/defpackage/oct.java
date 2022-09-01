package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: oct  reason: default package */
/* loaded from: classes2.dex */
final class oct extends FilterInputStream implements InputStreamRetargetInterface {
    private final int a;
    private final ofg b;
    private long c;
    private long d;
    private long e = -1;

    public oct(InputStream inputStream, int i, ofg ofgVar) {
        super(inputStream);
        this.a = i;
        this.b = ofgVar;
    }

    private final void a() {
        if (this.d > this.c) {
            this.b.i();
            this.c = this.d;
        }
    }

    private final void b() {
        if (this.d <= this.a) {
            return;
        }
        nvu nvuVar = nvu.i;
        throw nvuVar.f("Decompressed gRPC message exceeds maximum size " + this.a).h();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.d++;
        }
        b();
        a();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.in.markSupported()) {
            if (this.e == -1) {
                throw new IOException("Mark not set");
            }
            this.in.reset();
            this.d = this.e;
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.d += skip;
        b();
        a();
        return skip;
    }

    @Override // j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.d += read;
        }
        b();
        a();
        return read;
    }
}
