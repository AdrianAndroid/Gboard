package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: ddo  reason: default package */
/* loaded from: classes.dex */
public final class ddo extends AnimatorListenerAdapter {
    public final /* synthetic */ ddp a;

    public ddo(ddp ddpVar) {
        this.a = ddpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = (View) ((ObjectAnimator) animator).getTarget();
        if (view != null) {
            view.setVisibility(8);
            view.post(new cvj(this, 17));
        }
        ddp ddpVar = this.a;
        ddpVar.a.gk(ddpVar.k);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = (View) ((ObjectAnimator) animator).getTarget();
        if (view != null) {
            view.setVisibility(0);
        }
        this.a.s(0);
    }
}
