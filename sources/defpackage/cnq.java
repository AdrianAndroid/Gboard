package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: cnq  reason: default package */
/* loaded from: classes.dex */
final class cnq extends AnimatorListenerAdapter {
    final /* synthetic */ cny a;

    public cnq(cny cnyVar) {
        this.a = cnyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.n.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.d.setVisibility(0);
        if (this.a.f.W()) {
            this.a.f.O(false);
        }
        this.a.n.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.a.d.setVisibility(8);
    }
}
