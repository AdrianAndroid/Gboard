package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: lgf  reason: default package */
/* loaded from: classes.dex */
public final class lgf {
    private static final Object a;

    static {
        Object g = g();
        a = g;
        if (g != null) {
            h("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (g == null) {
            return;
        }
        i(g);
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Throwable b(Throwable th, Class cls) {
        try {
            return (Throwable) cls.cast(th.getCause());
        } catch (ClassCastException e) {
            e.initCause(th);
            throw e;
        }
    }

    public static Throwable c(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause != null) {
                if (cause == th2) {
                    throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                }
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
                th = cause;
            } else {
                return th;
            }
        }
    }

    public static void d(Throwable th, Class cls) {
        e(th, cls);
        f(th);
    }

    public static void e(Throwable th, Class cls) {
        jdg.u(th);
        if (!cls.isInstance(th)) {
            return;
        }
        throw ((Throwable) cls.cast(th));
    }

    public static void f(Throwable th) {
        jdg.u(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    private static Object g() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method h(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void i(Object obj) {
        try {
            Method h = h("getStackTraceDepth", Throwable.class);
            if (h == null) {
                return;
            }
            h.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
