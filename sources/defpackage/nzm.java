package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import java.io.InputStream;
import java.net.SocketAddress;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: nzm  reason: default package */
/* loaded from: classes2.dex */
public final class nzm implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public nzm(nuu nuuVar, nvu nvuVar, int i) {
        this.c = i;
        this.b = nuuVar;
        this.a = nvuVar;
    }

    public nzm(nzn nznVar, Object obj, int i) {
        this.c = i;
        this.b = nznVar;
        this.a = obj;
    }

    public nzm(nzn nznVar, num numVar, int i) {
        this.c = i;
        this.a = nznVar;
        this.b = numVar;
    }

    public nzm(nzs nzsVar, num numVar, int i) {
        this.c = i;
        this.a = nzsVar;
        this.b = numVar;
    }

    public nzm(nzs nzsVar, ofi ofiVar, int i) {
        this.c = i;
        this.b = nzsVar;
        this.a = ofiVar;
    }

    public nzm(nzt nztVar, InputStream inputStream, int i) {
        this.c = i;
        this.b = nztVar;
        this.a = inputStream;
    }

    public nzm(nzt nztVar, nsj nsjVar, int i) {
        this.c = i;
        this.a = nztVar;
        this.b = nsjVar;
    }

    public nzm(nzt nztVar, nsv nsvVar, int i) {
        this.c = i;
        this.a = nztVar;
        this.b = nsvVar;
    }

    public nzm(nzt nztVar, nsy nsyVar, int i) {
        this.c = i;
        this.a = nztVar;
        this.b = nsyVar;
    }

    public nzm(nzt nztVar, nvu nvuVar, int i) {
        this.c = i;
        this.a = nztVar;
        this.b = nvuVar;
    }

    public nzm(obd obdVar, nvu nvuVar, int i) {
        this.c = i;
        this.a = obdVar;
        this.b = nvuVar;
    }

    public nzm(obf obfVar, List list, int i) {
        this.c = i;
        this.b = obfVar;
        this.a = list;
    }

    public nzm(obf obfVar, nvu nvuVar, int i) {
        this.c = i;
        this.a = obfVar;
        this.b = nvuVar;
    }

    public nzm(oca ocaVar, Runnable runnable, int i) {
        this.c = i;
        this.b = ocaVar;
        this.a = runnable;
    }

    public nzm(ocb ocbVar, oca ocaVar, int i) {
        this.c = i;
        this.a = ocbVar;
        this.b = ocaVar;
    }

    public nzm(odz odzVar, num numVar, int i) {
        this.c = i;
        this.a = odzVar;
        this.b = numVar;
    }

    public nzm(odz odzVar, oea oeaVar, int i) {
        this.c = i;
        this.b = odzVar;
        this.a = oeaVar;
    }

    public nzm(odz odzVar, ofi ofiVar, int i) {
        this.c = i;
        this.b = odzVar;
        this.a = ofiVar;
    }

    public nzm(oec oecVar, nvu nvuVar, int i) {
        this.c = i;
        this.a = oecVar;
        this.b = nvuVar;
    }

    public nzm(owm owmVar, Runnable runnable, int i) {
        this.c = i;
        this.a = owmVar;
        this.b = runnable;
    }

    public nzm(owu owuVar, Runnable runnable, int i) {
        this.c = i;
        this.a = owuVar;
        this.b = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v152, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [ofi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [nsj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v89, types: [ofi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v97, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ocq ocqVar;
        int i = 0;
        boolean z = false;
        switch (this.c) {
            case 0:
                ((nzn) this.b).c.g(this.a);
                return;
            case 1:
                ((nzn) this.a).c.e((num) this.b);
                return;
            case 2:
                ((nzt) this.a).f.h(this.b);
                return;
            case 3:
                ((nzt) this.a).f.j((nsy) this.b);
                return;
            case 4:
                ((nzt) this.a).f.i((nsv) this.b);
                return;
            case 5:
                ((nzt) this.b).f.n((InputStream) this.a);
                return;
            case 6:
                ((nzt) this.a).f.c((nvu) this.b);
                return;
            case 7:
                ((nzs) this.b).a.d(this.a);
                return;
            case 8:
                ((nzs) this.a).a.c((num) this.b);
                return;
            case 9:
                SocketAddress a = ((obf) this.b).f.a();
                obc obcVar = ((obf) this.b).f;
                obcVar.c = this.a;
                obcVar.b();
                ((obf) this.b).g = this.a;
                if (((obf) this.b).n.a == nsl.READY || ((obf) this.b).n.a == nsl.CONNECTING) {
                    obc obcVar2 = ((obf) this.b).f;
                    while (true) {
                        if (i < obcVar2.c.size()) {
                            int indexOf = ((nsz) obcVar2.c.get(i)).b.indexOf(a);
                            if (indexOf == -1) {
                                i++;
                            } else {
                                obcVar2.a = i;
                                obcVar2.b = indexOf;
                            }
                        } else if (((obf) this.b).n.a == nsl.READY) {
                            ocqVar = ((obf) this.b).m;
                            ((obf) this.b).m = null;
                            ((obf) this.b).f.b();
                            ((obf) this.b).d(nsl.IDLE);
                        } else {
                            ((obf) this.b).l.j(nvu.l.f("InternalSubchannel closed pending transport due to address change"));
                            obf.j((obf) this.b);
                            ((obf) this.b).f.b();
                            ((obf) this.b).i();
                        }
                    }
                }
                ocqVar = null;
                if (ocqVar == null) {
                    return;
                }
                obf obfVar = (obf) this.b;
                if (obfVar.r != null) {
                    obfVar.i.j(nvu.l.f("InternalSubchannel closed transport early due to address change"));
                    ((obf) this.b).r.j();
                    obf obfVar2 = (obf) this.b;
                    obfVar2.r = null;
                    obfVar2.i = null;
                }
                obf obfVar3 = (obf) this.b;
                obfVar3.i = ocqVar;
                obfVar3.r = obfVar3.e.d(new nzp(this, 12, null), 5L, TimeUnit.SECONDS, ((obf) this.b).b);
                return;
            case 10:
                if (((obf) this.a).n.a == nsl.SHUTDOWN) {
                    return;
                }
                obf obfVar4 = (obf) this.a;
                obfVar4.o = (nvu) this.b;
                ocq ocqVar2 = obfVar4.m;
                obf obfVar5 = (obf) this.a;
                nzf nzfVar = obfVar5.l;
                obfVar5.m = null;
                obf.j((obf) this.a);
                ((obf) this.a).d(nsl.SHUTDOWN);
                ((obf) this.a).f.b();
                if (((obf) this.a).j.isEmpty()) {
                    ((obf) this.a).f();
                }
                obf obfVar6 = (obf) this.a;
                obfVar6.e.c();
                oqv oqvVar = obfVar6.q;
                if (oqvVar != null) {
                    oqvVar.j();
                    obfVar6.q = null;
                    obfVar6.p = null;
                }
                oqv oqvVar2 = ((obf) this.a).r;
                if (oqvVar2 != null) {
                    oqvVar2.j();
                    ((obf) this.a).i.j((nvu) this.b);
                    obf obfVar7 = (obf) this.a;
                    obfVar7.r = null;
                    obfVar7.i = null;
                }
                if (ocqVar2 != null) {
                    ocqVar2.j((nvu) this.b);
                }
                if (nzfVar == null) {
                    return;
                }
                nzfVar.j((nvu) this.b);
                return;
            case 11:
                if (((obd) this.a).c.n.a == nsl.SHUTDOWN) {
                    return;
                }
                ocq ocqVar3 = ((obd) this.a).c.m;
                obd obdVar = (obd) this.a;
                nzf nzfVar2 = obdVar.a;
                if (ocqVar3 == nzfVar2) {
                    obdVar.c.m = null;
                    ((obd) this.a).c.f.b();
                    ((obd) this.a).c.d(nsl.IDLE);
                    return;
                }
                obf obfVar8 = obdVar.c;
                if (obfVar8.l != nzfVar2) {
                    return;
                }
                jdg.J(obfVar8.n.a == nsl.CONNECTING, "Expected state is CONNECTING, actual state is %s", ((obd) this.a).c.n.a);
                obc obcVar3 = ((obd) this.a).c.f;
                int i2 = obcVar3.b + 1;
                obcVar3.b = i2;
                if (i2 >= ((nsz) obcVar3.c.get(obcVar3.a)).b.size()) {
                    obcVar3.a++;
                    obcVar3.b = 0;
                }
                obc obcVar4 = ((obd) this.a).c.f;
                if (obcVar4.a >= obcVar4.c.size()) {
                    obf.j(((obd) this.a).c);
                    ((obd) this.a).c.f.b();
                    obf obfVar9 = ((obd) this.a).c;
                    Object obj = this.b;
                    obfVar9.e.c();
                    nvu nvuVar = (nvu) obj;
                    jdg.w(!nvuVar.k(), "The error status must not be OK");
                    obfVar9.e(new nsm(nsl.TRANSIENT_FAILURE, nvuVar));
                    if (obfVar9.p == null) {
                        obfVar9.p = nxp.i();
                    }
                    long a2 = obfVar9.p.a() - obfVar9.h.a(TimeUnit.NANOSECONDS);
                    obfVar9.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", obf.k(nvuVar), Long.valueOf(a2));
                    if (obfVar9.q == null) {
                        z = true;
                    }
                    jdg.G(z, "previous reconnectTask is not done");
                    obfVar9.q = obfVar9.e.d(new nzp(obfVar9, 10), a2, TimeUnit.NANOSECONDS, obfVar9.b);
                    return;
                }
                ((obd) this.a).c.i();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((nuu) this.b).a((nvu) this.a);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (((ocb) this.a).a.get() == oce.f) {
                    oce oceVar = ((ocb) this.a).c;
                    if (oceVar.v == null) {
                        oceVar.v = new LinkedHashSet();
                        oce oceVar2 = ((ocb) this.a).c;
                        oceVar2.O.c(oceVar2.w, true);
                    }
                    ((ocb) this.a).c.v.add(this.b);
                    return;
                }
                ((oca) this.b).j();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.a.run();
                oca ocaVar = (oca) this.b;
                ocaVar.f.c.m.execute(new obv(ocaVar, 4));
                return;
            case 15:
                oec.w((oec) this.a);
                ((oec) this.a).u.a((nvu) this.b, nyv.PROCESSED, new num());
                return;
            case 16:
                ((odz) this.a).b.u.c((num) this.b);
                return;
            case 17:
                ((odz) this.b).b.t((oea) this.a);
                return;
            case 18:
                ((odz) this.b).b.u.d(this.a);
                return;
            case 19:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(((owm) this.a).a);
                this.b.run();
                return;
            default:
                int threadStatsTag = TrafficStats.getThreadStatsTag();
                TrafficStats.setThreadStatsTag(((owu) this.a).b);
                owu owuVar = (owu) this.a;
                if (owuVar.c) {
                    ThreadStatsUid.set(owuVar.d);
                }
                try {
                    this.b.run();
                    if (((owu) this.a).c) {
                        ThreadStatsUid.clear();
                    }
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                    return;
                } catch (Throwable th) {
                    if (((owu) this.a).c) {
                        ThreadStatsUid.clear();
                    }
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                    throw th;
                }
        }
    }
}
