package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hib  reason: default package */
/* loaded from: classes.dex */
final class hib implements hhk {
    private final AtomicReference a;

    public hib(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        this.a.set(null);
    }
}
