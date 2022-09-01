package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kuf  reason: default package */
/* loaded from: classes.dex */
public final class kuf extends AnimatorListenerAdapter {
    final /* synthetic */ kup a;
    private boolean b;

    public kuf(kup kupVar) {
        this.a = kupVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kup kupVar = this.a;
        kupVar.A = 0;
        kupVar.v = null;
        if (!this.b) {
            kupVar.B.g(4, false);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.B.g(0, false);
        kup kupVar = this.a;
        kupVar.A = 1;
        kupVar.v = animator;
        this.b = false;
    }
}
