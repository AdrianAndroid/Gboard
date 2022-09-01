package defpackage;

/* compiled from: PG */
/* renamed from: dty  reason: default package */
/* loaded from: classes.dex */
public final class dty implements idm {
    private final idi c;
    public final bxg a = new bxg();
    public final nfh b = mbh.aT.t();
    private final idb d = new dtz(this);

    public dty(idi idiVar) {
        this.c = idiVar;
    }

    public final void a(nfh nfhVar, int i) {
        idb idbVar = this.d;
        this.c.f((mbh) nfhVar.cz(), i, idbVar.c, idbVar.d);
        nfhVar.b = (nfm) nfhVar.b.N(4);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final void f() {
        this.c.a();
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.d.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return dtz.a;
    }
}
