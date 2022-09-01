package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior extends tp {
    public ViewPropertyAnimator a;
    private final LinkedHashSet b = new LinkedHashSet();
    private int c = 0;
    private int d = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    private final void t(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ksm(this));
    }

    private final void u(int i) {
        this.d = i;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ksn) it.next()).a();
        }
    }

    @Override // defpackage.tp
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.c = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // defpackage.tp
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    @Override // defpackage.tp
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.d == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            u(1);
            t(view, this.c, 175L, krt.c);
        } else if (i >= 0 || this.d == 2) {
        } else {
            ViewPropertyAnimator viewPropertyAnimator2 = this.a;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            u(2);
            t(view, 0, 225L, krt.d);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
