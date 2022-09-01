package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: ddn  reason: default package */
/* loaded from: classes.dex */
final class ddn extends AnimatorListenerAdapter {
    final /* synthetic */ ddp a;

    public ddn(ddp ddpVar) {
        this.a = ddpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s(4);
        View view = this.a.c;
        if (view != null) {
            view.post(new cvj(view, 16));
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = (View) ((ObjectAnimator) animator).getTarget();
        if (view != null) {
            view.setVisibility(0);
        }
        ddp ddpVar = this.a;
        ddpVar.a.gk(ddpVar.k);
    }
}
