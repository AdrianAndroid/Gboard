package defpackage;

/* compiled from: PG */
/* renamed from: nyo  reason: default package */
/* loaded from: classes2.dex */
final class nyo extends nzh {
    final /* synthetic */ nvu a;
    final /* synthetic */ num b;
    final /* synthetic */ nyq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyo(nyq nyqVar, nvu nvuVar, num numVar) {
        super(nyqVar.b.d);
        this.c = nyqVar;
        this.a = nvuVar;
        this.b = numVar;
    }

    @Override // defpackage.nzh
    public final void a() {
        int i = oiw.a;
        nvu nvuVar = this.a;
        num numVar = this.b;
        nvu nvuVar2 = this.c.a;
        if (nvuVar2 != null) {
            numVar = new num();
            nvuVar = nvuVar2;
        }
        this.c.b.f = true;
        this.c.c.h(nvuVar, numVar);
        this.c.b.g();
        this.c.b.c.a(nvuVar.k());
    }
}
