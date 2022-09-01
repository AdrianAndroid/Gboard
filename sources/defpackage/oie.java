package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oie  reason: default package */
/* loaded from: classes2.dex */
final class oie extends ConcurrentLinkedQueue implements Executor {
    public volatile Object b;
    private static final Logger c = Logger.getLogger(oie.class.getName());
    public static final Object a = new Object();

    public static void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            c.logp(Level.WARNING, "io.grpc.stub.ClientCalls$ThreadlessExecutor", "runQuietly", "Runnable threw exception", th);
        }
    }

    public static void b() {
        if (!Thread.interrupted()) {
            return;
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        add(runnable);
        Object obj = this.b;
        if (obj != a) {
            LockSupport.unpark((Thread) obj);
        } else if (remove(runnable) && oig.a) {
            throw new RejectedExecutionException();
        }
    }
}
