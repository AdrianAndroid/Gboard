package defpackage;

import android.os.SystemClock;
import android.util.Printer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: hpk  reason: default package */
/* loaded from: classes.dex */
public final class hpk implements mkr, hhk, gzv {
    public boolean b;
    private final mkr d = kcu.C();
    private final mkr e;
    private boolean f;
    private mko g;
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/inputconnection/FlaggedListeningExecutorService");
    public static final hhl a = hhq.a("call_ic_from_background", false);

    public hpk() {
        mks f = gxp.a().f("ICWrapper", 0);
        hhl hhlVar = a;
        this.b = ((Boolean) hhlVar.c()).booleanValue();
        this.e = f;
        hhlVar.e(this);
        gzt.a.a(this);
    }

    private final mkr c() {
        return this.b ? this.e : this.d;
    }

    private final void d() {
        boolean z = false;
        if (!this.f && ((Boolean) a.c()).booleanValue()) {
            z = true;
        }
        if (this.b && !z) {
            mko mkoVar = this.g;
            if (mkoVar != null && !mkoVar.isDone()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    this.g.get(100L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    ((ltd) ((ltd) ((ltd) c.d()).i(e)).k("com/google/android/libraries/inputmethod/inputconnection/FlaggedListeningExecutorService", "maybeUpdateExecutor", '[', "FlaggedListeningExecutorService.java")).t("Timeout to wait future done.");
                }
                ((ltd) ((ltd) c.b()).k("com/google/android/libraries/inputmethod/inputconnection/FlaggedListeningExecutorService", "maybeUpdateExecutor", 93, "FlaggedListeningExecutorService.java")).v("Revert back to direct executor, wait last future for %s ms. ", SystemClock.elapsedRealtime() - elapsedRealtime);
            }
            this.g = null;
        }
        this.b = z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return c().awaitTermination(j, timeUnit);
    }

    public final void b(boolean z) {
        this.f = z;
        d();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("callIcFromBackground = ".concat(String.valueOf(String.valueOf(a))));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c().execute(runnable);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "FlaggedListeningExecutorService";
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: hP */
    public final mko submit(Runnable runnable) {
        mko hP = c().hP(runnable);
        if (this.b) {
            this.g = hP;
        }
        return hP;
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: hQ */
    public final mko submit(Callable callable) {
        mko hQ = c().hQ(callable);
        if (this.b) {
            this.g = hQ;
        }
        return hQ;
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: hR */
    public final mko submit(Runnable runnable, Object obj) {
        mko hR = c().hR(runnable, obj);
        if (this.b) {
            this.g = hR;
        }
        return hR;
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        d();
    }

    @Override // defpackage.mkr
    public final List invokeAll(Collection collection) {
        return c().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return c().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return c().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return c().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        c().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return c().shutdownNow();
    }

    @Override // defpackage.mkr
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return c().invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return c().invokeAny(collection, j, timeUnit);
    }
}
