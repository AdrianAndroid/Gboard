package defpackage;

/* compiled from: PG */
/* renamed from: dpk  reason: default package */
/* loaded from: classes.dex */
public final class dpk extends idc implements idm {
    private final idb b = new dpl(this);

    public dpk(idi idiVar) {
        super(idiVar);
    }

    @Override // defpackage.idr
    public final lmz a() {
        return lmz.q(dpo.values());
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.b.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return dpl.a;
    }
}
