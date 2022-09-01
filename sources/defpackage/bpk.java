package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bpk  reason: default package */
/* loaded from: classes.dex */
final class bpk extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;

    public bpk(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
        animator.removeAllListeners();
    }
}
