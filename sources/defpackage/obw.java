package defpackage;

/* compiled from: PG */
/* renamed from: obw  reason: default package */
/* loaded from: classes2.dex */
public final class obw extends ntv {
    public nya a;
    boolean b;
    boolean c;
    public final /* synthetic */ oce d;

    public obw(oce oceVar) {
        this.d = oceVar;
    }

    @Override // defpackage.ntv
    public final nsc a() {
        return this.d.F;
    }

    @Override // defpackage.ntv
    public final /* bridge */ /* synthetic */ ntz b(ntt nttVar) {
        this.d.m.c();
        jdg.G(!this.d.A, "Channel is being terminated");
        return new nxw(this.d, nttVar, this);
    }

    @Override // defpackage.ntv
    public final void c() {
        this.d.m.c();
        this.b = true;
        this.d.m.execute(new obv(this, 2));
    }

    @Override // defpackage.ntv
    public final void d(nsl nslVar, nua nuaVar) {
        this.d.m.c();
        jdg.Q(nslVar, "newState");
        this.d.m.execute(new owx(this, nuaVar, nslVar, 1));
    }
}
