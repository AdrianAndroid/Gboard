package com.google.android.libraries.inputmethod.accesspoint.widget;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccessPointsPanel extends ViewGroup implements jdb, gqz {
    public final gtg a;
    public boolean b;
    private final int e;
    private final boolean f;
    private jdr g;
    private gqc h;
    private int j;
    private int k;
    private final List c = new ArrayList();
    private final qo d = new qo();
    private float i = 1.0f;
    private int[] l = gvw.b;

    public AccessPointsPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Throwable th;
        TypedArray typedArray;
        this.a = new gtg(context, attributeSet);
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, gtn.c, 0, 0);
            try {
                this.e = typedArray.getInt(0, 4);
                this.f = typedArray.getBoolean(1, false);
                if (typedArray == null) {
                    return;
                }
                typedArray.recycle();
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }

    private static int f(int i, int i2) {
        if (i2 > 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        if (i2 == -2) {
            return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    private final int g(int i) {
        double d = i;
        double d2 = this.e;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (int) Math.ceil(d / d2);
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        if (jdrVar != this.g) {
            this.g = jdrVar;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((SoftKeyView) getChildAt(i)).j(jdrVar);
            }
            this.a.a = jdrVar;
        }
    }

    @Override // defpackage.gra
    public final void a(float f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View findViewById = getChildAt(i).findViewById(R.id.f51600_resource_name_obfuscated_res_0x7f0b0014);
            findViewById.setScaleX(f);
            findViewById.setScaleY(f);
        }
    }

    @Override // defpackage.gqy
    /* renamed from: b */
    public final SoftKeyView n(String str) {
        gsr gsrVar = (gsr) this.d.get(str);
        if (gsrVar != null) {
            return gsrVar.b;
        }
        return null;
    }

    public final void c(SoftKeyView softKeyView, gqh gqhVar) {
        boolean z = true;
        softKeyView.n(this.a.a(gqhVar, false, !gqa.a(getContext()).g));
        if (gqhVar.c("highlighted") != Boolean.TRUE) {
            z = false;
        }
        softKeyView.setActivated(z);
    }

    public final void d() {
        guw.e(this, 0, this.c, this.d, new gtl(this, 0));
        requestLayout();
    }

    public final boolean e() {
        return getLayoutDirection() == 1;
    }

    @Override // defpackage.gqy
    public final int i() {
        return this.c.size();
    }

    @Override // defpackage.gqy
    public final int j(String str) {
        for (int i = 0; i < this.c.size(); i++) {
            if (((gqh) this.c.get(i)).a.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.gqy
    public final int k(List list) {
        if (this.c.equals(list)) {
            return this.c.size();
        }
        this.c.clear();
        if (list != null) {
            this.c.addAll(list);
        }
        if (isShown()) {
            d();
        }
        return this.c.size();
    }

    @Override // defpackage.gqy
    public final Rect l() {
        Rect rect = new Rect();
        jdy.i(this, null, rect);
        return rect;
    }

    @Override // defpackage.gqy
    public final View m(int i) {
        if (i < 0 || i >= i()) {
            return null;
        }
        return getChildAt(i);
    }

    @Override // defpackage.gqy
    public final gqh o(int i) {
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return (gqh) this.c.get(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        removeAllViews();
        addOnLayoutChangeListener(new gtk(this, new fqa(this, 16), 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        double d = childCount;
        double d2 = this.k;
        Double.isNaN(d);
        Double.isNaN(d2);
        int ceil = (int) Math.ceil(d / d2);
        boolean e = e();
        int i7 = this.k;
        int i8 = childCount / i7;
        int i9 = childCount % i7;
        int paddingTop = getPaddingTop();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.k;
            if (i10 >= i12) {
                return;
            }
            if (this.f) {
                i5 = i10 < i12 + (-1) ? this.e : childCount - (this.e * i10);
                i6 = e ? getPaddingLeft() + ((this.e - 1) * this.j) : getPaddingLeft();
            } else {
                i5 = (i9 > i10 ? 1 : 0) + i8;
                int paddingLeft = getPaddingLeft();
                int i13 = this.j;
                i6 = paddingLeft + (((ceil - i5) * i13) / 2) + (e ? (i5 - 1) * i13 : 0);
            }
            int i14 = 0;
            while (i14 < i5) {
                View view = null;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    int i15 = i11 + 1;
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() != 8) {
                        view = childAt;
                        i11 = i15;
                        break;
                    }
                    view = childAt;
                    i11 = i15;
                }
                if (view != null) {
                    int i16 = this.j;
                    int i17 = this.l[i10];
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int i18 = ((i16 - measuredWidth) / 2) + i6;
                    int i19 = (this.f ? 0 : (i17 - measuredHeight) / 2) + paddingTop;
                    int i20 = childCount;
                    view.layout(i18, i19, i18 + measuredWidth, i19 + measuredHeight);
                    i6 = e() ? i6 - this.j : i6 + this.j;
                    i14++;
                    childCount = i20;
                }
            }
            paddingTop += this.l[i10];
            i10++;
            childCount = childCount;
        }
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (isShown()) {
            d();
        }
    }

    @Override // defpackage.gqy
    public final gqi p(gqh gqhVar, int i) {
        if (i >= 0 && i <= i()) {
            this.c.add(i, gqhVar);
            if (isShown()) {
                SoftKeyView b = this.a.b(this);
                this.d.put(gqhVar.a, gsr.a(gqhVar, b));
                addView(b, i);
                c(b, gqhVar);
                gqhVar.e(b);
            }
        }
        return null;
    }

    @Override // defpackage.gqy
    public final /* synthetic */ grc q(Rect rect) {
        throw null;
    }

    @Override // defpackage.gqy
    public final void r() {
        for (gsr gsrVar : this.d.values()) {
            gsrVar.a.d();
        }
        this.d.clear();
        this.c.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((SoftKeyView) getChildAt(i)).n(null);
        }
        removeAllViews();
    }

    @Override // defpackage.gqy
    public final void s(String str) {
        int j;
        gsr gsrVar;
        if (!TextUtils.isEmpty(str) && (j = j(str)) >= 0) {
            this.c.remove(j);
            if (!isShown() || (gsrVar = (gsr) this.d.remove(str)) == null) {
                return;
            }
            gsrVar.a.d();
            removeView(gsrVar.b);
        }
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        if (this.h != gqcVar) {
            this.h = gqcVar;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((SoftKeyView) getChildAt(i)).i(gqcVar);
            }
            this.a.b = gqcVar;
        }
    }

    @Override // defpackage.gqy
    public final void u(int i) {
    }

    @Override // defpackage.gqy
    public final boolean v() {
        throw null;
    }

    @Override // defpackage.gqy
    public final boolean w(gqh gqhVar, int i) {
        int indexOf;
        gsr gsrVar;
        if (i < 0 || i >= i() || (indexOf = this.c.indexOf(gqhVar)) < 0 || indexOf == i) {
            return false;
        }
        this.c.remove(indexOf);
        this.c.add(i, gqhVar);
        if (!isShown() || (gsrVar = (gsr) this.d.get(gqhVar.a)) == null) {
            return true;
        }
        SoftKeyView softKeyView = gsrVar.b;
        removeView(softKeyView);
        addView(softKeyView, i);
        return true;
    }

    @Override // defpackage.grb
    public final gqu x() {
        if (this.f) {
            return new gtm(this);
        }
        return null;
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        float f3 = this.i;
        float f4 = f * f2;
        this.i = f4;
        if (f3 != f4) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((SoftKeyView) getChildAt(i)).k(this.i);
            }
            this.a.c = this.i;
        }
    }

    @Override // defpackage.grb
    public final gck z(imn imnVar, gqh gqhVar) {
        SoftKeyView n = n(gqhVar.a);
        if (n == null) {
            return null;
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(n.getContext(), R.animator.f430_resource_name_obfuscated_res_0x7f02000a);
        objectAnimator.setProperty(new gss(Float.class));
        objectAnimator.addListener(new gst());
        objectAnimator.setTarget(n);
        return new gck(imnVar, this, gqhVar, n, objectAnimator);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = 0;
        if (!this.f) {
            setMeasuredDimension(i, i2);
            int childCount = getChildCount();
            if (childCount == 0) {
                this.k = 0;
                this.j = 0;
                this.l = gvw.b;
                return;
            }
            int g = g(childCount);
            this.k = g;
            this.l = new int[g];
            double d = childCount;
            double d2 = g;
            Double.isNaN(d);
            Double.isNaN(d2);
            this.j = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / ((int) Math.ceil(d / d2));
            int measuredHeight = ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / this.k;
            Arrays.fill(this.l, measuredHeight);
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    childAt.measure(f(this.j, layoutParams.width), f(measuredHeight, layoutParams.height));
                } else {
                    childAt.measure(f(this.j, -2), f(measuredHeight, -2));
                }
                i3++;
            }
            return;
        }
        int childCount2 = getChildCount();
        if (childCount2 == 0) {
            this.j = 0;
            this.k = 0;
            this.l = gvw.b;
            setMeasuredDimension(i, i2);
            return;
        }
        int g2 = g(childCount2);
        this.k = g2;
        int[] iArr = new int[g2];
        this.l = iArr;
        Arrays.fill(iArr, 0);
        this.j = ((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()) / this.e;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 != null) {
                    childAt2.measure(f(this.j, layoutParams2.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                } else {
                    childAt2.measure(f(this.j, -2), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int[] iArr2 = this.l;
                if (measuredHeight2 > iArr2[i4]) {
                    iArr2[i4] = measuredHeight2;
                }
                i5++;
                if (i5 == this.e) {
                    i4++;
                    i5 = 0;
                }
            }
        }
        int[] iArr3 = this.l;
        int length = iArr3.length;
        int i7 = 0;
        while (i3 < length) {
            i7 += iArr3[i3];
            i3++;
        }
        if (i7 <= View.MeasureSpec.getSize(i2)) {
            setMeasuredDimension(i, i2);
        } else {
            setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
        }
    }
}
