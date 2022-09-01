package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bym  reason: default package */
/* loaded from: classes.dex */
public final class bym extends byb {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/crank/transformerexpression/TransformerExpressionModelManager");
    private static volatile bym h;
    public llp b = llp.r(hqp.e());

    public bym(bze bzeVar, mkr mkrVar) {
        super("TransformerExpressionModelManager", bzeVar, mkrVar);
    }

    public static bym a(Context context) {
        bym bymVar = h;
        if (bymVar == null) {
            synchronized (bym.class) {
                bymVar = h;
                if (bymVar == null) {
                    bymVar = new bym(bzd.a(context), gxo.a(10));
                    h = bymVar;
                }
            }
        }
        return bymVar;
    }

    @Override // defpackage.byb
    protected final bzu c() {
        bzt a2 = bzu.a("transformer_expression");
        a2.e = 300;
        a2.f = 300;
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.byb
    public final hhl d() {
        return bxn.e;
    }

    @Override // defpackage.byb
    protected final hhl e() {
        return bxn.aI;
    }

    @Override // defpackage.byb
    protected final hhl f() {
        return bxn.aG;
    }

    @Override // defpackage.byb
    protected final hhl g() {
        return bxn.aH;
    }

    @Override // defpackage.byb
    public final jqk h() {
        return new byc(this.b);
    }

    @Override // defpackage.byb
    protected final String i() {
        return "transformer_expression";
    }

    @Override // defpackage.byb
    public final String j() {
        return "transformer_expression";
    }
}
