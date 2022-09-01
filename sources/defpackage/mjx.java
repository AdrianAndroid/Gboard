package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mjx  reason: default package */
/* loaded from: classes.dex */
public abstract class mjx extends lkz implements Future, mko {
    protected abstract mko N();

    protected /* bridge */ /* synthetic */ Future O() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return O().cancel(z);
    }

    @Override // defpackage.mko
    public final void d(Runnable runnable, Executor executor) {
        N().d(runnable, executor);
    }

    public Object get() {
        return O().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return O().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return O().isDone();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return O().get(j, timeUnit);
    }
}
