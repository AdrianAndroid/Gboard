package com.google.android.libraries.inputmethod.emoji.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiView extends View {
    public hee a;
    public String[] b;
    public hei c;
    public Drawable d;
    public Typeface e;
    private final axp f;
    private final heh g;
    private final float h;
    private final float i;
    private hef j;
    private Paint k;
    private heg l;

    public EmojiView(Context context) {
        this(context, null);
    }

    private final Paint f() {
        if (this.k == null) {
            this.k = new Paint(3);
        }
        return this.k;
    }

    private final void g() {
        b();
        hee heeVar = this.a;
        heh hehVar = this.g;
        mko O = kcu.O(new cak(hehVar, f(), this.a, 12), hehVar.d);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new ehz(this, 11));
        this.j = hef.a(heeVar, O, hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
    }

    public final String a() {
        return this.a.b;
    }

    public final void b() {
        this.j.close();
        this.j = hef.a;
    }

    public final void c(heg hegVar) {
        heg hegVar2 = this.l;
        if (hegVar2 != null) {
            this.f.d(hegVar2.b);
        }
        this.l = hegVar;
        invalidate();
    }

    public final void d(hei heiVar) {
        this.c = heiVar;
        String obj = heiVar.b.toString();
        if (!TextUtils.equals(this.a.b, obj)) {
            this.a = this.a.b(obj);
            b();
            c(null);
            if (!TextUtils.isEmpty(obj)) {
                g();
            }
        }
        gqa.q(this, heiVar.b);
    }

    public final void e(hej hejVar) {
        setOnTouchListener(hejVar);
        setOnHoverListener(hejVar);
        setOnClickListener(hejVar);
        setOnLongClickListener(hejVar);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f;
        heg hegVar = this.l;
        if (hegVar == null) {
            return;
        }
        if (this.j.b() && !this.j.b.b.equals(hegVar.a.b)) {
            return;
        }
        Bitmap bitmap = hegVar.b;
        Paint f2 = f();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f3 = width;
        if (f3 < width2) {
            if (height < height2) {
                canvas.drawBitmap(bitmap, Math.round((width2 - f3) / 2.0f) + getPaddingLeft(), Math.round((height2 - f) / 2.0f) + getPaddingTop(), f2);
                return;
            }
        }
        float max = Math.max(this.h / this.i, Math.min(width2 / f3, height2 / height));
        canvas.save();
        canvas.translate((width2 / 2.0f) + getPaddingLeft(), (height2 / 2.0f) + getPaddingTop());
        canvas.scale(max, max);
        canvas.translate((-width) / 2.0f, (-height) / 2.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, f2);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean z = true;
        accessibilityNodeInfo.setEnabled(true);
        String[] strArr = this.b;
        if (strArr == null || strArr.length == 0) {
            z = false;
        }
        setLongClickable(z);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a.b.isEmpty()) {
            return;
        }
        if (!this.j.b() || this.j.b.equals(this.a)) {
            heg hegVar = this.l;
            if (hegVar == null || hegVar.a.equals(this.a)) {
                if (this.l != null || this.j.b()) {
                    return;
                }
                g();
                return;
            }
            g();
            return;
        }
        g();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        hee heeVar = this.a;
        int max = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        int max2 = Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        if (max != heeVar.c || max2 != heeVar.d) {
            heeVar = hee.a(heeVar.b, max, max2);
        }
        this.a = heeVar;
    }

    public EmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = hee.a;
        this.j = hef.a;
        this.l = null;
        this.c = hei.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hem.a);
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.h = dimensionPixelSize;
        float a = gwc.a(context, 30.0f);
        int i = (int) (a + (a >= 0.0f ? 0.5f : -0.5f));
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, i == 0 ? (int) Math.signum(30.0f) : i);
        this.i = dimensionPixelSize2;
        obtainStyledAttributes.recycle();
        f().setTextSize(dimensionPixelSize2);
        hjq.c(context);
        axp axpVar = atb.b(context).a;
        this.f = axpVar;
        this.g = new heh(axpVar, dimensionPixelSize);
    }
}
