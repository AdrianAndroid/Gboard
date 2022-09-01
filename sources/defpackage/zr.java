package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zr  reason: default package */
/* loaded from: classes2.dex */
public final class zr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(View view) {
        return view.getElevation();
    }

    static float b(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return view.getZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ColorStateList d(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PorterDuff.Mode e(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abc f(View view, abc abcVar, Rect rect) {
        WindowInsets e = abcVar.e();
        if (e != null) {
            return abc.n(view.computeSystemWindowInsets(e, rect), view);
        }
        rect.setEmpty();
        return abcVar;
    }

    public static abc g(View view) {
        aau aarVar;
        if (!aaq.d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = aaq.a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) aaq.b.get(obj);
            Rect rect2 = (Rect) aaq.c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                aarVar = new aat();
            } else if (Build.VERSION.SDK_INT >= 29) {
                aarVar = new aas();
            } else {
                aarVar = new aar();
            }
            aarVar.b(vq.c(rect));
            aarVar.c(vq.c(rect2));
            abc a = aarVar.a();
            a.q(a);
            a.o(view.getRootView());
            return a;
        } catch (IllegalAccessException e) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. ".concat(String.valueOf(e.getMessage())), e);
            return null;
        }
    }

    static String h(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.f129440_resource_name_obfuscated_res_0x7f0b2160);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(View view, float f) {
        view.setElevation(f);
    }

    static void m(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(View view, yy yyVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.f129360_resource_name_obfuscated_res_0x7f0b2157, yyVar);
        }
        if (yyVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.f129440_resource_name_obfuscated_res_0x7f0b2160));
        } else {
            view.setOnApplyWindowInsetsListener(new zq(view, yyVar));
        }
    }

    static void o(View view, String str) {
        view.setTransitionName(str);
    }

    static void p(View view, float f) {
        view.setTranslationZ(f);
    }

    static void q(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(View view) {
        view.stopNestedScroll();
    }

    static boolean s(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    static boolean t(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    static boolean u(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    static boolean v(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    static boolean w(View view) {
        return view.hasNestedScrollingParent();
    }

    static boolean x(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean y(View view) {
        return view.isNestedScrollingEnabled();
    }

    static boolean z(View view, int i) {
        return view.startNestedScroll(i);
    }
}
