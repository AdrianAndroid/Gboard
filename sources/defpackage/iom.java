package defpackage;

/* compiled from: PG */
/* renamed from: iom  reason: default package */
/* loaded from: classes.dex */
public final class iom implements idm {
    private final kbj a;
    private final idb b = new ion(this);

    public iom(kbj kbjVar) {
        this.a = kbjVar;
    }

    public final void a(kbh kbhVar, double d) {
        if (this.a == null || Math.random() >= d) {
            return;
        }
        this.a.e.c(kbhVar);
    }

    @Override // defpackage.idj
    public final void e() {
        kbj kbjVar = this.a;
        if (kbjVar != null) {
            kbjVar.e.a();
            this.a.e.b();
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        oll.e(iduVar, "sessionInfo");
        this.b.b(idoVar, iduVar, j, j2, objArr);
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
        return ion.a;
    }
}
