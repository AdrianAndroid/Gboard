package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* renamed from: lpv  reason: default package */
/* loaded from: classes.dex */
final class lpv extends lpl {
    public final ReferenceQueue h = new ReferenceQueue();

    public lpv(lqc lqcVar, int i) {
        super(lqcVar, i);
    }

    @Override // defpackage.lpl
    public final void g() {
        n(this.h);
    }

    @Override // defpackage.lpl
    public final void h() {
        e(this.h);
    }
}
