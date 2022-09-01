package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;

/* compiled from: PG */
/* renamed from: bpj  reason: default package */
/* loaded from: classes.dex */
final class bpj extends AnimatorListenerAdapter {
    final /* synthetic */ bpl a;

    public bpj(bpl bplVar) {
        this.a = bplVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d.setTranslationY(0.0f);
        this.a.d.setLayerType(0, null);
        this.a.e.setTranslationY(0.0f);
        this.a.e.setLayerType(0, null);
        this.a.h.setTranslationY(0.0f);
        this.a.h.setScaleY(1.0f);
        this.a.h.setAlpha(1.0f);
        this.a.h.setLayerType(0, null);
        Runnable runnable = this.a.i;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.d.setLayerType(2, null);
        if (Build.VERSION.SDK_INT >= 24 && this.a.d.getWindowToken() != null) {
            this.a.d.buildLayer();
        }
        this.a.e.setLayerType(2, null);
        if (Build.VERSION.SDK_INT >= 24 && this.a.e.getWindowToken() != null) {
            this.a.e.buildLayer();
        }
        this.a.h.setLayerType(2, null);
        if (Build.VERSION.SDK_INT < 24 || this.a.h.getWindowToken() == null) {
            return;
        }
        this.a.h.buildLayer();
    }
}
