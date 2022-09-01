package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: jx  reason: default package */
/* loaded from: classes.dex */
public final class jx extends AnimatorListenerAdapter {
    final /* synthetic */ jz a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ lv d;

    public jx(lv lvVar, jz jzVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = lvVar;
        this.a = jzVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.a(this.a.a);
        this.d.k.remove(this.a.a);
        this.d.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        mo moVar = this.a.a;
    }
}
