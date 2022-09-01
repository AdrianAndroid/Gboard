package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: jgi  reason: default package */
/* loaded from: classes.dex */
public class jgi extends AnimatorListenerAdapter {
    private final qv a = new qv();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(Animator animator) {
        return this.a.containsKey(animator) && ((Boolean) this.a.get(animator)).booleanValue();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.put(animator, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.put(animator, false);
    }
}
