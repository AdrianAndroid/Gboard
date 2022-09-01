package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* renamed from: lpw  reason: default package */
/* loaded from: classes.dex */
final class lpw extends lpb implements lpy {
    public volatile lpz c = lqc.a;

    public lpw(ReferenceQueue referenceQueue, Object obj, int i, lpw lpwVar) {
        super(referenceQueue, obj, i, lpwVar);
    }

    @Override // defpackage.lpg
    public final Object d() {
        return this.c.get();
    }

    @Override // defpackage.lpy
    public final lpz e() {
        return this.c;
    }
}
