package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gry  reason: default package */
/* loaded from: classes.dex */
public final class gry extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ gsa b;

    public gry(gsa gsaVar, boolean z) {
        this.b = gsaVar;
        this.a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        this.b.c(this.a);
    }
}
