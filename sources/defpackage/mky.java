package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mky  reason: default package */
/* loaded from: classes.dex */
public final class mky extends mkv implements mks {
    final ScheduledExecutorService a;

    public mky(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        jdg.u(scheduledExecutorService);
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final mkq schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        mlk g = mlk.g(runnable, null);
        return new mkw(g, this.a.schedule(g, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final mkq schedule(Callable callable, long j, TimeUnit timeUnit) {
        mlk f = mlk.f(callable);
        return new mkw(f, this.a.schedule(f, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final mkq scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        mkx mkxVar = new mkx(runnable);
        return new mkw(mkxVar, this.a.scheduleAtFixedRate(mkxVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final mkq scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        mkx mkxVar = new mkx(runnable);
        return new mkw(mkxVar, this.a.scheduleWithFixedDelay(mkxVar, j, j2, timeUnit));
    }
}
