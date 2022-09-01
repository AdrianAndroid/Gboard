package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwb  reason: default package */
/* loaded from: classes.dex */
public abstract class kwb extends Drawable implements Animatable {
    private static final Property a = new kwa(Float.class);
    private ValueAnimator b;
    final Context c;
    final kvp d;
    public List e;
    public boolean f;
    final Paint g = new Paint();
    public int h;
    private ValueAnimator i;
    private float j;

    public kwb(Context context, kvp kvpVar) {
        this.c = context;
        this.d = kvpVar;
        setAlpha(255);
    }

    private final void a(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f;
        this.f = true;
        valueAnimatorArr[0].end();
        this.f = z;
    }

    public boolean b(boolean z, boolean z2, boolean z3) {
        if (this.b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, a, 0.0f, 1.0f);
            this.b = ofFloat;
            ofFloat.setDuration(500L);
            this.b.setInterpolator(krt.b);
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.b = valueAnimator;
            valueAnimator.addListener(new kvy(this));
        }
        if (this.i == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, a, 1.0f, 0.0f);
            this.i = ofFloat2;
            ofFloat2.setDuration(500L);
            this.i.setInterpolator(krt.b);
            ValueAnimator valueAnimator2 = this.i;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.i = valueAnimator2;
            valueAnimator2.addListener(new kvz(this));
        }
        if (isVisible() || z) {
            ValueAnimator valueAnimator3 = z ? this.b : this.i;
            if (!z3) {
                if (valueAnimator3.isRunning()) {
                    valueAnimator3.end();
                } else {
                    a(valueAnimator3);
                }
                return super.setVisible(z, false);
            } else if (valueAnimator3.isRunning()) {
                return false;
            } else {
                boolean z4 = !z || super.setVisible(true, false);
                if (!(z ? this.d.c() : this.d.b())) {
                    a(valueAnimator3);
                    return z4;
                }
                if (z2 || !valueAnimator3.isPaused()) {
                    valueAnimator3.start();
                } else {
                    valueAnimator3.resume();
                }
                return z4;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        if (this.d.c() || this.d.b()) {
            return this.j;
        }
        return 1.0f;
    }

    public final void d(ajz ajzVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (!this.e.contains(ajzVar)) {
            this.e.add(ajzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.i;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean g() {
        ValueAnimator valueAnimator = this.b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final boolean h(boolean z, boolean z2, boolean z3) {
        float g = kws.g(this.c.getContentResolver());
        boolean z4 = false;
        if (z3 && g > 0.0f) {
            z4 = true;
        }
        return b(z, z2, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return g() || f();
    }

    public final void j() {
        h(false, false, false);
    }

    public final void k(ajz ajzVar) {
        List list = this.e;
        if (list == null || !list.contains(ajzVar)) {
            return;
        }
        this.e.remove(ajzVar);
        if (!this.e.isEmpty()) {
            return;
        }
        this.e = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return h(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        b(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        b(false, true, false);
    }
}
