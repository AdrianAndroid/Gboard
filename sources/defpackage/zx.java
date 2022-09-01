package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* renamed from: zx  reason: default package */
/* loaded from: classes2.dex */
final class zx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    static List b(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    static void d(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }
}
