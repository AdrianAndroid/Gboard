package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: jhh  reason: default package */
/* loaded from: classes.dex */
public final class jhh extends Drawable implements jgy {
    public double b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final Paint h;
    private final jgq i;
    private final jgt j;
    private final ObjectAnimator k;
    private final ObjectAnimator l;
    private final float n;
    private final jez q;
    private float o = 1.0f;
    public boolean a = isVisible();
    private float p = 0.0f;
    private final float m = 1.0f;

    public jhh(int i, int i2, int i3, float f, int i4) {
        jhg jhgVar = new jhg(this);
        this.q = jhgVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.c = Math.round(f * 255.0f);
        this.g = i4;
        Paint paint = new Paint();
        this.h = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        float f2 = 1.0f;
        double level = getLevel();
        Double.isNaN(level);
        this.b = level / 10000.0d;
        this.n = i4 != 2 ? 0.0f : f2;
        jgq jgqVar = new jgq();
        this.i = jgqVar;
        double level2 = getLevel();
        Double.isNaN(level2);
        jgqVar.d(level2 / 10000.0d);
        jgqVar.c(this.b);
        jgqVar.b();
        jgqVar.f(jhgVar);
        this.j = new jgt(jgqVar);
        this.k = jdg.b(this);
        ObjectAnimator c = jdg.c(this);
        c.addListener(new jhf(this));
        this.l = c;
    }

    @Override // defpackage.jgy
    public final void a() {
        this.a = false;
        if (super.setVisible(false, false)) {
            this.k.cancel();
            this.l.cancel();
            b();
        }
    }

    public final void b() {
        jgq jgqVar = this.i;
        double level = getLevel();
        Double.isNaN(level);
        jgqVar.d(level / 10000.0d);
        this.j.c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        canvas.save();
        float height = getBounds().height();
        float f = this.d;
        if (height > f) {
            canvas.translate(0.0f, (height - f) / 2.0f);
        }
        canvas.scale(bounds.width() / 10000.0f, this.d / 4.0f);
        canvas.translate(5000.0f, 2.0f);
        if (this.p < 1.0f) {
            if (this.g == 0) {
                canvas.scale(1.0f, -1.0f);
            }
            canvas.translate(0.0f, (this.p - 1.0f) * 4.0f * 0.5f);
            canvas.scale(1.0f, this.p);
        }
        int i = this.f;
        if (i != -1) {
            this.h.setColor(i);
        } else {
            this.h.setColor(this.e);
        }
        this.h.setAlpha((int) (this.c * this.o));
        canvas.drawRect(-5000.0f, -2.0f, 5000.0f, 2.0f, this.h);
        this.h.setColor(this.e);
        this.h.setAlpha((int) (this.o * 255.0f));
        canvas.drawRect(-5000.0f, -2.0f, ((float) (this.b * 10000.0d)) - 5000.0f, 2.0f, this.h);
        canvas.restore();
    }

    public float getGrowScale() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        jgq jgqVar = this.i;
        double d = i;
        Double.isNaN(d);
        jgqVar.c(d / 10000.0d);
        this.j.b();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.o = i / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.p = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.a;
        if (z3 || z2) {
            this.a = z;
            if (z) {
                super.setVisible(true, z2);
                if (z2) {
                    b();
                    this.k.cancel();
                    this.l.cancel();
                    this.p = this.n;
                }
                this.l.cancel();
                this.k.setFloatValues(this.m);
                this.k.start();
            } else if (z3) {
                this.k.cancel();
                this.l.setFloatValues(this.n);
                this.l.start();
            }
            return z3;
        }
        return false;
    }
}
