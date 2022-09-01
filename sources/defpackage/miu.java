package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* renamed from: miu  reason: default package */
/* loaded from: classes.dex */
final class miu extends mit {
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;

    public miu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.mit
    public final int a(miw miwVar) {
        return this.b.decrementAndGet(miwVar);
    }

    @Override // defpackage.mit
    public final void b(miw miwVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(miwVar, null, set) && atomicReferenceFieldUpdater.get(miwVar) == null) {
        }
    }
}
