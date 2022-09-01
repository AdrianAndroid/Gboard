package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hxb  reason: default package */
/* loaded from: classes.dex */
final class hxb extends AnimatorListenerAdapter {
    final /* synthetic */ SparseArray a;
    final /* synthetic */ int b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ ice d;
    final /* synthetic */ hxi e;

    public hxb(hxi hxiVar, SparseArray sparseArray, int i, ArrayList arrayList, ice iceVar) {
        this.e = hxiVar;
        this.a = sparseArray;
        this.b = i;
        this.c = arrayList;
        this.d = iceVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(this.b);
        this.e.q(this.c, this.d);
        hxi hxiVar = this.e;
        hxiVar.u(hxiVar.o(), this.d, hwy.d, false);
    }
}
