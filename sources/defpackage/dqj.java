package defpackage;

/* compiled from: PG */
/* renamed from: dqj  reason: default package */
/* loaded from: classes.dex */
public final class dqj implements idm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/migration/MigrationMetricsProcessor");
    public final idi b;
    public final nfh c = mbh.aT.t();
    private idb d;

    public dqj(idi idiVar) {
        this.b = idiVar;
    }

    public final idb a() {
        if (this.d == null) {
            this.d = new dqk(this);
        }
        return this.d;
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        a().b(idoVar, iduVar, j, j2, objArr);
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
        a();
        return dqk.a;
    }
}
