package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ManagedFrameLayout extends FrameLayout {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/widgets/ManagedFrameLayout");

    public ManagedFrameLayout(Context context) {
        super(context);
    }

    public static boolean b(View view) {
        if (view.getId() != -1 && (view.getParent() instanceof ManagedFrameLayout)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return (layoutParams instanceof jdi) && ((jdi) layoutParams).a;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: a */
    public final jdi mo27generateLayoutParams(AttributeSet attributeSet) {
        return new jdi(getContext(), attributeSet);
    }

    public ManagedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ManagedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ManagedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
