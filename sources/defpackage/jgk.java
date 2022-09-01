package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: jgk  reason: default package */
/* loaded from: classes.dex */
public final class jgk extends jgi {
    protected final Animator a;
    public final Runnable b;
    public int d;
    private final jgm e = new jgj(this);
    public final int c = -1;

    private jgk(Animator animator, Runnable runnable) {
        this.a = animator;
        this.b = runnable;
    }

    public static void b(Animator animator, Runnable runnable) {
        animator.addListener(new jgk(animator, runnable));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!a(animator)) {
            jgo.c().a(this.e);
        }
    }
}
