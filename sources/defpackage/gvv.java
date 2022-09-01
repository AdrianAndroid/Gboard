package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;

/* compiled from: PG */
/* renamed from: gvv  reason: default package */
/* loaded from: classes.dex */
public final class gvv {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/base/DisplayUtil");

    public static float a(Context context, int i) {
        return TypedValue.applyDimension(1, i, i(context));
    }

    public static int b(Context context) {
        return h(m(context.getApplicationContext(), true)).widthPixels;
    }

    public static int c(Context context) {
        return g(context).densityDpi;
    }

    public static int d(Context context) {
        return g(context).heightPixels;
    }

    public static int e(Context context) {
        return i(context).heightPixels;
    }

    public static int f(Context context) {
        return g(context).widthPixels;
    }

    public static DisplayMetrics g(Context context) {
        return h(m(context, false));
    }

    public static DisplayMetrics h(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static DisplayMetrics i(Context context) {
        return j(context, false);
    }

    public static DisplayMetrics j(Context context, boolean z) {
        Display m = m(context, z);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        m.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static Display k(Context context) {
        return ((DisplayManager) context.getSystemService("display")).getDisplay(0);
    }

    public static Display l(Context context) {
        Display display;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                display = context.getDisplay();
            } catch (UnsupportedOperationException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/base/DisplayUtil", "getDisplayFromUiContext", 212, "DisplayUtil.java")).w("failed to get display from Context: %s", gwc.g(context));
                display = null;
            }
            if (display != null) {
                return display;
            }
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/base/DisplayUtil", "getDisplayFromUiContext", 218, "DisplayUtil.java")).w("Context %s is not associated with display", gwc.g(context));
        }
        return k(context);
    }

    private static Display m(Context context, boolean z) {
        Display display;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                display = context.getDisplay();
            } catch (UnsupportedOperationException e) {
                if (!z) {
                    ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/base/DisplayUtil", "getDisplay", 161, "DisplayUtil.java")).w("failed to get display from Context: %s", gwc.g(context));
                }
                display = null;
            }
            if (display != null) {
                return display;
            }
            if (!z) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/base/DisplayUtil", "getDisplay", 169, "DisplayUtil.java")).w("Context %s is not associated with display", gwc.g(context));
            }
        }
        return k(context);
    }
}
