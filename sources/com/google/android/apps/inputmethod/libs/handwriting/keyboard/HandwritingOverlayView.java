package com.google.android.apps.inputmethod.libs.handwriting.keyboard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HandwritingOverlayView extends RelativeLayout implements jcz {
    public ImageView a;
    public Canvas b;
    public Bitmap c;
    public float d;
    public float e;
    public int f;
    public float g;
    public int h;
    public dgf i;
    public final dgj j;
    public opu k;
    private final Paint l;
    private final Rect m;

    public HandwritingOverlayView(Context context) {
        this(context, null, 0);
    }

    private final Rect j(RectF rectF) {
        this.m.set((int) rectF.left, (int) rectF.top, (int) (rectF.right + 1.0f), (int) (rectF.bottom + 1.0f));
        return this.m;
    }

    @Override // defpackage.jcz
    public final void a(int i) {
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (i >> 16) & 255, 0.0f, 0.0f, 0.0f, 0.0f, (i >> 8) & 255, 0.0f, 0.0f, 0.0f, 0.0f, i & 255, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        this.l.setColorFilter(colorMatrixColorFilter);
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setColorFilter(colorMatrixColorFilter);
        }
    }

    public final void b() {
        g(null);
    }

    public final void c() {
        int max = Math.max(getHeight(), 1);
        int max2 = Math.max(getWidth(), 1);
        Bitmap bitmap = this.c;
        if (bitmap != null || max2 <= 0 || max <= 0) {
            if (bitmap.getWidth() >= max2 && this.c.getHeight() >= max) {
                return;
            }
            Bitmap bitmap2 = this.c;
            this.c = Bitmap.createBitmap(max2, max, Bitmap.Config.ALPHA_8);
            Canvas canvas = new Canvas(this.c);
            this.b = canvas;
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.l);
            return;
        }
        this.c = Bitmap.createBitmap(max2, max, Bitmap.Config.ALPHA_8);
        this.b = new Canvas(this.c);
    }

    public final void d(gpo gpoVar) {
        float a;
        if (this.b == null) {
            c();
        }
        dgj dgjVar = this.j;
        Canvas canvas = this.b;
        RectF rectF = dgjVar.b;
        dgjVar.h = 0.0f;
        dgjVar.f = gpoVar;
        dgjVar.e = gpoVar;
        dgjVar.i.c = -1.0f;
        Float f = (Float) dgjVar.d.get(gpoVar);
        if (f != null) {
            a = f.floatValue();
        } else {
            a = dgjVar.i.a(gpoVar);
            dgjVar.d.put(gpoVar, Float.valueOf(a));
        }
        float f2 = a * dgjVar.g;
        float f3 = gpoVar.a;
        float f4 = gpoVar.b;
        rectF.set(f3, f4, f3, f4);
        float f5 = (-f2) / 2.0f;
        rectF.inset(f5, f5);
        canvas.save();
        canvas.clipRect(rectF);
        dgjVar.a.setStyle(Paint.Style.FILL);
        canvas.drawCircle(gpoVar.a, gpoVar.b, f2 / 2.0f, dgjVar.a);
        canvas.restore();
        invalidate(j(rectF));
    }

    public final void e(gpo gpoVar) {
        float a;
        RectF rectF;
        if (this.b == null) {
            c();
        }
        dgj dgjVar = this.j;
        Canvas canvas = this.b;
        dgjVar.i.a(gpoVar);
        Float f = (Float) dgjVar.d.get(gpoVar);
        if (f != null) {
            a = f.floatValue();
        } else {
            a = dgjVar.i.a(gpoVar);
            dgjVar.d.put(gpoVar, Float.valueOf(a));
        }
        float a2 = dgj.a(dgjVar.e, gpoVar);
        dgjVar.h += a2;
        if (a2 >= 5.0f || ((float) (gpoVar.c - dgjVar.e.c)) >= 20.0f) {
            float f2 = a * dgjVar.g;
            gpo gpoVar2 = dgjVar.e;
            float f3 = gpoVar2.a;
            gpo gpoVar3 = dgjVar.f;
            float f4 = (gpoVar3.a + f3) / 2.0f;
            float f5 = gpoVar2.b;
            float f6 = (gpoVar3.b + f5) / 2.0f;
            float f7 = (gpoVar.a + f3) / 2.0f;
            float f8 = (gpoVar.b + f5) / 2.0f;
            RectF rectF2 = dgjVar.b;
            rectF2.set(Math.min(Math.min(f4, f7), dgjVar.e.a), Math.min(Math.min(f6, f8), dgjVar.e.b), Math.max(Math.max(f4, f7), dgjVar.e.a), Math.max(Math.max(f6, f8), dgjVar.e.b));
            float f9 = (-f2) / 2.0f;
            rectF2.inset(f9, f9);
            dgjVar.a.setStrokeWidth(f2);
            canvas.save();
            canvas.clipRect(rectF2);
            dgjVar.c.reset();
            dgjVar.c.moveTo(f4, f6);
            Path path = dgjVar.c;
            gpo gpoVar4 = dgjVar.e;
            path.quadTo(gpoVar4.a, gpoVar4.b, f7, f8);
            dgjVar.a.setStyle(Paint.Style.STROKE);
            canvas.drawPath(dgjVar.c, dgjVar.a);
            dgjVar.f = dgjVar.e;
            dgjVar.e = gpoVar;
            canvas.restore();
            rectF = rectF2;
        } else {
            rectF = null;
        }
        if (rectF != null) {
            invalidate(j(rectF));
        }
    }

    public final void f(gpo gpoVar) {
        float a;
        if (this.b == null) {
            c();
        }
        dgj dgjVar = this.j;
        Canvas canvas = this.b;
        RectF rectF = dgjVar.b;
        Float f = (Float) dgjVar.d.get(gpoVar);
        if (f != null) {
            a = f.floatValue();
        } else {
            a = dgjVar.i.a(gpoVar);
            dgjVar.d.put(gpoVar, Float.valueOf(a));
        }
        float f2 = a * dgjVar.g;
        float a2 = dgjVar.h + dgj.a(gpoVar, dgjVar.e);
        dgjVar.h = a2;
        dgi dgiVar = dgjVar.i;
        float f3 = (dgiVar.a + dgiVar.b) / 2.0f;
        if (a2 > f3) {
            gpo gpoVar2 = dgjVar.e;
            float f4 = gpoVar2.a;
            gpo gpoVar3 = dgjVar.f;
            float f5 = (f4 + gpoVar3.a) / 2.0f;
            float f6 = (gpoVar2.b + gpoVar3.b) / 2.0f;
            float f7 = gpoVar.a;
            float f8 = gpoVar.b;
            rectF.set(Math.min(f5, f7), Math.min(f6, f8), Math.max(f5, f7), Math.max(f6, f8));
            float f9 = (-f2) / 2.0f;
            rectF.inset(f9, f9);
            dgjVar.a.setStrokeWidth(f2);
            dgjVar.a.setStyle(Paint.Style.STROKE);
            canvas.drawLine(f5, f6, f7, f8, dgjVar.a);
        } else {
            float f10 = f3 * dgjVar.g;
            float f11 = gpoVar.a;
            float f12 = gpoVar.b;
            rectF.set(f11, f12, f11, f12);
            float f13 = (-f10) / 2.0f;
            rectF.inset(f13, f13);
            canvas.save();
            canvas.clipRect(rectF);
            dgjVar.a.setStyle(Paint.Style.FILL);
            canvas.drawCircle(gpoVar.a, gpoVar.b, f10 / 2.0f, dgjVar.a);
            canvas.restore();
        }
        invalidate(j(rectF));
    }

    public final void g(Bitmap bitmap) {
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void h(float f) {
        this.j.i.b = f;
    }

    public final void i(float f) {
        this.j.i.a = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = null;
        this.b = null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.l);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        opu opuVar;
        super.onLayout(z, i, i2, i3, i4);
        if (!z || (opuVar = this.k) == null) {
            return;
        }
        ((HandwritingMotionEventHandler) opuVar.a).f.setEmpty();
        HandwritingMotionEventHandler handwritingMotionEventHandler = (HandwritingMotionEventHandler) opuVar.a;
        ((gpq) handwritingMotionEventHandler.i.e).a(handwritingMotionEventHandler.c.getWidth(), ((HandwritingMotionEventHandler) opuVar.a).c.getHeight());
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
    }

    public HandwritingOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HandwritingOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.LayoutParams layoutParams;
        this.a = null;
        this.d = 10.0f;
        this.e = 5.0f;
        this.f = 0;
        this.g = 0.1f;
        this.h = 400;
        this.i = dgf.FADE_OUT;
        this.m = new Rect();
        this.j = new dgj(context);
        this.d = jgd.w(context, attributeSet, "max_stroke_width", this.d);
        this.e = jgd.w(context, attributeSet, "min_stroke_width", this.e);
        this.f = jgd.d(context, attributeSet, null, "animation_time", 0);
        h(this.d);
        i(this.e);
        int v = jgd.v(context, attributeSet, "stroke_color", -1);
        this.i = (dgf) jgd.x(context, attributeSet, dgf.class, dgf.FADE_OUT);
        this.h = jgd.d(context, attributeSet, null, "animation_delay_ms", 400);
        this.g = jgd.b(context, attributeSet, null, "scrollout_remainder_fraction", 0.1f);
        this.l = new Paint();
        dgf dgfVar = this.i;
        if (dgfVar == dgf.FADE_OUT) {
            this.a = null;
        } else {
            if (dgfVar == dgf.ZOOM_OUT) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            }
            ImageView imageView = new ImageView(context);
            this.a = imageView;
            addView(imageView, layoutParams);
        }
        a(v);
        setWillNotDraw(false);
    }
}
