package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* renamed from: dmw  reason: default package */
/* loaded from: classes.dex */
final class dmw extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
    }
}
