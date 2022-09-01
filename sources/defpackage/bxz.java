package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bxz  reason: default package */
/* loaded from: classes.dex */
public final class bxz extends byb {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/crank/expressiveconcepttriggering/ExpressiveConceptTriggeringModelManager");
    private static volatile bxz h;
    public llp b = llp.r(hqp.e());

    public bxz(bze bzeVar, mkr mkrVar) {
        super("ExpressiveConceptTriggeringModelManager", bzeVar, mkrVar);
    }

    public static bxz a(Context context) {
        bxz bxzVar = h;
        if (bxzVar == null) {
            synchronized (bxz.class) {
                bxzVar = h;
                if (bxzVar == null) {
                    bxzVar = new bxz(bzd.a(context), gxo.a(10));
                    h = bxzVar;
                }
            }
        }
        return bxzVar;
    }

    @Override // defpackage.byb
    protected final bzu c() {
        bzt a2 = bzu.a("expressive_concepts_triggering");
        a2.e = 300;
        a2.f = 300;
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.byb
    public final hhl d() {
        return bxn.c;
    }

    @Override // defpackage.byb
    protected final hhl e() {
        return bxn.ay;
    }

    @Override // defpackage.byb
    protected final hhl f() {
        return bxn.aw;
    }

    @Override // defpackage.byb
    protected final hhl g() {
        return bxn.ax;
    }

    @Override // defpackage.byb
    public final jqk h() {
        return new byc(this.b);
    }

    @Override // defpackage.byb
    protected final String i() {
        return "expressive_concepts_triggering";
    }

    @Override // defpackage.byb
    public final String j() {
        return "expressive_concepts_triggering";
    }
}
