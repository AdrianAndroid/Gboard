package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: dcb  reason: default package */
/* loaded from: classes.dex */
public final class dcb {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/framework/core/CriticalErrorNotification");
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(Context context, String str, String str2) {
        uh uhVar;
        NotificationManager notificationManager;
        if (context == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/framework/core/CriticalErrorNotification", "showNotification", 47, "CriticalErrorNotification.java")).t("Cannot show notification without a context");
            return;
        }
        AtomicBoolean atomicBoolean = b;
        if (!atomicBoolean.get() && Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("com.google.android.apps.inputmethod.criticalerror", context.getString(R.string.f149840_resource_name_obfuscated_res_0x7f14014a), 4);
            if (atomicBoolean.compareAndSet(false, true) && (notificationManager = (NotificationManager) context.getSystemService("notification")) != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        if (atomicBoolean.get()) {
            uhVar = new uh(context, "com.google.android.apps.inputmethod.criticalerror");
        } else {
            uhVar = new uh(context);
        }
        uhVar.e(false);
        uhVar.i(R.drawable.f49030_resource_name_obfuscated_res_0x7f08028b);
        uhVar.f(str);
        uhVar.g(context.getString(R.string.f149830_resource_name_obfuscated_res_0x7f140149));
        if (str2 != null) {
            ug ugVar = new ug();
            ugVar.a(str2);
            uhVar.j(ugVar);
        }
        int i = um.a;
        um.b(null, 0, uhVar.a(), context, (NotificationManager) context.getSystemService("notification"));
    }
}
