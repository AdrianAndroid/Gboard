package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fnn  reason: default package */
/* loaded from: classes.dex */
public final class fnn {
    static boolean a = false;
    public static final /* synthetic */ int c = 0;
    private static boolean d = false;
    static final AtomicBoolean b = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnn.b(android.content.Context, int):int");
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static void d(Context context, int i) {
        int f = fmy.d.f(context, i);
        if (f != 0) {
            Intent g = fmy.d.g(context, f, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + f);
            if (g == null) {
                throw new fnl();
            }
            throw new fnm("Google Play Services not available", g);
        }
    }

    public static boolean e(Context context) {
        try {
            if (!a) {
                PackageInfo c2 = fsj.b(context).c("com.google.android.gms", 64);
                fno.b(context);
                if (c2 == null || fno.e(c2, false) || !fno.e(c2, true)) {
                    d = false;
                } else {
                    d = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            a = true;
        }
        return d || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static boolean f(Context context, int i) {
        if (i == 1) {
            return h(context);
        }
        return false;
    }

    @Deprecated
    public static boolean g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean h(Context context) {
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    @Deprecated
    public static String i() {
        return "CANCELED";
    }
}
