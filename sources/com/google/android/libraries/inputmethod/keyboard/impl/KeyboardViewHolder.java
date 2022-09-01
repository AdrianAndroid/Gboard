package com.google.android.libraries.inputmethod.keyboard.impl;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KeyboardViewHolder extends jdm {
    private static final ltg l = ltg.j("com/google/android/libraries/inputmethod/keyboard/impl/KeyboardViewHolder");
    public View a;
    public htx b;
    public Runnable c;
    public hte d;
    public htw e;
    public View g;
    public View j;
    public int k;
    private String m;
    private ibz n;
    private ice o;
    private int p;
    private Matrix r;
    private final Matrix q = new Matrix();
    public int f = 0;
    public int h = 8;
    public int i = 0;

    public KeyboardViewHolder(Context context) {
        super(context);
    }

    public static void d(ibz ibzVar, ice iceVar, View view, htw htwVar) {
        if (view == null || view.isShown()) {
            htwVar.d(ibzVar, iceVar, view);
        }
    }

    public static void e(ibz ibzVar, ice iceVar, View view, htw htwVar) {
        if (ibzVar == null || iceVar == null || view == null) {
            return;
        }
        htwVar.c(ibzVar, iceVar, view);
    }

    private final int l() {
        int measuredWidth;
        if (this.k > 0) {
            View view = this.a;
            if (!(view instanceof SoftKeyboardView) || (measuredWidth = view.getMeasuredWidth()) <= 0) {
                return 0;
            }
            Context context = getContext();
            int g = jbt.g(context, R.attr.f6630_resource_name_obfuscated_res_0x7f0401cc);
            int g2 = jbt.g(context, R.attr.f4940_resource_name_obfuscated_res_0x7f040120);
            return (int) (((measuredWidth - gvv.a(context, this.k)) - (g + g)) - (g2 + g2));
        }
        return 0;
    }

    private final void m() {
        ibz ibzVar;
        ice iceVar;
        View view = this.a;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != this) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.a);
                }
                addView(this.a);
            }
            htw htwVar = this.e;
            if (htwVar == null || (ibzVar = this.n) == null || (iceVar = this.o) == null) {
                return;
            }
            htwVar.a(ibzVar, iceVar, this.a);
        }
    }

    private final void n() {
        Runnable runnable = this.c;
        if (runnable != null) {
            kki.k(runnable);
            this.c.run();
            this.c = null;
        }
        htx htxVar = this.b;
        if (htxVar != null) {
            htxVar.a();
            this.b = null;
        }
    }

    private final void o(int i) {
        if (i > 0) {
            View view = this.a;
            if (!(view instanceof SoftKeyboardView)) {
                return;
            }
            for (jdd jddVar : ((SoftKeyboardView) view).k) {
                jddVar.a(i);
            }
        }
    }

    private static boolean p(View view) {
        return view != null && view.isShown();
    }

    public final View a(int i) {
        if (i == 0) {
            return null;
        }
        View findViewById = getRootView().findViewById(i);
        if (findViewById == null) {
            ((ltd) ((ltd) l.b()).k("com/google/android/libraries/inputmethod/keyboard/impl/KeyboardViewHolder", "getViewById", 324, "KeyboardViewHolder.java")).u("no view find by view id %d in the root view.", i);
        }
        return findViewById;
    }

    public final Runnable b(ibz ibzVar, ice iceVar, View view, htw htwVar) {
        return new hpm(this, ibzVar, iceVar, view, htwVar, 2);
    }

    public final void c(ibz ibzVar, ice iceVar, View view, htw htwVar) {
        if (htwVar != null && p(view) && ibzVar != null && iceVar != null) {
            htwVar.e(ibzVar, iceVar, false);
        }
        if (view == this.a || view == null || view.getParent() != this) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view = this.a;
        if (view == null || !view.isShown()) {
            return true;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - this.a.getLeft(), getScrollY() - this.a.getTop());
        Matrix matrix = this.a.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.r == null) {
                Matrix matrix2 = new Matrix();
                this.r = matrix2;
                matrix.invert(matrix2);
            }
            obtain.transform(this.r);
        }
        boolean dispatchTouchEvent = this.a.dispatchTouchEvent(obtain);
        obtain.recycle();
        return dispatchTouchEvent;
    }

    public final void f(ibz ibzVar, ice iceVar, View view, htw htwVar, boolean z) {
        if (view != null) {
            if (z) {
                gxi gxiVar = new gxi(this, view, 18);
                this.c = gxiVar;
                kki.j(gxiVar);
            } else {
                removeView(view);
            }
            if (htwVar == null || ibzVar == null || iceVar == null) {
                return;
            }
            htwVar.b(ibzVar, iceVar, view);
        }
    }

    public final void g(ibz ibzVar, ice iceVar, View view, String str, int i) {
        hte hteVar;
        ibz ibzVar2;
        ice iceVar2;
        ice iceVar3;
        ibz ibzVar3 = this.n;
        ice iceVar4 = this.o;
        View view2 = this.a;
        String str2 = this.m;
        int i2 = this.p;
        this.n = ibzVar;
        this.o = iceVar;
        this.a = view;
        this.m = str;
        this.p = i;
        o(l());
        i();
        n();
        if (view2 == view) {
            if (this.e == null) {
                return;
            }
            View view3 = this.a;
            if (view3 != null && (ibzVar3 != this.n || iceVar4 != this.o)) {
                if (ibzVar3 != null && iceVar4 != null) {
                    if (p(view3)) {
                        this.e.e(ibzVar3, iceVar4, false);
                    }
                    this.e.b(ibzVar3, iceVar4, this.a);
                }
                ibz ibzVar4 = this.n;
                if (ibzVar4 != null && (iceVar3 = this.o) != null) {
                    this.e.a(ibzVar4, iceVar3, this.a);
                }
            } else if (p(view3) && (ibzVar2 = this.n) != null && (iceVar2 = this.o) != null) {
                this.e.e(ibzVar2, iceVar2, true);
            }
            this.b = new htv(this, this.n, this.o, this.a, this.e);
            return;
        }
        Matrix matrix = this.q;
        if ((view2 instanceof SoftKeyboardView) && (view instanceof SoftKeyboardView)) {
            SoftKeyboardView softKeyboardView = (SoftKeyboardView) view2;
            MotionEvent motionEvent = softKeyboardView.q;
            MotionEvent motionEvent2 = null;
            jdy.c(matrix, view2, null);
            if (motionEvent != null) {
                motionEvent2 = MotionEvent.obtain(motionEvent);
                motionEvent2.transform(matrix);
            }
            jdc jdcVar = ((SoftKeyboardView) view).e;
            if (jdcVar != null) {
                jdcVar.f(motionEvent2);
            }
            softKeyboardView.h();
        }
        if (!jam.o() || view == null || (hteVar = this.d) == null || !hteVar.d(view2, view, str2, i2, str, i)) {
            c(ibzVar3, iceVar4, view2, this.e);
            f(ibzVar3, iceVar4, view2, this.e, true);
            m();
            htw htwVar = this.e;
            if (htwVar == null) {
                return;
            }
            this.b = new htv(this, ibzVar, iceVar, view, htwVar);
            return;
        }
        m();
        if (view2 != null) {
            view2.bringToFront();
        }
        this.b = new hua(this, ibzVar3, iceVar4, view2, ibzVar, iceVar, view, str2, i2, str, i, this.d, this.e);
    }

    public final void h(int i) {
        View view = this.g;
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o(l());
        if (z) {
            this.r = null;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        View view;
        super.onWindowVisibilityChanged(i);
        ibz ibzVar = this.n;
        ice iceVar = this.o;
        htw htwVar = this.e;
        if (htwVar == null || this.b != null) {
            return;
        }
        if (i == 0) {
            if (ibzVar == null && iceVar == null && this.a == null) {
                return;
            }
            d(ibzVar, iceVar, this.a, htwVar);
        } else if (getVisibility() != 0 || (view = this.a) == null || view.getVisibility() != 0 || ibzVar == null || iceVar == null) {
        } else {
            htwVar.e(ibzVar, iceVar, false);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        g(this.n, this.o, null, this.m, this.p);
        n();
        super.removeAllViews();
        measure(0, 0);
        this.a = null;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        int visibility = getVisibility();
        ibz ibzVar = this.n;
        ice iceVar = this.o;
        View view = this.a;
        htw htwVar = this.e;
        boolean p = (ibzVar == null || iceVar == null || view == null) ? false : p(this);
        super.setVisibility(i);
        h(getVisibility() == 0 ? 8 : 0);
        if (htwVar == null || this.b != null) {
            return;
        }
        if (i != 0) {
            if (!p) {
                return;
            }
            htwVar.e(ibzVar, iceVar, false);
        } else if (visibility == 0 || !isShown()) {
        } else {
            this.b = new htv(this, ibzVar, iceVar, view, htwVar);
        }
    }

    public KeyboardViewHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void i() {
        Drawable background;
        if (this.j == null) {
            return;
        }
        View view = this.a;
        Drawable drawable = null;
        Drawable.ConstantState constantState = (view == null || (background = view.getBackground()) == null) ? null : background.mutate().getConstantState();
        View view2 = this.j;
        if (constantState != null) {
            drawable = constantState.newDrawable();
        }
        view2.setBackground(drawable);
    }

    public KeyboardViewHolder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
