package defpackage;

import java.net.ProtocolException;

/* compiled from: PG */
/* renamed from: orz  reason: default package */
/* loaded from: classes2.dex */
final class orz implements ovn {
    final /* synthetic */ osc a;
    private final oux b;
    private boolean c;
    private long d;

    public orz(osc oscVar, long j) {
        this.a = oscVar;
        this.b = new oux(oscVar.d.a());
        this.d = j;
    }

    @Override // defpackage.ovn
    public final ovr a() {
        return this.b;
    }

    @Override // defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.d > 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        osc.k(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.ovn, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }

    @Override // defpackage.ovn
    public final void ik(our ourVar, long j) {
        if (!this.c) {
            oqs.B(ourVar.b, j);
            if (j > this.d) {
                throw new ProtocolException("expected " + this.d + " bytes but received " + j);
            }
            this.a.d.ik(ourVar, j);
            this.d -= j;
            return;
        }
        throw new IllegalStateException("closed");
    }
}
