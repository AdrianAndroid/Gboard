package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: fiy  reason: default package */
/* loaded from: classes.dex */
public final class fiy extends AnimatorListenerAdapter {
    final /* synthetic */ okf a;

    public fiy(okf okfVar) {
        this.a = okfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oll.e(animator, "animator");
        this.a.a();
    }
}
