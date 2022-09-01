package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gxm  reason: default package */
/* loaded from: classes.dex */
public final class gxm extends mjz implements mks {
    public static final /* synthetic */ int b = 0;
    public final mks a;
    private final mkr c;

    public gxm(mkr mkrVar, mks mksVar) {
        this.c = mkrVar;
        this.a = mksVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final mkq schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        mkp b2 = mkp.b(runnable);
        return new gxl(b2, this.a.a(new gxi(this, b2, 0), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final mkq schedule(Callable callable, long j, TimeUnit timeUnit) {
        mkp a = mkp.a(callable);
        return new gxl(a, this.a.a(new gxi(this, a, 1), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final mkq scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final Executor E = kcu.E(this);
        final mld e = mld.e();
        return new gxl(e, this.a.c(new Runnable() { // from class: gxh
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor = E;
                final Runnable runnable2 = runnable;
                final mld mldVar = e;
                executor.execute(new Runnable() { // from class: gxg
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable3 = runnable2;
                        mld mldVar2 = mldVar;
                        int i = gxm.b;
                        try {
                            runnable3.run();
                        } catch (Throwable th) {
                            mldVar2.n(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final mkq scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        mld e = mld.e();
        gxl gxlVar = new gxl(e, null);
        gxlVar.a = this.a.a(new gxk(this, runnable, e, gxlVar, j2, timeUnit), j, timeUnit);
        return gxlVar;
    }

    @Override // defpackage.mjz
    protected final mkr e() {
        return this.c;
    }

    @Override // defpackage.lkz
    protected final /* synthetic */ Object f() {
        return this.c;
    }

    @Override // defpackage.mjz, defpackage.mjv
    protected final /* synthetic */ ExecutorService g() {
        return this.c;
    }
}
