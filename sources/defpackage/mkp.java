package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mkp  reason: default package */
/* loaded from: classes.dex */
public final class mkp extends FutureTask implements mko {
    private final mjo a = new mjo();

    public mkp(Runnable runnable) {
        super(runnable, null);
    }

    public static mkp a(Callable callable) {
        return new mkp(callable);
    }

    public static mkp b(Runnable runnable) {
        return new mkp(runnable);
    }

    @Override // defpackage.mko
    public final void d(Runnable runnable, Executor executor) {
        mjo mjoVar = this.a;
        jdg.Q(runnable, "Runnable was null.");
        jdg.Q(executor, "Executor was null.");
        synchronized (mjoVar) {
            if (!mjoVar.b) {
                mjoVar.a = new mjn(runnable, executor, mjoVar.a);
            } else {
                mjo.a(runnable, executor);
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        mjo mjoVar = this.a;
        synchronized (mjoVar) {
            if (mjoVar.b) {
                return;
            }
            mjoVar.b = true;
            mjn mjnVar = mjoVar.a;
            mjn mjnVar2 = null;
            mjoVar.a = null;
            while (mjnVar != null) {
                mjn mjnVar3 = mjnVar.c;
                mjnVar.c = mjnVar2;
                mjnVar2 = mjnVar;
                mjnVar = mjnVar3;
            }
            while (mjnVar2 != null) {
                mjo.a(mjnVar2.a, mjnVar2.b);
                mjnVar2 = mjnVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return super.get(j, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public mkp(Callable callable) {
        super(callable);
    }
}
