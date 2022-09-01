package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: fbd  reason: default package */
/* loaded from: classes.dex */
final class fbd implements ValueAnimator.AnimatorUpdateListener {
    private final View a;
    private final int b;

    public fbd(View view, int i) {
        this.a = view;
        this.b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.getLayoutParams().height = Math.max(0, (int) (this.b - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        this.a.requestLayout();
    }
}
