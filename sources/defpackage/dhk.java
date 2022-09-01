package defpackage;

import j$.util.function.Supplier;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dhk  reason: default package */
/* loaded from: classes.dex */
public final class dhk implements jqk {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSlicingStrategy");
    private final dhj b;
    private final bys c;
    private final Supplier d;
    private final dhd e;

    public dhk(dhj dhjVar, dhd dhdVar, bys bysVar, Supplier supplier) {
        this.b = dhjVar;
        this.e = dhdVar;
        this.c = bysVar;
        this.d = supplier;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        int i = 1;
        boolean e = jsqVar.e("useForeground", true);
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSlicingStrategy", "getSlices", 44, "HandwritingSlicingStrategy.java")).H("getSlices(): %s useForeground=%b", jqmVar, e);
        boolean z = ((Boolean) dho.b.c()).booleanValue() && this.c.a();
        dho.b.c();
        this.c.a();
        int i2 = (!z || e) ? 2 : 1;
        if (!z) {
            i = 0;
        } else if (!e) {
            i = 2;
        }
        jqi e2 = jqj.e();
        HashSet hashSet = new HashSet();
        for (String str : jqmVar.j()) {
            hashSet.add(str);
        }
        String b = dhr.b(hashSet);
        if (b != null) {
            juf g = jug.g();
            g.f(jqmVar.h(b));
            g.d(2);
            g.g(i);
            e2.c(g.a());
        }
        HashSet hashSet2 = new HashSet();
        for (jav javVar : (Set) this.d.get()) {
            dhu g2 = this.b.g(javVar);
            if (g2 == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSlicingStrategy", "getSlices", 90, "HandwritingSlicingStrategy.java")).w("getSlices(): packMapping unavailable for %s", javVar);
            } else {
                HashSet<String> hashSet3 = new HashSet();
                this.e.a(g2, hashSet3, hashSet3);
                for (String str2 : hashSet3) {
                    if (jqmVar.j().contains(str2) && hashSet2.add(str2)) {
                        juf g3 = jug.g();
                        g3.f(jqmVar.h(str2));
                        g3.d(i2);
                        g3.g(i);
                        e2.c(g3.a());
                    }
                }
            }
        }
        jqj a2 = e2.a();
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSlicingStrategy", "getSlices", 108, "HandwritingSlicingStrategy.java")).w("getSlices(): result %s", a2);
        return a2;
    }

    public final String toString() {
        return "HWSlicingStrategy";
    }
}
