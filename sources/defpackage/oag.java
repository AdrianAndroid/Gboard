package defpackage;

/* compiled from: PG */
/* renamed from: oag  reason: default package */
/* loaded from: classes2.dex */
abstract class oag implements nyw {
    @Override // defpackage.nyw
    public void a(nvu nvuVar, nyv nyvVar, num numVar) {
        throw null;
    }

    protected abstract nyw b();

    @Override // defpackage.nyw
    public final void c(num numVar) {
        b().c(numVar);
    }

    @Override // defpackage.ofj
    public final void d(ofi ofiVar) {
        b().d(ofiVar);
    }

    @Override // defpackage.ofj
    public final void e() {
        b().e();
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("delegate", b());
        return S.toString();
    }
}
