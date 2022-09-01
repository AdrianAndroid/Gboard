package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* renamed from: re  reason: default package */
/* loaded from: classes2.dex */
final class re extends qy {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public re(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.qy
    public final void a(rh rhVar, rh rhVar2) {
        this.b.lazySet(rhVar, rhVar2);
    }

    @Override // defpackage.qy
    public final void b(rh rhVar, Thread thread) {
        this.a.lazySet(rhVar, thread);
    }

    @Override // defpackage.qy
    public final boolean c(ri riVar, rc rcVar, rc rcVar2) {
        return rd.a(this.d, riVar, rcVar, rcVar2);
    }

    @Override // defpackage.qy
    public final boolean d(ri riVar, Object obj, Object obj2) {
        return rd.a(this.e, riVar, obj, obj2);
    }

    @Override // defpackage.qy
    public final boolean e(ri riVar, rh rhVar, rh rhVar2) {
        return rd.a(this.c, riVar, rhVar, rhVar2);
    }
}
