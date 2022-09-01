package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: cns  reason: default package */
/* loaded from: classes.dex */
final class cns extends AnimatorListenerAdapter {
    final /* synthetic */ cny a;

    public cns(cny cnyVar) {
        this.a = cnyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.e.setTranslationX(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.a.e.setVisibility(0);
    }
}
