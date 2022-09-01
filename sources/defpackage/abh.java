package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: abh  reason: default package */
/* loaded from: classes.dex */
public final class abh {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
