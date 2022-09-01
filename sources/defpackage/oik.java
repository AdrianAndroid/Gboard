package defpackage;

/* compiled from: PG */
/* renamed from: oik  reason: default package */
/* loaded from: classes2.dex */
final class oik extends nxo {
    private final oin a;
    private final nvl b;
    private boolean c = false;
    private final oij d;

    public oik(oin oinVar, oij oijVar, nvl nvlVar) {
        this.a = oinVar;
        this.d = oijVar;
        this.b = nvlVar;
    }

    @Override // defpackage.nxo
    public final void j() {
        this.d.b = true;
        if (!this.c) {
            this.a.b(nvu.c.f("client cancelled").h());
        }
    }

    @Override // defpackage.nxo
    public final void k() {
        this.c = true;
        this.a.a();
    }

    @Override // defpackage.nxo
    public final void l(Object obj) {
        this.a.c(obj);
        if (this.d.c) {
            this.b.b(1);
        }
    }

    @Override // defpackage.nxo
    public final void m() {
    }
}
