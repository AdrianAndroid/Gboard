package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ioc  reason: default package */
/* loaded from: classes.dex */
public final class ioc extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ iod b;

    public ioc(iod iodVar, View view) {
        this.b = iodVar;
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.f(this.a);
    }
}
