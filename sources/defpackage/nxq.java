package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nxq  reason: default package */
/* loaded from: classes2.dex */
public abstract class nxq extends nxv implements nyu, ocx {
    public static final Logger a = Logger.getLogger(nxq.class.getName());
    public final ofo b;
    public final boolean c;
    private final oaj d;
    private num e;
    private volatile boolean f;

    /* JADX INFO: Access modifiers changed from: protected */
    public nxq(ofg ofgVar, ofo ofoVar, num numVar, nsa nsaVar) {
        jdg.Q(numVar, "headers");
        jdg.Q(ofoVar, "transportTracer");
        this.b = ofoVar;
        this.c = oao.h(nsaVar);
        this.d = new ocy(this, ofgVar);
        this.e = numVar;
    }

    @Override // defpackage.nyu
    public final void b(oau oauVar) {
        oauVar.b("remote_addr", a().c(ntd.a));
    }

    @Override // defpackage.nyu
    public final void c(nvu nvuVar) {
        jdg.w(!nvuVar.k(), "Should not cancel with OK status");
        this.f = true;
        opu t = t();
        int i = oiw.a;
        oar oarVar = ((ogc) t.a).j;
        nuj nujVar = oar.p;
        synchronized (oarVar.u) {
            ((ogc) t.a).j.m(nvuVar, true, null);
        }
    }

    @Override // defpackage.nyu
    public final void e() {
        if (!s().m) {
            s().m = true;
            ocy ocyVar = (ocy) q();
            if (ocyVar.f) {
                return;
            }
            ocyVar.f = true;
            ogn ognVar = ocyVar.j;
            if (ognVar != null && ognVar.c == 0) {
                ocyVar.j = null;
            }
            ocyVar.b(true, true);
        }
    }

    @Override // defpackage.nyu
    public final void i(nsv nsvVar) {
        this.e.d(oao.b);
        this.e.f(oao.b, Long.valueOf(Math.max(0L, nsvVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.nyu
    public final void j(nsy nsyVar) {
        nxu s = s();
        jdg.G(s.i == null, "Already called start");
        jdg.Q(nsyVar, "decompressorRegistry");
        s.j = nsyVar;
    }

    @Override // defpackage.nyu
    public final void k(int i) {
        ((ocu) s().a).b = i;
    }

    @Override // defpackage.nyu
    public final void l(int i) {
        ocy ocyVar = (ocy) this.d;
        jdg.G(ocyVar.a == -1, "max size already set");
        ocyVar.a = i;
    }

    @Override // defpackage.nyu
    public final void m(nyw nywVar) {
        nxu s = s();
        boolean z = false;
        jdg.G(s.i == null, "Already called setListener");
        s.i = nywVar;
        opu t = t();
        num numVar = this.e;
        int i = oiw.a;
        Object obj = t.a;
        String concat = "/".concat(((ogc) obj).e.b);
        oar oarVar = ((ogc) obj).j;
        nuj nujVar = oar.p;
        synchronized (oarVar.u) {
            oar oarVar2 = ((ogc) t.a).j;
            ogc ogcVar = oarVar2.I;
            String str = ogcVar.h;
            String str2 = ogcVar.f;
            if (oarVar2.D.u == null) {
                z = true;
            }
            oarVar2.v = ofw.a(numVar, concat, str, str2, z);
            ogh oghVar = oarVar2.D;
            ogc ogcVar2 = oarVar2.I;
            nvu nvuVar = oghVar.q;
            if (nvuVar != null) {
                ogcVar2.j.g(nvuVar, nyv.MISCARRIED, true, new num());
            } else if (oghVar.l.size() >= oghVar.v) {
                oghVar.w.add(ogcVar2);
                oghVar.l(ogcVar2);
            } else {
                oghVar.o(ogcVar2);
            }
        }
        this.e = null;
    }

    @Override // defpackage.nxv, defpackage.ofh
    public final boolean o() {
        return p().c() && !this.f;
    }

    @Override // defpackage.nxv
    protected /* bridge */ /* synthetic */ nxu p() {
        throw null;
    }

    @Override // defpackage.nxv
    protected final oaj q() {
        return this.d;
    }

    @Override // defpackage.ocx
    public final void r(ogn ognVar, boolean z, boolean z2, int i) {
        our ourVar;
        boolean z3 = false;
        jdg.w(ognVar != null || z, "null frame before EOS");
        opu t = t();
        int i2 = oiw.a;
        if (ognVar == null) {
            ourVar = ogc.d;
        } else {
            ourVar = ognVar.a;
            int i3 = (int) ourVar.b;
            if (i3 > 0) {
                oar oarVar = ((ogc) t.a).j;
                synchronized (oarVar.b) {
                    oarVar.e += i3;
                }
            }
        }
        oar oarVar2 = ((ogc) t.a).j;
        nuj nujVar = oar.p;
        synchronized (oarVar2.u) {
            oar oarVar3 = ((ogc) t.a).j;
            if (!oarVar3.z) {
                if (!oarVar3.E) {
                    if (oarVar3.H != -1) {
                        z3 = true;
                    }
                    jdg.G(z3, "streamId should be set");
                    oarVar3.C.a(z, oarVar3.G, ourVar, z2);
                } else {
                    oarVar3.w.ik(ourVar, (int) ourVar.b);
                    oarVar3.x |= z;
                    oarVar3.y |= z2;
                }
            }
            ofo ofoVar = ((nxq) t.a).b;
            if (i != 0) {
                ofoVar.f += i;
                ofoVar.a.a();
            }
        }
    }

    protected abstract nxu s();

    protected abstract opu t();
}
