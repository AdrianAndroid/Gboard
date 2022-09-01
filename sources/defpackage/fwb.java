package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: fwb  reason: default package */
/* loaded from: classes.dex */
public final class fwb {
    static {
        Pattern.compile(" *([A-Za-z]{2,3})(?:-([A-Za-z]{4}))?(?:-([A-Za-z]{2}|[0-9]{3}))?(?:-((?:[A-Za-z0-9]{5,8}|[0-9][A-Za-z0-9]{3})(?:-(?:[A-Za-z0-9]{5,8}|[0-9][A-Za-z0-9]{3}))*))?(?:-(?:[0-9A-WY-Za-wy-z](?:-[A-Za-z0-9]{2,8})+))?(?:-(?:x(?:-[A-Za-z0-9]{1,8})+))? *");
    }

    public static String a(Locale locale) {
        String languageTag = locale.toLanguageTag();
        return languageTag != null ? languageTag : "und";
    }

    public static Locale b(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        return forLanguageTag != null ? forLanguageTag : new Locale("");
    }
}
