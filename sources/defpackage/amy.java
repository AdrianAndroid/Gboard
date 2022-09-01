package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: amy  reason: default package */
/* loaded from: classes.dex */
public final class amy extends Drawable implements Drawable.Callback, Animatable {
    public amp a;
    public final asb b;
    public aow g;
    public String h;
    public boolean i;
    public aqg j;
    public gck l;
    private final ValueAnimator.AnimatorUpdateListener n;
    private final Matrix m = new Matrix();
    public float c = 1.0f;
    public boolean d = true;
    public boolean e = false;
    public final ArrayList f = new ArrayList();
    private int o = 255;
    private final boolean p = true;
    public boolean k = false;

    public amy() {
        asb asbVar = new asb();
        this.b = asbVar;
        op opVar = new op(this, 3);
        this.n = opVar;
        asbVar.addUpdateListener(opVar);
    }

    private final boolean q() {
        return this.d || this.e;
    }

    private static final float r(Rect rect) {
        return rect.width() / rect.height();
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        this.k = false;
        amp ampVar = this.a;
        int i = -1;
        if (ampVar == null || getBounds().isEmpty() || r(getBounds()) == r(ampVar.g)) {
            if (this.j != null) {
                float f3 = this.c;
                float min = Math.min(canvas.getWidth() / this.a.g.width(), canvas.getHeight() / this.a.g.height());
                if (f3 > min) {
                    f = this.c / min;
                } else {
                    min = f3;
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width = this.a.g.width() / 2.0f;
                    float height = this.a.g.height() / 2.0f;
                    float f4 = width * min;
                    float f5 = height * min;
                    float f6 = this.c;
                    canvas.translate((width * f6) - f4, (f6 * height) - f5);
                    canvas.scale(f, f, f4, f5);
                }
                this.m.reset();
                this.m.preScale(min, min);
                this.j.b(canvas, this.m, this.o);
                if (i > 0) {
                    canvas.restoreToCount(i);
                }
            }
        } else if (this.j != null) {
            Rect bounds = getBounds();
            float width2 = bounds.width() / this.a.g.width();
            float height2 = bounds.height() / this.a.g.height();
            if (this.p) {
                float min2 = Math.min(width2, height2);
                if (min2 < 1.0f) {
                    f2 = 1.0f / min2;
                    width2 /= f2;
                    height2 /= f2;
                } else {
                    f2 = 1.0f;
                }
                if (f2 > 1.0f) {
                    i = canvas.save();
                    float width3 = bounds.width() / 2.0f;
                    float height3 = bounds.height() / 2.0f;
                    float f7 = width3 * min2;
                    float f8 = min2 * height3;
                    canvas.translate(width3 - f7, height3 - f8);
                    canvas.scale(f2, f2, f7, f8);
                }
            }
            this.m.reset();
            this.m.preScale(width2, height2);
            this.j.b(canvas, this.m, this.o);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
        ami.a();
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final void f(aoz aozVar, Object obj, asj asjVar) {
        aqg aqgVar = this.j;
        if (aqgVar == null) {
            this.f.add(new amv(this, aozVar, obj, asjVar));
            return;
        }
        if (aozVar == aoz.a) {
            aqgVar.a(obj, asjVar);
        } else {
            apa apaVar = aozVar.b;
            if (apaVar == null) {
                ArrayList arrayList = new ArrayList();
                this.j.e(aozVar, 0, arrayList, new aoz(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((aoz) arrayList.get(i)).b.a(obj, asjVar);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            } else {
                apaVar.a(obj, asjVar);
            }
        }
        invalidateSelf();
        if (obj != and.C) {
            return;
        }
        m(c());
    }

    public final void g() {
        aqi a = arh.a(this.a);
        amp ampVar = this.a;
        this.j = new aqg(this, a, ampVar.f, ampVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        amp ampVar = this.a;
        if (ampVar == null) {
            return -1;
        }
        return (int) (ampVar.g.height() * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        amp ampVar = this.a;
        if (ampVar == null) {
            return -1;
        }
        return (int) (ampVar.g.width() * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        asb asbVar = this.b;
        if (asbVar.i) {
            asbVar.cancel();
        }
        this.a = null;
        this.j = null;
        this.g = null;
        asb asbVar2 = this.b;
        asbVar2.h = null;
        asbVar2.f = -2.14748365E9f;
        asbVar2.g = 2.14748365E9f;
        invalidateSelf();
    }

    public final void i() {
        this.f.clear();
        this.b.h();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.k) {
            return;
        }
        this.k = true;
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return o();
    }

    public final void j() {
        if (this.j == null) {
            this.f.add(new amw(this, 1));
            return;
        }
        if (q() || e() == 0) {
            asb asbVar = this.b;
            asbVar.i = true;
            boolean m = asbVar.m();
            for (Animator.AnimatorListener animatorListener : asbVar.a) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(asbVar, m);
                } else {
                    animatorListener.onAnimationStart(asbVar);
                }
            }
            asbVar.k((int) (asbVar.m() ? asbVar.d() : asbVar.e()));
            asbVar.c = 0L;
            asbVar.e = 0;
            asbVar.g();
        }
        if (q()) {
            return;
        }
        l((int) (d() < 0.0f ? b() : a()));
        this.b.f();
    }

    public final void k() {
        float e;
        if (this.j == null) {
            this.f.add(new amw(this, 0));
            return;
        }
        if (q() || e() == 0) {
            asb asbVar = this.b;
            asbVar.i = true;
            asbVar.g();
            asbVar.c = 0L;
            if (asbVar.m() && asbVar.d == asbVar.e()) {
                e = asbVar.d();
            } else if (!asbVar.m() && asbVar.d == asbVar.d()) {
                e = asbVar.e();
            }
            asbVar.d = e;
        }
        if (q()) {
            return;
        }
        l((int) (d() < 0.0f ? b() : a()));
        this.b.f();
    }

    public final void l(int i) {
        if (this.a == null) {
            this.f.add(new amt(this, i));
        } else {
            this.b.k(i);
        }
    }

    public final void m(float f) {
        amp ampVar = this.a;
        if (ampVar == null) {
            this.f.add(new amu(this, f));
            return;
        }
        this.b.k(asc.c(ampVar.h, ampVar.i, f));
        ami.a();
    }

    public final void n(int i) {
        this.b.setRepeatCount(i);
    }

    public final boolean o() {
        asb asbVar = this.b;
        if (asbVar == null) {
            return false;
        }
        return asbVar.i;
    }

    public final boolean p() {
        return this.a.d.b() > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.o = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        asa.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clear();
        this.b.f();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
