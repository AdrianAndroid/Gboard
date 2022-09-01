package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: gsu  reason: default package */
/* loaded from: classes.dex */
public final class gsu extends AnimatorListenerAdapter {
    final /* synthetic */ gsv a;

    public gsu(gsv gsvVar) {
        this.a = gsvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a.i;
        if (view != null) {
            view.setVisibility(0);
            this.a.i = null;
        }
        gsv gsvVar = this.a;
        gsvVar.a.c(gsvVar.d, null, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SoftKeyView softKeyView = this.a.e;
        if (softKeyView != null) {
            softKeyView.setVisibility(0);
        }
    }
}
