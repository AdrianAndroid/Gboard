package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kug  reason: default package */
/* loaded from: classes.dex */
public final class kug extends AnimatorListenerAdapter {
    final /* synthetic */ kup a;

    public kug(kup kupVar) {
        this.a = kupVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kup kupVar = this.a;
        kupVar.A = 0;
        kupVar.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.B.g(0, false);
        kup kupVar = this.a;
        kupVar.A = 2;
        kupVar.v = animator;
    }
}
