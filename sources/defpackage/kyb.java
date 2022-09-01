package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kyb  reason: default package */
/* loaded from: classes.dex */
public final class kyb extends AnimatorListenerAdapter {
    final /* synthetic */ kye a;

    public kyb(kye kyeVar) {
        this.a = kyeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f();
    }
}
