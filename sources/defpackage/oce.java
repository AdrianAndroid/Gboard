package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: oce  reason: default package */
/* loaded from: classes2.dex */
public final class oce extends nuf implements ntl {
    public static final Logger a = Logger.getLogger(oce.class.getName());
    static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    static final nvu c = nvu.l.f("Channel shutdown invoked");
    static final nvu d = nvu.l.f("Subchannel shutdown invoked");
    public static final oco e = new oco(null, new HashMap(), new HashMap(), null, null, null);
    public static final ntk f = new obl();
    public static final nsd g = new obp();
    public boolean A;
    public volatile boolean B;
    public final nyh C;
    public final nyi D;
    public final nyk E;
    public final nsc F;
    public final ntj G;
    public final ocb H;
    public final long L;
    public final long M;
    public final boolean N;
    public oac Q;
    public oqv S;
    private final String U;
    private final nut V;
    private final nur W;
    private final oda X;
    private final obt Y;
    private final obt Z;
    private final long aa;
    private final nsb ab;
    private boolean ac;
    private final ocp af;
    private final odl ag;
    private final oqv ah;
    public final ntm h;
    public final nyz i;
    public final occ j;
    public final Executor k;
    public final ofl l;
    public final nvz m;
    public final nsy n;
    public final String p;
    public nux q;
    public obw r;
    public volatile nua s;
    public boolean t;
    public Collection v;
    public final nzr x;
    public final nzg o = new nzg();
    public final Set u = new HashSet(16, 0.75f);
    public final Object w = new Object();
    private final Set ad = new HashSet(1, 0.75f);
    public final ocd y = new ocd(this);
    public final AtomicBoolean z = new AtomicBoolean(false);
    private final CountDownLatch ae = new CountDownLatch(1);
    public int P = 1;
    public oco I = e;
    public boolean J = false;
    public final lbi R = new lbi((byte[]) null);
    final oat O = new obu(this);
    public final opu T = new opu(this);
    public final boolean K = true;

