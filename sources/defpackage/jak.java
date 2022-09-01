package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: jak  reason: default package */
/* loaded from: classes.dex */
public final class jak {
    private static final lug a = hin.a;

    public static Enum a(String str, Class cls) {
        if (str == null) {
            return null;
        }
        try {
            return Enum.valueOf(cls, str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            if (message == null) {
                ((luc) ((luc) a.c()).k("com/google/android/libraries/inputmethod/utils/EnumUtil", "valueOf", 57, "EnumUtil.java")).t("null");
            } else {
                ((luc) ((luc) a.c()).k("com/google/android/libraries/inputmethod/utils/EnumUtil", "valueOf", 59, "EnumUtil.java")).w("%s", message);
            }
            return null;
        }
    }

    public static Enum b(String str, Enum r6) {
        if (str == null) {
            return r6;
        }
        try {
            return Enum.valueOf(r6.getDeclaringClass(), str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            if (message == null) {
                ((luc) ((luc) a.c()).k("com/google/android/libraries/inputmethod/utils/EnumUtil", "valueOf", 36, "EnumUtil.java")).t("null");
            } else {
                ((luc) ((luc) a.c()).k("com/google/android/libraries/inputmethod/utils/EnumUtil", "valueOf", 38, "EnumUtil.java")).w("%s", message);
            }
            return r6;
        }
    }
}
