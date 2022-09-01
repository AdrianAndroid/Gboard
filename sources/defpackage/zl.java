package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* compiled from: PG */
/* renamed from: zl  reason: default package */
/* loaded from: classes2.dex */
final class zl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(View view) {
        return view.getWindowSystemUiVisibility();
    }

    static ViewParent e(View view) {
        return view.getParentForAccessibility();
    }

    static AccessibilityNodeProvider f(View view) {
        return view.getAccessibilityNodeProvider();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view) {
        view.postInvalidateOnAnimation();
    }

    static void h(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    static void l(View view) {
        view.requestFitSystemWindows();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    static void n(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(View view) {
        return view.getFitsSystemWindows();
    }

    static boolean q(View view) {
        return view.hasOverlappingRendering();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(View view) {
        return view.hasTransientState();
    }

    static boolean s(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }
}
