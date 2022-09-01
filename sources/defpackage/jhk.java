package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
@Deprecated
/* renamed from: jhk  reason: default package */
/* loaded from: classes.dex */
public final class jhk extends Drawable implements Animatable, jgy {
    public final AnimatorSet a;
    private final int c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final Paint i;
    private final ObjectAnimator j;
    private final ObjectAnimator k;
    private final float m;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private final Rect t;
    private float n = 1.0f;
    public boolean b = isVisible();
    private final float l = 1.0f;

    public jhk(int i, int i2, int i3, float f, boolean z, int i4) {
        this.e = i;
        this.g = i2;
        this.c = Math.round(f * 255.0f);
        this.d = z;
        this.h = i4;
        this.f = i3;
        float f2 = 1.0f;
        Paint paint = new Paint();
        this.i = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.1f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(733L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.8268492f);
        ofFloat2.setInterpolator(abt.c(0.33473143f, 0.12481982f, 0.78584397f, 1.0f));
        ofFloat2.setDuration(650L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.8268492f, 0.1f);
        ofFloat3.setInterpolator(abt.c(0.225732f, 0.0f, 0.35f, 1.05f));
        ofFloat3.setDuration(617L);
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "rect1TranslationX", -522.6f, 199.6f);
        ofFloat4.setInterpolator(abt.c(0.34f, 0.0f, 0.78f, 1.0f));
        ofFloat4.setStartDelay(400L);
        ofFloat4.setDuration(1600L);
        animatorSet.play(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.1f, 0.55f);
        ofFloat5.setInterpolator(abt.c(0.20502818f, 0.057050835f, 0.5f, 0.5f));
        ofFloat5.setDuration(352L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.55f, 0.90995026f);
        ofFloat6.setInterpolator(abt.c(0.15f, 0.2f, 0.6483738f, 1.0043154f));
        ofFloat6.setDuration(532L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.90995026f, 0.1f);
        ofFloat7.setInterpolator(abt.c(0.25775883f, -0.003163357f, 0.21176192f, 1.3817896f));
        ofFloat7.setDuration(1116L);
        animatorSet.playSequentially(ofFloat5, ofFloat6, ofFloat7);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "rect2TranslationX", -208.0f, 132.0f);
        ofFloat8.setInterpolator(abt.c(0.26f, 0.0f, 0.75f, 0.68f));
        ofFloat8.setDuration(964L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "rect2TranslationX", 132.0f, 422.6f);
        ofFloat9.setInterpolator(abt.c(0.4f, 0.6270349f, 0.6f, 0.9020258f));
        ofFloat9.setDuration(1036L);
        animatorSet.playSequentially(ofFloat8, ofFloat9);
        animatorSet.addListener(new jhi());
        jhm.a();
        jgk.b(animatorSet, null);
        this.a = animatorSet;
        this.m = i4 != 2 ? 0.0f : f2;
        this.j = jdg.b(this);
        ObjectAnimator c = jdg.c(this);
        c.addListener(new jhj(this));
        this.k = c;
        this.t = new Rect();
        b();
    }

    @Override // defpackage.jgy
    public final void a() {
        this.b = false;
        if (super.setVisible(false, false)) {
            this.j.cancel();
            this.k.cancel();
            this.a.cancel();
        }
    }

    public final void b() {
        this.j.cancel();
        this.k.cancel();
        this.a.cancel();
        this.o = 0.1f;
        this.p = -522.6f;
        this.q = 0.1f;
        this.r = -197.6f;
        this.s = this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(this.t)) {
            return;
        }
        canvas.save();
        float height = this.t.height();
        float f = this.e;
        if (height > f) {
            canvas.translate(0.0f, (height - f) / 2.0f);
        }
        canvas.scale(this.t.width() / 360.0f, this.e / 4.0f);
        canvas.translate(180.0f, 2.0f);
        canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
        if (this.s < 1.0f) {
            if (this.h == 0) {
                canvas.scale(1.0f, -1.0f);
            }
            canvas.translate(0.0f, (this.s - 1.0f) * 4.0f * 0.5f);
            canvas.scale(1.0f, this.s);
        }
        int i = this.f;
        if (i != -1) {
            this.i.setColor(i);
            this.i.setAlpha((int) (this.n * this.c));
        } else {
            this.i.setColor(this.g);
            this.i.setAlpha((int) (this.n * this.c));
        }
        canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, this.i);
        this.i.setColor(this.g);
        if (this.d) {
            canvas.scale(-1.0f, 1.0f);
        }
        this.i.setAlpha((int) (this.n * 255.0f));
        canvas.save();
        canvas.translate(this.p, 0.0f);
        canvas.scale(this.o, 1.0f);
        canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.i);
        canvas.restore();
        canvas.save();
        canvas.translate(this.r, 0.0f);
        canvas.scale(this.q, 1.0f);
        canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.i);
        canvas.restore();
        canvas.restore();
    }

    public float getGrowScale() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getRect1ScaleX() {
        return this.o;
    }

    public float getRect1TranslationX() {
        return this.p;
    }

    public float getRect2ScaleX() {
        return this.q;
    }

    public float getRect2TranslationX() {
        return this.r;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return isVisible();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.s = f;
        invalidateSelf();
    }

    public void setRect1ScaleX(float f) {
        this.o = f;
        invalidateSelf();
    }

    public void setRect1TranslationX(float f) {
        this.p = f;
        invalidateSelf();
    }

    public void setRect2ScaleX(float f) {
        this.q = f;
        invalidateSelf();
    }

    public void setRect2TranslationX(float f) {
        this.r = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.b;
        if (z3 || z2) {
            this.b = z;
            if (z) {
                super.setVisible(true, z2);
                if (z2) {
                    b();
                }
                this.k.cancel();
                this.j.setFloatValues(this.l);
                this.j.start();
                if (!this.a.isStarted()) {
                    this.a.start();
                }
            } else if (z3) {
                this.j.cancel();
                this.k.setFloatValues(this.m);
                this.k.start();
            }
            return z3;
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        setVisible(true, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        setVisible(false, false);
    }
}
