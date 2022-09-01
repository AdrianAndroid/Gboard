package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: ilt  reason: default package */
/* loaded from: classes.dex */
public final class ilt extends AnimatorListenerAdapter {
    public ilv a;
    public int b;
    final /* synthetic */ hek c;

    public ilt(hek hekVar, ilv ilvVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = hekVar;
        this.a = ilvVar;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d(this.b);
        animator.removeListener(this);
        hek hekVar = this.c;
        this.a = null;
        ((xy) hekVar.b).b(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.k();
    }
}
