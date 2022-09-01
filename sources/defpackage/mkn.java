package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mkn  reason: default package */
/* loaded from: classes.dex */
public abstract class mkn extends AtomicReference implements Runnable {
    private static final Runnable a = new mkm(0);
    private static final Runnable b = new mkm(0);

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        mkl mklVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (runnable instanceof mkl) {
                mklVar = (mkl) runnable;
            } else if (runnable != b) {
                break;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(mklVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract Object a();

    public abstract String b();

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            mkl mklVar = new mkl(this);
            mklVar.a(Thread.currentThread());
            if (!compareAndSet(runnable, mklVar)) {
                return;
            }
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (((Runnable) getAndSet(a)) != b) {
                    return;
                }
                LockSupport.unpark(thread);
            } catch (Throwable th) {
                if (((Runnable) getAndSet(a)) == b) {
                    LockSupport.unpark((Thread) runnable);
                }
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z = !g();
        if (z) {
            try {
                obj = a();
            } catch (Throwable th) {
                try {
                    kcu.A(th);
                    if (!compareAndSet(currentThread, a)) {
                        c(currentThread);
                    }
                    d(th);
                    return;
                } catch (Throwable th2) {
                    if (!compareAndSet(currentThread, a)) {
                        c(currentThread);
                    }
                    e(null);
                    throw th2;
                }
            }
        }
        if (!compareAndSet(currentThread, a)) {
            c(currentThread);
        }
        if (!z) {
            return;
        }
        e(obj);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof mkl) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
