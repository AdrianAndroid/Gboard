package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: gsx  reason: default package */
/* loaded from: classes.dex */
final class gsx extends AnimatorListenerAdapter {
    final /* synthetic */ gsz a;

    public gsx(gsz gszVar) {
        this.a = gszVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f = -1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ObjectAnimator objectAnimator;
        gsz gszVar = this.a;
        if (gszVar.f == gszVar.g && (objectAnimator = gszVar.c) != null) {
            objectAnimator.cancel();
        }
        View view = (View) ((ObjectAnimator) animator).getTarget();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
