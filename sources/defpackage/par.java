package defpackage;

/* compiled from: PG */
/* renamed from: par  reason: default package */
/* loaded from: classes2.dex */
final class par extends ozs {
    final ozt a;

    public par(ozt oztVar) {
        this.a = oztVar;
    }

    @Override // defpackage.ozs
    public final void b(Object obj) {
        long j;
        ozt oztVar = this.a;
        paw pawVar = new paw(oztVar, obj);
        synchronized (oztVar) {
            j = oztVar.b;
            oztVar.c = pawVar;
        }
        if (j == Long.MIN_VALUE) {
            oztVar.c.a(Long.MAX_VALUE);
        } else {
            oztVar.c.a(j);
        }
    }

    @Override // defpackage.ozs
    public final void il(Throwable th) {
        this.a.a(th);
    }
}
