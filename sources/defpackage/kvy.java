package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;

/* compiled from: PG */
/* renamed from: kvy  reason: default package */
/* loaded from: classes.dex */
final class kvy extends AnimatorListenerAdapter {
    final /* synthetic */ kwb a;

    public kvy(kwb kwbVar) {
        this.a = kwbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        kwb kwbVar = this.a;
        List<ajz> list = kwbVar.e;
        if (list == null || kwbVar.f) {
            return;
        }
        for (ajz ajzVar : list) {
            ajzVar.c(kwbVar);
        }
    }
}
