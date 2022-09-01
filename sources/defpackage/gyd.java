package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gyd  reason: default package */
/* loaded from: classes.dex */
final class gyd extends FutureTask implements RunnableScheduledFuture {
    private final long a;
    private final long b;

    public gyd(Runnable runnable, long j, long j2) {
        super(runnable, null);
        this.a = System.nanoTime() + j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (delayed2 instanceof gyd) {
            gyd gydVar = (gyd) delayed2;
            long j = this.a - gydVar.a;
            if (j < 0) {
                return -1;
            }
            return (j <= 0 && this.b < gydVar.b) ? -1 : 1;
        }
        return Long.signum(getDelay(TimeUnit.NANOSECONDS) - delayed2.getDelay(TimeUnit.NANOSECONDS));
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        if (timeUnit != null) {
            return timeUnit.convert(this.a - System.nanoTime(), TimeUnit.NANOSECONDS);
        }
        return 0L;
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        System.currentTimeMillis();
        super.run();
    }
}
