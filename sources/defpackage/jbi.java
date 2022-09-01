package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* renamed from: jbi  reason: default package */
/* loaded from: classes.dex */
public final class jbi {
    public static final Map a;
    private static final lug b = hin.a;
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/utils/ResourceUtil");
    private static final lfy d = lfy.c(':');

    static {
        qo qoVar = new qo();
        a = qoVar;
        qoVar.put("HARDWARE", Build.HARDWARE);
        qoVar.put("MODEL", Build.MODEL);
        qoVar.put("BRAND", Build.BRAND);
        qoVar.put("MANUFACTURER", Build.MANUFACTURER);
        StringBuilder sb = new StringBuilder();
        for (String str : qoVar.keySet()) {
            if (sb.length() == 0) {
                sb.append("[");
            } else {
                sb.append(" ");
            }
            sb.append(str);
            sb.append(" = ");
            sb.append((String) a.get(str));
        }
        sb.append("]");
    }

    public static int a(Context context, String str, String str2) {
        return b(context, str, str2, m(context), true);
    }

    public static int b(Context context, String str, String str2, String str3, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.length() > 0 && str.charAt(0) == '@') {
            str = str.substring(1);
        }
        int identifier = context.getResources().getIdentifier(str, str2, str3);
        if (identifier != 0) {
            return identifier;
        }
        Context applicationContext = context.getApplicationContext();
        if (context != applicationContext) {
            identifier = applicationContext.getResources().getIdentifier(str, str2, m(applicationContext));
        }
        if (identifier != 0) {
            return identifier;
        }
        if (z) {
            throw new IllegalStateException("Failed to get identifier from name: ".concat(String.valueOf(str)));
        }
        return 0;
    }

    public static int c(Context context, String str) {
        return a(context, str, "xml");
    }

    public static Context d(Context context, jav javVar) {
        return l(context, javVar.q(), javVar.a());
    }

    public static Context e(Context context, boolean z) {
        Configuration configuration = context.getResources().getConfiguration();
        boolean z2 = true;
        if (configuration.getLayoutDirection() != 1) {
            z2 = false;
        }
        if (z2 == z) {
            return context;
        }
        Configuration configuration2 = new Configuration(configuration);
        n(configuration2, z);
        return k(context, configuration2);
    }

    public static Resources f(Context context, Locale locale) {
        return locale == null ? context.getResources() : l(context, locale, -1).getResources();
    }

    public static String g(Resources resources, int i, String str) {
        String[] stringArray = resources.getStringArray(i);
        Map map = a;
        String str2 = null;
        if (stringArray != null && map != null) {
            int length = stringArray.length;
            String str3 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str4 = stringArray[i2];
                int indexOf = str4.indexOf(44);
                if (indexOf < 0) {
                    ((luc) ((luc) b.c()).k("com/google/android/libraries/inputmethod/utils/ResourceUtil", "findConstantForKeyValuePairs", 320, "ResourceUtil.java")).w("Array element has no comma: %s", str4);
                } else {
                    String substring = str4.substring(0, indexOf);
                    if (substring.isEmpty()) {
                        ((luc) ((luc) b.d()).k("com/google/android/libraries/inputmethod/utils/ResourceUtil", "findConstantForKeyValuePairs", 329, "ResourceUtil.java")).w("Array element has no condition: %s", str4);
                        if (str3 == null) {
                            str3 = str4.substring(indexOf + 1);
                        }
                    } else {
                        try {
                            if (o(map, substring)) {
                                str2 = str4.substring(indexOf + 1);
                                break;
                            }
                            continue;
                        } catch (jbh e) {
                            ((luc) ((luc) ((luc) b.d()).i(e)).k("com/google/android/libraries/inputmethod/utils/ResourceUtil", "findConstantForKeyValuePairs", (char) 348, "ResourceUtil.java")).t("Syntax error, ignored, ");
                        }
                    }
                }
                i2++;
            }
            if (str2 == null) {
                str2 = str3;
            }
        }
        if (str2 != null) {
            resources.getResourceEntryName(i);
            return str2;
        }
        return str;
    }

    public static String h(int i) {
        guw.a().getApplicationContext();
        return i(i);
    }

    public static String i(int i) {
        return i == 0 ? "0" : "#0x".concat(String.valueOf(Integer.toHexString(i)));
    }

    public static String j(int i) {
        return "#0x".concat(String.valueOf(Integer.toHexString(i)));
    }

    private static Context k(Context context, Configuration configuration) {
        try {
            return context.createConfigurationContext(configuration);
        } catch (Throwable th) {
            if (!jam.b) {
                throw th;
            }
            return context;
        }
    }

    private static Context l(Context context, Locale locale, int i) {
        Locale locale2;
        Configuration configuration = context.getResources().getConfiguration();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24) {
            locale2 = configuration.getLocales().get(0);
        } else {
            locale2 = configuration.locale;
        }
        if (locale.equals(locale2)) {
            return context;
        }
        Configuration configuration2 = new Configuration(configuration);
        configuration2.setLocale(locale);
        if (i != -1 && configuration2.getLayoutDirection() != i) {
            if (i == 1) {
                z = true;
            }
            n(configuration2, z);
        }
        return k(context, configuration2);
    }

    private static String m(Context context) {
        try {
            return context.getPackageName();
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) c.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/ResourceUtil", "getPackageName", (char) 231, "ResourceUtil.java")).t("Failed to get package name.");
            return null;
        }
    }

    private static void n(Configuration configuration, boolean z) {
        configuration.setLayoutDirection(z ? new Locale("iw", "IT") : Locale.US);
    }

    private static boolean o(Map map, String str) {
        for (String str2 : d.i(str)) {
            int indexOf = str2.indexOf(61);
            if (indexOf >= 0) {
                String str3 = (String) map.get(str2.substring(0, indexOf));
                if (str3 != null) {
                    try {
                        if (!str3.matches(str2.substring(indexOf + 1))) {
                            return false;
                        }
                    } catch (PatternSyntaxException e) {
                        throw new jbh("Syntax error", str, e);
                    }
                } else {
                    throw new jbh("Unknown key", str);
                }
            } else {
                throw new jbh("Pattern has no '='", str);
            }
        }
        return true;
    }
}
