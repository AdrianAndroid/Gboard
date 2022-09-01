package defpackage;

/* compiled from: PG */
/* renamed from: glv  reason: default package */
/* loaded from: classes.dex */
public final class glv extends gkx {
    private static final ltg m = ltg.j("com/google/android/libraries/gsa/io/impl/HttpEngineImpl");
    public final lfb d;
    public final lfb e;
    public final lfb f;
    public final glo g;
    public final gle h;
    public final gnn i;
    public final lfb j;
    public final lfb k;
    public volatile bmr l = null;

    public glv(lfb lfbVar, lfb lfbVar2, lfb lfbVar3, lfb lfbVar4, gle gleVar, glo gloVar, gnn gnnVar, nox noxVar, lfb lfbVar5, lfb lfbVar6, bll bllVar) {
        super(lfbVar2, noxVar, bllVar);
        this.d = lfbVar;
        this.e = lfbVar3;
        this.f = lfbVar4;
        this.g = gloVar;
        this.h = gleVar;
        this.i = gnnVar;
        this.j = lfbVar5;
        this.k = lfbVar6;
    }

    @Override // defpackage.bmc
    public final mko c(bmi bmiVar, blw blwVar, blq blqVar) {
        jdg.u(blwVar);
        if (bmiVar.i && !blwVar.e()) {
            ((ltd) ((ltd) m.d().h(luh.a, "HttpEngineImpl")).k("com/google/android/libraries/gsa/io/impl/HttpEngineImpl", "executeRequestUnbuffered", 123, "HttpEngineImpl.java")).t("Cannot follow redirects on with a non-cloneable upload stream.");
            bnh.a();
        }
        gnn gnnVar = this.i;
        gnp gnpVar = (gnp) gnnVar;
        return new bli(mhu.h(kcu.P(gqn.f(gnpVar.a, new gmj(this, blqVar, bmiVar, blwVar, 1)), new glh(gnpVar, 6)), Throwable.class, new eoi(bmiVar.s, 17), mjl.a));
    }
}
