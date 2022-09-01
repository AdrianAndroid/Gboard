package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: ozz  reason: default package */
/* loaded from: classes2.dex */
final class ozz implements Runnable, ozu {
    private final pam a;
    private final Handler b;
    private volatile boolean c;

    public ozz(pam pamVar, Handler handler) {
        this.a = pamVar;
        this.b = handler;
    }

    @Override // defpackage.ozu
    public final void d() {
        this.c = true;
        this.b.removeCallbacks(this);
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IllegalStateException illegalStateException;
        try {
            this.a.a();
        } catch (Throwable th) {
            if (th instanceof pai) {
                illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th);
            } else {
                illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
            }
            pbq.a.c();
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
        }
    }
}
