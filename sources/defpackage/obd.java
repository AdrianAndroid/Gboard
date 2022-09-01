package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: obd  reason: default package */
/* loaded from: classes2.dex */
public final class obd implements ocp {
    final nzf a;
    boolean b = false;
    final /* synthetic */ obf c;

    public obd(obf obfVar, nzf nzfVar) {
        this.c = obfVar;
        this.a = nzfVar;
    }

    @Override // defpackage.ocp
    public final void a(boolean z) {
        this.c.g(this.a, z);
    }

    @Override // defpackage.ocp
    public final void b() {
        this.c.d.a(2, "READY");
        this.c.e.execute(new nzp(this, 14));
    }

    @Override // defpackage.ocp
    public final void c(nvu nvuVar) {
        this.c.d.b(2, "{0} SHUTDOWN with {1}", this.a.c(), obf.k(nvuVar));
        this.b = true;
        this.c.e.execute(new nzm(this, nvuVar, 11));
    }

    @Override // defpackage.ocp
    public final void d() {
        jdg.G(this.b, "transportShutdown() must be called before transportTerminated().");
        this.c.d.b(2, "{0} Terminated", this.a.c());
        ntj.c(this.c.c.f, this.a);
        this.c.g(this.a, false);
        this.c.e.execute(new nzp(this, 15));
    }
}
