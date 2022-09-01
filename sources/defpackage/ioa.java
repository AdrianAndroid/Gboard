package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: ioa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ioa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public /* synthetic */ ioa(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b != 0) {
            this.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else {
            this.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
