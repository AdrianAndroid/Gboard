package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SliderPagingIndicatorView extends View implements jcz {
    private int a;
    private Drawable b;
    private int c;
    private int d;
    private int e = 0;
    private float f;

    public SliderPagingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "page_indicator_image", 0);
        if (attributeResourceValue != 0) {
            this.b = context.getResources().getDrawable(jbt.j(context, attributeResourceValue));
        }
    }

    private final void d() {
        Drawable drawable;
        int i;
        int i2 = this.c;
        if (i2 == 0 || (drawable = this.b) == null || (i = this.a) == 0) {
            return;
        }
        int i3 = i2 / i;
        if (i > 1) {
            float f = i3;
            int i4 = this.e;
            float f2 = this.f;
            drawable.setBounds((int) ((i4 + f2) * f), 0, (int) (f * (i4 + 1 + f2)), this.d);
            return;
        }
        drawable.setBounds(0, 0, 0, this.d);
    }

    @Override // defpackage.jcz
    public final void a(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void b(int i) {
        this.a = i;
        this.e = 0;
        this.f = 0.0f;
        d();
        invalidate();
    }

    public final void c(int i, float f) {
        if (i < 0 || i >= this.a) {
            return;
        }
        this.e = i;
        this.f = f;
        d();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.c != i) {
            this.c = i;
            this.d = i2;
            d();
        }
    }
}
