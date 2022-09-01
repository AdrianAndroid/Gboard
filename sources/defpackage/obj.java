package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: obj  reason: default package */
/* loaded from: classes2.dex */
public final class obj implements Runnable {
    private static final Logger a = Logger.getLogger(obj.class.getName());
    private final Runnable b;

    public obj(Runnable runnable) {
        jdg.Q(runnable, "task");
        this.b = runnable;
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.b + ")";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("Exception while executing runnable ");
            Runnable runnable = this.b;
            sb.append(runnable);
            logger.logp(level, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(runnable.toString()), th);
            lgf.f(th);
            throw new AssertionError(th);
        }
    }
}
