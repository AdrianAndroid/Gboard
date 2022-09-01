package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* renamed from: mlk  reason: default package */
/* loaded from: classes.dex */
public final class mlk extends mju implements RunnableFuture {
    private volatile mkn a;

    public mlk(mix mixVar) {
        this.a = new mli(this, mixVar);
    }

    public static mlk e(mix mixVar) {
        return new mlk(mixVar);
    }

    public static mlk f(Callable callable) {
        return new mlk(callable);
    }

    public static mlk g(Runnable runnable, Object obj) {
        return new mlk(Executors.callable(runnable, obj));
    }

    @Override // defpackage.mik
    protected final void a() {
        mkn mknVar;
        if (o() && (mknVar = this.a) != null) {
            mknVar.h();
        }
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        mkn mknVar = this.a;
        if (mknVar != null) {
            return "task=[" + mknVar + "]";
        }
        return super.b();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        mkn mknVar = this.a;
        if (mknVar != null) {
            mknVar.run();
        }
        this.a = null;
    }

    public mlk(Callable callable) {
        this.a = new mlj(this, callable);
    }
}
