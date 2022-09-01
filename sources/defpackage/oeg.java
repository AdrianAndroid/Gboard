package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* renamed from: oeg  reason: default package */
/* loaded from: classes2.dex */
final class oeg extends oef {
    private final AtomicIntegerFieldUpdater a;

    public oeg(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.oef
    public final boolean a(oei oeiVar) {
        return this.a.compareAndSet(oeiVar, 0, -1);
    }

    @Override // defpackage.oef
    public final void b(oei oeiVar) {
        this.a.set(oeiVar, 0);
    }
}
