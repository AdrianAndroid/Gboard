package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kvz  reason: default package */
/* loaded from: classes.dex */
public final class kvz extends AnimatorListenerAdapter {
    final /* synthetic */ kwb a;

    public kvz(kwb kwbVar) {
        this.a = kwbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        kwb kwbVar = this.a;
        List<ajz> list = kwbVar.e;
        if (list == null || kwbVar.f) {
            return;
        }
        for (ajz ajzVar : list) {
            ajzVar.b(kwbVar);
        }
    }
}
