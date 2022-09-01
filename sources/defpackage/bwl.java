package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bwl  reason: default package */
/* loaded from: classes.dex */
public final class bwl extends AnimatorListenerAdapter {
    final /* synthetic */ bwr a;

    public bwl(bwr bwrVar) {
        this.a = bwrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bwr bwrVar = this.a;
        bwrVar.j.G(bwrVar.a, bwrVar.b);
    }
}
