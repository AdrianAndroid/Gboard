package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kwj  reason: default package */
/* loaded from: classes.dex */
final class kwj extends AnimatorListenerAdapter {
    final /* synthetic */ kwm a;

    public kwj(kwm kwmVar) {
        this.a = kwmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        kwm kwmVar = this.a;
        kwmVar.e = (kwmVar.e + 1) % kwmVar.d.c.length;
        kwmVar.f = true;
    }
}
