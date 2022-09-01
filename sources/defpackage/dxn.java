package defpackage;

/* compiled from: PG */
/* renamed from: dxn  reason: default package */
/* loaded from: classes.dex */
public final class dxn implements idm {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public dxn(ccx ccxVar, int i) {
        this.c = i;
        this.a = new ccw(this, null);
        this.b = ccxVar;
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
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
        int i = this.c;
        return i != 0 ? i != 1 ? izy.a : ccw.a : dxo.a;
    }

    public dxn(idi idiVar, int i) {
        this.c = i;
        this.a = idiVar;
        this.b = new dxo(this);
    }

    public dxn(idi idiVar, int i, byte[] bArr) {
        this.c = i;
        this.a = idiVar;
        this.b = new izy(this, null);
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        int i = this.c;
        if (i == 0) {
            ((idb) this.b).b(idoVar, iduVar, j, j2, objArr);
        } else if (i == 1) {
            ((idb) this.a).b(idoVar, iduVar, j, j2, objArr);
        } else {
            ((idb) this.b).b(idoVar, iduVar, j, j2, objArr);
        }
    }
}
