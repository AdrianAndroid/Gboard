package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* renamed from: imq  reason: default package */
/* loaded from: classes.dex */
final class imq implements View.OnAttachStateChangeListener {
    final View a;
    final View b;
    final int c;
    final int d;
    final int e;
    final Animator f;
    final /* synthetic */ imr g;

    public imq(imr imrVar, View view, View view2, int i, int i2, int i3, Animator animator) {
        this.g = imrVar;
        this.a = view;
        this.b = view2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = animator;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        imq imqVar = (imq) this.g.c.get(this.a);
        if (imqVar == this && imqVar.b == view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.g.c.remove(this.a);
            this.g.g(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
