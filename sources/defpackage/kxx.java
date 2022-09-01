package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* renamed from: kxx  reason: default package */
/* loaded from: classes.dex */
final class kxx extends AnimatorListenerAdapter {
    final /* synthetic */ kye a;

    public kxx(kye kyeVar) {
        this.a = kyeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = this.a.l;
        snackbarContentLayout.a.setAlpha(1.0f);
        snackbarContentLayout.a.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(1.0f);
            snackbarContentLayout.b.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        }
    }
}
