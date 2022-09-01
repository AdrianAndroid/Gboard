package defpackage;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jam  reason: default package */
/* loaded from: classes.dex */
public final class jam {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/utils/Environment");
    public static final boolean b;
    public static volatile boolean c;
    public static int d;
    public static int e;
    private static final boolean f;
    private static volatile float g;

    static {
        b = "robolectric".equals(Build.FINGERPRINT) || Build.FINGERPRINT == null;
        f = true;
        c = true;
        g = 0.0f;
    }

    @Deprecated
    public static boolean A(Context context) {
        return context.getResources().getBoolean(R.bool.f19580_resource_name_obfuscated_res_0x7f050024);
    }

    public static boolean B() {
        return ActivityManager.isUserAMonkey() || y();
    }

    public static boolean C(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 6;
    }

    public static boolean D(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                return userManager.isManagedProfile();
            }
            if (userManager.getUserProfiles().size() < 2) {
                return false;
            }
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (devicePolicyManager == null) {
            return false;
        }
        for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(0)) {
            if (devicePolicyManager.isProfileOwnerApp(packageInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(Context context) {
        return !z(context) && Build.VERSION.SDK_INT >= 29;
    }

    public static boolean F(Context context) {
        return context.getResources().getBoolean(R.bool.f20620_resource_name_obfuscated_res_0x7f050090);
    }

    public static Locale[] G() {
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            int size = localeList.size();
            Locale[] localeArr = new Locale[size];
            for (int i = 0; i < size; i++) {
                localeArr[i] = localeList.get(i);
            }
            return localeArr;
        }
        return new Locale[]{Locale.getDefault()};
    }

    public static boolean H(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.bitstrips.imoji", 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/utils/Environment", "isPackageInstalled", 237, "Environment.java")).w("%s is not installed", "com.bitstrips.imoji");
            return false;
        }
    }

    private static float I(Context context) {
        if (g == 0.0f) {
            g = Float.parseFloat(jbi.g(context.getResources(), R.array.f1220_resource_name_obfuscated_res_0x7f030014, "NaN"));
        }
        float f2 = g;
        if (Float.isNaN(f2) || f2 <= 0.0f) {
            return Float.NaN;
        }
        DisplayMetrics i = gvv.i(context);
        return (r(context) ? i.heightPixels : i.widthPixels) / f2;
    }

    private static boolean J(float f2) {
        return f2 != 96.0f;
    }

    public static float a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f2 = J(displayMetrics.xdpi) ? displayMetrics.xdpi : displayMetrics.densityDpi;
        float f3 = J(displayMetrics.ydpi) ? displayMetrics.ydpi : displayMetrics.densityDpi;
        double sqrt = Math.sqrt((displayMetrics.heightPixels * displayMetrics.heightPixels * f2 * f2) + (displayMetrics.widthPixels * displayMetrics.widthPixels * f3 * f3));
        double d2 = f2 * f3;
        Double.isNaN(d2);
        return (float) (sqrt / d2);
    }

    public static float b(Context context) {
        DisplayMetrics i = gvv.i(context);
        boolean r = r(context);
        int i2 = r ? i.widthPixels : i.heightPixels;
        float f2 = r ? i.xdpi : i.ydpi;
        return i2 / (J(f2) ? (int) f2 : i.densityDpi);
    }

    public static int c(Context context) {
        float I = I(context);
        if (!Float.isNaN(I)) {
            return (int) I;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f2 = r(context) ? displayMetrics.ydpi : displayMetrics.xdpi;
        return J(f2) ? (int) f2 : gvv.c(context);
    }

    public static int d(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return r(context) ? displayMetrics.heightPixels : displayMetrics.widthPixels;
    }

    public static int e(Context context) {
        return f(context, context.getPackageName());
    }

    public static int f(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception unused) {
            return 1;
        }
    }

    public static int g(Context context) {
        float I = I(context);
        if (!Float.isNaN(I)) {
            return (int) I;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f2 = r(context) ? displayMetrics.xdpi : displayMetrics.ydpi;
        return J(f2) ? (int) f2 : gvv.c(context);
    }

    public static long h(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
            long j = packageInfo.firstInstallTime;
            return packageInfo.firstInstallTime;
        } catch (PackageManager.NameNotFoundException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Environment", "getFirstInstallTime", (char) 674, "Environment.java")).t("getFirstInstallTime(): Could not get first install time");
            return -1L;
        }
    }

    public static long i(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
            long j = packageInfo.lastUpdateTime;
            return packageInfo.lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Environment", "getLastUpgradeTime", (char) 692, "Environment.java")).t("getLastUpgradeTime(): Could not get last update time");
            return -1L;
        }
    }

    public static String j() {
        return String.format(Locale.US, "%d_%d", Integer.valueOf(Build.VERSION.SDK_INT), Long.valueOf(Build.TIME));
    }

    public static String k(Context context) {
        return String.format(Locale.US, "%s_%d", l(context), Integer.valueOf(e(context)));
    }

    public static String l(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void m(Context context) {
        boolean z = true;
        if (Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 1) == 0) {
            z = false;
        }
        c = z;
    }

    public static boolean n(Context context) {
        Object systemService = context.getSystemService("vibrator");
        return (systemService instanceof Vibrator) && ((Vibrator) systemService).hasVibrator();
    }

    public static boolean o() {
        if (f) {
            return Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled();
        }
        return false;
    }

    public static boolean p(Context context) {
        return Build.VERSION.SDK_INT >= 25 && ((UserManager) context.getSystemService(UserManager.class)).isDemoUser();
    }

    public static boolean q(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/utils/Environment", "isInteractive", 554, "Environment.java")).t("PowerManager is not found");
            return true;
        }
        return powerManager.isInteractive();
    }

    public static boolean r(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean s(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/utils/Environment", "isLowRamDevice", 574, "Environment.java")).t("ActivityManager is not found");
            return false;
        }
        return activityManager.isLowRamDevice();
    }

    public static boolean t(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean u() {
        if (!jdg.Z(Build.MANUFACTURER, "google") || !Build.MODEL.contains("Pixel")) {
            if (!jdg.Z(Build.MANUFACTURER, "google")) {
                return false;
            }
            String concat = "aOupWzd67OVi4UwHm5tHcOc18igY0jVk|".concat(String.valueOf(Build.DEVICE.toLowerCase(Locale.US)));
            lxu c2 = lxy.c();
            int length = concat.length();
            lxv a2 = ((lxm) c2).a(length + length);
            a2.e(concat);
            long c3 = a2.k().c();
            return c3 == -7518367280166809616L || c3 == -1211852355553296524L;
        }
        return true;
    }

    public static boolean v(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (NoSuchMethodError | NullPointerException e2) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/libraries/inputmethod/utils/Environment", "isPowerSaveMode", (char) 653, "Environment.java")).t("Cannot determine power save mode status.");
            return false;
        }
    }

    public static boolean w() {
        return jal.a.booleanValue();
    }

    public static boolean x() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static boolean y() {
        try {
            Class.forName("com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean z(Context context) {
        return (context.getApplicationInfo().flags & 129) != 0;
    }
}
