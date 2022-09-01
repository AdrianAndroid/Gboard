package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kwg  reason: default package */
/* loaded from: classes.dex */
final class kwg extends AnimatorListenerAdapter {
    final /* synthetic */ kwi a;

    public kwg(kwi kwiVar) {
        this.a = kwiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        kwi kwiVar = this.a;
        kwiVar.c = (kwiVar.c + 1) % kwiVar.b.c.length;
        kwiVar.d = true;
    }
}
