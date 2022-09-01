package defpackage;

/* compiled from: PG */
/* renamed from: ehx  reason: default package */
/* loaded from: classes.dex */
final class ehx implements csi {
    private final /* synthetic */ int a;

    public ehx(int i) {
        this.a = i;
    }

    @Override // defpackage.csi
    public final lmz l() {
        return this.a != 0 ? lmz.r(csl.b) : lmz.r(csl.b);
    }

    @Override // defpackage.csi
    public final /* synthetic */ ctt f(csh cshVar) {
        if (this.a == 0) {
            return eju.e(cshVar).a();
        }
        return eju.f(cshVar).a();
    }
}
