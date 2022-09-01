package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jav  reason: default package */
/* loaded from: classes.dex */
public final class jav implements Parcelable {
    public final int f;
    public final String g;
    public final String[] h;
    public final String i;
    public final String j;
    public final String[] k;
    public final String[] l;
    public final String m;
    public final String n;
    private volatile Locale s;
    private static final ltg o = ltg.j("com/google/android/libraries/inputmethod/utils/LanguageTag");
    public static final Parcelable.Creator CREATOR = new icc(2);
    public static final qo a = new qo();
    private static final lmz p = lmz.w("ar-XT", "bgp-XC", "bgp-XT", "bgq-PK", "bgq-XU", "bm-XF", "bm-Nkoo", "doi-XC", "doi-XT", "doi-Arab", "dv-MV", "dyu-XF", "fa-AF", "ff-Adlm", "ff-XF", "glk-IR", "ji", "ji-XT", "kmz-XC", "ks-XC", "ks-XT", "ks-Arab", "ku-IQ", "ku-IR", "ms-Arab-MY", "ms-XC", "ms-XF", "mve-PK", "mve-XT", "pa-XT", "prs-AF", "sd-XC", "sd-XT", "sd-Arab", "su-XC", "trw");
    private static final lmz q = lmz.w("cja-XA", "doi-XA", "doi-XD", "doi-XU", "doi-Deva", "doi-Latn", "gju-XD", "gju-XU", "ks-XA", "ks-XD", "ks-XU", "ks-Deva", "ks-Latn", "mde-XA", "rhg-XA", "sd-XA", "sd-XD", "sd-XV", "sd-Deva", "sd-Latn", "ur-XA");
    public static final lle b = new lrk(new Object[]{"iw", "he", "ji", "yi", "in", "id"}, 3);
    private static volatile llw r = lrq.b;
    public static volatile int c = 0;
    public static final jav d = new jav();
    public static final jav e = d(Locale.US);

    static {
        jez.U("iw", "he");
        jez.U("ji", "yi");
        jez.U("in", "id");
    }

    private jav() {
        this.f = -1;
        this.g = null;
        String[] strArr = gvw.g;
        this.h = strArr;
        this.i = null;
        this.j = null;
        this.k = strArr;
        this.l = strArr;
        this.m = null;
        this.s = Locale.ROOT;
        this.n = "";
    }

    public jav(jau jauVar, String str) {
        this.f = jauVar.a;
        this.g = jauVar.b;
        this.h = Q(jauVar.f);
        this.i = jauVar.c;
        this.j = jauVar.d;
        this.k = Q(jauVar.g);
        this.l = Q(jauVar.h);
        this.m = jauVar.e;
        this.n = str;
    }

    public static boolean A(char c2) {
        return c2 == 'x' || c2 == 'X';
    }

