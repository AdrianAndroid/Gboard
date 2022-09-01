package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: byn  reason: default package */
/* loaded from: classes.dex */
public final class byn {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/crank/utils/CrankEngineLocales");

    public static Locale a(List list, String str) {
        llp r;
        if (list.isEmpty()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/crank/utils/CrankEngineLocales", "getLocaleToUseForCrankEngine", 48, "CrankEngineLocales.java")).t("Locales list is empty");
            return null;
        }
        int i = 0;
        if (((Boolean) bxn.Z.c()).booleanValue()) {
            r = llp.o(list);
        } else if (((Boolean) bxn.aa.c()).booleanValue()) {
            r = llp.r((Locale) list.get(0));
        } else if (list.size() > 1) {
            return null;
        } else {
            r = llp.r((Locale) list.get(0));
        }
        int size = r.size();
        while (i < size) {
            Locale locale = (Locale) r.get(i);
            i++;
            if (jay.j(str, locale)) {
                ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/crank/utils/CrankEngineLocales", "getLocaleToUseForCrankEngine", 66, "CrankEngineLocales.java")).w("Using locale %s for emoji prediction", locale);
                return locale;
            }
        }
        return null;
    }
}
