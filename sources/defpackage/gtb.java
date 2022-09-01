package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: gtb  reason: default package */
/* loaded from: classes.dex */
final class gtb extends AnimatorListenerAdapter {
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = (View) ((ObjectAnimator) animator).getTarget();
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }
}
