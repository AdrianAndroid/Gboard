package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oas  reason: default package */
/* loaded from: classes2.dex */
public final class oas {
    private static final Logger g = Logger.getLogger(oas.class.getName());
    public final long a;
    public final lga b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public Throwable e;
    public long f;

    public oas(long j, lga lgaVar) {
        this.a = j;
        this.b = lgaVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            g.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static Runnable b() {
        return new mkm(4);
    }

    public static void c(opu opuVar, Executor executor, Throwable th) {
        a(executor, d(opuVar));
    }

    public static Runnable d(opu opuVar) {
        return new nzp(opuVar, 9, null, null, null);
    }
}
