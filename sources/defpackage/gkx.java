package defpackage;

/* compiled from: PG */
/* renamed from: gkx  reason: default package */
/* loaded from: classes.dex */
public abstract class gkx implements bmc {
    public final lfb a;
    public final nox b;
    protected final bll c;

    public gkx(lfb lfbVar, nox noxVar, bll bllVar) {
        this.a = lfbVar;
        this.b = noxVar;
        this.c = bllVar;
    }

    @Override // defpackage.bmc
    public final bll a() {
        return this.c;
    }

    @Override // defpackage.bmc
    public final blq b(blu bluVar) {
        return ((bmm) this.b.a()).d(bluVar);
    }
}
