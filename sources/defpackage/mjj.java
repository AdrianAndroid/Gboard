package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mjj  reason: default package */
/* loaded from: classes.dex */
public abstract class mjj extends mkn {
    private final Executor a;
    final /* synthetic */ mjk b;

    public mjj(mjk mjkVar, Executor executor) {
        this.b = mjkVar;
        jdg.u(executor);
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.mkn
    public final void d(Throwable th) {
        mjk.t(this.b);
        if (th instanceof ExecutionException) {
            this.b.n(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.b.cancel(false);
        } else {
            this.b.n(th);
        }
    }

    @Override // defpackage.mkn
    public final void e(Object obj) {
        mjk.t(this.b);
        c(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.n(e);
        }
    }

    @Override // defpackage.mkn
    public final boolean g() {
        return this.b.isDone();
    }
}
