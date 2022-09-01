package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import android.util.Log;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: je  reason: default package */
/* loaded from: classes.dex */
public final class je {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    public static Intent c(Activity activity) {
        Intent a = ue.a(activity);
        if (a == null) {
            String e = e(activity);
            if (e == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, e);
            try {
                if (f(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + e + "' in manifest");
                return null;
            }
        }
        return a;
    }

    public static Intent d(Context context, ComponentName componentName) {
        String f = f(context, componentName);
        if (f == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), f);
        if (f(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String e(Activity activity) {
        try {
            return f(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String f(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = Build.VERSION.SDK_INT >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str == null) {
            if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
                return null;
            }
            return string.charAt(0) == '.' ? String.valueOf(context.getPackageName()).concat(string) : string;
        }
        return str;
    }
}
