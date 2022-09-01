package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: pay  reason: default package */
/* loaded from: classes2.dex */
public final class pay {
    public final ThreadFactory a;
    public final long b;
    public final ConcurrentLinkedQueue c;
    public final pbx d;
    private final ScheduledExecutorService e;
    private final Future f;

    public pay(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture<?> scheduledFuture;
        this.a = threadFactory;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.b = nanos;
        this.c = new ConcurrentLinkedQueue();
        this.d = new pbx();
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, new pax(threadFactory));
            pbe.f(scheduledExecutorService);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new owv(this, 5), nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.e = scheduledExecutorService;
        this.f = scheduledFuture;
    }

    public final void a() {
        try {
            Future future = this.f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        } finally {
            this.d.d();
        }
    }
}
