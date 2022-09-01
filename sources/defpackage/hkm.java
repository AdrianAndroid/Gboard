package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: hkm  reason: default package */
/* loaded from: classes.dex */
final class hkm extends AnimatorListenerAdapter {
    private final View a;

    public hkm(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        hko.g(this.a);
    }
}
