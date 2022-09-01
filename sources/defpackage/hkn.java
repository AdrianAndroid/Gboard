package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: hkn  reason: default package */
/* loaded from: classes.dex */
final class hkn extends AnimatorListenerAdapter {
    private final View a;
    private final Animator b;

    public hkn(View view, Animator animator) {
        this.a = view;
        this.b = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        Animator animator2 = this.b;
        if (animator2 != null) {
            animator2.start();
        } else {
            hko.g(this.a);
        }
    }
}
