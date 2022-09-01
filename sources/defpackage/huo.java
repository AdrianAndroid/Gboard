package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: huo  reason: default package */
/* loaded from: classes.dex */
final class huo extends AnimatorListenerAdapter {
    final /* synthetic */ hus a;

    public huo(hus husVar) {
        this.a = husVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.e();
    }
}
