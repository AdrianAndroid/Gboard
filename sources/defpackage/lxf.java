package defpackage;

/* compiled from: PG */
/* renamed from: lxf  reason: default package */
/* loaded from: classes.dex */
public final class lxf {
    private static final String[] a;
    private static final lxi b;

    static {
        lxi lxkVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        a = strArr;
        int i = 0;
        while (true) {
            if (i >= 2) {
                lxkVar = new lxk();
                break;
            }
            try {
                lxkVar = (lxi) Class.forName(strArr[i]).asSubclass(lxi.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                lxkVar = null;
            }
            if (lxkVar != null) {
                break;
            }
            i++;
        }
        b = lxkVar;
    }

    public static StackTraceElement a(Class cls, int i) {
        lxj.b(cls, "target");
        if (i < 0) {
            throw new IllegalArgumentException("skip count cannot be negative: " + i);
        }
        return b.a(cls, i + 1);
    }

    public static StackTraceElement[] b(Class cls, int i) {
        if (i > 0 || i == -1) {
            return b.b(cls, i);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}
