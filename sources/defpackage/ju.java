package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: ju  reason: default package */
/* loaded from: classes.dex */
public final class ju extends AnimatorListenerAdapter {
    final /* synthetic */ mo a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ lv d;

    public ju(lv lvVar, mo moVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = lvVar;
        this.a = moVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.a(this.a);
        this.d.j.remove(this.a);
        this.d.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
