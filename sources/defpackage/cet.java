package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cet  reason: default package */
/* loaded from: classes.dex */
public final class cet implements jqk {
    private static final lug a = lug.i("SuperDelight");
    private final Context b;

    public cet(Context context) {
        this.b = context;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        List<Locale> b = cej.b(jsqVar);
        jqi e = jqj.e();
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightBundledSlicingStrategy", "getSlices", 39, "SuperDelightBundledSlicingStrategy.java")).w("BundledSlicing#getSlices() : Locale = %s", b);
        if (b == null || b.isEmpty()) {
            return e.a();
        }
        HashSet hashSet = new HashSet();
        for (Locale locale : b) {
            juc a2 = cej.a(this.b, locale, jqmVar.i(), true);
            if (a2 != null && hashSet.add(a2.i())) {
                e.c(jug.h(a2));
            }
        }
        e.d(true);
        jqj a3 = e.a();
        ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightBundledSlicingStrategy", "getSlices", 65, "SuperDelightBundledSlicingStrategy.java")).w("BundledSlicing#getSlices(): result %s", a3);
        return a3;
    }

    public final String toString() {
        return "SuperDelightBundledSlicingStrategy";
    }
}
