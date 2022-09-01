package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nzo  reason: default package */
/* loaded from: classes2.dex */
public class nzo extends nsd {
    private static final Logger c = Logger.getLogger(nzo.class.getName());
    private static final nsd d = new nzk();
    public final nsu a;
    public nsd b;
    private final ScheduledFuture e;
    private final Executor f;
    private volatile boolean g;
    private nvu h;
    private List i = new ArrayList();
    private nzn j;
    private nxp k;

    /* JADX INFO: Access modifiers changed from: protected */
    public nzo(Executor executor, ScheduledExecutorService scheduledExecutorService, nsv nsvVar) {
        ScheduledFuture<?> schedule;
        jdg.Q(executor, "callExecutor");
        this.f = executor;
        jdg.Q(scheduledExecutorService, "scheduler");
        nsu k = nsu.k();
        this.a = k;
        nsv b = k.b();
        if (nsvVar == null && b == null) {
            schedule = null;
        } else {
            long min = nsvVar != null ? Math.min(Long.MAX_VALUE, nsvVar.b(TimeUnit.NANOSECONDS)) : Long.MAX_VALUE;
            if (b != null && b.b(TimeUnit.NANOSECONDS) < min) {
                min = b.b(TimeUnit.NANOSECONDS);
                Logger logger = c;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(min)));
                    if (nsvVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", Long.valueOf(nsvVar.b(TimeUnit.NANOSECONDS))));
                    }
                    logger.logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
                }
            }
            long abs = Math.abs(min) / TimeUnit.SECONDS.toNanos(1L);
            long abs2 = Math.abs(min) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (min < 0) {
                sb2.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
            } else {
                sb2.append("Deadline exceeded after ");
            }
            sb2.append(abs);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            schedule = scheduledExecutorService.schedule(new kht(this, sb2, 18), min, TimeUnit.NANOSECONDS);
        }
        this.e = schedule;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (!this.g) {
                this.i.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.nsd
    public final void a(nxp nxpVar, num numVar) {
        nvu nvuVar;
        boolean z;
        jdg.G(this.k == null, "already started");
        synchronized (this) {
            this.k = nxpVar;
            nvuVar = this.h;
            z = this.g;
            if (!z) {
                nzn nznVar = new nzn(nxpVar, null, null, null);
                this.j = nznVar;
                nxpVar = nznVar;
            }
        }
        if (nvuVar != null) {
            this.f.execute(new nzl(this, nxpVar, nvuVar, null, null, null));
        } else if (z) {
            this.b.a(nxpVar, numVar);
        } else {
            j(new kme(this, nxpVar, numVar, 5, null, null, null));
        }
    }

    @Override // defpackage.nsd
    public final void b(String str, Throwable th) {
        nvu f;
        nvu nvuVar = nvu.c;
        if (str != null) {
            f = nvuVar.f(str);
        } else {
            f = nvuVar.f("Call cancelled without message");
        }
        if (th != null) {
            f = f.e(th);
        }
        g(f, false);
    }

    @Override // defpackage.nsd
    public final void c() {
        j(new kvl(this, 19));
    }

    @Override // defpackage.nsd
    public final void d(int i) {
        if (this.g) {
            this.b.d(i);
        } else {
            j(new dob(this, i, 14));
        }
    }

    @Override // defpackage.nsd
    public final void e(Object obj) {
        if (this.g) {
            this.b.e(obj);
        } else {
            j(new kht(this, obj, 20));
        }
    }

    protected void f() {
    }

    public final void g(nvu nvuVar, boolean z) {
        boolean z2;
        nxp nxpVar;
        synchronized (this) {
            if (this.b == null) {
                i(d);
                nxpVar = this.k;
                this.h = nvuVar;
                z2 = false;
            } else if (z) {
                return;
            } else {
                z2 = true;
                nxpVar = null;
            }
            nxp nxpVar2 = nxpVar;
            if (z2) {
                j(new kht(this, nvuVar, 19));
            } else {
                if (nxpVar2 != null) {
                    this.f.execute(new nzl(this, nxpVar2, nvuVar, null, null, null));
                }
                h();
            }
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.i     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.i = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.g = r0     // Catch: java.lang.Throwable -> L42
            nzn r0 = r3.j     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f
            nzj r2 = new nzj
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.i     // Catch: java.lang.Throwable -> L42
            r3.i = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            goto L46
        L45:
            throw r0
        L46:
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzo.h():void");
    }

    public final void i(nsd nsdVar) {
        nsd nsdVar2 = this.b;
        jdg.J(nsdVar2 == null, "realCall already set to %s", nsdVar2);
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = nsdVar;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("realCall", this.b);
        return S.toString();
    }
}
