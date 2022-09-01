package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jhf  reason: default package */
/* loaded from: classes.dex */
public final class jhf extends jgi {
    final /* synthetic */ jhh a;

    public jhf(jhh jhhVar) {
        this.a = jhhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        jhh jhhVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(jhhVar.a, false);
        this.a.b();
    }
}
