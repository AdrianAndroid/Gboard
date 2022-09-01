package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: byu  reason: default package */
/* loaded from: classes.dex */
public final class byu implements jqk {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/dataservice/superpacks/LocaleSlicingStrategy");
    private final Locale b;

    public byu(Locale locale) {
        this.b = locale;
    }

    @Override // defpackage.jqk
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.jqk
    public final jqj b(jqm jqmVar, jsq jsqVar) {
        jqi e = jqj.e();
        for (juc jucVar : jqmVar.i()) {
            String b = jucVar.n().b("locale", "");
            if (TextUtils.isEmpty(b)) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/LocaleSlicingStrategy", "getSlices", 45, "LocaleSlicingStrategy.java")).t("getSlices() : Could not get packLocaleStr from manifest");
            } else {
                Locale f = jay.f(b);
                if (jay.h(f, this.b)) {
                    ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/LocaleSlicingStrategy", "getSlices", 53, "LocaleSlicingStrategy.java")).w("Found queries pack for locale: %s", f);
                    e.c(jug.h(jucVar));
                }
            }
        }
        return e.a();
    }
}
