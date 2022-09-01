package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kzk  reason: default package */
/* loaded from: classes.dex */
public final class kzk extends kzg {
    final /* synthetic */ kzp b;

    public kzk(kzp kzpVar) {
        this.b = kzpVar;
    }

    @Override // defpackage.kzg
    public final void b() {
        kzp kzpVar = this.b;
        if (kzpVar.k != null) {
            kzpVar.l.g("Unbind from service.", new Object[0]);
            kzp kzpVar2 = this.b;
            kzpVar2.a.unbindService(kzpVar2.j);
            this.b.f = false;
            kzp kzpVar3 = this.b;
            kzpVar3.k = null;
            kzpVar3.j = null;
        }
        this.b.b();
    }
}
