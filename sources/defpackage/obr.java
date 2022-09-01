package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: obr  reason: default package */
/* loaded from: classes2.dex */
public final class obr extends ntc {
    public final nsu a;
    private final ntk b;
    private final nsb c;
    private final Executor d;
    private final nuq e;
    private nsa f;
    private nsd g;

    public obr(ntk ntkVar, nsb nsbVar, Executor executor, nuq nuqVar, nsa nsaVar) {
        this.b = ntkVar;
        this.c = nsbVar;
        this.e = nuqVar;
        Executor executor2 = nsaVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        this.f = nsaVar.a(executor);
        this.a = nsu.k();
    }

    @Override // defpackage.ntc, defpackage.nsd
    public final void a(nxp nxpVar, num numVar) {
        new ntx(this.e, numVar, this.f);
        oqv a = this.b.a();
        nvu nvuVar = (nvu) a.a;
        if (nvuVar.k()) {
            ocm b = ((oco) a.b).b(this.e);
            if (b != null) {
                this.f = this.f.d(ocm.a, b);
            }
            nsd a2 = this.c.a(this.e, this.f);
            this.g = a2;
            a2.a(nxpVar, numVar);
            return;
        }
        this.d.execute(new obq(this, nxpVar, nvuVar, null, null, null));
        this.g = oce.g;
    }

    @Override // defpackage.nvc, defpackage.nsd
    public final void b(String str, Throwable th) {
        nsd nsdVar = this.g;
        if (nsdVar != null) {
            nsdVar.b(str, th);
        }
    }

    @Override // defpackage.ntc, defpackage.nvc
    protected final nsd f() {
        return this.g;
    }
}
