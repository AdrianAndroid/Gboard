package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* renamed from: uv  reason: default package */
/* loaded from: classes2.dex */
public class uv {
    public static int a(Context context, String str) {
        nd.c(str, "permission must be non-null");
        if (li.f() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        int i = um.a;
        return um.c(context, (NotificationManager) context.getSystemService("notification")) ? 0 : -1;
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ut.a(context);
        }
        return null;
    }

    public static ColorStateList c(Context context, int i) {
        return vm.a(context.getResources(), i, context.getTheme());
    }

    public static File d(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ut.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str == null) {
            return null;
        }
        return new File(str);
    }

    public static boolean e(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ut.c(context);
        }
        return false;
    }

    public static File[] f(Context context) {
        return uq.b(context, null);
    }
}
