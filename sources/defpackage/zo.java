package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: zo  reason: default package */
/* loaded from: classes2.dex */
final class zo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(View view) {
        return view.isLaidOut();
    }

    static boolean g(View view) {
        return view.isLayoutDirectionResolved();
    }
}
