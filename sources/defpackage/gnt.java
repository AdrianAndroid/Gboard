package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: gnt  reason: default package */
/* loaded from: classes.dex */
public final class gnt extends gnp {
    private final Handler b;

    public gnt(Class cls, Handler handler) {
        super(cls);
        this.b = handler;
    }

    @Override // defpackage.gnp
    protected final mko f(Callable callable) {
        mkp a = mkp.a(callable);
        if (this.b.post(a)) {
            return a;
        }
        throw new RejectedExecutionException();
    }

    @Override // defpackage.gnp
    public final void g(long j, Runnable runnable) {
        if (this.b.postDelayed(runnable, j)) {
            return;
        }
        throw new RejectedExecutionException();
    }

    @Override // defpackage.gnp
    public final void h(Runnable runnable) {
        if (this.b.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException();
    }
}
