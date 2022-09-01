package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;

/* compiled from: PG */
/* renamed from: gte  reason: default package */
/* loaded from: classes.dex */
public final class gte {
    public final qv a = new qv();
    public final View.OnLayoutChangeListener b = new dkr(this, 8);
    private final gqy c;
    private final int d;
    private ValueAnimator e;

    public gte(gqy gqyVar, int i) {
        this.c = gqyVar;
        this.d = i;
    }

    private final void c() {
        int i = this.a.d;
        if (i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                ((View) this.a.c(i2)).removeOnLayoutChangeListener(this.b);
            }
            this.a.clear();
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.e.cancel();
        }
        c();
    }

    public final void b(lfe lfeVar) {
        c();
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.e.cancel();
        }
        int i = this.c.i();
        for (int i2 = 0; i2 < i; i2++) {
            View m = this.c.m(i2);
            if (m != null && lfeVar.a(m)) {
                m.addOnLayoutChangeListener(this.b);
                this.a.put(m, new Point((int) (m.getLeft() + m.getTranslationX()), (int) (m.getTop() + m.getTranslationY())));
            }
        }
        if (this.e == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.e = ofFloat;
            ofFloat.setDuration(this.d);
            this.e.addListener(new gtd(this));
            this.e.addUpdateListener(new op(this, 19));
        }
        this.e.start();
    }
}
