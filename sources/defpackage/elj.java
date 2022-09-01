package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;

/* compiled from: PG */
/* renamed from: elj  reason: default package */
/* loaded from: classes.dex */
public final class elj {
    public final ViewGroup a;
    private final ObjectAnimator b;
    private final ValueAnimator c;
    private final AnimatorSet d;
    private final int e;

    public elj(ViewGroup viewGroup, int i) {
        this.a = viewGroup;
        this.e = i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "alpha", 0.0f, 0.0f);
        this.b = ofFloat;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        this.c = ofInt;
        ofInt.addUpdateListener(new op(this, 14));
        AnimatorSet animatorSet = new AnimatorSet();
        this.d = animatorSet;
        ofFloat.setStartDelay(120L);
        ofFloat.setDuration(80L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(ofInt).with(ofFloat);
    }

    private final void d(elh elhVar, int i, int i2, float f, float f2) {
        if (elhVar != null) {
            this.b.removeAllListeners();
            this.b.addListener(new eli(this, elhVar));
        }
        this.c.setIntValues(i, i2);
        this.b.setFloatValues(f, f2);
        this.a.setLayerType(2, null);
        if (Build.VERSION.SDK_INT >= 24 && this.a.getWindowToken() != null) {
            this.a.buildLayer();
        }
        this.d.start();
    }

    public final void a() {
        this.d.cancel();
    }

    public final void b(elh elhVar) {
        d(elhVar, this.e, 0, 1.0f, 0.0f);
    }

    public final void c(elh elhVar) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.height = 0;
        this.a.setAlpha(0.0f);
        this.a.setLayoutParams(layoutParams);
        this.a.setVisibility(0);
        d(elhVar, 0, this.e, 0.0f, 1.0f);
    }
}
