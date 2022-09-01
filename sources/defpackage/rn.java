package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: rn  reason: default package */
/* loaded from: classes2.dex */
public final class rn implements mko {
    final WeakReference a;
    public final ri b = new rm(this);

    public rn(rj rjVar) {
        this.a = new WeakReference(rjVar);
    }

    public final boolean a(Throwable th) {
        ri riVar = this.b;
        ri.g(th);
        if (ri.b.d(riVar, null, new rb(th))) {
            ri.e(riVar);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        rj rjVar = (rj) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || rjVar == null) {
            return cancel;
        }
        rjVar.a = null;
        rjVar.b = null;
        rjVar.c.f(null);
        return true;
    }

    @Override // defpackage.mko
    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
