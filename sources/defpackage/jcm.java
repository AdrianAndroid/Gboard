package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.inputmethod.widgets.AlternatingTextView;

/* compiled from: PG */
/* renamed from: jcm  reason: default package */
/* loaded from: classes.dex */
public final class jcm extends AnimatorListenerAdapter {
    final /* synthetic */ AlternatingTextView a;

    public jcm(AlternatingTextView alternatingTextView) {
        this.a = alternatingTextView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        animator.removeListener(this);
        this.a.c();
    }
}
