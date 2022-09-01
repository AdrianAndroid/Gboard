package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: w  reason: default package */
/* loaded from: classes2.dex */
public final class w extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bz d;
    final /* synthetic */ aa e;

    public w(ViewGroup viewGroup, View view, boolean z, bz bzVar, aa aaVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = bzVar;
        this.e = aaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            cd.t(this.d.e, this.b);
        }
        this.e.b();
        if (bi.S(2)) {
            new StringBuilder("Animator from operation ").append(this.d);
        }
    }
}
