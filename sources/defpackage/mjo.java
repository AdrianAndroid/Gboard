package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: mjo  reason: default package */
/* loaded from: classes.dex */
public final class mjo {
    private static final Logger c = Logger.getLogger(mjo.class.getName());
    public mjn a;
    public boolean b;

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = c;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.ExecutionList", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }
}
