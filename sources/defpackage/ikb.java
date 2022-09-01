package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.util.IllformedLocaleException;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: ikb  reason: default package */
/* loaded from: classes.dex */
public final class ikb {
    private static final lug a = hin.a;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
        r4.i.setLength(0);
        r4.i.append(r8);
        r8 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
        if (r8.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f6, code lost:
        r9 = (java.lang.String) r8.next();
        r10 = defpackage.jav.l(r9);
        r11 = r10.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
        if (r11 < 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
        if (r11 > 8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010f, code lost:
        if (defpackage.jav.v(r10) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0111, code lost:
        r12 = r12 + 1;
        r4.i.append('-');
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
        if (r12 <= 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
        if (r9.length() != 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012a, code lost:
        r4.i.append(defpackage.jbs.c(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0120, code lost:
        r4.i.append(defpackage.jbs.e(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
        throw new java.lang.IllegalArgumentException("Invalid extension subtag: ".concat(java.lang.String.valueOf(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
        r4.h.add(r4.i.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.jav a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikb.a(java.lang.String):jav");
    }

    public static String b(Context context, jav javVar) {
        if (javVar.equals(jav.d)) {
            return context.getString(R.string.f159510_resource_name_obfuscated_res_0x7f1405eb);
        }
        return javVar.m(context);
    }

    public static Locale c(jav javVar) {
        if (jav.d.equals(javVar)) {
            return Locale.ROOT;
        }
        Locale.Builder builder = new Locale.Builder();
        try {
            String str = javVar.g;
            if (str != null) {
                builder.setLanguage(str);
            }
            String str2 = javVar.j;
            if (str2 != null) {
                builder.setRegion(str2);
            }
            String str3 = javVar.i;
            if (str3 != null) {
                builder.setScript(str3);
            }
            if (javVar.k.length > 0) {
                ((luc) ((luc) a.d()).k("com/google/android/libraries/inputmethod/personaldictionary/LanguageTagChanger", "toLocale", 94, "LanguageTagChanger.java")).G("Unknown variant %s in %s", javVar.k[0], javVar);
            }
            String[] strArr = javVar.l;
            if (strArr.length == 1 && strArr[0].length() > 1) {
                builder.setExtension(javVar.l[0].charAt(0), javVar.l[0].substring(2));
            }
            return builder.build();
        } catch (IllegalArgumentException | IllformedLocaleException e) {
            ((luc) ((luc) ((luc) a.d()).i(e)).k("com/google/android/libraries/inputmethod/personaldictionary/LanguageTagChanger", "toLocale", 102, "LanguageTagChanger.java")).w("Failed to convert a language tag: %s", javVar);
            return null;
        }
    }

    public static Locale d(String str) {
        if (TextUtils.isEmpty(str)) {
            return Locale.ROOT;
        }
        if (str.equals("ja_JP_JP_#u-ca-japanese")) {
            return new Locale("ja", "JP", "JP");
        }
        if (str.equals("th_TH_TH_#u-nu-thai")) {
            return new Locale("th", "TH", "TH");
        }
        if (str.equals("no_NO_NY")) {
            return new Locale("no", "NO", "NY");
        }
        List k = lfy.c('_').k(str);
        Locale.Builder builder = new Locale.Builder();
        try {
            builder.setLanguage((String) k.get(0));
            if (k.size() > 1) {
                builder.setRegion((String) k.get(1));
            }
            for (int i = 2; i < k.size(); i++) {
                String str2 = (String) k.get(i);
                if (str2.length() <= 0 || str2.charAt(0) != '#') {
                    builder.setVariant(str2);
                } else if (str2.length() <= 2 || (str2.charAt(1) != 'x' && str2.charAt(1) != 'u')) {
                    builder.setScript(str2.substring(1));
                } else {
                    builder.setExtension(str2.charAt(1), str2.substring(3));
                }
            }
            return builder.build();
        } catch (IllegalArgumentException | IllformedLocaleException e) {
            ((luc) ((luc) ((luc) a.d()).i(e)).k("com/google/android/libraries/inputmethod/personaldictionary/LanguageTagChanger", "toLocale", 69, "LanguageTagChanger.java")).w("Failed to convert a locale string: %s", str);
            return null;
        }
    }
}
