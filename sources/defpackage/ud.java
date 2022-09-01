package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* compiled from: PG */
/* renamed from: ud  reason: default package */
/* loaded from: classes2.dex */
public class ud {
    public static int a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static AppOpsManager b(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static String c(Context context) {
        return context.getOpPackageName();
    }
}
