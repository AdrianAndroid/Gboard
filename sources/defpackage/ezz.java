package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ezz  reason: default package */
/* loaded from: classes.dex */
public final class ezz {
    private static final llp a = llp.x("af", "am", "ar", "az", "be", "bg", "bn", "bs", "ca", "ceb", "co", "cs", "cy", "da", "de", "el", "en", "eo", "es", "et", "eu", "fa", "fi", "fil", "fr", "fy", "ga", "gd", "gl", "gu", "ha", "haw", "hi", "hmn", "hr", "ht", "hu", "hy", "id", "ig", "is", "it", "iw", "ja", "jw", "ka", "kk", "km", "kn", "ko", "ku", "ky", "la", "lb", "lo", "lt", "lv", "mg", "mi", "mk", "ml", "mn", "mr", "ms", "mt", "my", "ne", "nl", "no", "ny", "pa", "pl", "ps", "pt", "ro", "ru", "sd", "si", "sk", "sl", "sm", "sn", "so", "sq", "sr", "st", "su", "sv", "sw", "ta", "te", "tg", "th", "tr", "uk", "ur", "uz", "vi", "xh", "yi", "yo", "zh", "zu");
    private static final llp b = llp.x("af", "am", "ar", "az", "be", "bg", "bn", "bs", "ca", "ceb", "co", "cs", "cy", "da", "de", "el", "en", "eo", "es", "et", "eu", "fa", "fi", "fil", "fr", "fy", "ga", "gd", "gl", "gu", "ha", "haw", "hi", "hmn", "hr", "ht", "hu", "hy", "id", "ig", "is", "it", "iw", "ja", "jw", "ka", "kk", "km", "kn", "ko", "ku", "ky", "la", "lb", "lo", "lt", "lv", "mg", "mi", "mk", "ml", "mn", "mr", "ms", "mt", "my", "ne", "nl", "no", "ny", "pa", "pl", "ps", "pt", "ro", "ru", "sd", "si", "sk", "sl", "sm", "sn", "so", "sq", "sr", "st", "su", "sv", "sw", "ta", "te", "tg", "th", "tr", "uk", "ur", "uz", "vi", "xh", "yi", "yo", "zh-CN", "zh-TW", "zu");

    public static String a(Locale locale) {
        return "zh".equalsIgnoreCase(locale.getLanguage()) ? "zh" : i(locale);
    }

    public static String b(String str) {
        return a(jay.f(str));
    }

    public static String c(String str) {
        Locale f = jay.f(str);
        if ("zh".equalsIgnoreCase(f.getLanguage())) {
            String c = jay.c(f);
            if (!TextUtils.isEmpty(c)) {
                if ("Hant".equalsIgnoreCase(c)) {
                    return jav.d(Locale.TRADITIONAL_CHINESE).n;
                }
                return jav.d(Locale.SIMPLIFIED_CHINESE).n;
            }
            String country = f.getCountry();
            if (TextUtils.isEmpty(country) || country.equalsIgnoreCase("CN") || country.equalsIgnoreCase("SG")) {
                return jav.d(Locale.SIMPLIFIED_CHINESE).n;
            }
            return jav.d(Locale.TRADITIONAL_CHINESE).n;
        }
        return i(f);
    }

    public static final Map d(Context context, Locale locale) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("auto", h(context, locale));
        llp llpVar = a;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) llpVar.get(i2);
            if (!"auto".equals(str)) {
                String b2 = b(str);
                if (!TextUtils.isEmpty(b2)) {
                    String b3 = jay.b(b2, locale);
                    if (!TextUtils.isEmpty(b3)) {
                        linkedHashMap.put(b2, b3);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map e(Locale locale) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        llp llpVar = b;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            String c = c((String) llpVar.get(i2));
            if (!TextUtils.isEmpty(c)) {
                String b2 = jay.b(c, locale);
                if (!TextUtils.isEmpty(b2)) {
                    linkedHashMap.put(c, b2);
                }
            }
        }
        return linkedHashMap;
    }

    public static Map f(Map map, Locale locale) {
        if (map.size() <= 1) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = (String) map.get("auto");
        if (str != null) {
            linkedHashMap.put("auto", str);
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collator collator = Collator.getInstance(locale);
        collator.setStrength(0);
        Collections.sort(arrayList, new ezy(collator, 0));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i);
            linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        return linkedHashMap;
    }

    public static boolean g(String str, String str2) {
        if (!"zh".equals(str) || !"zh-CN".equals(str2)) {
            return str.equals(str2);
        }
        return true;
    }

    public static String h(Context context, Locale locale) {
        String string = context.getString(R.string.f176770_resource_name_obfuscated_res_0x7f140cf8);
        if (locale.equals(context.getResources().getConfiguration().locale)) {
            return string;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        String string2 = context.createConfigurationContext(configuration).getString(R.string.f176770_resource_name_obfuscated_res_0x7f140cf8);
        return TextUtils.isEmpty(string2) ? string : string2;
    }

    private static String i(Locale locale) {
        String language = locale.getLanguage();
        return "nb".equals(language) ? "no" : "in".equals(language) ? "id" : "fil".equals(language) ? "tl" : "he".equals(language) ? "iw" : "ji".equals(language) ? "yi" : "zz".equals(language) ? "en" : language;
    }
}
