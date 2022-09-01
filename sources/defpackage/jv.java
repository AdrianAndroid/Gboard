package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: jv  reason: default package */
/* loaded from: classes.dex */
public final class jv extends AnimatorListenerAdapter {
    final /* synthetic */ mo a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ lv d;

    public jv(lv lvVar, mo moVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = lvVar;
        this.a = moVar;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.a(this.a);
        this.d.h.remove(this.a);
        this.d.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
