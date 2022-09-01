package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: gdr  reason: default package */
/* loaded from: classes.dex */
public final class gdr {
    private static final Object a = new Object();
    private static Method b = null;
    private static Method c = null;

    static {
        int i = fmy.c;
    }

    public static void a(Context context) {
        Context context2;
        fyb.aH(context, "Context must not be null");
        fnn.d(context, 11925000);
        synchronized (a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = fty.c(context, fty.b, "com.google.android.gms.providerinstaller.dynamite").c;
            } catch (ftu e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context c2 = fnn.c(context);
                if (c2 != null) {
                    try {
                        if (c == null) {
                            c = b(c2, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, Long.TYPE, Long.TYPE});
                        }
                        c.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                    } catch (Exception e2) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e2.getMessage())));
                    }
                }
                if (c2 != null) {
                    c(c2, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new fnl();
                }
            }
            c(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, String str) {
        try {
            if (b == null) {
                b = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            b.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.getMessage() : cause.getMessage())));
            }
            throw new fnl();
        }
    }
}
