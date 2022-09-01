package defpackage;

/* compiled from: PG */
/* renamed from: kzn  reason: default package */
/* loaded from: classes.dex */
final class kzn extends kzg {
    final /* synthetic */ kzo b;

    public kzn(kzo kzoVar) {
        this.b = kzoVar;
    }

    @Override // defpackage.kzg
    public final void b() {
        kzp kzpVar = this.b.a;
        kzpVar.l.g("unlinkToDeath", new Object[0]);
        ((bkf) kzpVar.k).a.unlinkToDeath(kzpVar.i, 0);
        kzp kzpVar2 = this.b.a;
        kzpVar2.k = null;
        kzpVar2.f = false;
    }
}
