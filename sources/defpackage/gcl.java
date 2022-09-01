package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: gcl  reason: default package */
/* loaded from: classes.dex */
public final class gcl extends uv {
    @Deprecated
    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (guw.h()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != guw.h() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void h(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new od(activity, 5));
        }
    }

    public static void i(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 < length) {
                if (TextUtils.isEmpty(strArr[i2])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (!li.f() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
                i2++;
            } else {
                int size = hashSet.size();
                String[] strArr2 = size > 0 ? new String[length - size] : strArr;
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                }
                if (activity instanceof tz) {
                    tz tzVar = (tz) activity;
                }
                tw.b(activity, strArr, i);
                return;
            }
        }
    }
}
