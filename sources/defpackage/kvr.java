package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kvr  reason: default package */
/* loaded from: classes.dex */
final class kvr extends AnimatorListenerAdapter {
    final /* synthetic */ kvv a;

    public kvr(kvv kvvVar) {
        this.a = kvvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        kvv kvvVar = this.a;
        kvvVar.f = (kvvVar.f + 4) % kvvVar.e.c.length;
    }
}