    public static boolean B(String str) {
        if (str.length() != 2 || !s(str)) {
            if (str.length() != 3) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                if (!x(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean E(String str) {
        return TextUtils.isEmpty(str) || str.startsWith("und");
    }

    public static boolean F(String str) {
        int length = str.length();
        if (length < 5 || length > 8) {
            return length == 4 && x(str.charAt(0)) && u(str.charAt(1)) && u(str.charAt(2)) && u(str.charAt(3));
        }
        return v(str);
    }

    public static jav[] G() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            int size = localeList.size();
            for (int i = 0; i < size; i++) {
                jav d2 = d(localeList.get(i));
                if (!arrayList.contains(d2)) {
                    arrayList.add(d2);
                }
            }
        } else {
            arrayList.add(d(Locale.getDefault()));
        }
        return (jav[]) arrayList.toArray(new jav[arrayList.size()]);
    }

    public static jau H() {
        return new jau((byte[]) null);
    }

    public static jau I(jav javVar) {
        return new jau(javVar);
    }

    public static jav L(jau jauVar, mop mopVar) {
        do {
            jav c2 = mopVar.c(jauVar.c());
            if (c2 != null) {
                return c2;
            }
        } while (jauVar.d());
        return null;
    }

    private static String N(Locale locale, Locale locale2) {
        String displayName = locale2 != null ? locale.getDisplayName(locale2) : locale.getDisplayName();
        if (!displayName.isEmpty()) {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            String substring = displayName.substring(0, offsetByCodePoints);
            if (locale2 == null) {
                locale2 = Locale.getDefault();
            }
            return String.valueOf(substring.toUpperCase(locale2)).concat(String.valueOf(displayName.substring(offsetByCodePoints)));
        }
        return displayName;
    }

    private static boolean O(char c2) {
        return jbs.k(c2) || jbs.o(c2);
    }

    private final boolean P() {
        return b.containsKey(this.g);
    }

    private static String[] Q(List list) {
        return list.isEmpty() ? gvw.g : (String[]) list.toArray(new String[list.size()]);
    }

    private static Object R(jau jauVar, Collection collection, jat jatVar) {
        do {
            String c2 = jauVar.c();
            for (Object obj : collection) {
                if (c2.equals(jatVar.a(obj).n)) {
                    return obj;
                }
            }
        } while (jauVar.d());
        return null;
    }

    public static int b(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection();
    }

    public static jav c(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        return locale != null ? d(locale) : G()[0];
    }

    public static jav d(Locale locale) {
        if (Locale.ROOT.equals(locale)) {
            return d;
        }
        jau H = H();
        try {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            int indexOf = language.indexOf(95);
            if (indexOf >= 0) {
                if (TextUtils.isEmpty(country)) {
                    country = language.substring(indexOf + 1);
                }
                language = language.substring(0, indexOf);
            }
            if (TextUtils.isEmpty(language) || !z(language)) {
                ((ltd) ((ltd) o.d()).k("com/google/android/libraries/inputmethod/utils/LanguageTag", "extractLanguageAndCountryFromLocale", 257, "LanguageTag.java")).G("Locale %s has invalid language '%s', fallback to 'en'", locale, language);
                language = "en";
            }
            H.e(language);
            if (!TextUtils.isEmpty(country)) {
                if (!B(country)) {
                    ((ltd) ((ltd) o.d()).k("com/google/android/libraries/inputmethod/utils/LanguageTag", "extractLanguageAndCountryFromLocale", 264, "LanguageTag.java")).G("Locale %s has invalid country code: %s", locale, country);
                } else {
                    H.g(country);
                }
            }
            String variant = locale.getVariant();
            if (!TextUtils.isEmpty(variant)) {
                if (F(variant)) {
                    if (!F(l(variant))) {
                        throw new IllegalArgumentException("Invalid variant subtag: ".concat(String.valueOf(variant)));
                    }
                    H.g.add(jbs.c(variant));
                } else {
                    ((ltd) ((ltd) o.d()).k("com/google/android/libraries/inputmethod/utils/LanguageTag", "fromLocale", 228, "LanguageTag.java")).G("Locale %s has invalid variant: %s", locale, variant);
                }
            }
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                H.h(script);
            }
            return H.a();
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Failed to build LanguageTag from Locale: ".concat(String.valueOf(String.valueOf(locale))), e2);
        }
    }

    public static jav e(String str) {
        return TextUtils.isEmpty(str) ? d : f(str.replace('_', '-'));
    }

    public static jav f(String str) {
        jav g = g(str);
        return g != null ? g : H().b(str);
    }

    public static jav g(String str) {
        if (TextUtils.isEmpty(str)) {
            return d;
        }
        qo qoVar = a;
        synchronized (qoVar) {
            jav javVar = (jav) qoVar.get(str);
            if (javVar == null) {
                return null;
            }
            return javVar;
        }
    }

    public static String l(String str) {
        return str != null ? str : "";
    }

    public static boolean s(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!O(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(char[] cArr, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                int i3 = i + 1;
                if (!O(cArr[i])) {
                    return false;
                }
                i = i3;
            } else {
                return true;
            }
        }
    }

    public static boolean u(char c2) {
        return O(c2) || x(c2);
    }

    public static boolean v(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!u(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean w(char[] cArr, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                int i3 = i + 1;
                if (!u(cArr[i])) {
                    return false;
                }
                i = i3;
            } else {
                return true;
            }
        }
    }

    public static boolean x(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean y(char c2) {
        return u(c2) && !A(c2);
    }

    public static boolean z(String str) {
        int length = str.length();
        return length >= 2 && length <= 8 && s(str);
    }

    public final boolean C() {
        return a() == 1;
    }

    public final boolean D() {
        return TextUtils.isEmpty(this.g) || "und".equals(this.g);
    }

    public final jau J() {
        return new jau(this);
    }

    public final jav K(mop mopVar) {
        if (d.equals(this)) {
            return null;
        }
        jav c2 = mopVar.c(this.n);
        if (c2 != null) {
            return c2;
        }
        jau J = J();
        J.d();
        jav L = L(J, mopVar);
        if (L != null || TextUtils.isEmpty(this.i)) {
            return L;
        }
        jau J2 = J();
        J2.h(null);
        return L(J2, mopVar);
    }

    public final int a() {
        Locale q2;
        if (p.contains(this.n)) {
            return 1;
        }
        if (q.contains(this.n)) {
            return 0;
        }
        if (TextUtils.isEmpty(this.m)) {
            q2 = q();
        } else {
            jau J = J();
            J.e = null;
            q2 = J.a().q();
        }
        return TextUtils.getLayoutDirectionFromLocale(q2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jav)) {
            return false;
        }
        jav javVar = (jav) obj;
        boolean P = P();
        if (P == javVar.P()) {
            return this.n.equals(javVar.n);
        }
        if (P) {
            return p().equals(javVar.n);
        }
        return this.n.equals(javVar.p());
    }

    public final jav h(Collection collection) {
        return (jav) k(collection, jas.b);
    }

    public final int hashCode() {
        return p().hashCode();
    }

    public final jav i(Collection collection) {
        jau jauVar = new jau(this);
        do {
            List asList = Arrays.asList(jauVar.a());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jav javVar = (jav) it.next();
                if (javVar.h(asList) != null) {
                    return javVar;
                }
            }
        } while (jauVar.d());
        return null;
    }

