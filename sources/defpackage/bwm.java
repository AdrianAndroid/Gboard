package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bwm  reason: default package */
/* loaded from: classes.dex */
public final class bwm extends AnimatorListenerAdapter {
    final /* synthetic */ bwr a;

    public bwm(bwr bwrVar) {
        this.a = bwrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bwr bwrVar = this.a;
        bwrVar.j.m(bwrVar.a, bwrVar.b);
    }
}
