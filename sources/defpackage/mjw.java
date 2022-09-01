package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mjw  reason: default package */
/* loaded from: classes.dex */
final class mjw extends mkh {
    private final mko a;

    public mjw(mko mkoVar) {
        jdg.u(mkoVar);
        this.a = mkoVar;
    }

    @Override // defpackage.mik, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.mik, defpackage.mko
    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    @Override // defpackage.mik, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.mik, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.mik, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.mik
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.mik, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
