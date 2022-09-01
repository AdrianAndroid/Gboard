package com.google.android.libraries.inputmethod.emoji.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CircleView extends View {
    public Paint a;
    protected float b;

    public CircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.b, this.a);
    }

    public CircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hdh.a, i, 0);
        this.b = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
