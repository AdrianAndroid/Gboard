package defpackage;

/* compiled from: PG */
/* renamed from: oic  reason: default package */
/* loaded from: classes2.dex */
final class oic extends oib {
    private final oin a;
    private final ohz b;

    public oic(oin oinVar, ohz ohzVar) {
        this.a = oinVar;
        this.b = ohzVar;
    }

    @Override // defpackage.oib
    public final void Y() {
        this.b.d();
    }

    @Override // defpackage.nxp
    public final void e(num numVar) {
    }

    @Override // defpackage.nxp
    public final void f() {
    }

    @Override // defpackage.nxp
    public final void g(Object obj) {
        this.a.c(obj);
        this.b.d();
    }

    @Override // defpackage.nxp
    public final void h(nvu nvuVar, num numVar) {
        if (nvuVar.k()) {
            this.a.a();
        } else {
            this.a.b(nvuVar.i(numVar));
        }
    }
}
