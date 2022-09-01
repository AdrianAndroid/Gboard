package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: dks  reason: default package */
/* loaded from: classes.dex */
final class dks extends AnimatorListenerAdapter {
    final /* synthetic */ dkt a;
    final /* synthetic */ dkv b;

    public dks(dkv dkvVar, dkt dktVar) {
        this.b = dkvVar;
        this.a = dktVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = dkv.m;
        dkt a = this.a.a();
        if (a != null) {
            this.b.a(a);
        }
    }
}
