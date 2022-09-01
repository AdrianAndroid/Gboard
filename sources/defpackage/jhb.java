package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* renamed from: jhb  reason: default package */
/* loaded from: classes.dex */
public final class jhb extends Drawable implements jgy {
    private static final LinearInterpolator c = new LinearInterpolator();
    private final ValueAnimator d;
    private final ValueAnimator e;
    private float f;
    private final int i;
    private final Paint j;
    private final int k;
    private final int l;
    private final jgq n;
    private final jgt o;
    private final RectF g = new RectF();
    private final Rect h = new Rect();
    private int p = 255;
    private final float m = -1.0f;
    public boolean a = false;
    public float b = getLevel() / 10000;

    public jhb(int i, int i2, int i3) {
        this.k = i;
        this.l = i2;
        this.i = i3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", 0.0f, 1.0f);
        ofFloat.setDuration(750L);
        LinearInterpolator linearInterpolator = c;
        ofFloat.setInterpolator(linearInterpolator);
        this.d = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, 0.0f);
        ofFloat2.addListener(new jha(this));
        ofFloat2.setDuration(750L);
        ofFloat2.setInterpolator(linearInterpolator);
        this.e = ofFloat2;
        Paint paint = new Paint();
        this.j = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        jgq jgqVar = new jgq();
        this.n = jgqVar;
        double level = getLevel();
        Double.isNaN(level);
        jgqVar.d(level / 10000.0d);
        jgqVar.c(this.b);
        jgqVar.b();
        jgqVar.f(new jgz(this));
        this.o = new jgt(jgqVar);
        setVisible(false, false);
    }

    @Override // defpackage.jgy
    public final void a() {
        this.a = false;
        if (super.setVisible(false, false)) {
            b();
        }
    }

    public final void b() {
        jgq jgqVar = this.n;
        double level = getLevel();
        Double.isNaN(level);
        jgqVar.d(level / 10000.0d);
        this.o.c();
    }

    public final void c() {
        b();
        if (this.d.isStarted()) {
            this.d.cancel();
        }
        if (this.e.isStarted()) {
            this.e.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect;
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        if (this.m != -1.0f) {
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            this.h.left = centerX - (getIntrinsicWidth() / 2);
            this.h.right = centerX + (getIntrinsicWidth() / 2);
            this.h.top = centerY - (getIntrinsicHeight() / 2);
            this.h.bottom = centerY + (getIntrinsicHeight() / 2);
            rect = this.h;
        } else {
            rect = getBounds();
        }
        int i = this.k;
        float f = this.f;
        float f2 = i * f;
        int i2 = (int) (this.p * f);
        float f3 = (this.l + i) - (f2 / 2.0f);
        this.j.setStrokeWidth(f2);
        this.g.set(rect);
        this.g.inset(f3, f3);
        float width = this.g.width();
        float f4 = this.b;
        this.j.setColor(this.i);
        this.j.setAlpha((int) (i2 * 0.2f));
        canvas.drawOval(this.g, this.j);
        this.j.setAlpha(i2);
        double d = (width / 2.0f) - f2;
        Double.isNaN(d);
        double d2 = f2 * 180.0f;
        Double.isNaN(d2);
        float max = Math.max(f4 * 360.0f, (float) ((d * 3.141592653589793d) / d2));
        if (max < 5.0f) {
            return;
        }
        canvas.drawArc(this.g, -90.0f, max, false, this.j);
    }

    public float getAlphaFraction() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.m;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.m;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        jgq jgqVar = this.n;
        double d = i;
        Double.isNaN(d);
        jgqVar.c(d / 10000.0d);
        this.o.b();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.p) {
            this.p = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.f = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.a;
        if (z3 || z2) {
            this.a = z;
            if (z) {
                super.setVisible(true, z2);
                if (this.e.isRunning()) {
                    this.d.setCurrentPlayTime(750 - this.e.getCurrentPlayTime());
                    this.e.cancel();
                }
                if (z2) {
                    c();
                    this.d.start();
                } else {
                    this.d.start();
                }
            } else if (z3) {
                if (this.d.isRunning()) {
                    this.e.setCurrentPlayTime(750 - this.d.getCurrentPlayTime());
                    this.d.cancel();
                }
                this.e.start();
            } else {
                c();
            }
            return z3;
        }
        return false;
    }
}
