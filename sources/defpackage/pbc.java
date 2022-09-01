package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: pbc  reason: default package */
/* loaded from: classes2.dex */
public final class pbc extends ols {
    static final pbb a;
    public static final pay b;
    final ThreadFactory c;
    public final AtomicReference d;
    private static final TimeUnit f = TimeUnit.SECONDS;
    private static final long e = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();

    static {
        pbb pbbVar = new pbb(pbj.a);
        a = pbbVar;
        pbbVar.d();
        pay payVar = new pay(null, 0L, null);
        b = payVar;
        payVar.a();
    }

    public pbc(ThreadFactory threadFactory) {
        this.c = threadFactory;
        pay payVar = b;
        AtomicReference atomicReference = new AtomicReference(payVar);
        this.d = atomicReference;
        pay payVar2 = new pay(threadFactory, e, f);
        if (!pbl.a(atomicReference, payVar, payVar2)) {
            payVar2.a();
        }
    }
}
