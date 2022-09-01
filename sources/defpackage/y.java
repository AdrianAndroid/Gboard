package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: y  reason: default package */
/* loaded from: classes2.dex */
public final class y implements Animation.AnimationListener {
    final /* synthetic */ bz a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ aa d;

    public y(bz bzVar, ViewGroup viewGroup, View view, aa aaVar) {
        this.a = bzVar;
        this.b = viewGroup;
        this.c = view;
        this.d = aaVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.b.post(new az(this, 1));
        if (bi.S(2)) {
            new StringBuilder("Animation from operation ").append(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (bi.S(2)) {
            new StringBuilder("Animation from operation ").append(this.a);
        }
    }
}
