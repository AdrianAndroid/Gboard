package defpackage;

/* compiled from: PG */
/* renamed from: hyf  reason: default package */
/* loaded from: classes.dex */
public final class hyf {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/lethe/CrashDataUtils");

    public static boolean a(hyd hydVar) {
        hyd hydVar2 = hyd.JAVA_DEFAULT_EXCEPTION;
        int ordinal = hydVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return false;
        }
        if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
            return true;
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/lethe/CrashDataUtils", "isNativeCrash", 22, "CrashDataUtils.java")).u("Unhandled type: %d", hydVar.h);
        return false;
    }
}
