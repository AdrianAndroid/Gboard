package defpackage;

import android.os.IBinder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: nwm  reason: default package */
/* loaded from: classes2.dex */
public final class nwm extends nwn implements oey {
    public final List a;
    private oet b;

    public nwm(oda odaVar, nry nryVar, List list, IBinder iBinder) {
        super(odaVar, nryVar, ntm.a(nwm.class, "from ".concat(String.valueOf(String.valueOf(nryVar.c(ntd.a))))));
        this.a = list;
        t(nxf.b(iBinder, this.i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized nvu a(oew oewVar, String str, num numVar) {
        Executor oeeVar;
        nsn nsnVar;
        if (s()) {
            return nvu.l.f("transport is shutdown");
        }
        oet oetVar = this.b;
        oewVar.l();
        oix a = oiw.a();
        if (oetVar.c.e != mjl.a) {
            oeeVar = new oei(oetVar.c.e);
        } else {
            oeeVar = new oee();
            oewVar.f();
        }
        Executor executor = oeeVar;
        nuj nujVar = oao.c;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= numVar.e) {
                break;
            } else if (Arrays.equals(nujVar.b, numVar.g(i))) {
                String str2 = (String) numVar.b(oao.c);
                if (oetVar.c.q.a(str2) == null) {
                    oewVar.i(oeu.c);
                    oewVar.e(nvu.j.f(String.format("Can't find decompressor for %s", str2)), new num());
                } else {
                    oewVar.k();
                }
            } else {
                i++;
            }
        }
        ofg b = oewVar.b();
        jdg.Q(b, "statsTraceCtx not present from stream");
        Long l = (Long) numVar.b(oao.b);
        nsu nsuVar = oetVar.c.p;
        nxp[] nxpVarArr = b.b;
        if (nxpVarArr.length > 0) {
            nxp nxpVar = nxpVarArr[0];
            throw null;
        }
        nsr nsrVar = ntp.a;
        oeu oeuVar = oetVar.c;
        nvg nvgVar = nsuVar.f;
        nsu nsuVar2 = new nsu(nsuVar, nvgVar == null ? new nvf(nsrVar, oeuVar, 0) : nvgVar.c(nsrVar, oeuVar, nsrVar.hashCode(), 0));
        if (l == null) {
            nsnVar = new nsn(nsuVar2);
        } else {
            nsv f = nsv.f(l.longValue(), TimeUnit.NANOSECONDS, oetVar.c.v);
            ScheduledExecutorService scheduledExecutorService = ((nwn) oetVar.a).i;
            nsu.l(scheduledExecutorService, "scheduler");
            nsv b2 = nsuVar2.b();
            if (b2 == null || b2.compareTo(f) > 0) {
                z = true;
            } else {
                f = b2;
            }
            nsn nsnVar2 = new nsn(nsuVar2, f);
            if (z) {
                if (!f.d()) {
                    synchronized (nsnVar2) {
                        kvl kvlVar = new kvl(nsnVar2, 15);
                        nsv.e(scheduledExecutorService, "scheduler");
                        nsnVar2.b = scheduledExecutorService.schedule(kvlVar, f.a - System.nanoTime(), TimeUnit.NANOSECONDS);
                    }
                } else {
                    nsnVar2.j(new TimeoutException("context timed out"));
                }
            }
            nsnVar = nsnVar2;
        }
        oep oepVar = new oep(executor, oetVar.c.e, oewVar, nsnVar);
        oewVar.i(oepVar);
        mld e = mld.e();
        executor.execute(new oes(oetVar, nsnVar, a, str, oewVar, oepVar, e, b, numVar));
        executor.execute(new oer(nsnVar, e, numVar, oewVar, oepVar));
        return nvu.b;
    }

    @Override // defpackage.nwn
    public final void g(nvu nvuVar) {
    }

    @Override // defpackage.nwn
    public final void h() {
        oet oetVar = this.b;
        if (oetVar != null) {
            Future future = oetVar.b;
            if (future != null) {
                future.cancel(false);
                oetVar.b = null;
            }
            Iterator it = oetVar.c.f.iterator();
            if (it.hasNext()) {
                nxp nxpVar = (nxp) it.next();
                throw null;
            }
            oeu oeuVar = oetVar.c;
            oey oeyVar = oetVar.a;
            synchronized (oeuVar.m) {
                if (!oeuVar.o.remove(oeyVar)) {
                    throw new AssertionError("Transport already removed");
                }
                ntj.c((nti) oeuVar.r.g.get(Long.valueOf(ntj.a(oeuVar))), oeyVar);
                oeuVar.a();
            }
        }
    }

    @Override // defpackage.oey
    public final synchronized void j() {
        p(nvu.b, false);
    }

    @Override // defpackage.oey
    public final synchronized void k(nvu nvuVar) {
        p(nvuVar, true);
    }

    public final synchronized void m(oet oetVar) {
        this.b = oetVar;
        if (s()) {
            u(5);
            h();
            i();
            return;
        }
        nxf nxfVar = this.m;
        jdg.u(nxfVar);
        n(nxfVar);
        if (s()) {
            return;
        }
        u(3);
        nry nryVar = this.k;
        oetVar.b.cancel(false);
        oetVar.b = null;
        Iterator it = oetVar.c.f.iterator();
        if (it.hasNext()) {
            nxp nxpVar = (nxp) it.next();
            throw null;
        } else {
            this.k = nryVar;
        }
    }

    @Override // defpackage.nwn
    protected final nwy x(int i) {
        return new nwv(this, this.k, i);
    }
}
