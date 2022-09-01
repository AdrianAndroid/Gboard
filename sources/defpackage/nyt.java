package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nyt  reason: default package */
/* loaded from: classes2.dex */
final class nyt extends nsd {
    private static final Logger h = Logger.getLogger(nyt.class.getName());
    public final nuq a;
    public final Executor b;
    public final nyi c;
    public final nsu d;
    public nyu e;
    public volatile boolean f;
    private final boolean i;
    private volatile ScheduledFuture j;
    private final boolean k;
    private nsa l;
    private boolean m;
    private boolean n;
    private final ScheduledExecutorService p;
    private final opu q;
    private final nyr o = new nyr(this, 0);
    public nsy g = nsy.b;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
    }

    public nyt(nuq nuqVar, Executor executor, nsa nsaVar, opu opuVar, ScheduledExecutorService scheduledExecutorService, nyi nyiVar, byte[] bArr, byte[] bArr2) {
        boolean z = false;
        nsk nskVar = nsk.a;
        this.a = nuqVar;
        String str = nuqVar.b;
        System.identityHashCode(this);
        int i = oiw.a;
        if (executor == mjl.a) {
            this.b = new oee();
            this.i = true;
        } else {
            this.b = new oei(executor);
            this.i = false;
        }
        this.c = nyiVar;
        this.d = nsu.k();
        nup nupVar = nuqVar.a;
        this.k = (nupVar == nup.UNARY || nupVar == nup.SERVER_STREAMING) ? true : z;
        this.l = nsaVar;
        this.q = opuVar;
        this.p = scheduledExecutorService;
    }

    private final void h(Object obj) {
        jdg.G(this.e != null, "Not started");
        jdg.G(!this.m, "call was cancelled");
        jdg.G(!this.n, "call was half-closed");
        try {
            nyu nyuVar = this.e;
            if (!(nyuVar instanceof oec)) {
                nyuVar.n(this.a.b(obj));
            } else {
                oec oecVar = (oec) nyuVar;
                ody odyVar = oecVar.q;
                if (odyVar.a) {
                    odyVar.f.a.n(oecVar.e.b(obj));
                } else {
                    oecVar.s(new odr(oecVar, obj));
                }
            }
            if (this.k) {
                return;
            }
            this.e.d();
        } catch (Error e) {
            this.e.c(nvu.c.f("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.e.c(nvu.c.e(e2).f("Failed to stream message"));
        }
    }

    @Override // defpackage.nsd
    public final void a(nxp nxpVar, num numVar) {
        nsa nsaVar;
        nyu oecVar;
        int i = oiw.a;
        jdg.G(this.e == null, "Already started");
        jdg.G(!this.m, "call was cancelled");
        if (!this.d.i()) {
            ocm ocmVar = (ocm) this.l.e(ocm.a);
            if (ocmVar != null) {
                Long l = ocmVar.b;
                if (l != null) {
                    nsv f = nsv.f(l.longValue(), TimeUnit.NANOSECONDS, nsv.c);
                    nsv nsvVar = this.l.b;
                    if (nsvVar == null || f.compareTo(nsvVar) < 0) {
                        nsa nsaVar2 = new nsa(this.l);
                        nsaVar2.b = f;
                        this.l = nsaVar2;
                    }
                }
                Boolean bool = ocmVar.c;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        nsaVar = new nsa(this.l);
                        nsaVar.e = Boolean.TRUE;
                    } else {
                        nsaVar = new nsa(this.l);
                        nsaVar.e = Boolean.FALSE;
                    }
                    this.l = nsaVar;
                }
                Integer num = ocmVar.d;
                if (num != null) {
                    nsa nsaVar3 = this.l;
                    Integer num2 = nsaVar3.f;
                    if (num2 != null) {
                        this.l = nsaVar3.b(Math.min(num2.intValue(), ocmVar.d.intValue()));
                    } else {
                        this.l = nsaVar3.b(num.intValue());
                    }
                }
                Integer num3 = ocmVar.e;
                if (num3 != null) {
                    nsa nsaVar4 = this.l;
                    Integer num4 = nsaVar4.g;
                    if (num4 != null) {
                        this.l = nsaVar4.c(Math.min(num4.intValue(), ocmVar.e.intValue()));
                    } else {
                        this.l = nsaVar4.c(num3.intValue());
                    }
                }
            }
            nsi nsiVar = nsh.a;
            nsy nsyVar = this.g;
            numVar.d(oao.g);
            numVar.d(oao.c);
            if (nsiVar != nsh.a) {
                numVar.f(oao.c, "identity");
            }
            numVar.d(oao.d);
            byte[] bArr = nsyVar.c;
            if (bArr.length != 0) {
                numVar.f(oao.d, bArr);
            }
            numVar.d(oao.e);
            numVar.d(oao.f);
            nsv f2 = f();
            if (f2 == null || !f2.d()) {
                nsv b = this.d.b();
                nsv nsvVar2 = this.l.b;
                Logger logger = h;
                if (logger.isLoggable(Level.FINE) && f2 != null && f2.equals(b)) {
                    StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, f2.b(TimeUnit.NANOSECONDS)))));
                    if (nsvVar2 == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", Long.valueOf(nsvVar2.b(TimeUnit.NANOSECONDS))));
                    }
                    logger.logp(Level.FINE, "io.grpc.internal.ClientCallImpl", "logIfContextNarrowedTimeout", sb.toString());
                }
                opu opuVar = this.q;
                nuq nuqVar = this.a;
                nsa nsaVar5 = this.l;
                nsu nsuVar = this.d;
                Object obj = opuVar.a;
                if (!((oce) obj).N) {
                    nyx a = opuVar.a(new ntx(nuqVar, numVar, nsaVar5));
                    nsu a2 = nsuVar.a();
                    oecVar = a.m(nuqVar, numVar, nsaVar5, oao.m(nsaVar5, 0, false));
                    nsuVar.f(a2);
                } else {
                    oeb oebVar = ((oce) obj).I.a;
                    ocm ocmVar2 = (ocm) nsaVar5.e(ocm.a);
                    oecVar = new oec(opuVar, nuqVar, numVar, nsaVar5, ocmVar2 == null ? null : ocmVar2.f, ocmVar2 == null ? null : ocmVar2.g, oebVar, nsuVar, null, null);
                }
                this.e = oecVar;
            } else {
                nxp[] m = oao.m(this.l, 0, false);
                nvu nvuVar = nvu.e;
                new StringBuilder("ClientCall started after deadline exceeded: ").append(f2);
                this.e = new oad(nvuVar.f("ClientCall started after deadline exceeded: ".concat(f2.toString())), m, null, null, null);
            }
            if (this.i) {
                this.e.f();
            }
            Integer num5 = this.l.f;
            if (num5 != null) {
                this.e.k(num5.intValue());
            }
            Integer num6 = this.l.g;
            if (num6 != null) {
                this.e.l(num6.intValue());
            }
            if (f2 != null) {
                this.e.i(f2);
            }
            this.e.h(nsiVar);
            this.e.j(this.g);
            this.c.b();
            this.e.m(new nyq(this, nxpVar, null, null, null));
            this.d.d(this.o, mjl.a);
            if (f2 != null && !f2.equals(this.d.b()) && this.p != null) {
                long b2 = f2.b(TimeUnit.NANOSECONDS);
                this.j = this.p.schedule(new obj(new nys(this, b2)), b2, TimeUnit.NANOSECONDS);
            }
            if (!this.f) {
                return;
            }
            g();
            return;
        }
        this.e = ocz.a;
        this.b.execute(new nyl(this, nxpVar, null, null, null));
    }

    @Override // defpackage.nsd
    public final void b(String str, Throwable th) {
        nvu f;
        int i = oiw.a;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            h.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.m) {
            return;
        }
        this.m = true;
        if (this.e != null) {
            nvu nvuVar = nvu.c;
            if (str != null) {
                f = nvuVar.f(str);
            } else {
                f = nvuVar.f("Call cancelled without message");
            }
            if (th != null) {
                f = f.e(th);
            }
            this.e.c(f);
        }
        g();
    }

    @Override // defpackage.nsd
    public final void c() {
        int i = oiw.a;
        jdg.G(this.e != null, "Not started");
        jdg.G(!this.m, "call was cancelled");
        jdg.G(!this.n, "call already half-closed");
        this.n = true;
        this.e.e();
    }

    @Override // defpackage.nsd
    public final void d(int i) {
        int i2 = oiw.a;
        jdg.G(this.e != null, "Not started");
        jdg.w(true, "Number requested must be non-negative");
        this.e.g(i);
    }

    @Override // defpackage.nsd
    public final void e(Object obj) {
        int i = oiw.a;
        h(obj);
    }

    public final nsv f() {
        nsv nsvVar = this.l.b;
        nsv b = this.d.b();
        if (nsvVar == null) {
            return b;
        }
        if (b == null) {
            return nsvVar;
        }
        nsvVar.c(b);
        nsvVar.c(b);
        return nsvVar.a - b.a < 0 ? nsvVar : b;
    }

    public final void g() {
        this.d.g(this.o);
        ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("method", this.a);
        return S.toString();
    }
}
