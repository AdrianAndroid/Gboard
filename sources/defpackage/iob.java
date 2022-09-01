package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iob  reason: default package */
/* loaded from: classes.dex */
public final class iob extends AnimatorListenerAdapter {
    final /* synthetic */ iod a;

    public iob(iod iodVar) {
        this.a = iodVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ValueAnimator valueAnimator = this.a.b;
        if (valueAnimator == null || valueAnimator.getAnimatedFraction() <= 0.25f) {
            return;
        }
        this.a.c = true;
    }
}
