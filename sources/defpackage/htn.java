package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: htn  reason: default package */
/* loaded from: classes.dex */
public final class htn implements Animator.AnimatorListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ int b;

    public htn(ViewGroup viewGroup, int i) {
        this.a = viewGroup;
        this.b = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.b;
        }
        this.a.requestLayout();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
