package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: oec */
/* loaded from: classes2.dex */
public final class oec implements nyu {
    static final nuj a = nuj.c("grpc-previous-rpc-attempts", num.b);
    static final nuj b = nuj.c("grpc-retry-pushback-ms", num.b);
    public static final nvu c = nvu.c.f("Stream thrown away because RetriableStream committed");
    public static final Random d = new Random();
    final /* synthetic */ nsa A;
    final /* synthetic */ nsu B;
    public final lbi C;
    final /* synthetic */ opu D;
    private final num E;
    private nvu F;
    public final nuq e;
    public final Executor f;
    public final ScheduledExecutorService h;
    public final oed i;
    public final oap j;
    public final boolean k;
    public final long m;
    public final long n;
    public final oeb o;
    public long t;
    public nyw u;
    public odv v;
    public odv w;
    public long x;
    public boolean y;
    final /* synthetic */ nuq z;
    public final Executor g = new nvz(new odm());
    public final Object l = new Object();
    public final oau p = new oau();
    public volatile ody q = new ody(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
    public final AtomicBoolean r = new AtomicBoolean();
    public final AtomicInteger s = new AtomicInteger();

    public oec(opu opuVar, nuq nuqVar, num numVar, nsa nsaVar, oed oedVar, oap oapVar, oeb oebVar, nsu nsuVar, byte[] bArr, byte[] bArr2) {
        this.D = opuVar;
        this.z = nuqVar;
        this.A = nsaVar;
        this.B = nsuVar;
        oce oceVar = (oce) opuVar.a;
        lbi lbiVar = oceVar.R;
        long j = oceVar.L;
        long j2 = oceVar.M;
        Executor f = oceVar.f(nsaVar);
        ScheduledExecutorService b2 = ((oce) opuVar.a).i.b();
        this.e = nuqVar;
        this.C = lbiVar;
        this.m = j;
        this.n = j2;
        this.f = f;
        this.h = b2;
        this.E = numVar;
        this.i = oedVar;
        if (oedVar != null) {
            this.x = oedVar.b;
        }
        this.j = oapVar;
        boolean z = false;
        jdg.w(oedVar == null || oapVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.k = oapVar != null ? true : z;
        this.o = oebVar;
    }

    public static /* synthetic */ void w(oec oecVar) {
        oecVar.y = true;
    }

    @Override // defpackage.nyu
    public final nry a() {
        throw null;
    }

    @Override // defpackage.nyu
    public final void b(oau oauVar) {
        ody odyVar;
        synchronized (this.l) {
            oauVar.b("closed", this.p);
            odyVar = this.q;
        }
        if (odyVar.f != null) {
            oau oauVar2 = new oau();
            odyVar.f.a.b(oauVar2);
            oauVar.b("committed", oauVar2);
            return;
        }
        oau oauVar3 = new oau();
        for (oea oeaVar : odyVar.c) {
            oau oauVar4 = new oau();
            oeaVar.a.b(oauVar4);
            oauVar3.a(oauVar4);
        }
        oauVar.b("open", oauVar3);
    }

    @Override // defpackage.nyu
    public final void c(nvu nvuVar) {
        oea oeaVar;
        oea oeaVar2 = new oea(0);
        oeaVar2.a = new ocz();
        Runnable q = q(oeaVar2);
        if (q != null) {
            q.run();
            this.g.execute(new nzm(this, nvuVar, 15));
            return;
        }
        synchronized (this.l) {
            if (this.q.c.contains(this.q.f)) {
                oeaVar = this.q.f;
            } else {
                this.F = nvuVar;
                oeaVar = null;
            }
            ody odyVar = this.q;
            this.q = new ody(odyVar.b, odyVar.c, odyVar.d, odyVar.f, true, odyVar.a, odyVar.h, odyVar.e);
        }
        if (oeaVar == null) {
            return;
        }
        oeaVar.a.c(nvuVar);
    }

    @Override // defpackage.ofh
    public final void d() {
        ody odyVar = this.q;
        if (odyVar.a) {
            odyVar.f.a.d();
        } else {
            s(new odp(1));
        }
    }

    @Override // defpackage.nyu
    public final void e() {
        s(new odp(0));
    }

    @Override // defpackage.ofh
    public final void f() {
        s(new odp(2));
    }

    @Override // defpackage.ofh
    public final void g(int i) {
        ody odyVar = this.q;
        if (odyVar.a) {
            odyVar.f.a.g(i);
        } else {
            s(new odq(i, 2));
        }
    }

    @Override // defpackage.ofh
    public final void h(nsj nsjVar) {
        s(new odo(nsjVar, 1));
    }

    @Override // defpackage.nyu
    public final void i(nsv nsvVar) {
        s(new odo(nsvVar, 0));
    }

    @Override // defpackage.nyu
    public final void j(nsy nsyVar) {
        s(new odo(nsyVar, 2));
    }

    @Override // defpackage.nyu
    public final void k(int i) {
        s(new odq(i, 1));
    }

    @Override // defpackage.nyu
    public final void l(int i) {
        s(new odq(i, 0));
    }

    @Override // defpackage.nyu
    public final void m(nyw nywVar) {
        nvu nvuVar;
        odv odvVar;
        oeb oebVar;
        this.u = nywVar;
        ocd ocdVar = ((oce) this.D.a).y;
        synchronized (ocdVar.a) {
            nvuVar = ocdVar.c;
            odvVar = null;
            if (nvuVar == null) {
                ocdVar.b.add(this);
                nvuVar = null;
            }
        }
        if (nvuVar != null) {
            c(nvuVar);
            return;
        }
        synchronized (this.l) {
            this.q.b.add(new odx(this));
        }
        oea p = p(0, false);
        if (this.k) {
            synchronized (this.l) {
                this.q = this.q.a(p);
                if (v(this.q) && ((oebVar = this.o) == null || oebVar.a())) {
                    odvVar = new odv(this.l);
                    this.w = odvVar;
                }
            }
            if (odvVar != null) {
                odvVar.b(this.h.schedule(new odw(this, odvVar, 0), this.j.b, TimeUnit.NANOSECONDS));
            }
        }
        t(p);
    }

    @Override // defpackage.ofh
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.ofh
    public final boolean o() {
        for (oea oeaVar : this.q.c) {
            if (oeaVar.a.o()) {
                return true;
            }
        }
        return false;
    }

    public final oea p(int i, boolean z) {
        oea oeaVar = new oea(i);
        ods odsVar = new ods(new odu(this, oeaVar), null, null, null);
        num numVar = this.E;
        num numVar2 = new num();
        numVar2.e(numVar);
        if (i > 0) {
            numVar2.f(a, String.valueOf(i));
        }
        nsa g = this.A.g(odsVar);
        nxp[] m = oao.m(g, i, z);
        nyx a2 = this.D.a(new ntx(this.z, numVar2, g));
        nsu a3 = this.B.a();
        try {
            nyu m2 = a2.m(this.z, numVar2, g, m);
            this.B.f(a3);
            oeaVar.a = m2;
            return oeaVar;
        } catch (Throwable th) {
            this.B.f(a3);
            throw th;
        }
    }

    public final Runnable q(oea oeaVar) {
        List list;
        Collection emptyList;
        Future future;
        Future future2;
        synchronized (this.l) {
            if (this.q.f != null) {
                return null;
            }
            Collection collection = this.q.c;
            ody odyVar = this.q;
            boolean z = true;
            jdg.G(odyVar.f == null, "Already committed");
            List list2 = odyVar.b;
            if (odyVar.c.contains(oeaVar)) {
                list = null;
                emptyList = Collections.singleton(oeaVar);
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z = false;
            }
            this.q = new ody(list, emptyList, odyVar.d, oeaVar, odyVar.g, z, odyVar.h, odyVar.e);
            this.C.e(-this.t);
            odv odvVar = this.v;
            if (odvVar != null) {
                Future a2 = odvVar.a();
                this.v = null;
                future = a2;
            } else {
                future = null;
            }
            odv odvVar2 = this.w;
            if (odvVar2 != null) {
                Future a3 = odvVar2.a();
                this.w = null;
                future2 = a3;
            } else {
                future2 = null;
            }
            return new odn(this, collection, oeaVar, future, future2);
        }
    }

    public final void r(oea oeaVar) {
        Runnable q = q(oeaVar);
        if (q != null) {
            q.run();
        }
    }

    public final void s(odt odtVar) {
        Collection<oea> collection;
        synchronized (this.l) {
            if (!this.q.a) {
                this.q.b.add(odtVar);
            }
            collection = this.q.c;
        }
        for (oea oeaVar : collection) {
            odtVar.a(oeaVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008f, code lost:
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
        r18.g.execute(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
        r2 = r19.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
        if (r18.q.f != r19) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
        r0 = r18.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
        r2.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
        r0 = defpackage.oec.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
        r5 = r6.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
        if (r7 >= r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
        r8 = (defpackage.odt) r6.get(r7);
        r8.a(r19);
        r4 = r4 | (r8 instanceof defpackage.odx);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
        if (r4 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
        r8 = r18.q;
        r10 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
        if (r10 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
        if (r10 == r19) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
        if (r8.g == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fa, code lost:
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.oea r19) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oec.t(oea):void");
    }

    public final void u() {
        Future future;
        synchronized (this.l) {
            odv odvVar = this.w;
            future = null;
            if (odvVar != null) {
                Future a2 = odvVar.a();
                this.w = null;
                future = a2;
            }
            this.q = this.q.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean v(ody odyVar) {
        return odyVar.f == null && odyVar.e < this.j.a && !odyVar.h;
    }
}
