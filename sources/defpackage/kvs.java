package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: kvs  reason: default package */
/* loaded from: classes.dex */
final class kvs extends AnimatorListenerAdapter {
    final /* synthetic */ kvv a;

    public kvs(kvv kvvVar) {
        this.a = kvvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        kvv kvvVar = this.a;
        ajz ajzVar = kvvVar.i;
        if (ajzVar != null) {
            ajzVar.b(kvvVar.j);
        }
    }
}
