package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gxr  reason: default package */
/* loaded from: classes.dex */
public final class gxr implements mks {
    private final mks a;

    public gxr(mks mksVar) {
        this.a = mksVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final mkq schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a.a(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final mkq schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.a.b(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final mkq scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.a.c(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final mkq scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.a.d(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: hP */
    public final mko submit(Runnable runnable) {
        return this.a.hP(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: hQ */
    public final mko submit(Callable callable) {
        return this.a.hQ(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: hR */
    public final mko submit(Runnable runnable, Object obj) {
        return this.a.hR(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService, defpackage.mkr
    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService, defpackage.mkr
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }
}
