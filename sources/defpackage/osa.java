package defpackage;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osa  reason: default package */
/* loaded from: classes2.dex */
public final class osa extends orw {
    private long e;

    public osa(osc oscVar, long j) {
        super(oscVar);
        this.e = j;
        if (j == 0) {
            c(true, null);
        }
    }

    @Override // defpackage.orw, defpackage.ovp
    public final long b(our ourVar, long j) {
        if (!this.b) {
            long j2 = this.e;
            if (j2 == 0) {
                return -1L;
            }
            long b = super.b(ourVar, Math.min(j2, 8192L));
            if (b == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c(false, protocolException);
                throw protocolException;
            }
            long j3 = this.e - b;
            this.e = j3;
            if (j3 == 0) {
                c(true, null);
            }
            return b;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.e != 0 && !oqs.C(this, TimeUnit.MILLISECONDS)) {
            c(false, null);
        }
        this.b = true;
    }
}
