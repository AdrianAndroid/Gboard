package defpackage;

/* compiled from: PG */
/* renamed from: kzj  reason: default package */
/* loaded from: classes.dex */
final class kzj extends kzg {
    final /* synthetic */ kzg b;
    final /* synthetic */ kzp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzj(kzp kzpVar, fxa fxaVar, kzg kzgVar, byte[] bArr) {
        super(fxaVar, null);
        this.c = kzpVar;
        this.b = kzgVar;
    }

    @Override // defpackage.kzg
    public final void b() {
        kzp kzpVar = this.c;
        kzg kzgVar = this.b;
        if (kzpVar.k != null || kzpVar.f) {
            if (kzpVar.f) {
                kzpVar.l.g("Waiting to bind to the service.", new Object[0]);
                kzpVar.c.add(kzgVar);
                return;
            }
            kzgVar.run();
            return;
        }
        kzpVar.l.g("Initiate binding to the service.", new Object[0]);
        kzpVar.c.add(kzgVar);
        kzpVar.j = new kzo(kzpVar);
        kzpVar.f = true;
        if (kzpVar.a.bindService(kzpVar.g, kzpVar.j, 1)) {
            return;
        }
        kzpVar.l.g("Failed to bind to the service.", new Object[0]);
        kzpVar.f = false;
        for (kzg kzgVar2 : kzpVar.c) {
            kzgVar2.a(new kzq());
        }
        kzpVar.c.clear();
    }
}
