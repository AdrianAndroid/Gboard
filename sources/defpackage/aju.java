package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: aju  reason: default package */
/* loaded from: classes.dex */
public final class aju {
    private static long a;
    private static Method b;

    public static boolean a() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                if (b == null) {
                    a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
            } catch (Exception e) {
                if (!(e instanceof InvocationTargetException)) {
                    return false;
                }
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
        }
        return ajv.a();
    }
}
