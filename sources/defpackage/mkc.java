package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: mkc  reason: default package */
/* loaded from: classes.dex */
public final class mkc implements Runnable {
    public Object a;
    public Object b;
    private final /* synthetic */ int c;

    public mkc(mix mixVar, Executor executor, int i) {
        this.c = i;
        jdg.u(mixVar);
        this.a = mixVar;
        jdg.u(executor);
        this.b = executor;
    }

    public mkc(mko mkoVar, Future future, int i) {
        this.c = i;
        this.a = mkoVar;
        this.b = future;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            kcu.V(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }
}
