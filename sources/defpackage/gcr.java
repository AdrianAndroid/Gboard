package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: gcr  reason: default package */
/* loaded from: classes.dex */
public final class gcr {
    public static String b = "0";
    private static final String c = "gcr";
    private static fty e;
    private static final fmy d = fmy.d;
    public static final Object a = new Object();

    private gcr() {
    }

    public static fty a() {
        fty ftyVar;
        synchronized (a) {
            ftyVar = e;
        }
        return ftyVar;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            fyb.aH(context, "Context must not be null");
            ClassLoader classLoader = gcr.class.getClassLoader();
            fyb.ax(classLoader);
            try {
                classLoader.loadClass("org.chromium.net.CronetEngine");
                fnn.d(context, 11925000);
                try {
                    fty c2 = fty.c(context, fty.a, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> loadClass = c2.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (loadClass.getClassLoader() == gcr.class.getClassLoader()) {
                            Log.e(c, "ImplVersion class is missing from Cronet module.");
                            throw new fnl();
                        }
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        Integer num = (Integer) d(method, new Object[0]);
                        fyb.ax(num);
                        int intValue = num.intValue();
                        String str = (String) d(method2, new Object[0]);
                        fyb.ax(str);
                        b = str;
                        if (intValue < 3) {
                            Intent g = d.g(context, 2, "cr");
                            if (g != null) {
                                String str2 = b;
                                throw new fnm("Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + intValue + ". The Cronet implementation version is " + str2, g);
                            }
                            Log.e(c, "Unable to fetch error resolution intent");
                            throw new fnl();
                        }
                        e = c2;
                    } catch (Exception e2) {
                        Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                        throw ((fnl) new fnl().initCause(e2));
                    }
                } catch (ftu e3) {
                    Log.e(c, "Unable to load Cronet module", e3);
                    throw ((fnl) new fnl().initCause(e3));
                }
            } catch (ClassNotFoundException e4) {
                Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                throw ((fnl) new fnl().initCause(e4));
            }
        }
    }

    public static boolean c() {
        return a() != null;
    }

    private static Object d(Method method, Object... objArr) {
        return method.invoke(null, objArr);
    }
}
