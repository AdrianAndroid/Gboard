package defpackage;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: lfd  reason: default package */
/* loaded from: classes.dex */
public final class lfd {
    static {
        Logger.getLogger(lfd.class.getName());
    }

    private lfd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        return System.nanoTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lem b(String str) {
        jdg.u(str);
        return new let(Pattern.compile(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    public static String d(String str) {
        return str == null ? "" : str;
    }

    public static boolean e(String str) {
        return str == null || str.isEmpty();
    }
}
