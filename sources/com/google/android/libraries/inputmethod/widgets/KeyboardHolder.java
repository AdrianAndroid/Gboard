package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KeyboardHolder extends LinearLayout {
    public static final hhl a = hhq.a("exclude_system_gesture_on_keyboard", false);
    public float b = 1.0f;
    private final Rect c = new Rect();
    private final List d = new ArrayList();

    public KeyboardHolder(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 29 || !((Boolean) a.c()).booleanValue()) {
            return;
        }
        this.c.left = 0;
        this.c.right = getWidth();
        this.c.top = 0;
        this.c.bottom = getHeight();
        this.d.clear();
        this.d.add(this.c);
        setSystemGestureExclusionRects(this.d);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b != 1.0f) {
            setMeasuredDimension((int) (getMeasuredWidth() * this.b), getMeasuredHeight());
        }
    }

    public KeyboardHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
