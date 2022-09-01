package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lhy  reason: default package */
/* loaded from: classes.dex */
public final class lhy extends lhz {
    volatile long a = Long.MAX_VALUE;
    lih b = lig.c();
    lih c = lig.c();
    volatile long d = Long.MAX_VALUE;
    lih e = lig.c();
    lih f = lig.c();

    public lhy(ReferenceQueue referenceQueue, Object obj, int i, lih lihVar) {
        super(referenceQueue, obj, i, lihVar);
    }

    @Override // defpackage.lhz, defpackage.lih
    public final long b() {
        return this.a;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final long c() {
        return this.d;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final lih f() {
        return this.b;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final lih g() {
        return this.e;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final lih h() {
        return this.c;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final lih i() {
        return this.f;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final void l(lih lihVar) {
        this.b = lihVar;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final void m(lih lihVar) {
        this.e = lihVar;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final void n(lih lihVar) {
        this.c = lihVar;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final void o(lih lihVar) {
        this.f = lihVar;
    }

    @Override // defpackage.lhz, defpackage.lih
    public final void q(long j) {
        this.d = j;
    }
}
