package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.inputmethod.libs.expression.header.ConstraintHeaderViewImpl;

/* compiled from: PG */
/* renamed from: cof  reason: default package */
/* loaded from: classes.dex */
public final class cof extends AnimatorListenerAdapter {
    final /* synthetic */ coq a;
    final /* synthetic */ ConstraintHeaderViewImpl b;

    public cof(ConstraintHeaderViewImpl constraintHeaderViewImpl, coq coqVar) {
        this.b = constraintHeaderViewImpl;
        this.a = coqVar;
    }

    private final void a() {
        synchronized (this.b) {
            ConstraintHeaderViewImpl constraintHeaderViewImpl = this.b;
            constraintHeaderViewImpl.m = null;
            constraintHeaderViewImpl.j.removeAllViews();
            this.b.v(this.a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        a();
    }
}
