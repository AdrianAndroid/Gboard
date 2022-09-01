package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: jhc  reason: default package */
/* loaded from: classes.dex */
final class jhc extends AnimatorListenerAdapter {
    final /* synthetic */ jhe a;

    public jhc(jhe jheVar) {
        this.a = jheVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (!this.a.a.isStarted()) {
            this.a.a.start();
        }
    }
}
