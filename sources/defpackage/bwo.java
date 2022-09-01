package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bwo  reason: default package */
/* loaded from: classes.dex */
final class bwo extends AnimatorListenerAdapter {
    final /* synthetic */ bwr a;

    public bwo(bwr bwrVar) {
        this.a = bwrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bwr bwrVar = this.a;
        bwrVar.j.v(bwrVar.b);
        this.a.g = null;
    }
}
