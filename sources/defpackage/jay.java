package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jay  reason: default package */
/* loaded from: classes.dex */
public final class jay {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/utils/LanguageUtil");
    private static final Pattern b = Pattern.compile("[-_]");
    private static final lfy c = lfy.e(",");

    public static llp a(List list) {
        if (list.isEmpty()) {
            return llp.q();
        }
        llk e = llp.e();
        llp llpVar = jax.a;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            jav javVar = (jav) llpVar.get(i2);
            if (list.contains(javVar.j)) {
                e.h(javVar);
            }
        }
        return e.g();
    }

    public static String b(String str, Locale locale) {
        if (str.equalsIgnoreCase("zh-tw")) {
            str = "zh-hant";
        } else if (str.equalsIgnoreCase("zh-cn")) {
            str = "zh-hans";
        }
        Locale f = f(str);
        if (f != null) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            return jbs.p(f.getDisplayName(locale));
        }
        return "";
    }

    public static String c(Locale locale) {
        String script = locale.getScript();
        return !TextUtils.isEmpty(script) ? script : xn.a(locale);
    }

    public static String d(String str) {
        if (str != null) {
            List k = lfy.f(b).k(str);
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < k.size(); i++) {
                if (i != 0) {
                    sb.append('-');
                }
                if (z) {
                    sb.append((String) k.get(i));
                } else if (i == 0) {
                    String c2 = jbs.c((String) k.get(0));
                    boolean equals = c2.equals("und");
                    sb.append(c2);
                    z = equals;
                } else if (i == 1) {
                    sb.append(jbs.e((String) k.get(1)));
                } else {
                    sb.append(jbs.c((String) k.get(i)));
                }
            }
            return sb.toString();
        }
        return null;
    }

    public static Collection e(String str) {
        String[] strArr = (String[]) jaw.a.get(str);
        return strArr != null ? Arrays.asList(strArr) : Collections.emptyList();
    }

    public static Locale f(String str) {
        if (TextUtils.isEmpty(str)) {
            return Locale.ROOT;
        }
        try {
            return jav.e(str).q();
        } catch (IllegalArgumentException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/LanguageUtil", "constructLocaleFromString", 564, "LanguageUtil.java")).w("Failed to construct locale from: %s", str);
            return Locale.ROOT;
        }
    }

    public static boolean g(Locale locale, Locale locale2) {
        if (TextUtils.isEmpty(locale.getLanguage()) || TextUtils.isEmpty(locale2.getLanguage()) || !locale.getLanguage().equalsIgnoreCase(locale2.getLanguage())) {
            return false;
        }
        return TextUtils.equals(c(locale), c(locale2));
    }

    public static boolean h(Locale locale, Locale locale2) {
        if (Locale.ROOT.equals(locale)) {
            return true;
        }
        if (locale2 == null) {
            return false;
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant) && !variant.equalsIgnoreCase("zall") && !variant.equalsIgnoreCase(locale2.getVariant())) {
            return false;
        }
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country) && !country.equalsIgnoreCase("zall") && !country.equalsIgnoreCase(locale2.getCountry())) {
            return false;
        }
        String language = locale.getLanguage();
        if (!TextUtils.isEmpty(language) && !language.equalsIgnoreCase("zall") && !language.equalsIgnoreCase(locale2.getLanguage())) {
            return false;
        }
        String script = locale.getScript();
        return TextUtils.isEmpty(script) || script.equalsIgnoreCase("zall") || script.equalsIgnoreCase(locale2.getScript());
    }

    public static boolean i(Locale locale, Locale locale2) {
        return locale.getVariant().equalsIgnoreCase(locale2.getVariant()) && locale.getCountry().equalsIgnoreCase(locale2.getCountry()) && locale.getLanguage().equalsIgnoreCase(locale2.getLanguage());
    }

    public static boolean j(String str, Locale locale) {
        llp r = locale != null ? llp.r(locale) : llp.q();
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Iterable<Locale> ab = lre.ab(c.i(str), iuu.l);
        lta listIterator = r.listIterator();
        while (listIterator.hasNext()) {
            Locale locale2 = (Locale) listIterator.next();
            for (Locale locale3 : ab) {
                if (h(locale3, locale2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
