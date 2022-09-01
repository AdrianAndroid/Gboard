package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oei  reason: default package */
/* loaded from: classes2.dex */
public final class oei implements Executor, Runnable {
    private static final Logger a = Logger.getLogger(oei.class.getName());
    private static final oef b;
    private final Executor c;
    private final Queue d = new ConcurrentLinkedQueue();
    public volatile int runState = 0;

    static {
        oef oehVar;
        try {
            oehVar = new oeg(AtomicIntegerFieldUpdater.newUpdater(oei.class, "runState"));
        } catch (Throwable th) {
            a.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            oehVar = new oeh();
        }
        b = oehVar;
    }

    public oei(Executor executor) {
        jdg.Q(executor, "'executor' must not be null.");
        this.c = executor;
    }

    private final void a(Runnable runnable) {
        if (b.a(this)) {
            try {
                this.c.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.d.remove(runnable);
                }
                b.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Queue queue = this.d;
        jdg.Q(runnable, "'r' must not be null.");
        queue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        try {
            Executor executor = this.c;
            while (executor == this.c && (runnable = (Runnable) this.d.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", "Exception while executing runnable " + runnable, (Throwable) e);
                }
            }
            b.b(this);
            if (this.d.isEmpty()) {
                return;
            }
            a(null);
        } catch (Throwable th) {
            b.b(this);
            throw th;
        }
    }
}
