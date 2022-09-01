package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lht  reason: default package */
/* loaded from: classes.dex */
public final class lht extends lhr {
    volatile long a = Long.MAX_VALUE;
    lih b = lig.c();
    lih c = lig.c();

    public lht(Object obj, int i, lih lihVar) {
        super(obj, i, lihVar);
    }

    @Override // defpackage.lgt, defpackage.lih
    public final long c() {
        return this.a;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final lih g() {
        return this.b;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final lih i() {
        return this.c;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final void m(lih lihVar) {
        this.b = lihVar;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final void o(lih lihVar) {
        this.c = lihVar;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final void q(long j) {
        this.a = j;
    }
}
