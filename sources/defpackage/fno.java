package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fno  reason: default package */
/* loaded from: classes.dex */
public final class fno {
    private static fno b;
    private static volatile Set c;
    public final Context a;
    private volatile String d;

    public fno(Context context) {
        this.a = context.getApplicationContext();
    }

    public static fno b(Context context) {
        fyb.ax(context);
        synchronized (fno.class) {
            if (b == null) {
                fng.a(context);
                b = new fno(context);
            }
        }
        return b;
    }

    static final fri d(PackageInfo packageInfo, fri... friVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        fnd fndVar = new fnd(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < friVarArr.length; i++) {
            if (friVarArr[i].equals(fndVar)) {
                return friVarArr[i];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? d(packageInfo, fnf.a) : d(packageInfo, fnf.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public final fnk a(String str) {
        fnk c2;
        if (str == null) {
            return fnk.a();
        }
        if (str.equals(this.d)) {
            return fnk.a;
        }
        if (fng.b()) {
            c2 = fng.d(str, fnn.e(this.a));
        } else {
            try {
                c2 = c(this.a.getPackageManager().getPackageInfo(str, 64));
            } catch (PackageManager.NameNotFoundException unused) {
                return fnk.b();
            }
        }
        if (!c2.b) {
            return c2;
        }
        this.d = str;
        return c2;
    }

    public final fnk c(PackageInfo packageInfo) {
        boolean e = fnn.e(this.a);
        if (packageInfo == null) {
            return fnk.a();
        }
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return fnk.a();
        }
        fnd fndVar = new fnd(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        fnk c2 = fng.c(str, fndVar, e, false);
        return (!c2.b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !fng.c(str, fndVar, false, true).b) ? c2 : fnk.a();
    }
}
