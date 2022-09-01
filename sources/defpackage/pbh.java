package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: pbh  reason: default package */
/* loaded from: classes2.dex */
public final class pbh extends AtomicReference implements Runnable, ozu {
    private static final long serialVersionUID = -3962399486978279857L;
    final pbk a = new pbk();
    final pam b;

    public pbh(pam pamVar) {
        this.b = pamVar;
    }

    static final void a(Throwable th) {
        pbp.b(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    @Override // defpackage.ozu
    public final void d() {
        if (!this.a.b) {
            this.a.d();
        }
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.a.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.b.a();
            } finally {
                d();
            }
        } catch (pai e) {
            a(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable th) {
            a(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th));
        }
    }
}
