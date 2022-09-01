package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: eli  reason: default package */
/* loaded from: classes.dex */
final class eli extends AnimatorListenerAdapter {
    final /* synthetic */ elj a;
    private elh b;

    public eli(elj eljVar, elh elhVar) {
        this.a = eljVar;
        this.b = elhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.a.setLayerType(0, null);
        this.b = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setLayerType(0, null);
        elh elhVar = this.b;
        if (elhVar != null) {
            elhVar.a();
        }
    }
}
