package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: grj  reason: default package */
/* loaded from: classes.dex */
final class grj extends AnimatorListenerAdapter {
    final /* synthetic */ grn a;

    public grj(grn grnVar) {
        this.a = grnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gqx gqxVar = this.a.c;
        if (gqxVar != null) {
            gqxVar.d();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        gqx gqxVar = this.a.c;
        if (gqxVar != null) {
            gqxVar.e();
            this.a.c.f(-1.0f);
        }
    }
}
