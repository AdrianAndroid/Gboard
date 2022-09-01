package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: cnv  reason: default package */
/* loaded from: classes.dex */
public final class cnv extends AnimatorListenerAdapter {
    final /* synthetic */ cny a;

    public cnv(cny cnyVar) {
        this.a = cnyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.a.f.W()) {
            this.a.f.O(true);
        }
    }
}