    static {
        nvu.l.f("Channel shutdownNow invoked");
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public oce(ocj ocjVar, nyz nyzVar, oda odaVar, lgb lgbVar, List list, ofl oflVar) {
        nvz nvzVar = new nvz(new obo(this));
        this.m = nvzVar;
        obs obsVar = new obs(this);
        this.af = obsVar;
        String str = ocjVar.g;
        jdg.Q(str, "target");
        this.U = str;
        ntm b2 = ntm.b("Channel", str);
        this.h = b2;
        this.l = oflVar;
        oda odaVar2 = ocjVar.c;
        jdg.Q(odaVar2, "executorPool");
        this.X = odaVar2;
        ?? a2 = odaVar2.a();
        jdg.Q(a2, "executor");
        this.k = a2;
        oda odaVar3 = ocjVar.d;
        jdg.Q(odaVar3, "offloadExecutorPool");
        obt obtVar = new obt(odaVar3);
        this.Z = obtVar;
        nyg nygVar = new nyg(nyzVar, obtVar);
        this.i = nygVar;
        new nyg(nyzVar, obtVar);
        occ occVar = new occ(nygVar.b());
        this.j = occVar;
        long a3 = oflVar.a();
        nyk nykVar = new nyk(b2, a3, "Channel for '" + str + "'");
        this.E = nykVar;
        nyj nyjVar = new nyj(nykVar, oflVar);
        this.F = nyjVar;
        nvi nviVar = oao.m;
        boolean z = ocjVar.m;
        this.N = z;
        oqv oqvVar = new oqv(nue.b());
        this.ah = oqvVar;
        nuw nuwVar = new nuw(z, oqvVar, null, null);
        ocjVar.q.a();
        jdg.u(nviVar);
        jdg.u(nvzVar);
        jdg.u(occVar);
        jdg.u(nyjVar);
        nur nurVar = new nur(443, nviVar, nvzVar, nuwVar, occVar, nyjVar, obtVar);
        this.W = nurVar;
        nut nutVar = ocjVar.f;
        this.V = nutVar;
        this.q = p(str, nutVar, nurVar);
        this.Y = new obt(odaVar);
        nzr nzrVar = new nzr(a2, nvzVar);
        this.x = nzrVar;
        nzrVar.f = obsVar;
        nzrVar.c = new nzp(obsVar, 1);
        nzrVar.d = new nzp(obsVar, 0);
        nzrVar.e = new nzp(obsVar, 2);
        ocb ocbVar = new ocb(this, this.q.a());
        this.H = ocbVar;
        this.ab = nxp.Q(ocbVar, list);
        jdg.Q(lgbVar, "stopwatchSupplier");
        long j = ocjVar.l;
        if (j == -1) {
            this.aa = -1L;
        } else {
            jdg.z(j >= ocj.b, "invalid idleTimeoutMillis %s", j);
            this.aa = ocjVar.l;
        }
        this.ag = new odl(new obv(this, 0), nvzVar, nygVar.b(), lga.b());
        nsy nsyVar = ocjVar.j;
        jdg.Q(nsyVar, "decompressorRegistry");
        this.n = nsyVar;
        jdg.Q(ocjVar.k, "compressorRegistry");
        this.p = ocjVar.h;
        this.M = 16777216L;
        this.L = 1048576L;
        obm obmVar = new obm(oflVar);
        this.C = obmVar;
        this.D = obmVar.a();
        ntj ntjVar = ocjVar.n;
        jdg.u(ntjVar);
        this.G = ntjVar;
        ntj.b(ntjVar.d, this);
    }

    private static nux p(String str, nut nutVar, nur nurVar) {
        URI uri;
        nux a2;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        if (uri == null || (a2 = nutVar.a(uri, nurVar)) == null) {
            String str2 = "";
            if (!b.matcher(str).matches()) {
                try {
                    nux a3 = nutVar.a(new URI(nutVar.b(), str2, "/" + str, null), nurVar);
                    if (a3 != null) {
                        return a3;
                    }
                } catch (URISyntaxException e3) {
                    throw new IllegalArgumentException(e3);
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            }
            objArr[1] = str2;
            throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
        }
        return a2;
    }

    private final void q() {
        this.m.c();
        oqv oqvVar = this.S;
        if (oqvVar != null) {
            oqvVar.j();
            this.S = null;
            this.Q = null;
        }
    }

    @Override // defpackage.nsb
    public final nsd a(nuq nuqVar, nsa nsaVar) {
        return this.ab.a(nuqVar, nsaVar);
    }

    @Override // defpackage.nsb
    public final String b() {
        return this.ab.b();
    }

    @Override // defpackage.ntr
    public final ntm c() {
        return this.h;
    }

    @Override // defpackage.nuf
    public final void d() {
        this.m.execute(new nzp(this, 18));
    }

    @Override // defpackage.nuf
    public final nsl e() {
        nsl nslVar = this.o.a;
        if (nslVar != null) {
            return nslVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    public final Executor f(nsa nsaVar) {
        Executor executor = nsaVar.c;
        return executor == null ? this.k : executor;
    }

    public final void g(boolean z) {
        ScheduledFuture scheduledFuture;
        odl odlVar = this.ag;
        odlVar.e = false;
        if (!z || (scheduledFuture = odlVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        odlVar.f = null;
    }

    public final void h() {
        n(true);
        this.x.a(null);
        this.F.a(2, "Entering IDLE state");
        this.o.a(nsl.IDLE);
        oat oatVar = this.O;
        Object[] objArr = {this.w, this.x};
        for (int i = 0; i < 2; i++) {
            if (oatVar.a.contains(objArr[i])) {
                i();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.m.c();
        if (this.z.get() || this.t) {
            return;
        }
        if (this.O.a.isEmpty()) {
            m();
        } else {
            g(false);
        }
        if (this.r != null) {
            return;
        }
        this.F.a(2, "Exiting idle mode");
        obw obwVar = new obw(this);
        obwVar.a = new nya(this.ah, obwVar, null, null);
        this.r = obwVar;
        this.q.d(new nuu(this, obwVar, this.q));
        this.ac = true;
    }

    public final void j() {
        if (!this.B && this.z.get() && this.u.isEmpty() && this.ad.isEmpty()) {
            this.F.a(2, "Terminated");
            ntj.c(this.G.d, this);
            this.X.b(this.k);
            this.Y.b();
            this.Z.b();
            this.i.close();
            this.B = true;
            this.ae.countDown();
        }
    }

    public final void k() {
        this.m.c();
        q();
        l();
    }

    public final void l() {
        this.m.c();
        if (this.ac) {
            this.q.b();
        }
    }

    public final void m() {
        long j = this.aa;
        if (j == -1) {
            return;
        }
        odl odlVar = this.ag;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a2 = odlVar.a() + nanos;
        odlVar.e = true;
        if (a2 - odlVar.d < 0 || odlVar.f == null) {
            ScheduledFuture scheduledFuture = odlVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            odlVar.f = odlVar.a.schedule(new obv(odlVar, 8), nanos, TimeUnit.NANOSECONDS);
        }
        odlVar.d = a2;
    }

    public final void n(boolean z) {
        this.m.c();
        if (z) {
            jdg.G(this.ac, "nameResolver is not started");
            jdg.G(this.r != null, "lbHelper is null");
        }
        if (this.q != null) {
            q();
            this.q.c();
            this.ac = false;
            if (z) {
                this.q = p(this.U, this.V, this.W);
            } else {
                this.q = null;
            }
        }
        obw obwVar = this.r;
        if (obwVar != null) {
            nya nyaVar = obwVar.a;
            nyaVar.b.c();
            nyaVar.b = null;
            this.r = null;
        }
        this.s = null;
    }

    public final void o(nua nuaVar) {
        this.s = nuaVar;
        this.x.a(nuaVar);
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.g("logId", this.h.a);
        S.b("target", this.U);
        return S.toString();
    }
}
