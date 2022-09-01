package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jha  reason: default package */
/* loaded from: classes.dex */
public final class jha extends jgi {
    final /* synthetic */ jhb a;

    public jha(jhb jhbVar) {
        this.a = jhbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        jhb jhbVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(jhbVar.a, false);
        this.a.c();
    }
}
