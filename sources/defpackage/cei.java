package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cei  reason: default package */
/* loaded from: classes.dex */
public final class cei {
    private static final lug a = lug.i("SuperDelight");

    public static int a(juc jucVar) {
        return jucVar.n().f("status");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jsr b() {
        return jsr.d("bundled_delight", "main_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jsr c() {
        return jsr.d("delight", "main_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jsr d() {
        return jsr.d("delight_overrides", "main_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jsr e(Locale locale) {
        StringBuilder sb = new StringBuilder("main_");
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        sb.append(language.toLowerCase(Locale.US));
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append("_");
            sb.append(country.toLowerCase(Locale.US));
        }
        sb.append("_");
        return jsr.d("delight", sb.toString());
    }

    public static Long f(juc jucVar) {
        try {
            Long l = (Long) jucVar.n().a("version");
            if (l != null) {
                return l;
            }
            return -1L;
        } catch (ClassCastException e) {
            ((luc) ((luc) ((luc) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/DelightPackUtils", "getVersion", 142, "DelightPackUtils.java")).w("DelightPackUtils#getVersion() failed for %s", jucVar);
            return -1L;
        }
    }

    public static Locale g(juc jucVar) {
        String b = jucVar.n().b("language", "");
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return jaz.b(b, jucVar.n().b("country", ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(juc jucVar) {
        int a2 = a(jucVar);
        return a2 == 2 || a2 == 3;
    }

    public static boolean i(juc jucVar) {
        jtr e = jucVar.e();
        return e != null && TextUtils.equals(e.b(), "delight_overrides");
    }
}
