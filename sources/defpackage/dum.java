package defpackage;

/* compiled from: PG */
/* renamed from: dum  reason: default package */
/* loaded from: classes.dex */
public final class dum {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardOpener");
    public final idk a = ieh.j();

    public static hox a() {
        hsk b2 = hsx.b();
        if (b2 == null) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardOpener", "getInputBundle", 147, "KeyboardOpener.java")).t("Input method unexpectedly null.");
            return null;
        }
        return b2.P();
    }

    public static Runnable b(hox hoxVar, duo duoVar, int i) {
        return new ov(i, duoVar, hoxVar, 4);
    }

    public static boolean c() {
        hox a = a();
        return (a == null || a.ag() == null) ? false : true;
    }

    public static void d() {
        hsk b2;
        if (c() && (b2 = hsx.b()) != null) {
            b2.bk();
        }
    }
}
