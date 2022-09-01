package com.google.android.libraries.inputmethod.accesspoint.widget;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccessPointsBar extends ViewGroup implements jdb, gqw {
    public gtg a;
    final float b;
    final float c;
    private final int f;
    private final int g;
    private final gth h;
    private int i;
    private jdr j;
    private gqc k;
    private int m;
    private int n;
    private Space o;
    private boolean p;
    private View q;
    private int r;
    private SoftKeyView s;
    private gqh t;
    private boolean u;
    private final boolean x;
    private boolean y;
    private int z;
    private final Rect d = new Rect();
    private final qo e = new qo();
    private float l = 1.0f;
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private int A = -1;

    public AccessPointsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, gtn.a, 0, 0);
            int i = 5;
            try {
                try {
                    int i2 = typedArray.getInt(1, 5);
                    i = jbt.c(context, R.string.f175300_resource_name_obfuscated_res_0x7f140c60, i2);
                    if (i > 8 || i < 3) {
                        i = i2;
                    }
                } catch (RuntimeException unused) {
                }
                this.f = i;
                this.g = typedArray.getResourceId(2, 0);
                this.b = typedArray.getDimension(4, 0.0f);
                this.c = typedArray.getDimension(0, 0.0f);
                this.x = typedArray.getBoolean(3, true);
                if (typedArray != null) {
                    typedArray.recycle();
                }
                gth gthVar = new gth(context, attributeSet);
                this.h = gthVar;
                this.a = gthVar.a(false);
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }

    private final float D(View view, int i, boolean z, float f) {
        if (view.getVisibility() != 0) {
            return 0.0f;
        }
        if (z) {
            return ((i - view.getRight()) + (this.n / 2.0f)) * (-f);
        }
        return (view.getLeft() + (this.n / 2.0f)) * f;
    }

    private final int E() {
        int i;
        int i2 = 0;
        for (gsr gsrVar : this.e.values()) {
            if (gsrVar.b.getVisibility() != 8) {
                i2++;
            }
        }
        return (i2 >= (this.u ? this.f + (-1) : this.f) || (i = this.A) < 0 || i > i2) ? i2 : i2 + 1;
    }

    private static int F(int i, int i2) {
        if (i2 > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(i2, i), 1073741824);
        }
        if (i2 == -2) {
            return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    private static int G(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    private final void H(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (z) {
            i -= i2;
        }
        int i4 = i + ((i2 - measuredWidth) / 2);
        int paddingTop = getPaddingTop() + ((i3 - measuredHeight) / 2);
        view.layout(i4, paddingTop, measuredWidth + i4, measuredHeight + paddingTop);
    }

    private static void I(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setVisibility(childAt.getId() == R.id.f51570_resource_name_obfuscated_res_0x7f0b0011 ? 8 : 0);
        }
        viewGroup.setTranslationX(0.0f);
    }

    private static void J(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setVisibility(childAt.getId() == R.id.f51570_resource_name_obfuscated_res_0x7f0b0011 ? 0 : 8);
        }
    }

    private final void K(List list) {
        guw.e(this, this.m, list, this.e, new gtl(this, 1));
    }

    private final void L(boolean z) {
        SoftKeyView softKeyView = this.s;
        int i = true != z ? 8 : 0;
        softKeyView.setVisibility(i);
        View view = this.q;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        if (jdrVar != this.j) {
            SoftKeyView softKeyView = this.s;
            if (softKeyView != null) {
                softKeyView.j(jdrVar);
            }
            this.a.a = jdrVar;
            this.j = jdrVar;
        }
    }

    public final void B(SoftKeyView softKeyView, gqh gqhVar) {
        boolean z = true;
        softKeyView.n(this.a.a(gqhVar, true, this.y && !gqa.a(getContext()).g));
        if (gqhVar.c("highlighted") != Boolean.TRUE) {
            z = false;
        }
        softKeyView.setActivated(z);
    }

    public final boolean C() {
        return getLayoutDirection() == 1;
    }

    @Override // defpackage.gqw
    public final void a(boolean z) {
        this.y = z;
        gtg a = this.h.a(z);
        if (a == this.a) {
            return;
        }
        a.b = this.k;
        a.a = this.j;
        a.c = this.l;
        this.a = a;
        View view = this.s;
        int indexOfChild = view != null ? indexOfChild(view) : -1;
        if (indexOfChild >= 0 && indexOfChild < getChildCount()) {
            removeViewAt(indexOfChild);
            SoftKeyView b = this.a.b(this);
            this.s = b;
            addView(b, indexOfChild);
            gqh gqhVar = this.t;
            if (gqhVar != null) {
                B(this.s, gqhVar);
                this.t.e(this.s);
            }
        }
        qo qoVar = this.e;
        int i = qoVar.d;
        if (i == 0) {
            return;
        }
        gqh[] gqhVarArr = new gqh[i];
        for (gsr gsrVar : qoVar.values()) {
            int indexOfChild2 = indexOfChild(gsrVar.b);
            if (indexOfChild2 >= this.i) {
                indexOfChild2 = -1;
            }
            if (indexOfChild2 >= 0 && indexOfChild2 < i) {
                gqhVarArr[indexOfChild2] = gsrVar.a;
            }
        }
        this.e.clear();
        int i2 = i - this.m;
        if (i2 > 0) {
            removeViews(0, i2);
        }
        K(Arrays.asList(gqhVarArr));
    }

    @Override // defpackage.gqw
    public final void b(boolean z) {
        SoftKeyView softKeyView;
        if (z == this.u || (softKeyView = this.s) == null) {
            return;
        }
        this.u = z;
        boolean z2 = false;
        if (z && softKeyView.b != null) {
            z2 = true;
        }
        L(z2);
    }

    @Override // defpackage.gqw
    public final void c(gqh gqhVar) {
        this.t = gqhVar;
        SoftKeyView softKeyView = this.s;
        if (softKeyView == null) {
            return;
        }
        if (gqhVar != null) {
            B(softKeyView, gqhVar);
            gqhVar.e(this.s);
        } else {
            softKeyView.n(null);
            this.u = false;
        }
        L(this.u);
    }

    @Override // defpackage.gqx
    public final void d() {
        SoftKeyView softKeyView;
        int i = this.e.d;
        for (int i2 = 0; i2 < i; i2++) {
            I(((gsr) this.e.f(i2)).b);
        }
        if (!this.u || (softKeyView = this.s) == null) {
            return;
        }
        I(softKeyView);
        View view = this.q;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.u) {
            return super.drawChild(canvas, view, j);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild < 0 || indexOfChild >= this.i) {
            return super.drawChild(canvas, view, j);
        }
        int save = canvas.save();
        canvas.clipRect(this.v);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // defpackage.gqx
    public final void e() {
        SoftKeyView softKeyView;
        int i = this.e.d;
        for (int i2 = 0; i2 < i; i2++) {
            J(((gsr) this.e.f(i2)).b);
        }
        if (!this.u || (softKeyView = this.s) == null) {
            return;
        }
        J(softKeyView);
        View view = this.q;
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // defpackage.gqx
    public final void f(float f) {
        SoftKeyView softKeyView;
        if (this.n <= 0) {
            return;
        }
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount() - this.m;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                childAt.setTranslationX(D(childAt, measuredWidth, z, f));
            }
        }
        if (!this.u || (softKeyView = this.s) == null) {
            return;
        }
        softKeyView.setTranslationX(D(softKeyView, measuredWidth, z, f));
    }

    @Override // defpackage.gqx
    public final void g() {
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    @Override // defpackage.gqx
    public final void h() {
        setPivotX(getLayoutDirection() == 1 ? getMeasuredWidth() : 0.0f);
    }

    @Override // defpackage.gqy
    public final int i() {
        return this.i;
    }

    @Override // defpackage.gqy
    public final int j(String str) {
        gsr gsrVar = (gsr) this.e.get(str);
        if (gsrVar == null) {
            return -1;
        }
        return indexOfChild(gsrVar.b);
    }

    @Override // defpackage.gqy
    public final int k(List list) {
        int size = list.size();
        int i = this.f;
        if (size > i) {
            SoftKeyView softKeyView = this.s;
            if (softKeyView != null && softKeyView.b != null) {
                i--;
            }
            size = i;
            this.i = size;
        } else {
            this.i = size;
        }
        K(list.subList(0, size));
        requestLayout();
        return this.i;
    }

    @Override // defpackage.gqy
    public final Rect l() {
        Rect rect = new Rect();
        jdy.i(this, null, rect);
        return rect;
    }

    @Override // defpackage.gqy
    public final View m(int i) {
        if (i < 0 || i >= this.i) {
            return null;
        }
        return getChildAt(i);
    }

    @Override // defpackage.gqy
    public final View n(String str) {
        gsr gsrVar = (gsr) this.e.get(str);
        if (gsrVar != null) {
            return gsrVar.b;
        }
        return null;
    }

    @Override // defpackage.gqy
    public final gqh o(int i) {
        throw null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        Space space = new Space(getContext());
        this.o = space;
        space.setId(R.id.f128940_resource_name_obfuscated_res_0x7f0b211a);
        this.o.setVisibility(8);
        this.o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.o);
        this.u = false;
        if (this.x && this.g != 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.g, (ViewGroup) this, false);
            this.q = inflate;
            inflate.measure(0, 0);
            this.q.setVisibility(8);
            this.r = this.q.getMeasuredWidth();
            addView(this.q);
        }
        SoftKeyView b = this.a.b(this);
        this.s = b;
        b.setVisibility(8);
        addView(this.s);
        this.m = getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int E = E();
        int i6 = this.n;
        int i7 = E * i6;
        if (this.p) {
            i7 += i6;
        }
        if (this.u) {
            i7 += i6 + this.r;
        }
        this.z = (getWidth() - i7) / 2;
        if (i7 <= 0) {
            return;
        }
        boolean C = C();
        if (C) {
            i5 = getWidth() - this.z;
        } else {
            i5 = this.z;
        }
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            boolean z3 = true;
            if (i8 >= this.i) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.A == i9) {
                    i5 = G(i5, this.n, C);
                } else {
                    z3 = z2;
                }
                H(childAt, i5, this.n, i4 - i2, C);
                i5 = G(i5, this.n, C);
                i9++;
                z2 = z3;
            }
            i8++;
        }
        if (this.u) {
            if (z2) {
                i5 = C ? i5 + this.n : i5 - this.n;
            }
            View view = this.q;
            if (view != null) {
                H(view, i5, this.r, i4 - i2, C);
                i5 = G(i5, this.r, C);
            }
            int i10 = i5;
            SoftKeyView softKeyView = this.s;
            if (softKeyView != null) {
                H(softKeyView, i10, this.n, i4 - i2, C);
            }
        }
        if (this.i <= 0) {
            this.v.setEmpty();
        } else if (!this.u) {
            this.v.set(0, 0, getWidth(), getHeight());
        } else {
            View view2 = this.q;
            if (view2 == null) {
                view2 = this.s;
            }
            if (view2 == null) {
                return;
            }
            if (getLayoutDirection() == 1) {
                this.v.set(view2.getRight(), 0, getWidth(), getHeight());
            } else {
                this.v.set(0, 0, view2.getLeft(), getHeight());
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int E;
        int i3;
        Space space;
        setMeasuredDimension(i, i2);
        int i4 = this.i;
        if (i4 == 0) {
            this.n = 0;
            return;
        }
        this.p = i4 % 2 == 1 && i4 < this.f && (space = this.o) != null && space.getVisibility() == 0;
        if (this.y) {
            E = this.f;
        } else {
            E = E();
            if (this.u) {
                E++;
            }
            if (this.p) {
                E++;
            }
        }
        this.n = ((getMeasuredWidth() - (this.u ? this.r : 0)) + (((int) (this.b + this.c)) / 2)) / (E + 1);
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.q) {
                i3 = this.r;
            } else {
                i3 = (childAt != this.o || this.p) ? this.n : 0;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            childAt.measure(F(i3, layoutParams.width), F(measuredHeight, layoutParams.height));
        }
    }

    @Override // defpackage.gqy
    public final gqi p(gqh gqhVar, int i) {
        gqh gqhVar2;
        gsr gsrVar;
        boolean v = v();
        if (i >= 0 && ((!v || i < this.i) && (v || i <= this.i))) {
            if (v) {
                View view = (SoftKeyView) getChildAt(this.i - 1);
                jdy.i(view, null, this.w);
                int i2 = this.e.d;
                int i3 = 0;
                while (true) {
                    if (i3 < i2) {
                        gsrVar = (gsr) this.e.f(i3);
                        if (gsrVar != null && gsrVar.b == view) {
                            break;
                        }
                        i3++;
                    } else {
                        gsrVar = null;
                        break;
                    }
                }
                gqhVar2 = gsrVar != null ? gsrVar.a : null;
                if (gqhVar2 != null) {
                    this.e.remove(gqhVar2.a);
                    gqhVar2.d();
                }
                removeView(view);
                this.i--;
            } else {
                gqhVar2 = null;
            }
            SoftKeyView b = this.a.b(this);
            addView(b, i);
            B(b, gqhVar);
            gqhVar.e(b);
            this.e.put(gqhVar.a, gsr.a(gqhVar, b));
            this.i++;
            if (gqhVar2 != null) {
                return new gqi(gqhVar2, new Point(this.w.centerX(), this.w.centerY()));
            }
        }
        return null;
    }

    @Override // defpackage.gqy
    public final grc q(Rect rect) {
        int i;
        if (rect.isEmpty()) {
            return null;
        }
        jdy.i(this, null, this.d);
        int centerX = rect.centerX();
        if (!this.d.contains(centerX, rect.centerY())) {
            return null;
        }
        if (this.i == 0) {
            return grc.a(0, new Point(this.d.centerX(), this.d.centerY()));
        }
        boolean C = C();
        if (C) {
            i = (getWidth() - this.z) - (this.n / 2);
        } else {
            i = this.z + (this.n / 2);
        }
        int i2 = this.d.left + i;
        int E = E();
        for (int i3 = 0; i3 < E; i3++) {
            int abs = Math.abs(centerX - i2);
            int i4 = this.n;
            if (abs <= i4 / 2) {
                return grc.a(i3, new Point(i2, this.d.centerY()));
            }
            i2 = G(i2, i4, C);
        }
        return null;
    }

    @Override // defpackage.gqy
    public final void r() {
        this.i = 0;
        for (gsr gsrVar : this.e.values()) {
            gsrVar.a.d();
        }
        this.e.clear();
        int childCount = getChildCount() - this.m;
        if (childCount > 0) {
            removeViews(0, childCount);
        }
    }

    @Override // defpackage.gqy
    public final void s(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        gsr gsrVar = (gsr) this.e.remove(str);
        if (gsrVar != null) {
            gsrVar.a.d();
            removeView(gsrVar.b);
        }
        this.i = this.e.d;
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        if (this.k != gqcVar) {
            SoftKeyView softKeyView = this.s;
            if (softKeyView != null) {
                softKeyView.i(gqcVar);
            }
            this.a.b = gqcVar;
            this.k = gqcVar;
        }
    }

    @Override // defpackage.gqy
    public final void u(int i) {
        if (i < 0 || i > this.i) {
            i = -1;
        }
        if (this.A == i) {
            return;
        }
        this.A = i;
        requestLayout();
    }

    @Override // defpackage.gqy
    public final boolean v() {
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0) {
                i++;
            }
        }
        if (this.u) {
            if (i >= this.f - 1) {
                return true;
            }
        } else if (i >= this.f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gqy
    public final boolean w(gqh gqhVar, int i) {
        if (i >= 0 && i < this.i) {
            gsr gsrVar = (gsr) this.e.get(gqhVar.a);
            int indexOfChild = gsrVar != null ? indexOfChild(gsrVar.b) : -1;
            if (gsrVar != null && indexOfChild != i) {
                SoftKeyView softKeyView = gsrVar.b;
                removeView(softKeyView);
                addView(softKeyView, i);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.grb
    public final gqu x() {
        return new gtj(getContext(), this, !this.y);
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        float f3 = this.l;
        float f4 = f * f2;
        this.l = f4;
        if (f3 != f4) {
            SoftKeyView softKeyView = this.s;
            if (softKeyView != null) {
                softKeyView.k(f4);
            }
            this.a.c = this.l;
        }
    }

    @Override // defpackage.grb
    public final gck z(imn imnVar, gqh gqhVar) {
        View n;
        if (!this.y || (n = n(gqhVar.a)) == null) {
            return null;
        }
        return new gck(imnVar, this, gqhVar, n, (Animator) null);
    }
}
