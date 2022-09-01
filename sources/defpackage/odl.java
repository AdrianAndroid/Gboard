package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: odl  reason: default package */
/* loaded from: classes2.dex */
final class odl {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final lga g;

    public odl(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, lga lgaVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = lgaVar;
        lgaVar.e();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
