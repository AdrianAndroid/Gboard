package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: cnu  reason: default package */
/* loaded from: classes.dex */
public final class cnu extends AnimatorListenerAdapter {
    final /* synthetic */ cny a;

    public cnu(cny cnyVar) {
        this.a = cnyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.d.setVisibility(0);
        this.a.n.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.d.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        if (this.a.f.W()) {
            this.a.f.O(true);
        }
        this.a.d.setVisibility(8);
        if (this.a.m()) {
            this.a.g();
        }
    }
}
