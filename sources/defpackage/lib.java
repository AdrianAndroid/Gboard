package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lib  reason: default package */
/* loaded from: classes.dex */
public final class lib extends lhz {
    volatile long a = Long.MAX_VALUE;
    lih b = lig.c();
    lih c = lig.c();

    public lib(ReferenceQueue referenceQueue, Object obj, int i, lih lihVar) {
        super(referenceQueue, obj, i, lihVar);
    }

    @Override // defpackage.lhz, defpackage.lih
    public final long c() {
        return this.a;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final lih g() {
        return this.b;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final lih i() {
        return this.c;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final void m(lih lihVar) {
        this.b = lihVar;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final void o(lih lihVar) {
        this.c = lihVar;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final void q(long j) {
        this.a = j;
    }
}
