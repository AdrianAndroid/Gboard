package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: cnr  reason: default package */
/* loaded from: classes.dex */
final class cnr extends AnimatorListenerAdapter {
    final /* synthetic */ cny a;

    public cnr(cny cnyVar) {
        this.a = cnyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cuj a;
        super.onAnimationEnd(animator);
        this.a.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        if (this.a.e.a() == null || (a = this.a.e.a()) == null) {
            return;
        }
        a.fc();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.a.e.setVisibility(8);
    }
}
