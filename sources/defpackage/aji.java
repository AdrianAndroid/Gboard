package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* renamed from: aji  reason: default package */
/* loaded from: classes.dex */
public final class aji extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new afi();
    private static final int[] g = {-16777216};
    public final ajh a;
    public final Resources b;
    public float c;
    public boolean d;
    private float h;
    private final Animator i;

    public aji(Context context) {
        nq.g(context);
        this.b = context.getResources();
        ajh ajhVar = new ajh();
        this.a = ajhVar;
        ajhVar.c(g);
        b(2.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new cpi(this, ajhVar, 1));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new dyg(this, ajhVar, 1));
        this.i = ofFloat;
    }

    public static final void c(float f2, ajh ajhVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int a = ajhVar.a();
            int[] iArr = ajhVar.i;
            ajhVar.f();
            int i = iArr[0];
            int i2 = (a >> 24) & 255;
            int i3 = (a >> 16) & 255;
            int i4 = (a >> 8) & 255;
            int i5 = a & 255;
            ajhVar.q = ((i2 + ((int) ((((i >> 24) & 255) - i2) * f3))) << 24) | ((i3 + ((int) ((((i >> 16) & 255) - i3) * f3))) << 16) | ((i4 + ((int) ((((i >> 8) & 255) - i4) * f3))) << 8) | (i5 + ((int) (f3 * ((i & 255) - i5))));
            return;
        }
        ajhVar.q = ajhVar.a();
    }

    public final void a(float f2, ajh ajhVar, boolean z) {
        float interpolation;
        float f3;
        if (this.d) {
            c(f2, ajhVar);
            double floor = Math.floor(ajhVar.l / 0.8f);
            float f4 = ajhVar.j;
            float f5 = ajhVar.k;
            ajhVar.e = f4 + ((((-0.01f) + f5) - f4) * f2);
            ajhVar.f = f5;
            float f6 = ajhVar.l;
            ajhVar.g = f6 + ((((float) (floor + 1.0d)) - f6) * f2);
        } else if (f2 == 1.0f && !z) {
        } else {
            float f7 = ajhVar.l;
            if (f2 < 0.5f) {
                interpolation = ajhVar.j;
                f3 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f8 = ajhVar.j + 0.79f;
                interpolation = f8 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f8;
            }
            float f9 = this.c;
            ajhVar.e = interpolation;
            ajhVar.f = f3;
            ajhVar.g = f7 + (0.20999998f * f2);
            this.h = (f2 + f9) * 216.0f;
        }
    }

    public final void b(float f2) {
        this.a.d(f2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        ajh ajhVar = this.a;
        RectF rectF = ajhVar.a;
        float f2 = ajhVar.n;
        float f3 = (ajhVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            int min = Math.min(bounds.width(), bounds.height());
            int i = ajhVar.o;
            float f4 = ajhVar.m;
            f3 = (min / 2.0f) - Math.max(i / 2.0f, ajhVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f3, bounds.centerY() - f3, bounds.centerX() + f3, bounds.centerY() + f3);
        float f5 = ajhVar.e;
        float f6 = ajhVar.g;
        float f7 = (f5 + f6) * 360.0f;
        float f8 = ajhVar.f;
        ajhVar.b.setColor(ajhVar.q);
        ajhVar.b.setAlpha(ajhVar.p);
        float f9 = ajhVar.h / 2.0f;
        rectF.inset(f9, f9);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ajhVar.d);
        float f10 = -f9;
        rectF.inset(f10, f10);
        canvas.drawArc(rectF, f7, ((f8 + f6) * 360.0f) - f7, false, ajhVar.b);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.i.cancel();
        this.a.e();
        ajh ajhVar = this.a;
        if (ajhVar.f != ajhVar.e) {
            this.d = true;
            this.i.setDuration(666L);
            this.i.start();
            return;
        }
        ajhVar.g();
        this.a.b();
        this.i.setDuration(1332L);
        this.i.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.g();
        this.a.b();
        invalidateSelf();
    }
}
