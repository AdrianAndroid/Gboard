package defpackage;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: nvz  reason: default package */
/* loaded from: classes2.dex */
public final class nvz implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public nvz(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        jdg.Q(uncaughtExceptionHandler, "uncaughtExceptionHandler");
        this.a = uncaughtExceptionHandler;
    }

    public final void a() {
        do {
            AtomicReference atomicReference = this.c;
            Thread currentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, currentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        this.c.set(null);
                    }
                } catch (Throwable th) {
                    this.c.set(null);
                    throw th;
                }
            }
        } while (!this.b.isEmpty());
    }

    public final void b(Runnable runnable) {
        Queue queue = this.b;
        jdg.Q(runnable, "runnable is null");
        queue.add(runnable);
    }

    public final void c() {
        jdg.G(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    public final oqv d(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        nvy nvyVar = new nvy(runnable);
        return new oqv(nvyVar, scheduledExecutorService.schedule(new nvx(this, nvyVar, runnable), j, timeUnit));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
