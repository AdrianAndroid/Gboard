package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cxr  reason: default package */
/* loaded from: classes.dex */
public final class cxr implements jqk {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/superpackscommon/LocaleBasedSlicingStrategy");
    private final Context b;

    public cxr(Context context) {
        this.b = context;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        jqi e = jqj.e();
        Object a2 = jsqVar.a("enabled_locales");
        Locale[] localeArr = a2 instanceof Locale[] ? (Locale[]) a2 : null;
        if (localeArr == null || (r3 = localeArr.length) == 0) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/expression/superpackscommon/LocaleBasedSlicingStrategy", "getSlices", 74, "LocaleBasedSlicingStrategy.java")).t("Received null or empty userEnabledLocales.");
            return e.a();
        }
        Collection i = jqmVar.i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = 0;
        for (Locale locale : localeArr) {
            juc a3 = cxq.a(this.b, locale, i);
            if (a3 != null && linkedHashSet.add(a3)) {
                juf g = jug.g();
                g.f(a3);
                g.g(0);
                g.d(0);
                e.c(g.a());
                i2++;
            }
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/superpackscommon/LocaleBasedSlicingStrategy", "matchEnabledLocalesWithPackLocales", 110, "LocaleBasedSlicingStrategy.java")).y("User enabled %d locales; returning %d slices", localeArr.length, i2);
        return e.a();
    }
}
