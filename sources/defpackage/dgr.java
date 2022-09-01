package defpackage;

/* compiled from: PG */
/* renamed from: dgr  reason: default package */
/* loaded from: classes.dex */
public final class dgr implements idm, idr {
    public static final lug a = lug.i("HandwritingMetrics");
    public static final llw b = llw.m(dgt.HANDWRITING_OPERATION, "Handwriting.usage", dgt.HANDWRITING_RECOGNITION, "Handwriting.recognition");
    public static final lmz c;
    public static final lmz d;
    public final idi e;
    public final idb f = new dgs(this);
    final jwy g;

    static {
        lmx g = lmz.g();
        g.d("zh");
        g.d("ja");
        c = g.g();
        lmx g2 = lmz.g();
        g2.d("hi");
        g2.d("ne");
        g2.d("mr");
        g2.d("gu");
        g2.d("pa");
        g2.d("te");
        g2.d("kn");
        g2.d("ta");
        g2.d("or");
        g2.d("lo");
        g2.d("km");
        g2.d("si");
        g2.d("ml");
        g2.d("bn");
        g2.d("as");
        g2.d("my");
        d = g2.g();
    }

    public dgr(idi idiVar, gjz gjzVar, byte[] bArr) {
        this.e = idiVar;
        this.g = new jwy(gjzVar, null);
    }

    @Override // defpackage.idr
    public final lmz a() {
        return lmz.q(dgv.values());
    }

    @Override // defpackage.idr
    public final void b(ids idsVar, long j) {
        this.e.e(((dgv) idsVar).c, j);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final void f() {
        this.e.a();
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.f.b(idoVar, iduVar, j, j2, objArr);
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
        return dgs.a;
    }
}
