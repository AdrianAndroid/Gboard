package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oee  reason: default package */
/* loaded from: classes2.dex */
public final class oee implements Executor {
    private static final Logger a = Logger.getLogger(oee.class.getName());
    private boolean b;
    private ArrayDeque c;

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    new StringBuilder("Exception while executing runnable ").append(runnable);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
                }
            } else {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        jdg.Q(runnable, "'task' must not be null.");
        if (!this.b) {
            this.b = true;
            try {
                runnable.run();
                if (this.c != null) {
                    a();
                }
                this.b = false;
                return;
            } catch (Throwable th) {
                try {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", "Exception while executing runnable " + runnable, th);
                    if (this.c != null) {
                        a();
                    }
                    this.b = false;
                    return;
                } catch (Throwable th2) {
                    if (this.c != null) {
                        a();
                    }
                    this.b = false;
                    throw th2;
                }
            }
        }
        if (this.c == null) {
            this.c = new ArrayDeque(4);
        }
        this.c.add(runnable);
    }
}
