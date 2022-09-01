package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: fco  reason: default package */
/* loaded from: classes.dex */
public final class fco implements ValueAnimator.AnimatorUpdateListener {
    private final View a;

    public fco(View view) {
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.a.requestLayout();
    }
}
