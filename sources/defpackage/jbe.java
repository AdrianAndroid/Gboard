package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: jbe  reason: default package */
/* loaded from: classes.dex */
public final class jbe {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/utils/ProcessUtil");
    private static final gwa b = new gwa();
    private static final gwa c = new gwa();

    private jbe() {
    }

    public static String a(Context context) {
        return (String) b.a(new ihp(context, 3));
    }

    public static String b(Context context) {
        return (String) c.a(new ihp(context, 4));
    }

    public static boolean c(Context context) {
        String a2 = a(context);
        if (a2 == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/utils/ProcessUtil", "isMainProcess", 48, "ProcessUtil.java")).t("Process name wasn't available. Assuming we're on the main process");
            return true;
        }
        return a2.equals(context.getPackageName());
    }
}
