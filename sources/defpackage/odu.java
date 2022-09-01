package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: odu  reason: default package */
/* loaded from: classes2.dex */
public final class odu extends nxp {
    long a;
    final /* synthetic */ oec b;
    private final oea c;

    public odu(oec oecVar, oea oeaVar) {
        this.b = oecVar;
        this.c = oeaVar;
    }

    @Override // defpackage.nxp
    public final void b(long j) {
        if (this.b.q.f != null) {
            return;
        }
        synchronized (this.b.l) {
            if (this.b.q.f == null) {
                oea oeaVar = this.c;
                if (!oeaVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    oec oecVar = this.b;
                    long j3 = oecVar.t;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > oecVar.m) {
                        oeaVar.c = true;
                    } else {
                        long e = oecVar.C.e(j2 - j3);
                        oec oecVar2 = this.b;
                        oecVar2.t = this.a;
                        if (e > oecVar2.n) {
                            this.c.c = true;
                        }
                    }
                    oea oeaVar2 = this.c;
                    Runnable q = oeaVar2.c ? this.b.q(oeaVar2) : null;
                    if (q == null) {
                        return;
                    }
                    q.run();
                }
            }
        }
    }
}
