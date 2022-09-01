package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: grl  reason: default package */
/* loaded from: classes.dex */
final class grl extends AnimatorListenerAdapter {
    final /* synthetic */ grn a;

    public grl(grn grnVar) {
        this.a = grnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gqx gqxVar = this.a.c;
        if (gqxVar != null) {
            gqxVar.g();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        gqx gqxVar = this.a.c;
        if (gqxVar != null) {
            gqxVar.h();
        }
    }
}
