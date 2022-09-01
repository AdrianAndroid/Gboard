package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: oi  reason: default package */
/* loaded from: classes2.dex */
public final class oi {
    public static Method a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void a(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public static boolean b(View view) {
        return aad.f(view) == 1;
    }
}
