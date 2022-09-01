package defpackage;

/* compiled from: PG */
/* renamed from: oif  reason: default package */
/* loaded from: classes2.dex */
final class oif extends oib {
    private final oia a;
    private Object b;
    private boolean c = false;

    public oif(oia oiaVar) {
        this.a = oiaVar;
    }

    @Override // defpackage.oib
    public final void Y() {
        this.a.a.d(2);
    }

    @Override // defpackage.nxp
    public final void e(num numVar) {
    }

    @Override // defpackage.nxp
    public final void g(Object obj) {
        if (!this.c) {
            this.b = obj;
            this.c = true;
            return;
        }
        throw nvu.k.f("More than one value received for unary call").h();
    }

    @Override // defpackage.nxp
    public final void h(nvu nvuVar, num numVar) {
        if (nvuVar.k()) {
            if (!this.c) {
                this.a.n(nvu.k.f("No value received for unary call").i(numVar));
            }
            this.a.c(this.b);
            return;
        }
        this.a.n(nvuVar.i(numVar));
    }
}
