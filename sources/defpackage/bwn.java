package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bwn  reason: default package */
/* loaded from: classes.dex */
final class bwn extends AnimatorListenerAdapter {
    final /* synthetic */ bwr a;

    public bwn(bwr bwrVar) {
        this.a = bwrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f = null;
    }
}
