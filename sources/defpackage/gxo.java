package defpackage;

/* compiled from: PG */
/* renamed from: gxo  reason: default package */
/* loaded from: classes.dex */
public final class gxo {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/concurrent/ExecutorUtils");

    @Deprecated
    public static final mks b(int i) {
        return gxp.a().b(i);
    }

    @Deprecated
    public static final mks c(int i) {
        return gxp.a().b(i);
    }

    @Deprecated
    public static final mks a(int i) {
        if (i != 1 && i != 2 && i != 5) {
            if (i != 6) {
                if (i != 19) {
                    switch (i) {
                        case 9:
                        case 11:
                            break;
                        case 10:
                            break;
                        default:
                            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/concurrent/ExecutorUtils", "getFixedSizeBackgroundExecutor", 102, "ExecutorUtils.java")).t("Runnable priority should be one of ThreadPriorities.");
                            return gxp.a().c;
                    }
                }
                return gxp.a().b;
            }
            return gxp.a().c;
        }
        return gxp.a().a;
    }
}
