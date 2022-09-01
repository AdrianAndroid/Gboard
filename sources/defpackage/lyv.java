package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: lyv  reason: default package */
/* loaded from: classes.dex */
public final class lyv extends FilterInputStream implements InputStreamRetargetInterface {
    public long a;
    private long b = -1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyv(InputStream inputStream) {
        super(inputStream);
        jdg.u(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.b = this.a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.a++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.in.markSupported()) {
            if (this.b == -1) {
                throw new IOException("Mark not set");
            }
            this.in.reset();
            this.a = this.b;
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.a += skip;
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
            this.a += read;
        }
        return read;
    }
}
