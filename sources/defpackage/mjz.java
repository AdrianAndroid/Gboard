package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: mjz  reason: default package */
/* loaded from: classes.dex */
public abstract class mjz extends mjv implements mkr {
    protected abstract mkr e();

    @Override // defpackage.mjv
    protected /* bridge */ /* synthetic */ ExecutorService g() {
        throw null;
    }

    @Override // defpackage.mjv, java.util.concurrent.ExecutorService
    /* renamed from: hP */
    public final mko submit(Runnable runnable) {
        return e().hP(runnable);
    }

    @Override // defpackage.mjv, java.util.concurrent.ExecutorService
    /* renamed from: hQ */
    public final mko submit(Callable callable) {
        return e().hQ(callable);
    }

    @Override // defpackage.mjv, java.util.concurrent.ExecutorService
    /* renamed from: hR */
    public final mko submit(Runnable runnable, Object obj) {
        return e().hR(runnable, obj);
    }
}
