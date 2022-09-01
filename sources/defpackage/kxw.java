package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* renamed from: kxw  reason: default package */
/* loaded from: classes.dex */
public final class kxw extends AnimatorListenerAdapter {
    final /* synthetic */ kye a;

    public kxw(kye kyeVar) {
        this.a = kyeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = this.a.l;
        snackbarContentLayout.a.setAlpha(0.0f);
        snackbarContentLayout.a.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(0.0f);
            snackbarContentLayout.b.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        }
    }
}
