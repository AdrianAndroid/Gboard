package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: jw  reason: default package */
/* loaded from: classes.dex */
public final class jw extends AnimatorListenerAdapter {
    final /* synthetic */ mo a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;
    final /* synthetic */ ViewPropertyAnimator e;
    final /* synthetic */ lv f;

    public jw(lv lvVar, mo moVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = lvVar;
        this.a = moVar;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.f.a(this.a);
        this.f.i.remove(this.a);
        this.f.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
