package com.google.android.apps.search.assistant.surfaces.voice.ui.speakables;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Wiggle extends View {
    private static final Duration c = Duration.ofMillis(0);
    private static final int d = -16711936;
    public int a;
    public final fja b;
    private final Paint e;
    private final Path f;
    private ValueAnimator g;
    private final float h;
    private final float i;
    private final int j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Wiggle(Context context) {
        this(context, null, 0, 6, null);
        oll.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Wiggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        oll.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wiggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        oll.e(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(this.a);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.e = paint;
        this.f = new Path();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, fiw.a, 0, 0);
        try {
            this.h = obtainStyledAttributes.getDimension(0, 50.0f);
            this.a = obtainStyledAttributes.getColor(2, d);
            this.i = obtainStyledAttributes.getDimension(3, 20.0f);
            this.j = obtainStyledAttributes.getDimensionPixelSize(4, 1);
            Duration ofMillis = Duration.ofMillis(obtainStyledAttributes.getInteger(1, (int) c.toMillis()));
            Map l = nxp.l(oix.b(fjb.IDLE, Float.valueOf(obtainStyledAttributes.getFloat(5, 2.0f))), oix.b(fjb.RECOGNITION, Float.valueOf(obtainStyledAttributes.getFloat(6, 4.0f))));
            float dimension = obtainStyledAttributes.getDimension(7, 5.0f);
            fjb fjbVar = fjb.IDLE;
            Float valueOf = Float.valueOf(dimension);
            Map l2 = nxp.l(oix.b(fjbVar, valueOf), oix.b(fjb.RECOGNITION, valueOf));
            oll.d(ofMillis, "animationDuration");
            this.b = new fja(ofMillis, l, l2, new klr(this, 1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final float d(float f, float f2) {
        float f3 = this.h;
        fja fjaVar = this.b;
        float f4 = f3 - fjaVar.g;
        return f4 + (((float) Math.sin((f * fjaVar.f) + (f2 / this.i))) * f4);
    }

    public final void a() {
        fja fjaVar = this.b;
        ValueAnimator valueAnimator = fjaVar.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = fjaVar.i;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.g;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }

    public final void b(float f) {
        int width = getWidth();
        float f2 = this.b.g;
        float f3 = width - (f2 + f2);
        this.f.reset();
        this.f.moveTo(0.0f, d(f, 0.0f));
        int i = this.j;
        int i2 = (int) f3;
        if (i > 0) {
            int c2 = oli.c(i, i2, i);
            if (i <= c2) {
                int i3 = i;
                while (true) {
                    float f4 = i3;
                    this.f.lineTo(f4, d(f, f4));
                    if (i3 == c2) {
                        break;
                    }
                    i3 += i;
                }
            }
            this.f.lineTo(f3, d(f, f3));
            Path path = this.f;
            float f5 = this.b.g;
            path.offset(f5, f5);
            invalidate();
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + i + ".");
    }

    public final void c() {
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.b.a.isZero() || this.b.e == fjb.HIDDEN) {
            b(0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 6.2831855f);
        ofFloat.setDuration(this.b.a.toMillis());
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new fix(this, ofFloat, 1));
        ofFloat.start();
        this.g = ofFloat;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        oll.e(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f;
        Paint paint = this.e;
        paint.setStrokeWidth(this.b.g);
        paint.setColor(this.a);
        canvas.drawPath(path, paint);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
    }

    public /* synthetic */ Wiggle(Context context, AttributeSet attributeSet, int i, int i2, oli oliVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
