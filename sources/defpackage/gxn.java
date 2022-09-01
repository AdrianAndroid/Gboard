package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gxn  reason: default package */
/* loaded from: classes.dex */
public final class gxn extends gxc {
    public static final /* synthetic */ int b = 0;
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/concurrent/DelegateSequentialExecutorService");
    public final ExecutorService a;
    private final Executor d;
    private final mks e;

    public gxn(ExecutorService executorService, mks mksVar) {
        this.a = executorService;
        this.d = kcu.E(executorService);
        this.e = mksVar;
    }

    @Override // defpackage.gxc, java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        try {
            return this.a.awaitTermination(j, timeUnit);
        } catch (InterruptedException e) {
            ((ltd) ((ltd) ((ltd) c.c()).i(e)).k("com/google/android/libraries/inputmethod/concurrent/DelegateSequentialExecutorService", "awaitTermination", 'X', "DelegateSequentialExecutorService.java")).s();
            return false;
        }
    }

    @Override // defpackage.gxc
    public final void e(Runnable runnable, long j, TimeUnit timeUnit) {
        this.e.a(new gxi(this, runnable, 2), j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(new gxi(this, runnable, 3));
    }

    @Override // defpackage.gxc, java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // defpackage.gxc, java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // defpackage.gxc, java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // defpackage.gxc, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }
}
