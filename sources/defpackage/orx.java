package defpackage;

/* compiled from: PG */
/* renamed from: orx  reason: default package */
/* loaded from: classes2.dex */
final class orx implements ovn {
    final /* synthetic */ osc a;
    private final oux b;
    private boolean c;

    public orx(osc oscVar) {
        this.a = oscVar;
        this.b = new oux(oscVar.d.a());
    }

    @Override // defpackage.ovn
    public final ovr a() {
        return this.b;
    }

    @Override // defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.d.aa("0\r\n\r\n");
        osc.k(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.ovn, java.io.Flushable
    public final synchronized void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }

    @Override // defpackage.ovn
    public final void ik(our ourVar, long j) {
        if (!this.c) {
            ovh ovhVar = (ovh) this.a.d;
            if (!ovhVar.c) {
                ovhVar.b.V(j);
                ovhVar.T();
                this.a.d.aa("\r\n");
                this.a.d.ik(ourVar, j);
                this.a.d.aa("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalStateException("closed");
    }
}
