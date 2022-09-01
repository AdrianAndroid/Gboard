package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CopyImageView extends View {
    public Bitmap a;
    public CopyImageSourceView b;
    public mko c;
    public final int d;
    public final Matrix e;
    public final Rect f;
    public final Drawable g;
    public Bitmap h;
    public final Paint i;
    private final Paint j;
    private final float k;

    public CopyImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a != null) {
            if (this.g == null) {
                this.j.setAlpha((int) (this.k * 255.0f));
                canvas.drawBitmap(this.a, 0.0f, 0.0f, this.j);
                return;
            }
            this.i.setAlpha((int) (this.k * 255.0f));
            canvas.drawBitmap(this.h, 0.0f, 0.0f, this.i);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.d != 0 && z && i3 > i && i4 > i2) {
            mko mkoVar = this.c;
            if (mkoVar != null && !mkoVar.isDone()) {
                return;
            }
            this.c = gyc.b.hQ(new jiz(this, 1));
        }
    }

    public CopyImageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CopyImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.j = new Paint();
        this.e = new Matrix();
        this.f = new Rect();
        this.i = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jdl.c);
        this.d = obtainStyledAttributes.getResourceId(0, 0);
        this.k = obtainStyledAttributes.getFloat(2, 1.0f);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        this.g = resourceId == 0 ? null : context.getDrawable(resourceId);
        obtainStyledAttributes.recycle();
    }
}
