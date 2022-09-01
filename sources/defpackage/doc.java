package defpackage;

import android.support.v7.widget.AppCompatTextView;

/* compiled from: PG */
/* renamed from: doc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class doc implements oiy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ doc(AppCompatTextView appCompatTextView, int i) {
        this.b = i;
        this.a = appCompatTextView;
    }

    public /* synthetic */ doc(dsl dslVar, int i, byte[] bArr) {
        this.b = i;
        this.a = dslVar;
    }

    public /* synthetic */ doc(oiy oiyVar, int i) {
        this.b = i;
        this.a = oiyVar;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, oiy] */
    @Override // defpackage.oiy
    public final Object a() {
        switch (this.b) {
            case 0:
                return ((dsl) this.a).g();
            case 1:
                return ((dsl) this.a).f();
            case 2:
                return ((dsl) this.a).e();
            case 3:
                return ((dsl) this.a).d();
            case 4:
                return ((dsl) this.a).f();
            case 5:
                return ((dsl) this.a).g();
            case 6:
                return ((dsl) this.a).d();
            case 7:
                return ((dsl) this.a).e();
            case 8:
                Object obj = this.a;
                int i = dxf.a;
                return Integer.valueOf(((AppCompatTextView) obj).getTextColors().getDefaultColor());
            case 9:
                Object obj2 = this.a;
                int i2 = dxf.a;
                return Integer.valueOf(((AppCompatTextView) obj2).getTextColors().getDefaultColor());
            case 10:
                kbc kbcVar = (kbc) this.a;
                if (!kbcVar.a().e() || ((kdj) kbcVar.a().a()).b() == null) {
                    return null;
                }
                oiy b = ((kdj) kbcVar.a().a()).b();
                jdg.u(b);
                return (onm) b.a();
            default:
                return (khc) this.a.a();
        }
    }
}
