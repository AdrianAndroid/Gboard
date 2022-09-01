package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: ctq  reason: default package */
/* loaded from: classes.dex */
final class ctq extends AnimatorListenerAdapter {
    final /* synthetic */ ctr a;

    public ctq(ctr ctrVar) {
        this.a = ctrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a = null;
    }
}
