package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: mkk  reason: default package */
/* loaded from: classes.dex */
public final class mkk implements mko {
    public static final mko a = new mkk(null);
    private static final Logger b = Logger.getLogger(mkk.class.getName());
    private final Object c;

    public mkk(Object obj) {
        this.c = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // defpackage.mko
    public final void d(Runnable runnable, Executor executor) {
        jdg.Q(runnable, "Runnable was null.");
        jdg.Q(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = b;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        jdg.u(timeUnit);
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.c + "]]";
    }
}
