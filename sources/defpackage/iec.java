package defpackage;

/* compiled from: PG */
/* renamed from: iec  reason: default package */
/* loaded from: classes.dex */
public final class iec {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metrics/clearcut/ClearcutLoggerFactory");

    public static Object a(lgb lgbVar) {
        try {
            return lgbVar.a();
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/metrics/clearcut/ClearcutLoggerFactory", "createLoggerSafely", '=', "ClearcutLoggerFactory.java")).t("createLoggerSafely(): failed");
            return null;
        }
    }

    public static boolean b() {
        if (!hjk.a()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/metrics/clearcut/ClearcutLoggerFactory", "shouldCreateLogger", 68, "ClearcutLoggerFactory.java")).t("shouldCreateLogger(): isGMSCoreSafeToConnect=false");
            return false;
        } else if (!jam.B()) {
            return true;
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/metrics/clearcut/ClearcutLoggerFactory", "shouldCreateLogger", 72, "ClearcutLoggerFactory.java")).t("shouldCreateLogger(): disabled for tests");
            return false;
        }
    }
}
