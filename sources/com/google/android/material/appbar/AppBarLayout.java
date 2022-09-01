package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements to {
    public boolean a;
    public int b;
    public abc c;
    public List d;
    public boolean e;
    public final List f;
    public Drawable g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private WeakReference o;
    private ValueAnimator p;
    private int[] q;
    private Behavior r;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class BaseBehavior extends ksh {
        private int a;
        private ValueAnimator b;
        public int c;
        public boolean d;
        private ksc f;
        private WeakReference g;

        public BaseBehavior() {
        }

        private final void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int e = appBarLayout.e() + appBarLayout.getPaddingTop();
            int w = w() - e;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                ksd ksdVar = (ksd) childAt.getLayoutParams();
                if (J(ksdVar.a, 32)) {
                    top -= ksdVar.topMargin;
                    bottom += ksdVar.bottomMargin;
                }
                int i2 = -w;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                ksd ksdVar2 = (ksd) childAt2.getLayoutParams();
                int i3 = ksdVar2.a;
                if ((i3 & 17) != 17) {
                    return;
                }
                int i4 = -childAt2.getTop();
                int i5 = -childAt2.getBottom();
                if (i == 0 && aad.ad(appBarLayout) && aad.ad(childAt2)) {
                    i4 -= appBarLayout.e();
                }
                if (J(i3, 2)) {
                    i5 += aad.g(childAt2);
                } else if (J(i3, 5)) {
                    int g = aad.g(childAt2) + i5;
                    if (w < g) {
                        i4 = g;
                    } else {
                        i5 = g;
                    }
                }
                if (J(i3, 32)) {
                    i4 += ksdVar2.topMargin;
                    i5 -= ksdVar2.bottomMargin;
                }
                if (w < (i5 + i4) / 2) {
                    i4 = i5;
                }
                K(coordinatorLayout, appBarLayout, ld.c(i4 + e, -appBarLayout.f(), 0));
            }
        }

        private final void I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View view;
            aad.J(coordinatorLayout, abi.b.a());
            aad.J(coordinatorLayout, abi.c.a());
            if (appBarLayout.f() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        view = null;
                        break;
                    }
                    view = coordinatorLayout.getChildAt(i);
                    if (((tr) view.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                        break;
                    }
                    i++;
                }
                View view2 = view;
                if (view2 == null) {
                    return;
                }
                int childCount2 = appBarLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    if (((ksd) appBarLayout.getChildAt(i2).getLayoutParams()).a != 0) {
                        if (aad.p(coordinatorLayout) == null) {
                            aad.M(coordinatorLayout, new krz(this));
                        }
                        boolean z2 = true;
                        if (w() != (-appBarLayout.f())) {
                            M(coordinatorLayout, appBarLayout, abi.b, false);
                            z = true;
                        }
                        if (w() != 0) {
                            if (view2.canScrollVertically(-1)) {
                                int i3 = -appBarLayout.b();
                                if (i3 != 0) {
                                    aad.am(coordinatorLayout, abi.c, new ksa(this, coordinatorLayout, appBarLayout, view2, i3));
                                }
                            } else {
                                M(coordinatorLayout, appBarLayout, abi.c, true);
                            }
                            this.d = z2;
                            return;
                        }
                        z2 = z;
                        this.d = z2;
                        return;
                    }
                }
            }
        }

        private static boolean J(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(w() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int w = w();
            if (w == i) {
                ValueAnimator valueAnimator = this.b;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.b.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.b;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.b = valueAnimator3;
                valueAnimator3.setInterpolator(krt.e);
                this.b.addUpdateListener(new kyq(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator2.cancel();
            }
            this.b.setDuration(Math.min(height, 600));
            this.b.setIntValues(w, i);
            this.b.start();
        }

        private static final View L(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof yu) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static final void M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, abi abiVar, boolean z) {
            aad.am(coordinatorLayout, abiVar, new ksb(appBarLayout, z));
        }

        private static final void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                }
                i3++;
            }
            if (view != null) {
                int i4 = ((ksd) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int g = aad.g(view);
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.e) {
                z2 = appBarLayout.l(L(coordinatorLayout));
            }
            boolean k = appBarLayout.k(z2);
            if (!z) {
                if (!k) {
                    return;
                }
                List c = coordinatorLayout.c(appBarLayout);
                int size = c.size();
                for (int i5 = 0; i5 < size; i5++) {
                    tp tpVar = ((tr) ((View) c.get(i5)).getLayoutParams()).a;
                    if (tpVar instanceof ScrollingViewBehavior) {
                        if (((ScrollingViewBehavior) tpVar).d == 0) {
                            return;
                        }
                    }
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        final void A(ksc kscVar, boolean z) {
            if (this.f == null || z) {
                this.f = kscVar;
            }
        }

        @Override // defpackage.ksh
        public final /* bridge */ /* synthetic */ boolean B(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference weakReference = this.g;
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                return view2 != null && view2.isShown() && !view2.canScrollVertically(-1);
            }
            return true;
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.f();
                    i2 = i4;
                    i3 = appBarLayout.b() + i4;
                } else {
                    i2 = -appBarLayout.f();
                    i3 = 0;
                }
                if (i2 != i3) {
                    iArr[1] = D(coordinatorLayout, appBarLayout, i, i2, i3);
                }
            }
            if (appBarLayout.e) {
                appBarLayout.k(appBarLayout.l(view));
            }
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            C(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.a == 0 || i == 1) {
                H(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.k(appBarLayout.l(view2));
                }
            }
            this.g = new WeakReference(view2);
        }

        @Override // defpackage.ksk, defpackage.tp
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.g(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            ksc kscVar = this.f;
            if (kscVar == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.f();
                        if (i3 != 0) {
                            K(coordinatorLayout, appBarLayout, i4);
                        } else {
                            E(coordinatorLayout, appBarLayout, i4);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            K(coordinatorLayout, appBarLayout, 0);
                        } else {
                            E(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (kscVar.a) {
                E(coordinatorLayout, appBarLayout, -appBarLayout.f());
            } else if (kscVar.b) {
                E(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(kscVar.e);
                int i5 = -childAt.getBottom();
                if (this.f.g) {
                    round = aad.g(childAt) + appBarLayout.e();
                } else {
                    round = Math.round(childAt.getHeight() * this.f.f);
                }
                E(coordinatorLayout, appBarLayout, i5 + round);
            }
            appBarLayout.b = 0;
            this.f = null;
            G(ld.c(F(), -appBarLayout.f(), 0));
            N(coordinatorLayout, appBarLayout, F(), 0, true);
            appBarLayout.h(F());
            I(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((tr) appBarLayout.getLayoutParams()).height == -2) {
                coordinatorLayout.o(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
                return true;
            }
            return false;
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = D(coordinatorLayout, appBarLayout, i3, -appBarLayout.c(), 0);
            }
            if (i3 == 0) {
                I(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ void p(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof ksc)) {
                this.f = null;
                return;
            }
            A((ksc) parcelable, true);
            Parcelable parcelable2 = this.f.d;
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ Parcelable q(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            ksc y = y(absSavedState, (AppBarLayout) view);
            return y == null ? absSavedState : y;
        }

        @Override // defpackage.tp
        /* renamed from: t */
        public boolean i(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            int i3 = i & 2;
            boolean z = false;
            if (i3 != 0 && (appBarLayout.e || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.b) != null) {
                valueAnimator.cancel();
            }
            this.g = null;
            this.a = i2;
            return z;
        }

        @Override // defpackage.ksh
        public final /* bridge */ /* synthetic */ int u(View view) {
            return -((AppBarLayout) view).c();
        }

        @Override // defpackage.ksh
        public final /* synthetic */ int v(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.ksh
        public final int w() {
            return F() + this.c;
        }

        @Override // defpackage.ksh
        public final /* bridge */ /* synthetic */ int x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int w = w();
            int i6 = 0;
            if (i2 == 0 || w < i2 || w > i3) {
                this.c = 0;
            } else {
                int c = ld.c(i, i2, i3);
                if (w != c) {
                    if (appBarLayout.a) {
                        int abs = Math.abs(c);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            ksd ksdVar = (ksd) childAt.getLayoutParams();
                            Interpolator interpolator = ksdVar.b;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = ksdVar.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ksdVar.topMargin + ksdVar.bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= aad.g(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (aad.ad(childAt)) {
                                    i5 -= appBarLayout.e();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = Integer.signum(c) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        }
                    }
                    i4 = c;
                    boolean G = G(i4);
                    int i9 = w - c;
                    this.c = c - i4;
                    int i10 = 1;
                    if (G) {
                        for (int i11 = 0; i11 < appBarLayout.getChildCount(); i11++) {
                            ksd ksdVar2 = (ksd) appBarLayout.getChildAt(i11).getLayoutParams();
                            jma jmaVar = ksdVar2.c;
                            if (jmaVar != null && (ksdVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                int F = F();
                                Rect rect = (Rect) jmaVar.b;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.e());
                                float abs2 = ((Rect) jmaVar.b).top - Math.abs(F);
                                if (abs2 <= 0.0f) {
                                    float d = 1.0f - ld.d(Math.abs(abs2 / ((Rect) jmaVar.b).height()));
                                    float height = (-abs2) - ((((Rect) jmaVar.b).height() * 0.3f) * (1.0f - (d * d)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect((Rect) jmaVar.a);
                                    ((Rect) jmaVar.a).offset(0, (int) (-height));
                                    aad.R(childAt2, (Rect) jmaVar.a);
                                } else {
                                    aad.R(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.a) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.h(F());
                    if (c < w) {
                        i10 = -1;
                    }
                    N(coordinatorLayout, appBarLayout, c, i10, false);
                    i6 = i9;
                }
            }
            I(coordinatorLayout, appBarLayout);
            return i6;
        }

        final ksc y(Parcelable parcelable, AppBarLayout appBarLayout) {
            int F = F();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + F;
                if (childAt.getTop() + F <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = acy.c;
                    }
                    ksc kscVar = new ksc(parcelable);
                    boolean z2 = F == 0;
                    kscVar.b = z2;
                    kscVar.a = !z2 && (-F) >= appBarLayout.f();
                    kscVar.e = i;
                    if (bottom == aad.g(childAt) + appBarLayout.e()) {
                        z = true;
                    }
                    kscVar.g = z;
                    kscVar.f = bottom / childAt.getHeight();
                    return kscVar;
                }
            }
            return null;
        }

        @Override // defpackage.ksh
        public final /* bridge */ /* synthetic */ void z(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            H(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.k(appBarLayout.l(L(coordinatorLayout)));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class ScrollingViewBehavior extends ksi {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout w(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.tp
        public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            tp tpVar = ((tr) view2.getLayoutParams()).a;
            if (tpVar instanceof BaseBehavior) {
                aad.F(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) tpVar).c) + this.c) - x(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (!appBarLayout.e) {
                    return false;
                }
                appBarLayout.k(appBarLayout.l(view));
                return false;
            }
            return false;
        }

        @Override // defpackage.ksk, defpackage.tp
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.g(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.tp
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout w = w(coordinatorLayout.b(view));
            if (w != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    w.i(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.tp
        public final boolean k(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.tp
        public final void l(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                aad.J(coordinatorLayout, abi.b.a());
                aad.J(coordinatorLayout, abi.c.a());
                aad.M(coordinatorLayout, null);
            }
        }

        @Override // defpackage.tp
        public final /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            abc abcVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View v = v(coordinatorLayout.b(view));
            if (v != null) {
                int size = View.MeasureSpec.getSize(i3);
                if (size > 0) {
                    if (aad.ad(v) && (abcVar = coordinatorLayout.e) != null) {
                        size += abcVar.d() + abcVar.a();
                    }
                } else {
                    size = coordinatorLayout.getHeight();
                }
                int u = u(v);
                int measuredHeight = v.getMeasuredHeight();
                view.setTranslationY(0.0f);
                coordinatorLayout.o(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + u) - measuredHeight, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
                return true;
            }
            return false;
        }

        @Override // defpackage.ksi
        public final float t(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int f = appBarLayout.f();
                int b = appBarLayout.b();
                tp tpVar = ((tr) appBarLayout.getLayoutParams()).a;
                int w = tpVar instanceof BaseBehavior ? ((BaseBehavior) tpVar).w() : 0;
                if ((b == 0 || f + w > b) && (i = f - b) != 0) {
                    return (w / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.ksi
        public final int u(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.ksi
        public final /* bridge */ /* synthetic */ View v(List list) {
            return w(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ksj.f);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    protected static final ksd m() {
        return new ksd();
    }

    protected static final ksd n(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new ksd((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new ksd(layoutParams);
        }
        return new ksd((LinearLayout.LayoutParams) layoutParams);
    }

    private final void p(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (true != z ? 2 : 1) | (true != z2 ? 0 : 4);
        if (true == z3) {
            i = 8;
        }
        this.b = i2 | i;
        requestLayout();
    }

    private final boolean q() {
        return this.g != null && e() > 0;
    }

    private final boolean r() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !aad.ad(childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.to
    public final tp a() {
        Behavior behavior = new Behavior();
        this.r = behavior;
        return behavior;
    }

    final int b() {
        int i;
        int g;
        int i2 = this.j;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                ksd ksdVar = (ksd) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ksdVar.a;
                if ((i4 & 5) == 5) {
                    int i5 = ksdVar.topMargin + ksdVar.bottomMargin;
                    if ((i4 & 8) != 0) {
                        g = aad.g(childAt);
                    } else if ((i4 & 2) != 0) {
                        g = measuredHeight - aad.g(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && aad.ad(childAt)) {
                            i = Math.min(i, measuredHeight - e());
                        }
                        i3 += i;
                    }
                    i = i5 + g;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - e());
                    }
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.j = max;
        return max;
    }

    final int c() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ksd ksdVar = (ksd) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ksdVar.topMargin + ksdVar.bottomMargin;
                int i4 = ksdVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= aad.g(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.k = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ksd;
    }

    public final int d() {
        int e = e();
        int g = aad.g(this);
        if (g == 0) {
            int childCount = getChildCount();
            g = childCount > 0 ? aad.g(getChildAt(childCount - 1)) : 0;
            if (g == 0) {
                return getHeight() / 3;
            }
        }
        return g + g + e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (q()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.h);
            this.g.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.g;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidateDrawable(drawable);
    }

    final int e() {
        abc abcVar = this.c;
        if (abcVar != null) {
            return abcVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ksd ksdVar = (ksd) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ksdVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ksdVar.topMargin + ksdVar.bottomMargin;
                if (i2 == 0) {
                    if (aad.ad(childAt)) {
                        i3 -= e();
                    }
                    i2 = 0;
                }
                if ((i4 & 2) != 0) {
                    i3 -= aad.g(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.i = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g */
    public final ksd mo29generateLayoutParams(AttributeSet attributeSet) {
        return new ksd(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m();
    }

    final void h(int i) {
        int height;
        this.h = i;
        if (!willNotDraw()) {
            aad.G(this);
        }
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                opu opuVar = (opu) this.d.get(i2);
                if (opuVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) opuVar.a;
                    collapsingToolbarLayout.e = i;
                    abc abcVar = collapsingToolbarLayout.f;
                    int d = abcVar != null ? abcVar.d() : 0;
                    int childCount = ((CollapsingToolbarLayout) opuVar.a).getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = ((CollapsingToolbarLayout) opuVar.a).getChildAt(i3);
                        ksf ksfVar = (ksf) childAt.getLayoutParams();
                        oze h = CollapsingToolbarLayout.h(childAt);
                        int i4 = ksfVar.a;
                        if (i4 == 1) {
                            h.h(ld.c(-i, 0, ((CollapsingToolbarLayout) opuVar.a).a(childAt)));
                        } else if (i4 == 2) {
                            h.h(Math.round((-i) * ksfVar.b));
                        }
                    }
                    ((CollapsingToolbarLayout) opuVar.a).f();
                    Object obj = opuVar.a;
                    if (((CollapsingToolbarLayout) obj).d != null && d > 0) {
                        aad.G((View) obj);
                    }
                    int height2 = (((CollapsingToolbarLayout) opuVar.a).getHeight() - aad.g((View) opuVar.a)) - d;
                    int b = ((CollapsingToolbarLayout) opuVar.a).b();
                    kux kuxVar = ((CollapsingToolbarLayout) opuVar.a).b;
                    float f = height2;
                    kuxVar.d = Math.min(1.0f, (height - b) / f);
                    kuxVar.e = kuxVar.a();
                    CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) opuVar.a;
                    kux kuxVar2 = collapsingToolbarLayout2.b;
                    kuxVar2.f = collapsingToolbarLayout2.e + height2;
                    float d2 = ld.d(Math.abs(i) / f);
                    if (d2 != kuxVar2.b) {
                        kuxVar2.b = d2;
                        kuxVar2.c();
                    }
                }
            }
        }
    }

    public final void i(boolean z, boolean z2) {
        p(z, z2, true);
    }

    public final void j() {
        setWillNotDraw(!q());
    }

    final boolean k(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
            if (this.e && (getBackground() instanceof kxe)) {
                kxe kxeVar = (kxe) getBackground();
                float dimension = getResources().getDimension(R.dimen.f33100_resource_name_obfuscated_res_0x7f07010e);
                float f = true != z ? dimension : 0.0f;
                if (true != z) {
                    dimension = 0.0f;
                }
                ValueAnimator valueAnimator = this.p;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
                this.p = ofFloat;
                ofFloat.setDuration(getResources().getInteger(R.integer.f131050_resource_name_obfuscated_res_0x7f0c0008));
                this.p.setInterpolator(krt.a);
                this.p.addUpdateListener(new fix(this, kxeVar, 3));
                this.p.start();
            }
            return true;
        }
        return false;
    }

    final boolean l(View view) {
        int i;
        View view2 = null;
        if (this.o == null && (i = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        laq.i(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int length = iArr.length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.l;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130970316 : R.attr.f17110_resource_name_obfuscated_res_0x7f0406cc;
        int i2 = -2130970317;
        if (z2) {
            if (this.m) {
                i2 = R.attr.f17120_resource_name_obfuscated_res_0x7f0406cd;
            }
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = i2;
        iArr[2] = true != z3 ? R.attr.f17080_resource_name_obfuscated_res_0x7f0406c9 : -2130970313;
        int i3 = -2130970312;
        if (z && this.m) {
            i3 = R.attr.f17070_resource_name_obfuscated_res_0x7f0406c8;
        }
        iArr[3] = i3;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            boolean r2 = defpackage.aad.ad(r1)
            if (r2 == 0) goto L23
            boolean r2 = r1.r()
            if (r2 == 0) goto L23
            int r2 = r1.e()
            int r3 = r1.getChildCount()
        L17:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L23
            android.view.View r4 = r1.getChildAt(r3)
            defpackage.aad.F(r4, r2)
            goto L17
        L23:
            r1.o()
            r2 = 0
            r1.a = r2
            int r3 = r1.getChildCount()
            r4 = 0
        L2e:
            r5 = 1
            if (r4 >= r3) goto L45
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            ksd r6 = (defpackage.ksd) r6
            android.view.animation.Interpolator r6 = r6.b
            if (r6 == 0) goto L42
            r1.a = r5
            goto L45
        L42:
            int r4 = r4 + 1
            goto L2e
        L45:
            android.graphics.drawable.Drawable r3 = r1.g
            if (r3 == 0) goto L54
            int r4 = r1.getWidth()
            int r6 = r1.e()
            r3.setBounds(r2, r2, r4, r6)
        L54:
            boolean r3 = r1.e
            if (r3 != 0) goto L77
            int r3 = r1.getChildCount()
            r4 = 0
        L5d:
            if (r4 >= r3) goto L78
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            ksd r6 = (defpackage.ksd) r6
            int r6 = r6.a
            r0 = r6 & 1
            if (r0 != r5) goto L74
            r6 = r6 & 10
            if (r6 == 0) goto L74
            goto L77
        L74:
            int r4 = r4 + 1
            goto L5d
        L77:
            r2 = 1
        L78:
            boolean r3 = r1.l
            if (r3 == r2) goto L81
            r1.l = r2
            r1.refreshDrawableState()
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && aad.ad(this) && r()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = ld.c(getMeasuredHeight() + e(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += e();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        laq.h(this, f);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.g;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f7890_resource_name_obfuscated_res_0x7f040251);
    }

    private final void o() {
        Behavior behavior = this.r;
        ksc kscVar = null;
        if (behavior != null && this.i != -1 && this.b == 0) {
            kscVar = behavior.y(acy.c, this);
        }
        this.i = -1;
        this.j = -1;
        this.k = -1;
        if (kscVar != null) {
            this.r.A(kscVar, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams mo28generateDefaultLayoutParams() {
        return m();
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(kzb.a(context, attributeSet, i, R.style.f203920_resource_name_obfuscated_res_0x7f150840), attributeSet, i);
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.b = 0;
        this.f = new ArrayList();
        Context context2 = getContext();
        boolean z = true;
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = ksl.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = ksl.a;
        Context context3 = getContext();
        TypedArray a = kve.a(context3, attributeSet, ksl.a, i, R.style.f203920_resource_name_obfuscated_res_0x7f150840, new int[0]);
        try {
            if (a.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, a.getResourceId(0, 0)));
            }
            a.recycle();
            TypedArray a2 = kve.a(context2, attributeSet, ksj.a, i, R.style.f203920_resource_name_obfuscated_res_0x7f150840, new int[0]);
            aad.O(this, a2.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                kxe kxeVar = new kxe();
                kxeVar.l(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                kxeVar.j(context2);
                aad.O(this, kxeVar);
            }
            if (a2.hasValue(4)) {
                p(a2.getBoolean(4, false), false, false);
            }
            if (a2.hasValue(3)) {
                int dimensionPixelSize = a2.getDimensionPixelSize(3, 0);
                int integer = getResources().getInteger(R.integer.f131050_resource_name_obfuscated_res_0x7f0c0008);
                StateListAnimator stateListAnimator = new StateListAnimator();
                long j = integer;
                stateListAnimator.addState(new int[]{16842910, R.attr.f17110_resource_name_obfuscated_res_0x7f0406cc, -2130970317}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
                stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(this, "elevation", dimensionPixelSize).setDuration(j));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
                setStateListAnimator(stateListAnimator);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (a2.hasValue(2)) {
                    setKeyboardNavigationCluster(a2.getBoolean(2, false));
                }
                if (a2.hasValue(1)) {
                    setTouchscreenBlocksFocus(a2.getBoolean(1, false));
                }
            }
            this.e = a2.getBoolean(5, false);
            this.n = a2.getResourceId(6, -1);
            Drawable drawable = a2.getDrawable(7);
            Drawable drawable2 = this.g;
            if (drawable2 != drawable) {
                Drawable drawable3 = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                drawable3 = drawable != null ? drawable.mutate() : drawable3;
                this.g = drawable3;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.g.setState(getDrawableState());
                    }
                    wg.b(this.g, aad.f(this));
                    this.g.setVisible(getVisibility() != 0 ? false : z, false);
                    this.g.setCallback(this);
                }
                j();
                aad.G(this);
            }
            a2.recycle();
            aad.V(this, new kry(this, 0));
        } catch (Throwable th) {
            a.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams mo30generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }
}
