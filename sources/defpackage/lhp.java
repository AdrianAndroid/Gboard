package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lhp  reason: default package */
/* loaded from: classes.dex */
public final class lhp extends lhr {
    volatile long a = Long.MAX_VALUE;
    lih b = lig.c();
    lih c = lig.c();

    public lhp(Object obj, int i, lih lihVar) {
        super(obj, i, lihVar);
    }

    @Override // defpackage.lgt, defpackage.lih
    public final long b() {
        return this.a;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final lih f() {
        return this.b;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final lih h() {
        return this.c;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final void l(lih lihVar) {
        this.b = lihVar;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final void n(lih lihVar) {
        this.c = lihVar;
    }
}
