package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gxc  reason: default package */
/* loaded from: classes.dex */
public abstract class gxc extends mil implements mks {
    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final mkq schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        mkp b = mkp.b(runnable);
        e(b, j, timeUnit);
        return new gxb(b, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final mkq schedule(Callable callable, long j, TimeUnit timeUnit) {
        mkp a = mkp.a(callable);
        e(a, j, timeUnit);
        return new gxb(a, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final mkq scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final mkq scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    protected abstract void e(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