    public final jav j(Collection collection) {
        if (d.equals(this)) {
            return null;
        }
        jas jasVar = jas.a;
        jav javVar = (jav) k(collection, jasVar);
        if (javVar != null || TextUtils.isEmpty(this.i)) {
            return javVar;
        }
        jau J = J();
        J.h(null);
        return (jav) R(J, collection, jasVar);
    }

    public final Object k(Collection collection, jat jatVar) {
        if (d.equals(this)) {
            return null;
        }
        return R(new jau(this), collection, jatVar);
    }

    public final String m(Context context) {
        String M = M(context, null);
        return M != null ? M : N(q(), null);
    }

    public final String n(Context context, jav javVar) {
        return o(context, javVar.q());
    }

    public final String o(Context context, Locale locale) {
        String M = M(context, locale);
        return M != null ? M : N(q(), locale);
    }

    public final String p() {
        String str = (String) b.get(this.g);
        return str == null ? this.n : str.concat(String.valueOf(this.n.substring(this.g.length())));
    }

    public final Locale q() {
        if (this.s == null) {
            synchronized (this) {
                if (this.s == null) {
                    this.s = Locale.forLanguageTag(this.n);
                }
            }
        }
        return this.s;
    }

    public final boolean r(String str) {
        jav f = f(str);
        if (this.f != f.f) {
            return false;
        }
        String str2 = f.g;
        if (str2 != null && !str2.equals(this.g)) {
            return false;
        }
        String str3 = f.i;
        if (str3 != null && !str3.equals(this.i)) {
            return false;
        }
        String str4 = f.j;
        if (str4 != null && !str4.equals(this.j)) {
            return false;
        }
        String str5 = f.m;
        if (str5 != null && !str5.equals(this.m)) {
            return false;
        }
        if (f.h.length > 0 && !Arrays.asList(this.h).containsAll(Arrays.asList(f.h))) {
            return false;
        }
        if (f.k.length > 0 && !Arrays.asList(this.k).containsAll(Arrays.asList(f.k))) {
            return false;
        }
        return f.l.length <= 0 || Arrays.asList(this.l).containsAll(Arrays.asList(f.l));
    }

    public final String toString() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.n);
    }

    private final String M(Context context, Locale locale) {
        if (c != 0) {
            synchronized (jav.class) {
                int i = c;
                if (i != 0) {
                    TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i);
                    c = 0;
                    int length = obtainTypedArray.length();
                    lls i2 = llw.i(length / 2);
                    for (int i3 = 0; i3 < length; i3 += 2) {
                        i2.a(obtainTypedArray.getString(i3), Integer.valueOf(obtainTypedArray.getResourceId(i3 + 1, 0)));
                    }
                    obtainTypedArray.recycle();
                    r = i2.l();
                }
            }
        }
        Integer num = (Integer) r.get(this.n);
        if (num == null) {
            return null;
        }
        try {
            return jbi.f(context, locale).getString(num.intValue());
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
