package defpackage;

/* compiled from: PG */
/* renamed from: nyq  reason: default package */
/* loaded from: classes2.dex */
final class nyq implements nyw {
    public nvu a;
    final /* synthetic */ nyt b;
    public final nxp c;

    public nyq(nyt nytVar, nxp nxpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = nytVar;
        this.c = nxpVar;
    }

    @Override // defpackage.nyw
    public final void a(nvu nvuVar, nyv nyvVar, num numVar) {
        int i = oiw.a;
        nsv f = this.b.f();
        if (nvuVar.o == nvr.CANCELLED && f != null && f.d()) {
            oau oauVar = new oau();
            this.b.e.b(oauVar);
            nvu nvuVar2 = nvu.e;
            new StringBuilder("ClientCall was cancelled at or after deadline. ").append(oauVar);
            nvuVar = nvuVar2.b("ClientCall was cancelled at or after deadline. ".concat(oauVar.toString()));
            numVar = new num();
        }
        this.b.b.execute(new nyo(this, nvuVar, numVar));
    }

    public final void b(nvu nvuVar) {
        this.a = nvuVar;
        this.b.e.c(nvuVar);
    }

    @Override // defpackage.nyw
    public final void c(num numVar) {
        int i = oiw.a;
        this.b.b.execute(new nym(this, numVar));
    }

    @Override // defpackage.ofj
    public final void d(ofi ofiVar) {
        int i = oiw.a;
        this.b.b.execute(new nyn(this, ofiVar));
    }

    @Override // defpackage.ofj
    public final void e() {
        if (this.b.a.a.a()) {
            return;
        }
        int i = oiw.a;
        this.b.b.execute(new nyp(this));
    }
}
