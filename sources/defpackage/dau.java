package defpackage;

/* compiled from: PG */
/* renamed from: dau  reason: default package */
/* loaded from: classes.dex */
public final class dau {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/utils/DebugPreconditions");

    public static void a(String str) {
        k(str.isEmpty() ? new IllegalArgumentException() : new IllegalArgumentException(str));
    }

    public static void b(String str) {
        k(str.isEmpty() ? new IllegalStateException() : new IllegalStateException(str));
    }

    public static boolean c(Object obj) {
        if (obj == null) {
            b("");
            return false;
        }
        return true;
    }

    public static void d(boolean z) {
        if (!z) {
            a("");
        }
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            a((String) obj);
        }
    }

    public static lfb f(Class cls, Object obj) {
        if (!cls.isInstance(obj)) {
            a("Candidate data is invalid");
            return ldu.a;
        }
        return lfb.g(cls.cast(obj));
    }

    public static lfb g(Class cls, Object obj, Object... objArr) {
        if (!cls.isInstance(obj)) {
            a(jdg.p("Tooltip is invalid: %s", objArr));
            return ldu.a;
        }
        return lfb.g(cls.cast(obj));
    }

    public static void h(boolean z) {
        if (!z) {
            b("");
        }
    }

    public static void i(boolean z, Object obj) {
        if (!z) {
            b((String) obj);
        }
    }

    public static void j(boolean z, String str, Object... objArr) {
        if (!z) {
            b(jdg.p(str, objArr));
        }
    }

    private static void k(RuntimeException runtimeException) {
        if (jam.b) {
            throw runtimeException;
        }
        ((ltd) ((ltd) a.a(hip.a).i(runtimeException)).k("com/google/android/apps/inputmethod/libs/expression/utils/DebugPreconditions", "throwOrLog", 349, "DebugPreconditions.java")).s();
    }
}
