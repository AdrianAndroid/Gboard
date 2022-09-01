package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: akb  reason: default package */
/* loaded from: classes.dex */
final class akb extends AnimatorListenerAdapter {
    final /* synthetic */ akf a;

    public akb(akf akfVar) {
        this.a = akfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ajz) arrayList.get(i)).b(this.a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ajz) arrayList.get(i)).c(this.a);
        }
    }
}
