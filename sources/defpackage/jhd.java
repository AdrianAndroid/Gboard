package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jhd  reason: default package */
/* loaded from: classes.dex */
public final class jhd extends jgi {
    final /* synthetic */ jhe a;

    public jhd(jhe jheVar) {
        this.a = jheVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        jhe jheVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(jheVar.h, false);
        this.a.c();
    }
}
