package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: pbd  reason: default package */
/* loaded from: classes2.dex */
public final class pbd extends ols {
    static final int a;
    static final pbe d;
    public static final mok e;
    final ThreadFactory b;
    public final AtomicReference c;

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        a = intValue;
        pbe pbeVar = new pbe(pbj.a);
        d = pbeVar;
        pbeVar.d();
        e = new mok((ThreadFactory) null, 0);
    }

    public pbd(ThreadFactory threadFactory) {
        this.b = threadFactory;
        mok mokVar = e;
        AtomicReference atomicReference = new AtomicReference(mokVar);
        this.c = atomicReference;
        mok mokVar2 = new mok(threadFactory, a);
        if (!pbs.b(atomicReference, mokVar, mokVar2)) {
            mokVar2.c();
        }
    }
}
