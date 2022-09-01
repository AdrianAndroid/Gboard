package defpackage;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* renamed from: tw  reason: default package */
/* loaded from: classes2.dex */
public final class tw {
    static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void d(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            aap.a(window, z);
        } else {
            aao.a(window, z);
        }
    }

    public static aqq e(Window window, View view) {
        return new aqq(window);
    }
}
