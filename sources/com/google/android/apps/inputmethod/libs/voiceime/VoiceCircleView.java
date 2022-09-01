package com.google.android.apps.inputmethod.libs.voiceime;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VoiceCircleView extends View implements jcz {
    public static final Property a = Property.of(VoiceCircleView.class, Float.class, "outerRadius");
    public final float b;
    public final float c;
    boolean d;
    public int e;
    private float f;
    private final Paint g;
    private final RectF h;
    private final RectF i;
    private final Runnable j;
    private int k;
    private float l;
    private float m;
    private int n;
    private final int o;

    public VoiceCircleView(Context context) {
        this(context, null);
    }

    @Override // defpackage.jcz
    public final void a(int i) {
        this.k = i;
        invalidate();
    }

    public final void b() {
        float f;
        if (!aad.ag(this)) {
            this.n = -1;
        } else if (!jam.v(getContext().getApplicationContext())) {
            float f2 = this.b;
            ObjectAnimator.ofFloat(this, a, this.m, f2 + (((this.c - f2) * this.e) / 100.0f)).setDuration(200L).start();
            if (!this.d) {
                return;
            }
            postDelayed(this.j, 200L);
        } else {
            int i = this.n;
            if (i == -1) {
                i = this.e;
                this.n = i;
            }
            float f3 = this.b;
            float f4 = this.c - f3;
            float f5 = f4 / 10.0f;
            float f6 = f3 + ((f4 * i) / 100.0f);
            if (Math.abs(f6 - this.m) < f5) {
                this.n = this.e;
                f = this.m;
            } else {
                float f7 = this.m;
                f = f6 > f7 ? f7 + f5 : f7 - f5;
            }
            setOuterRadius(f);
            if (!this.d) {
                return;
            }
            postDelayed(this.j, 20L);
        }
    }

    public float getOuterRadius() {
        return this.m;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 1) {
            canvas.rotate(180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        float width = getWidth() - this.f;
        float height = getHeight() / 2.0f;
        this.g.setColor(this.k);
        this.g.setAlpha(102);
        float f = this.m;
        float f2 = this.b;
        if (f >= f2 && this.o != 2) {
            float f3 = (width - f) + f2;
            float f4 = (f + width) - f2;
            this.h.set(f3 - f2, height - f2, f3 + f2, f2 + height);
            canvas.drawArc(this.h, 90.0f, 180.0f, true, this.g);
            float f5 = this.b;
            canvas.drawRect(f3, height - f5, f4, height + f5, this.g);
            RectF rectF = this.i;
            float f6 = this.b;
            rectF.set(f4 - f6, height - f6, f4 + f6, f6 + height);
            canvas.drawArc(this.i, 270.0f, 180.0f, true, this.g);
        } else if (f > 0.0f) {
            canvas.drawCircle(width, height, f, this.g);
        }
        this.g.setColor(this.k);
        this.g.setAlpha(229);
        canvas.drawCircle(width, height, this.l, this.g);
        if (layoutDirection == 1) {
            canvas.rotate(-180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
    }

    public void setOuterRadius(float f) {
        this.m = f;
        invalidate();
    }

    public VoiceCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Paint();
        this.h = new RectF();
        this.i = new RectF();
        int i2 = 2;
        this.j = new fal(this, 2);
        this.d = true;
        this.n = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fag.a);
        a(obtainStyledAttributes.getColor(1, -16711936));
        int i3 = obtainStyledAttributes.getInt(2, 0);
        this.o = (i3 == 0 || i3 != 1) ? 1 : i2;
        if (!obtainStyledAttributes.hasValue(4)) {
            this.f = jbt.e(context, R.attr.f6750_resource_name_obfuscated_res_0x7f0401d8) / 2.0f;
        } else {
            this.f = obtainStyledAttributes.getDimension(4, 20.0f);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.b = obtainStyledAttributes.getDimension(0, 10.0f);
        } else {
            this.b = (float) Math.hypot(this.f, jbt.e(context, R.attr.f4910_resource_name_obfuscated_res_0x7f04011d) / 2.0f);
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = obtainStyledAttributes.getDimension(3, 20.0f);
        } else {
            this.c = (this.b * 7.0f) / 3.0f;
        }
        obtainStyledAttributes.recycle();
        this.l = this.b;
    }
}
