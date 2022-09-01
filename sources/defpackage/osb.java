package defpackage;

/* compiled from: PG */
/* renamed from: osb  reason: default package */
/* loaded from: classes2.dex */
final class osb extends orw {
    private boolean e;

    public osb(osc oscVar) {
        super(oscVar);
    }

    @Override // defpackage.orw, defpackage.ovp
    public final long b(our ourVar, long j) {
        if (!this.b) {
            if (this.e) {
                return -1L;
            }
            long b = super.b(ourVar, 8192L);
            if (b != -1) {
                return b;
            }
            this.e = true;
            c(true, null);
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.e) {
            c(false, null);
        }
        this.b = true;
    }
}
