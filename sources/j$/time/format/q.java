package j$.time.format;

/* loaded from: classes3.dex */
final class q implements j$.time.temporal.m {
    final /* synthetic */ j$.time.chrono.b a;
    final /* synthetic */ j$.time.temporal.m b;
    final /* synthetic */ j$.time.chrono.g c;
    final /* synthetic */ j$.time.n d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(j$.time.g gVar, j$.time.temporal.m mVar, j$.time.chrono.g gVar2, j$.time.n nVar) {
        this.a = gVar;
        this.b = mVar;
        this.c = gVar2;
        this.d = nVar;
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int b(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.a.a(this, nVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s d(j$.time.temporal.n nVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !nVar.isDateBased()) ? this.b.d(nVar) : ((j$.time.g) bVar).d(nVar);
    }

    @Override // j$.time.temporal.m
    public final boolean f(j$.time.temporal.n nVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !nVar.isDateBased()) ? this.b.f(nVar) : ((j$.time.g) bVar).f(nVar);
    }

    @Override // j$.time.temporal.m
    public final long h(j$.time.temporal.n nVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !nVar.isDateBased()) ? this.b.h(nVar) : ((j$.time.g) bVar).h(nVar);
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.temporal.q qVar) {
        return qVar == j$.time.temporal.p.a() ? this.c : qVar == j$.time.temporal.p.g() ? this.d : qVar == j$.time.temporal.p.e() ? this.b.i(qVar) : qVar.a(this);
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.b);
        String str2 = "";
        j$.time.chrono.g gVar = this.c;
        if (gVar != null) {
            str = j$.net.a.a(" with chronology ", String.valueOf(gVar));
        } else {
            str = str2;
        }
        j$.time.n nVar = this.d;
        if (nVar != null) {
            str2 = j$.net.a.a(" with zone ", String.valueOf(nVar));
        }
        return valueOf + str + str2;
    }
}
