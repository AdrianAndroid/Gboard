package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nsq  reason: default package */
/* loaded from: classes2.dex */
public final class nsq implements Runnable {
    final nso a;
    public final nsu b;
    private final Executor c;

    public nsq(Executor executor, nso nsoVar, nsu nsuVar) {
        this.c = executor;
        this.a = nsoVar;
        this.b = nsuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        try {
            this.c.execute(this);
        } catch (Throwable th) {
            nsu.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
