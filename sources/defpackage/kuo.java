package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kuo  reason: default package */
/* loaded from: classes.dex */
public abstract class kuo extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final /* synthetic */ kup b;
    private float c;
    private float d;

    public kuo(kup kupVar) {
        this.b = kupVar;
    }

    protected abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.k((int) this.d);
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.a) {
            kxe kxeVar = this.b.m;
            this.c = kxeVar == null ? 0.0f : kxeVar.a();
            this.d = a();
            this.a = true;
        }
        kup kupVar = this.b;
        float f = this.c;
        kupVar.k((int) (f + ((this.d - f) * valueAnimator.getAnimatedFraction())));
    }
}
