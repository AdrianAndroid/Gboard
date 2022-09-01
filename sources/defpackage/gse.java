package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.inputmethod.accesspoint.impl.ExpandAccessPointsHintView;

/* compiled from: PG */
/* renamed from: gse  reason: default package */
/* loaded from: classes.dex */
public final class gse extends AnimatorListenerAdapter {
    final /* synthetic */ gsh a;
    private boolean b;

    public gse(gsh gshVar) {
        this.a = gshVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gsh gshVar;
        ExpandAccessPointsHintView expandAccessPointsHintView;
        if (this.b || (expandAccessPointsHintView = (gshVar = this.a).i) == null) {
            return;
        }
        if (gshVar.o == null) {
            gshVar.o = new fqa(gshVar, 12);
        }
        expandAccessPointsHintView.postDelayed(gshVar.o, 500L);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b = false;
    }
}
