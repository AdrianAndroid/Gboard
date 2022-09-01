package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* compiled from: PG */
/* renamed from: yc  reason: default package */
/* loaded from: classes2.dex */
public final class yc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
        return accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return (Build.VERSION.CODENAME.equals("REL") && Build.VERSION.SDK_INT >= 31) || (Build.VERSION.CODENAME.length() > 0 && Build.VERSION.CODENAME.toUpperCase().charAt(0) >= 'S' && Build.VERSION.CODENAME.toUpperCase().charAt(0) <= 'Z');
    }
}
