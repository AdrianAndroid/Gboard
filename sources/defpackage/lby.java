package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lby  reason: default package */
/* loaded from: classes.dex */
public final class lby {
    private static las a;

    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
            return "";
        }
        if (replaceFirst.startsWith("base-")) {
            return replaceFirst.replace("base-", "config.");
        }
        return replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }

    public static void b(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }

    public static String c(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static Context d(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static lay e(Context context) {
        return (lay) ((lal) f(context)).a.a();
    }

    public static synchronized las f(Context context) {
        las lasVar;
        synchronized (lby.class) {
            if (a == null) {
                a = new lal(new lbi(d(context), (char[]) null), null);
            }
            lasVar = a;
        }
        return lasVar;
    }

    public static Object g(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(n(obj, str, cls2).invoke(obj, obj2));
        } catch (Exception e) {
            throw new lak(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static Method h(Class cls, String str, Class... clsArr) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new lak(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    public static Object i(Object obj, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(n(obj, "makePathElements", cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (Exception e) {
            throw new lak(String.format("Failed to invoke method %s on an object of type %s", "makePathElements", obj.getClass()), e);
        }
    }

    public static kcq k(Object obj, String str, Class cls) {
        return new kcq(obj, m(obj, str), cls);
    }

    public static kcq l(Object obj, String str, Class cls) {
        return new kcq(obj, m(obj, str), (Class) Array.newInstance(cls, 0).getClass());
    }

    private static Field m(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new lak(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    private static Method n(Object obj, String str, Class... clsArr) {
        return h(obj.getClass(), str, clsArr);
    }
}
