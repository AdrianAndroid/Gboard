package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: km  reason: default package */
/* loaded from: classes.dex */
final class km extends AnimatorListenerAdapter {
    final /* synthetic */ kn a;
    private boolean b = false;

    public km(kn knVar) {
        this.a = knVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
        } else if (((Float) this.a.p.getAnimatedValue()).floatValue() == 0.0f) {
            kn knVar = this.a;
            knVar.q = 0;
            knVar.j(0);
        } else {
            kn knVar2 = this.a;
            knVar2.q = 2;
            knVar2.i();
        }
    }
}
