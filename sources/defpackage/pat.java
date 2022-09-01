package defpackage;

/* compiled from: PG */
/* renamed from: pat  reason: default package */
/* loaded from: classes2.dex */
final class pat extends ozs {
    final ozs a;
    final pao b;
    boolean c;

    public pat(ozs ozsVar, pao paoVar) {
        this.a = ozsVar;
        this.b = paoVar;
    }

    @Override // defpackage.ozs
    public final void b(Object obj) {
        try {
            this.a.b(this.b.a(obj));
        } catch (Throwable th) {
            ols.p(th);
            d();
            pal.a(th, obj);
            il(th);
        }
    }

    @Override // defpackage.ozs
    public final void il(Throwable th) {
        if (this.c) {
            pbp.b(th);
            return;
        }
        this.c = true;
        this.a.il(th);
    }
}
