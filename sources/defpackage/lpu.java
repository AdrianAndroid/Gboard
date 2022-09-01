package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* renamed from: lpu  reason: default package */
/* loaded from: classes.dex */
final class lpu extends lpb implements lpg {
    public volatile Object c = null;

    public lpu(ReferenceQueue referenceQueue, Object obj, int i, lpu lpuVar) {
        super(referenceQueue, obj, i, lpuVar);
    }

    @Override // defpackage.lpg
    public final Object d() {
        return this.c;
    }
}
