package defpackage;

import android.animation.Animator;
import android.view.Choreographer;

/* compiled from: PG */
/* renamed from: asb  reason: default package */
/* loaded from: classes.dex */
public final class asb extends ary implements Choreographer.FrameCallback {
    public amp h;
    public float b = 1.0f;
    private boolean j = false;
    public long c = 0;
    public float d = 0.0f;
    public int e = 0;
    public float f = -2.14748365E9f;
    public float g = 2.14748365E9f;
    public boolean i = false;

    public final float c() {
        amp ampVar = this.h;
        if (ampVar == null) {
            return 0.0f;
        }
        float f = this.d;
        float f2 = ampVar.h;
        return (f - f2) / (ampVar.i - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        for (Animator.AnimatorListener animatorListener : this.a) {
            animatorListener.onAnimationCancel(this);
        }
        h();
    }

    public final float d() {
        amp ampVar = this.h;
        if (ampVar == null) {
            return 0.0f;
        }
        float f = this.g;
        return f == 2.14748365E9f ? ampVar.i : f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        g();
        amp ampVar = this.h;
        if (ampVar == null || !this.i) {
            return;
        }
        long j2 = this.c;
        long j3 = 0;
        if (j2 != 0) {
            j3 = j - j2;
        }
        float abs = ((float) j3) / ((1.0E9f / ampVar.j) / Math.abs(this.b));
        float f = this.d;
        if (m()) {
            abs = -abs;
        }
        float f2 = f + abs;
        this.d = f2;
        boolean i = asc.i(f2, e(), d());
        this.d = asc.b(this.d, e(), d());
        this.c = j;
        b();
        if (!i) {
            if (getRepeatCount() != -1 && this.e >= getRepeatCount()) {
                this.d = this.b < 0.0f ? e() : d();
                h();
                a(m());
            } else {
                for (Animator.AnimatorListener animatorListener : this.a) {
                    animatorListener.onAnimationRepeat(this);
                }
                this.e++;
                if (getRepeatMode() == 2) {
                    this.j = !this.j;
                    j();
                } else {
                    this.d = m() ? d() : e();
                }
                this.c = j;
            }
        }
        if (this.h != null) {
            float f3 = this.d;
            float f4 = this.f;
            if (f3 < f4 || f3 > this.g) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f4), Float.valueOf(this.g), Float.valueOf(this.d)));
            }
        }
        ami.a();
    }

    public final float e() {
        amp ampVar = this.h;
        if (ampVar == null) {
            return 0.0f;
        }
        float f = this.f;
        return f == -2.14748365E9f ? ampVar.h : f;
    }

    public final void f() {
        h();
        a(m());
    }

    public final void g() {
        if (this.i) {
            i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float e;
        if (this.h == null) {
            return 0.0f;
        }
        if (m()) {
            f = d();
            e = this.d;
        } else {
            f = this.d;
            e = e();
        }
        return (f - e) / (d() - e());
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        amp ampVar = this.h;
        if (ampVar == null) {
            return 0L;
        }
        return ampVar.a();
    }

    public final void h() {
        i(true);
    }

    protected final void i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.i = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.i;
    }

    public final void j() {
        this.b = -this.b;
    }

    public final void k(float f) {
        if (this.d == f) {
            return;
        }
        this.d = asc.b(f, e(), d());
        this.c = 0L;
        b();
    }

    public final void l(float f, float f2) {
        if (f <= f2) {
            amp ampVar = this.h;
            float f3 = ampVar == null ? -3.4028235E38f : ampVar.h;
            float f4 = ampVar == null ? Float.MAX_VALUE : ampVar.i;
            float b = asc.b(f, f3, f4);
            float b2 = asc.b(f2, f3, f4);
            if (b == this.f && b2 == this.g) {
                return;
            }
            this.f = b;
            this.g = b2;
            k((int) asc.b(this.d, b, b2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    public final boolean m() {
        return this.b < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.j) {
            return;
        }
        this.j = false;
        j();
    }
}
