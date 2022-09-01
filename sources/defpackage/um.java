package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: um  reason: default package */
/* loaded from: classes2.dex */
public final class um {
    public static final /* synthetic */ int a = 0;
    private static String c;
    private static ul f;
    private static final Object b = new Object();
    private static Set d = new HashSet();
    private static final Object e = new Object();

    public static Set a(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (b) {
            if (string != null) {
                if (!string.equals(c)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    d = hashSet;
                    c = string;
                }
            }
            set = d;
        }
        return set;
    }

    public static final void b(String str, int i, Notification notification, Context context, NotificationManager notificationManager) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i, notification);
            return;
        }
        uj ujVar = new uj(context.getPackageName(), i, str, notification);
        synchronized (e) {
            if (f == null) {
                f = new ul(context.getApplicationContext());
            }
            f.a.obtainMessage(0, ujVar).sendToTarget();
        }
        notificationManager.cancel(str, i);
    }

    public static final boolean c(Context context, NotificationManager notificationManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return notificationManager.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
