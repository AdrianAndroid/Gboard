package com.google.android.apps.inputmethod.libs.expression.header;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.inputmethod.latin.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StartElementScrollBehavior extends tp {
    private static final ltg m = ltg.j("com/google/android/apps/inputmethod/libs/expression/header/StartElementScrollBehavior");
    public final Context a;
    public final int b;
    public int c;
    public View e;
    public View f;
    public View g;
    public View h;
    public RecyclerView i;
    public int j;
    public ValueAnimator l;
    private int n;
    private int o;
    private MiddleElementScrollBehavior p;
    private int q;
    public int d = 0;
    public boolean k = false;

    public StartElementScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        this.b = jbt.e(context, R.attr.f3670_resource_name_obfuscated_res_0x7f04009f);
    }

    private final void A(int i, int[] iArr) {
        View view = this.g;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        x(this.g, this.n, this.o, i, iArr);
    }

    private final void B(boolean z) {
        MiddleElementScrollBehavior middleElementScrollBehavior = this.p;
        if (middleElementScrollBehavior != null) {
            middleElementScrollBehavior.a = z;
        }
    }

    private final boolean C() {
        RecyclerView recyclerView = this.i;
        if (recyclerView == null) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.m;
        int i = 1;
        if (linearLayoutManager != null) {
            return linearLayoutManager.L() > 0;
        }
        if (this.j != 1) {
            i = -1;
        }
        return recyclerView.canScrollHorizontally(i);
    }

    private static void x(View view, int i, int i2, int i3, int[] iArr) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int c = i3 > 0 ? ld.c(i3, 0, layoutParams.width - i) : ld.c(i3, layoutParams.width - i2, 0);
        if (c == 0) {
            return;
        }
        layoutParams.width -= c;
        iArr[0] = iArr[0] + c;
        if (view == null) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }

    private final void y(int i, int[] iArr) {
        View view = this.f;
        if (view == null) {
            return;
        }
        x(view, this.c, this.b, i, iArr);
    }

    private final void z(LinearLayout linearLayout, int i, int[] iArr) {
        int c;
        if (i > 0) {
            c = ld.c(i, 0, linearLayout.getMeasuredWidth() - this.d);
        } else {
            c = ld.c(i, -this.d, 0);
        }
        if (c != 0) {
            v(linearLayout, -c);
            this.d += c;
            iArr[0] = iArr[0] + c;
        }
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        LinearLayout linearLayout = (LinearLayout) view;
        if (C()) {
            return;
        }
        if (this.j == 1) {
            i = -i;
        }
        if (i == 0) {
            return;
        }
        if (i > 0) {
            y(i, iArr);
            A(i - iArr[0], iArr);
            z(linearLayout, i - iArr[0], iArr);
        } else {
            z(linearLayout, i, iArr);
            A(i - iArr[0], iArr);
            y(i - iArr[0], iArr);
        }
        u(-iArr[0]);
        iArr[0] = this.j == 1 ? -iArr[0] : iArr[0];
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        View view3;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout = (LinearLayout) view;
        B(false);
        if ((this.q == 0 || i == 1) && (view3 = this.g) != null && view3.getVisibility() == 0 && (layoutParams = this.g.getLayoutParams()) != null && layoutParams.width > this.n && layoutParams.width < this.o) {
            ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(this.a, R.animator.f450_resource_name_obfuscated_res_0x7f02000c);
            int[] iArr = new int[2];
            iArr[0] = layoutParams.width;
            int i2 = layoutParams.width;
            int i3 = this.o;
            if (i2 <= i3 / 2) {
                i3 = this.n;
            }
            iArr[1] = i3;
            valueAnimator.setIntValues(iArr);
            valueAnimator.addUpdateListener(new cpi(this, layoutParams, 0));
            t(valueAnimator);
        }
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        LinearLayout linearLayout = (LinearLayout) view;
        this.j = i;
        if (this.h == null) {
            this.h = linearLayout;
            this.g = linearLayout.findViewById(R.id.f59420_resource_name_obfuscated_res_0x7f0b04f1);
        }
        if (this.p == null) {
            Iterator it = coordinatorLayout.c(linearLayout).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View view3 = (View) it.next();
                if (view3 instanceof RecyclerView) {
                    this.i = (RecyclerView) view3;
                    tr trVar = (tr) view3.getLayoutParams();
                    this.p = trVar == null ? null : (MiddleElementScrollBehavior) trVar.a;
                }
            }
        }
        if (this.c == 0 && (view2 = this.e) != null) {
            this.c = view2.getMeasuredWidth();
        }
        if (this.k && this.d == 0 && this.i != null && C()) {
            this.d = linearLayout.getMeasuredWidth();
        }
        coordinatorLayout.l(linearLayout, i);
        v(linearLayout, -this.d);
        MiddleElementScrollBehavior middleElementScrollBehavior = this.p;
        if (middleElementScrollBehavior != null) {
            middleElementScrollBehavior.b = this.d;
            return true;
        }
        return true;
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        LinearLayout linearLayout = (LinearLayout) view;
        synchronized (this) {
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.l = null;
            }
        }
        this.q = i2;
        boolean z = true;
        if (1 != (i & 1)) {
            z = false;
        }
        B(z);
        return z;
    }

    public final void t(ValueAnimator valueAnimator) {
        synchronized (this) {
            if (this.l != null) {
                ((ltd) ((ltd) m.d()).k("com/google/android/apps/inputmethod/libs/expression/header/StartElementScrollBehavior", "beginAnimation", 301, "StartElementScrollBehavior.java")).t("Start elements cannot handle multiple animations at once.");
                return;
            }
            this.l = valueAnimator;
            valueAnimator.addListener(new cpj(this));
            valueAnimator.start();
        }
    }

    public final void u(int i) {
        MiddleElementScrollBehavior middleElementScrollBehavior = this.p;
        if (middleElementScrollBehavior != null) {
            if (this.j == 1) {
                i = -i;
            }
            middleElementScrollBehavior.t(i);
        }
    }

    public final void v(View view, int i) {
        if (this.j == 1) {
            i = -i;
        }
        aad.E(view, i);
    }

    public final void w(int i, int i2) {
        this.n = i;
        this.o = i2;
    }
}
