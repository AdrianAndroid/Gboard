package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* renamed from: lpx  reason: default package */
/* loaded from: classes.dex */
final class lpx extends lpl {
    public final ReferenceQueue h = new ReferenceQueue();
    public final ReferenceQueue i = new ReferenceQueue();

    public lpx(lqc lqcVar, int i) {
        super(lqcVar, i);
    }

    @Override // defpackage.lpl
    public final void g() {
        n(this.h);
    }

    @Override // defpackage.lpl
    public final void h() {
        e(this.h);
        f(this.i);
    }
}
