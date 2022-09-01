package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oby  reason: default package */
/* loaded from: classes2.dex */
public final class oby extends nsb {
    final /* synthetic */ ocb a;

    public oby(ocb ocbVar) {
        this.a = ocbVar;
    }

    @Override // defpackage.nsb
    public final nsd a(nuq nuqVar, nsa nsaVar) {
        Executor f = this.a.c.f(nsaVar);
        oce oceVar = this.a.c;
        nyt nytVar = new nyt(nuqVar, f, nsaVar, oceVar.T, oceVar.B ? null : this.a.c.i.b(), this.a.c.D, null, null);
        nytVar.g = this.a.c.n;
        return nytVar;
    }

    @Override // defpackage.nsb
    public final String b() {
        return this.a.b;
    }
}
