package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: fji  reason: default package */
/* loaded from: classes.dex */
public final class fji {
    private static boolean a = false;
    private static boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UserHandle a(Context context, List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (UserHandle) Collections.min(list, new nvp((UserManager) context.getSystemService(UserManager.class), 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List b(Context context, List list, fjx fjxVar) {
        ArrayList arrayList = new ArrayList();
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserHandle userHandle = (UserHandle) it.next();
            if (userManager.isUserRunning(userHandle) && !userManager.isQuietModeEnabled(userHandle) && (!fjxVar.c || userManager.isUserUnlocked(userHandle))) {
                arrayList.add(userHandle);
            }
        }
        return arrayList;
    }

    public static boolean c(Context context) {
        if (!a) {
            UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
            a = true;
            if (Build.VERSION.SDK_INT >= 30) {
                b = userManager.isManagedProfile();
            } else if (userManager.getUserProfiles().size() >= 2) {
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService(DevicePolicyManager.class);
                PackageManager packageManager = context.getPackageManager();
                b = false;
                Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (devicePolicyManager.isProfileOwnerApp(it.next().packageName)) {
                            b = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                b = false;
                a = false;
            }
        }
        return b;
    }
}
