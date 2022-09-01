package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* renamed from: byo  reason: default package */
/* loaded from: classes.dex */
public final class byo {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/crash/AgsaUtil");

    public static String a(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/crash/AgsaUtil", "getPackageInfo", 39, "AgsaUtil.java")).w("Package %s not found.", "com.google.android.googlequicksearchbox");
            packageInfo = null;
        }
        if (packageInfo == null) {
            return "";
        }
        String str = packageInfo.versionName;
        int i = packageInfo.versionCode;
        return (str + " " + i).trim();
    }
}
