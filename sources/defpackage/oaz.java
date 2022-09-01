package defpackage;

/* compiled from: PG */
/* renamed from: oaz  reason: default package */
/* loaded from: classes2.dex */
final class oaz extends oaf {
    final /* synthetic */ nyu a;
    final /* synthetic */ oba b;

    public oaz(oba obaVar, nyu nyuVar) {
        this.b = obaVar;
        this.a = nyuVar;
    }

    @Override // defpackage.oaf, defpackage.nyu
    public final void m(nyw nywVar) {
        this.b.a.b();
        this.a.m(new oay(this, nywVar));
    }

    @Override // defpackage.oaf
    protected final nyu p() {
        return this.a;
    }
}
