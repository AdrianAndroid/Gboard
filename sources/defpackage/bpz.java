package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: bpz  reason: default package */
/* loaded from: classes.dex */
final class bpz extends AnimatorListenerAdapter {
    final /* synthetic */ bqa a;

    public bpz(bqa bqaVar) {
        this.a = bqaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        bqa bqaVar = this.a;
        bqaVar.b.c(bqaVar.c, null, true);
        bqa bqaVar2 = this.a;
        bqaVar2.b.c(bqaVar2.d, null, true);
        this.a.a.fp(1024L, false);
        this.a.e.setY(0.0f);
        this.a.e.animate().setListener(null);
        this.a.f.setVisibility(0);
        this.a.h = false;
    }
}
