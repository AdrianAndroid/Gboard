package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Process;

/* compiled from: PG */
/* renamed from: jg  reason: default package */
/* loaded from: classes.dex */
public final class jg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface a(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static int b(Context context, String str) {
        int b;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d = uc.d(str);
        if (d == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int myUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (myUid2 != myUid || !xu.b(packageName2, packageName)) {
            b = jd.b(context, d, packageName);
        } else if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager b2 = ud.b(context);
            b = ud.a(b2, d, Binder.getCallingUid(), packageName);
            if (b == 0) {
                b = ud.a(b2, d, myUid, ud.c(context));
            }
        } else {
            b = jd.b(context, d, packageName);
        }
        return b != 0 ? -2 : 0;
    }
}
