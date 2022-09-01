package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gns  reason: default package */
/* loaded from: classes.dex */
public final class gns extends gnp {
    private static final Runnable b = bsd.m;
    private final mkr c;
    private final mks d;

    public gns(Class cls, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        super(cls);
        this.c = kcu.B(executorService);
        this.d = kcu.D(scheduledExecutorService);
    }

    @Override // defpackage.gnp
    protected final mko f(Callable callable) {
        return this.c.hQ(callable);
    }

    @Override // defpackage.gnp
    public final void g(long j, Runnable runnable) {
        kcu.U(this.d.a(b, j, TimeUnit.MILLISECONDS), new fkb(runnable, 2), this.c);
    }

    @Override // defpackage.gnp
    public final void h(Runnable runnable) {
        this.c.execute(runnable);
    }
}
