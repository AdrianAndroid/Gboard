package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oah  reason: default package */
/* loaded from: classes2.dex */
public abstract class oah implements nzf {
    protected abstract nzf a();

    @Override // defpackage.ntr
    public final ntm c() {
        return a().c();
    }

    @Override // defpackage.ocq
    public final Runnable d(ocp ocpVar) {
        return a().d(ocpVar);
    }

    @Override // defpackage.ocq
    public void j(nvu nvuVar) {
        a().j(nvuVar);
    }

    @Override // defpackage.ocq
    public final void k(nvu nvuVar) {
        throw null;
    }

    @Override // defpackage.nyx
    public nyu m(nuq nuqVar, num numVar, nsa nsaVar, nxp[] nxpVarArr) {
        throw null;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("delegate", a());
        return S.toString();
    }
}
