package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: mkt  reason: default package */
/* loaded from: classes.dex */
public final class mkt implements Executor {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public mkt(Executor executor, mik mikVar, int i) {
        this.c = i;
        this.a = executor;
        this.b = mikVar;
    }

    public mkt(lzi lziVar, Executor executor, int i) {
        this.c = i;
        this.b = lziVar;
        this.a = executor;
    }

    public mkt(ows owsVar, Executor executor, int i) {
        this.c = i;
        this.a = owsVar;
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        if (i == 0) {
            try {
                this.a.execute(runnable);
            } catch (RejectedExecutionException e) {
                ((mik) this.b).n(e);
            }
        } else if (i == 1) {
            try {
                this.a.execute(runnable);
            } catch (RejectedExecutionException e2) {
                ((mik) this.b).n(e2);
            }
        } else {
            try {
                this.b.execute(runnable);
            } catch (RejectedExecutionException e3) {
                ((ows) this.a).f(e3);
            }
        }
    }
}
