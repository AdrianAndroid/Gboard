package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.inputmethod.libs.expression.header.StartElementScrollBehavior;

/* compiled from: PG */
/* renamed from: cpj  reason: default package */
/* loaded from: classes.dex */
public final class cpj extends AnimatorListenerAdapter {
    final /* synthetic */ StartElementScrollBehavior a;

    public cpj(StartElementScrollBehavior startElementScrollBehavior) {
        this.a = startElementScrollBehavior;
    }

    private final void a() {
        synchronized (this.a) {
            this.a.l = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        a();
    }
}
