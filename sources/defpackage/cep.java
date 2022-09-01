package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cep  reason: default package */
/* loaded from: classes.dex */
public final class cep implements jqk {
    private static final lug a = lug.i("SuperDelight");

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        List<Locale> b = cej.b(jsqVar);
        jqi e = jqj.e();
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightAppSpecificSlicingStrategy", "getSlices", 34, "SuperDelightAppSpecificSlicingStrategy.java")).w("OverridesSlicing#getSlices() : Locale = %s", b);
        if (b == null || b.isEmpty()) {
            return e.a();
        }
        HashSet hashSet = new HashSet();
        boolean f = cdx.a == null ? false : cdx.f();
        for (Locale locale : b) {
            for (juc jucVar : jqmVar.i()) {
                juc c = cej.c(locale, llp.r(jucVar), f);
                if (c != null && hashSet.add(c.i())) {
                    e.c(jug.h(c));
                }
            }
        }
        e.d(true);
        jqj a2 = e.a();
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightAppSpecificSlicingStrategy", "getSlices", 67, "SuperDelightAppSpecificSlicingStrategy.java")).w("OverridesSlicing#getSlices(): result %s", a2);
        return a2;
    }

    public final String toString() {
        return "SuperDelightOverridesSlicingStrategy";
    }
}
