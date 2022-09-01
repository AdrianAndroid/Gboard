package defpackage;

import android.os.Build;
import android.transition.Transition;
import android.widget.PopupWindow;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: li  reason: default package */
/* loaded from: classes.dex */
public final class li {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }

    protected static boolean c(String str, String str2) {
        return !"REL".equals(str2) && str2.toUpperCase(Locale.ROOT).compareTo(str.toUpperCase(Locale.ROOT)) >= 0;
    }

    @Deprecated
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Deprecated
    public static boolean e() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.VERSION.SDK_INT >= 30 && c("S", Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT < 33) {
            return Build.VERSION.SDK_INT >= 32 && c("Tiramisu", Build.VERSION.CODENAME);
        }
        return true;
    }
}
