package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Printer;
import android.util.TypedValue;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: gwc  reason: default package */
/* loaded from: classes.dex */
public final class gwc {
    public static float a(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static ContextWrapper b(Context context, Class cls) {
        while (context instanceof ContextWrapper) {
            if (!cls.isInstance(context)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (ContextWrapper) context;
            }
        }
        return null;
    }

    public static Resources c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(context.getPackageName())) {
            return context.getResources();
        }
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            resourcesForApplication.updateConfiguration(context.getResources().getConfiguration(), context.getResources().getDisplayMetrics());
            return resourcesForApplication;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Drawable d(Context context, String str) {
        if (c(context, str) == null) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo != null && applicationInfo.icon != 0) {
                return applicationInfo.loadIcon(packageManager);
            }
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
        }
        return null;
    }

    public static Bundle e(Context context, Bundle bundle) {
        Bundle bundle2 = ActivityOptions.makeBasic().setLaunchDisplayId(gvv.l(context).getDisplayId()).toBundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    public static String f(Context context, String str) {
        Resources c = c(context, str);
        if (c == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null && applicationInfo.labelRes != 0) {
                return c.getString(applicationInfo.labelRes);
            }
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
        }
        return null;
    }

    public static String g(Context context) {
        StringBuilder sb = new StringBuilder(context.toString());
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            sb.append('>');
            sb.append(context);
        }
        return sb.toString();
    }

    public static Locale h(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getResources().getConfiguration().getLocales().get(0) : context.getResources().getConfiguration().locale;
    }

    public static boolean i(Context context) {
        return b(context, Activity.class) != null;
    }

    public static boolean j(Intent intent) {
        Parcel obtain = Parcel.obtain();
        intent.writeToParcel(obtain, 0);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        return dataSize > 500000;
    }

    public static boolean k(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final gva m() {
        gva gvaVar = (gva) ijl.b().a(gva.class);
        if (gvaVar == null) {
            ((ltd) gva.a.c()).j(ltp.e("com/google/android/libraries/inputmethod/appstart/AppStartedNotification$Companion", "get", 55, "AppStartedNotification.kt")).w("%s", "App started info has not been notified yet.");
        }
        return gvaVar;
    }

    public static final void n(Printer printer, String str, long j, SimpleDateFormat simpleDateFormat) {
        String format = simpleDateFormat.format(Long.valueOf(j));
        printer.println(str + j + " | " + format);
    }

    public static final SharedPreferences o(Context context) {
        oll.e(context, "applicationContext");
        Context m = jbt.m(context);
        String concat = String.valueOf(context.getPackageName()).concat("_ueh");
        if (!jbe.c(context)) {
            String b = jbe.b(context);
            if (true == TextUtils.isEmpty(b)) {
                b = "unknown";
            }
            concat = concat + "_" + b;
        }
        SharedPreferences sharedPreferences = m.getSharedPreferences(concat, 0);
        oll.d(sharedPreferences, "deviceProtectedContext.g…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
