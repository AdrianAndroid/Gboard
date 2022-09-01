package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: fez  reason: default package */
/* loaded from: classes.dex */
public final class fez implements Runnable {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/base/TimeOutTaskRunner");
    private final ScheduledExecutorService c;
    private final Runnable e;
    private final long f;
    private final AtomicReference d = new AtomicReference();
    final AtomicBoolean a = new AtomicBoolean();

    public fez(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j) {
        this.c = scheduledExecutorService;
        this.e = runnable;
        this.f = j;
    }

    private final synchronized void d() {
        Future future = (Future) this.d.getAndSet(null);
        if (future == null || future.isDone()) {
            return;
        }
        future.cancel(true);
    }

    private final synchronized void e() {
        this.d.set(((gxr) this.c).schedule(this, this.f, TimeUnit.MILLISECONDS));
    }

    public final synchronized void a() {
        if (!this.a.get()) {
            return;
        }
        d();
        e();
    }

    public final synchronized void b() {
        if (this.a.compareAndSet(false, true)) {
            a();
        }
    }

    public final synchronized void c() {
        if (this.a.compareAndSet(true, false)) {
            d();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            if (Thread.interrupted()) {
                return;
            }
            this.a.set(false);
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/voiceime/base/TimeOutTaskRunner", "run", 76, "TimeOutTaskRunner.java")).t("Operation timed out.");
            this.e.run();
        }
    }
}
