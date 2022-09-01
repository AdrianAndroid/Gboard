package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* renamed from: ouh  reason: default package */
/* loaded from: classes2.dex */
final class ouh extends OutputStream {
    final /* synthetic */ long a;
    final /* synthetic */ ous b;
    final /* synthetic */ oui c;
    private long d;

    public ouh(oui ouiVar, long j, ous ousVar) {
        this.c = ouiVar;
        this.a = j;
        this.b = ousVar;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.c.f) {
            return;
        }
        this.b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.f = true;
        long j = this.a;
        if (j == -1 || this.d >= j) {
            this.b.close();
            return;
        }
        long j2 = this.a;
        long j3 = this.d;
        throw new ProtocolException("expected " + j2 + " bytes but received " + j3);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (!this.c.f) {
            long j = this.a;
            if (j == -1 || this.d + i2 <= j) {
                this.d += i2;
                try {
                    this.b.L(bArr, i, i2);
                    return;
                } catch (InterruptedIOException e) {
                    throw new SocketTimeoutException(e.getMessage());
                }
            }
            throw new ProtocolException("expected " + this.a + " bytes but received " + this.d + i2);
        }
        throw new IOException("closed");
    }
}
