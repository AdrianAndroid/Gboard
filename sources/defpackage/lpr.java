package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* renamed from: lpr  reason: default package */
/* loaded from: classes.dex */
final class lpr extends lpl {
    public final ReferenceQueue h = new ReferenceQueue();

    public lpr(lqc lqcVar, int i) {
        super(lqcVar, i);
    }

    @Override // defpackage.lpl
    public final void g() {
        n(this.h);
    }

    @Override // defpackage.lpl
    public final void h() {
        f(this.h);
    }
}
