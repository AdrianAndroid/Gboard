package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* renamed from: mil  reason: default package */
/* loaded from: classes.dex */
public abstract class mil extends AbstractExecutorService implements mkr {
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: hP */
    public final mko submit(Runnable runnable) {
        return (mko) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: hQ */
    public final mko submit(Callable callable) {
        return (mko) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: hR */
    public final mko submit(Runnable runnable, Object obj) {
        return (mko) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return mlk.g(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return mlk.f(callable);
    }
}
