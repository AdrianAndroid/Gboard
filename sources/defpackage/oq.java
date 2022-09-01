package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: PG */
/* renamed from: oq  reason: default package */
/* loaded from: classes2.dex */
public class oq implements Animator.AnimatorListener {
    final float d;
    final float e;
    final float f;
    final float g;
    public final mo h;
    final int i;
    final ValueAnimator j;
    boolean k;
    float l;
    float m;
    public boolean n = false;
    public boolean o = false;
    public float p = 0.0f;

    public oq(mo moVar, int i, float f, float f2, float f3, float f4) {
        this.i = i;
        this.h = moVar;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j = ofFloat;
        ofFloat.addUpdateListener(new op(this, 0));
        ofFloat.setTarget(moVar.a);
        ofFloat.addListener(this);
    }

    public final void a() {
        this.j.cancel();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.p = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.o) {
            this.h.n(true);
        }
        this.o = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
