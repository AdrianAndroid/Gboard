package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: htm  reason: default package */
/* loaded from: classes.dex */
public final class htm implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ ValueAnimator a;
    final /* synthetic */ Animator b;

    public htm(ValueAnimator valueAnimator, Animator animator) {
        this.a = valueAnimator;
        this.b = animator;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        this.a.cancel();
        this.b.cancel();
    }
}
