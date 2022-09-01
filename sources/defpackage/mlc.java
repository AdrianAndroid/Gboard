package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: mlc  reason: default package */
/* loaded from: classes.dex */
public final class mlc implements Executor {
    public static final Logger a = Logger.getLogger(mlc.class.getName());
    private final Executor e;
    public final Deque b = new ArrayDeque();
    public int d = 1;
    public long c = 0;
    private final mlb f = new mlb(this);

    public mlc(Executor executor) {
        jdg.u(executor);
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        jdg.u(runnable);
        synchronized (this.b) {
            int i = this.d;
            if (i != 4 && i != 3) {
                long j = this.c;
                mla mlaVar = new mla(runnable);
                this.b.add(mlaVar);
                this.d = 2;
                try {
                    this.e.execute(this.f);
                    if (this.d != 2) {
                        return;
                    }
                    synchronized (this.b) {
                        if (this.c == j && this.d == 2) {
                            this.d = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.b) {
                        int i2 = this.d;
                        boolean z = false;
                        if ((i2 == 1 || i2 == 2) && this.b.removeLastOccurrence(mlaVar)) {
                            z = true;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.e + "}";
    }
}
