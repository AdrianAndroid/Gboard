package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: clu  reason: default package */
/* loaded from: classes.dex */
public final class clu implements jqk {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSlicingStrategy");
    private final Context b;
    private final bys c;
    private final boolean d;

    public clu(Context context, boolean z, bys bysVar) {
        this.b = context;
        this.d = z;
        this.c = bysVar;
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
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSlicingStrategy", "getSlices", 86, "EmojiSlicingStrategy.java")).t("getSlices() : Received null or empty userEnabledLocales.");
            return e.a();
        }
        Collection i = jqmVar.i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = (!this.d || !this.c.a()) ? 0 : 1;
        int i3 = 0;
        for (Locale locale : localeArr) {
            juc a3 = cxq.a(this.b, locale, i);
            if (a3 != null && linkedHashSet.add(a3)) {
                juf g = jug.g();
                g.f(a3);
                g.g(i2);
                g.d(2);
                e.c(g.a());
                i3++;
            }
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSlicingStrategy", "matchEnabledLocalesWithPackLocales", 127, "EmojiSlicingStrategy.java")).y("matchEnabledLocalesWithPackLocales() : User enabled %d locales; returning %d slices", localeArr.length, i3);
        return e.a();
    }
}
