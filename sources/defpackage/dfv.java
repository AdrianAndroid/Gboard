package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: dfv  reason: default package */
/* loaded from: classes.dex */
public final class dfv {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingDelightTagMatcher");
    private static volatile dfv b;
    private static final llw c;

    static {
        lls h = llw.h();
        h.a("ar-x-levant", "ar-XC");
        h.a("as-Latn", "as-XA");
        h.a("ber-Latn", "ber-XA");
        h.a("bgp-Arab", "bgp-XT");
        h.a("bhb-Deva", "bhb-XT");
        h.a("bn-Latn", "bn-XA");
        h.a("brh-Arab", "brh-XT");
        h.a("brx-Deva", "brx-XV");
        h.a("brx-Latn", "brx-XA");
        h.a("cr-Latn-CA", "cr-XA");
        h.a("crh-Latn", "crh-XA");
        h.a("doi-Arab", "doi-XT");
        h.a("doi-Deva", "doi-XU");
        h.a("doi-Latn", "doi-XA");
        h.a("gju-Deva", "gju-XU");
        h.a("gu-Latn", "gu-XA");
        h.a("hi-Latn", "hi-XA");
        h.a("hif-Deva", "hif-XD");
        h.a("jv-Latn", "jv");
        h.a("kmz-Arab", "kmz-XC");
        h.a("kmz-Latn", "kmz-XA");
        h.a("kn-Latn", "kn-XA");
        h.a("kok-Deva", "kok-XT");
        h.a("kok-Latn", "kok-XA");
        h.a("ks-Arab", "ks-XT");
        h.a("ks-Deva", "ks-XU");
        h.a("ks-Latn", "ks-XA");
        h.a("ktb-Latn", "ktb-XA");
        h.a("lmn-Deva", "lmn-XU");
        h.a("mai-Latn", "mai-XA");
        h.a("ml-Latn", "ml-XA");
        h.a("mni-Latn", "mni-XA");
        h.a("mr-Latn", "mr-XA");
        h.a("ms-Arab-BN", "ms-XF");
        h.a("ms-Arab-MY", "ms-XC");
        h.a("ne-Latn", "ne-XA");
        h.a("or-Latn", "or-XA");
        h.a("pa-Guru", "pa-XV");
        h.a("pa-Latn", "pa-XA");
        h.a("sa-Latn", "sa-XA");
        h.a("sat-Deva", "sat-XV");
        h.a("sat-Latn", "sat-XA");
        h.a("sd-Arab", "sd-XT");
        h.a("sd-Deva", "sd-XV");
        h.a("sd-Latn", "sd-XA");
        h.a("skr-x-sindhi", "skr-XT");
        h.a("skr-x-urdu", "skr-XU");
        h.a("sq-x-gheg", "aln-RS");
        h.a("sq-x-standard", "sq");
        h.a("sr-Cyrl-RS", "sr");
        h.a("sr-Latn-RS", "sr-ZZ");
        h.a("su-Arab", "su-XC");
        h.a("su-Latn", "su");
        h.a("syl-Latn", "syl-XA");
        h.a("ta-Latn", "ta-XA");
        h.a("te-Latn", "te-XA");
        h.a("trp-Latn", "trp-XA");
        h.a("unr-Latn", "unr-XA");
        h.a("ur-Latn", "ur-XA");
        h.a("uz-Latn", "uz");
        c = h.l();
    }

    private dfv() {
    }

    public static final Locale a(jav javVar) {
        String str = (String) c.get(javVar.n);
        if (str != null) {
            Locale build = new Locale.Builder().setLanguageTag(str).build();
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingDelightTagMatcher", "getLocaleForTag", 102, "HandwritingDelightTagMatcher.java")).G("Using Delight locale %s for language tag %s", build, javVar);
            return build;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingDelightTagMatcher", "getLocaleForTag", 105, "HandwritingDelightTagMatcher.java")).G("Using Delight locale %s for language tag %s", javVar.q(), javVar);
        return javVar.q();
    }

    public static void b() {
        if (b == null) {
            synchronized (dfv.class) {
                if (b == null) {
                    b = new dfv();
                }
            }
        }
    }
}
