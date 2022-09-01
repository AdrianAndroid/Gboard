package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kwk  reason: default package */
/* loaded from: classes.dex */
final class kwk extends AnimatorListenerAdapter {
    final /* synthetic */ kwm a;

    public kwk(kwm kwmVar) {
        this.a = kwmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        kwm kwmVar = this.a;
        ajz ajzVar = kwmVar.h;
        if (ajzVar != null) {
            ajzVar.b(kwmVar.j);
        }
    }
}
