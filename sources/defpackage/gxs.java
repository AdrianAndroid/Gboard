package defpackage;

import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: gxs  reason: default package */
/* loaded from: classes.dex */
final class gxs extends ScheduledThreadPoolExecutor {
    private final AtomicLong a = new AtomicLong(0);

    public gxs(kbs kbsVar, byte[] bArr) {
        super(1, kbsVar);
        setKeepAliveTime(2L, TimeUnit.MINUTES);
        allowCoreThreadTimeOut(false);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return new gyd(runnable, runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS), this.a.getAndIncrement());
    }
}
