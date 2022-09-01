package defpackage;

/* compiled from: PG */
/* renamed from: odq  reason: default package */
/* loaded from: classes2.dex */
final class odq implements odt {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public odq(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.odt
    public final void a(oea oeaVar) {
        int i = this.b;
        if (i == 0) {
            oeaVar.a.l(this.a);
        } else if (i != 1) {
            oeaVar.a.g(this.a);
        } else {
            oeaVar.a.k(this.a);
        }
    }
}
