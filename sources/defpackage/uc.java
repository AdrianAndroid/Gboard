package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* compiled from: PG */
/* renamed from: uc  reason: default package */
/* loaded from: classes2.dex */
public class uc {
    static int a(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    public static int b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static Object c(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    public static String d(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public void e(boolean z) {
    }

    public boolean f() {
        return false;
    }
}
