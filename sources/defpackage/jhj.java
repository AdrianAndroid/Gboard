package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jhj  reason: default package */
/* loaded from: classes.dex */
public final class jhj extends jgi {
    final /* synthetic */ jhk a;

    public jhj(jhk jhkVar) {
        this.a = jhkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        jhk jhkVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(jhkVar.b, false);
        this.a.a.cancel();
        this.a.b();
    }
}
