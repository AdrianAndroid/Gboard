package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* renamed from: mib  reason: default package */
/* loaded from: classes.dex */
final class mib extends mhv {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public mib(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.mhv
    public final mhz a(mik mikVar, mhz mhzVar) {
        return (mhz) this.d.getAndSet(mikVar, mhzVar);
    }

    @Override // defpackage.mhv
    public final mij b(mik mikVar, mij mijVar) {
        return (mij) this.c.getAndSet(mikVar, mijVar);
    }

    @Override // defpackage.mhv
    public final void c(mij mijVar, mij mijVar2) {
        this.b.lazySet(mijVar, mijVar2);
    }

    @Override // defpackage.mhv
    public final void d(mij mijVar, Thread thread) {
        this.a.lazySet(mijVar, thread);
    }

    @Override // defpackage.mhv
    public final boolean e(mik mikVar, mhz mhzVar, mhz mhzVar2) {
        return mia.a(this.d, mikVar, mhzVar, mhzVar2);
    }

    @Override // defpackage.mhv
    public final boolean f(mik mikVar, Object obj, Object obj2) {
        return mia.a(this.e, mikVar, obj, obj2);
    }

    @Override // defpackage.mhv
    public final boolean g(mik mikVar, mij mijVar, mij mijVar2) {
        return mia.a(this.c, mikVar, mijVar, mijVar2);
    }
}
