package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bpp  reason: default package */
/* loaded from: classes.dex */
final class bpp extends AnimatorListenerAdapter {
    final /* synthetic */ bpr a;

    public bpp(bpr bprVar) {
        this.a = bprVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g = null;
        bpr bprVar = this.a;
        bprVar.f.setVisibility(0);
        bprVar.f.setAlpha(1.0f);
        bprVar.e.setVisibility(4);
        bpr bprVar2 = this.a;
        bprVar2.f.postDelayed(bprVar2.d, ((Long) bpr.c.c()).longValue());
    }
}
