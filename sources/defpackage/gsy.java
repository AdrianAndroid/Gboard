package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* renamed from: gsy  reason: default package */
/* loaded from: classes.dex */
final class gsy extends AnimatorListenerAdapter {
    final /* synthetic */ gsz a;

    public gsy(gsz gszVar) {
        this.a = gszVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g = -1;
        View view = (View) ((ObjectAnimator) animator).getTarget();
        if (view != null) {
            view.setVisibility(8);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            opu opuVar = this.a.k;
            if (opuVar == null) {
                return;
            }
            opuVar.r(view);
        }
    }
}
