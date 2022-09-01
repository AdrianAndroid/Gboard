package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.DragConfirmationPopupView;

/* compiled from: PG */
/* renamed from: dem  reason: default package */
/* loaded from: classes.dex */
public final class dem extends AnimatorListenerAdapter {
    final /* synthetic */ DragConfirmationPopupView a;

    public dem(DragConfirmationPopupView dragConfirmationPopupView) {
        this.a = dragConfirmationPopupView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AnimatorSet animatorSet = this.a.f;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.a.f.cancel();
        }
        DragConfirmationPopupView dragConfirmationPopupView = this.a;
        dragConfirmationPopupView.f = null;
        if (!dragConfirmationPopupView.e) {
            dragConfirmationPopupView.c.b(dragConfirmationPopupView.a);
        }
    }
}
