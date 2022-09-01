package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kxv  reason: default package */
/* loaded from: classes.dex */
final class kxv extends AnimatorListenerAdapter {
    final /* synthetic */ kye a;

    public kxv(kye kyeVar) {
        this.a = kyeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.k();
    }
}
