package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* renamed from: hto  reason: default package */
/* loaded from: classes.dex */
public final class hto implements Animator.AnimatorListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hto(View view, int i) {
        this.b = i;
        this.a = view;
    }

    public hto(dgm dgmVar, int i) {
        this.b = i;
        this.a = dgmVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b != 0) {
            ((dgm) this.a).a = false;
            return;
        }
        Object obj = this.a;
        if (obj == null) {
            return;
        }
        ((View) obj).setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
