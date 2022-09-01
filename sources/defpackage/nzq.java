package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nzq  reason: default package */
/* loaded from: classes2.dex */
public final class nzq extends nzt {
    public final ntx a;
    final /* synthetic */ nzr b;
    public final nxp[] c;
    private final nsu h = nsu.k();

    public nzq(nzr nzrVar, ntx ntxVar, nxp[] nxpVarArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = nzrVar;
        this.a = ntxVar;
        this.c = nxpVarArr;
    }

    @Override // defpackage.nzt, defpackage.nyu
    public final void b(oau oauVar) {
        if (this.a.a.f()) {
            oauVar.a("wait_for_ready");
        }
        super.b(oauVar);
    }

    @Override // defpackage.nzt, defpackage.nyu
    public final void c(nvu nvuVar) {
        super.c(nvuVar);
        synchronized (this.b.a) {
            nzr nzrVar = this.b;
            if (nzrVar.e != null) {
                boolean remove = nzrVar.g.remove(this);
                if (!this.b.b() && remove) {
                    nzr nzrVar2 = this.b;
                    nzrVar2.b.b(nzrVar2.d);
                    nzr nzrVar3 = this.b;
                    if (nzrVar3.h != null) {
                        nzrVar3.b.b(nzrVar3.e);
                        this.b.e = null;
                    }
                }
            }
        }
        this.b.b.a();
    }

    public final Runnable p(nyx nyxVar) {
        nsu a = this.h.a();
        try {
            ntx ntxVar = this.a;
            nyu m = nyxVar.m(ntxVar.c, ntxVar.b, ntxVar.a, this.c);
            synchronized (this) {
                if (this.f == null) {
                    jdg.Q(m, "stream");
                    super.t(m);
                    nyw nywVar = this.e;
                    if (nywVar == null) {
                        this.g = null;
                        this.d = true;
                    }
                    if (nywVar != null) {
                        super.s(nywVar);
                        return new nzp(this, 5);
                    }
                }
            }
            return null;
        } finally {
            this.h.f(a);
        }
    }

    @Override // defpackage.nzt
    protected final void q(nvu nvuVar) {
        for (nxp nxpVar : this.c) {
            nxpVar.c(nvuVar);
        }
    }
}
