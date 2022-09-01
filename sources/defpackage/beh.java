package defpackage;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* renamed from: beh  reason: default package */
/* loaded from: classes.dex */
public class beh {
    private static void a(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(String.valueOf(cls))), exc);
    }

    public static bef c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                a(cls, e);
            } catch (InstantiationException e2) {
                a(cls, e2);
            } catch (NoSuchMethodException e3) {
                a(cls, e3);
            } catch (InvocationTargetException e4) {
                a(cls, e4);
            }
            if (!(obj instanceof bef)) {
                throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(String.valueOf(obj))));
            }
            return (bef) obj;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static ajt d(CharSequence charSequence, ArrayList arrayList) {
        return new ajt(charSequence, arrayList);
    }

    public static void e(int i, int i2, Map map, ArrayList arrayList) {
        nq.g(map);
        arrayList.add(new ajs(i, i2, map));
    }

    public static void f() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Must not be on main thread");
    }

    public ajt b(ajr ajrVar) {
        f();
        String obj = ajrVar.a.toString();
        nq.g(obj);
        return d(obj, new ArrayList());
    }
}
