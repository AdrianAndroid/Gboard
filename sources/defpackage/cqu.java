package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: cqu  reason: default package */
/* loaded from: classes.dex */
public final class cqu implements AutoCloseable {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final hit c;
    public volatile iru d = iru.UNKNOWN;
    private final irt e;

    public cqu(Executor executor, mks mksVar) {
        cqs cqsVar = cqs.a;
        cqt cqtVar = new cqt(this);
        this.e = cqtVar;
        this.a = executor;
        this.b = mksVar;
        this.c = cqsVar;
        cqtVar.f(executor);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.g();
    }
}
