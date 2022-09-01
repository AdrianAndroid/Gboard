package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: imf  reason: default package */
/* loaded from: classes.dex */
final class imf extends AnimatorListenerAdapter {
    final /* synthetic */ img a;

    public imf(img imgVar) {
        this.a = imgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        img imgVar = this.a;
        imgVar.g.n(imgVar.a);
        img imgVar2 = this.a;
        imgVar2.g.n(imgVar2.b);
        imh imhVar = this.a.g;
        ilm k = jdg.k(imhVar.f);
        if (k == null) {
            imhVar.b();
        } else {
            imhVar.h(k.c);
            imhVar.n(k);
            imhVar.m(k);
        }
        this.a.a();
    }
}
