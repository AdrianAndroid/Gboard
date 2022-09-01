package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: huy  reason: default package */
/* loaded from: classes.dex */
public final class huy extends AnimatorListenerAdapter {
    final /* synthetic */ hva a;
    private boolean b;

    public huy(hva hvaVar) {
        this.a = hvaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.b) {
            hva hvaVar = this.a;
            hvaVar.h.b(hvaVar.k, 0);
            this.a.q = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b = false;
    }
}
