package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private int A;
    private boolean B;
    private opu C;
    public int a;
    final kux b;
    final ktw c;
    Drawable d;
    int e;
    public abc f;
    private boolean g;
    private int h;
    private ViewGroup i;
    private View j;
    private View k;
    private int l;
    private int m;
    private int n;
    private final Rect o;
    private boolean p;
    private boolean q;
    private Drawable r;
    private int s;
    private boolean t;
    private ValueAnimator u;
    private long v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    protected static final ksf g() {
        return new ksf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static oze h(View view) {
        oze ozeVar = (oze) view.getTag(R.id.f130460_resource_name_obfuscated_res_0x7f0b21e8);
        if (ozeVar == null) {
            oze ozeVar2 = new oze(view);
            view.setTag(R.id.f130460_resource_name_obfuscated_res_0x7f0b21e8, ozeVar2);
            return ozeVar2;
        }
        return ozeVar;
    }

    private static int i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private final void j(AppBarLayout appBarLayout) {
        if (p()) {
            appBarLayout.e = false;
        }
    }

    private final void k() {
        View view;
        if (!this.g) {
            return;
        }
        ViewGroup viewGroup = null;
        this.i = null;
        this.j = null;
        int i = this.h;
        if (i != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
            this.i = viewGroup2;
            if (viewGroup2 != null) {
                ViewParent parent = viewGroup2.getParent();
                View view2 = viewGroup2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                    parent = parent.getParent();
                    view2 = view2;
                }
                this.j = view2;
            }
        }
        if (this.i == null) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
            }
            this.i = viewGroup;
        }
        if (!this.p && (view = this.k) != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.k);
            }
        }
        if (this.p && this.i != null) {
            if (this.k == null) {
                this.k = new View(getContext());
            }
            if (this.k.getParent() == null) {
                this.i.addView(this.k, -1, -1);
            }
        }
        this.g = false;
    }

    private final void l(Drawable drawable, int i, int i2) {
        m(drawable, this.i, i, i2);
    }

    private final void m(Drawable drawable, View view, int i, int i2) {
        if (p() && view != null && this.p) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private final void n(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int i5;
        int i6;
        int i7;
        if (!this.p || (view = this.k) == null) {
            return;
        }
        int i8 = 0;
        boolean z2 = aad.ag(view) && this.k.getVisibility() == 0;
        this.q = z2;
        if (!z2) {
            if (!z) {
                return;
            }
            z = true;
        }
        int f = aad.f(this);
        View view2 = this.j;
        if (view2 == null) {
            view2 = this.i;
        }
        int a = a(view2);
        kuy.a(this, this.k, this.o);
        ViewGroup viewGroup = this.i;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i8 = toolbar.n;
            i6 = toolbar.o;
            i7 = toolbar.p;
            i5 = toolbar.q;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                ViewGroup viewGroup2 = this.i;
                if (viewGroup2 instanceof android.widget.Toolbar) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup2;
                    i8 = toolbar2.getTitleMarginStart();
                    i6 = toolbar2.getTitleMarginEnd();
                    i7 = toolbar2.getTitleMarginTop();
                    i5 = toolbar2.getTitleMarginBottom();
                }
            }
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        kux kuxVar = this.b;
        int i9 = this.o.left + (f == 1 ? i6 : i8);
        int i10 = this.o.top + a + i7;
        int i11 = this.o.right;
        if (f != 1) {
            i8 = i6;
        }
        int i12 = i11 - i8;
        int i13 = (this.o.bottom + a) - i5;
        if (!kux.j(kuxVar.h, i9, i10, i12, i13)) {
            kuxVar.h.set(i9, i10, i12, i13);
            kuxVar.z = true;
        }
        kux kuxVar2 = this.b;
        int i14 = f == 1 ? this.m : this.a;
        int i15 = this.o.top + this.l;
        int i16 = (i3 - i) - (f == 1 ? this.a : this.m);
        int i17 = (i4 - i2) - this.n;
        if (!kux.j(kuxVar2.g, i14, i15, i16, i17)) {
            kuxVar2.g.set(i14, i15, i16, i17);
            kuxVar2.z = true;
        }
        this.b.g(z);
    }

    private final void o() {
        CharSequence title;
        if (this.i == null || !this.p || !TextUtils.isEmpty(this.b.v)) {
            return;
        }
        ViewGroup viewGroup = this.i;
        if (viewGroup instanceof Toolbar) {
            title = ((Toolbar) viewGroup).s;
        } else {
            title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        }
        e(title);
    }

    private final boolean p() {
        return this.x == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(View view) {
        return ((getHeight() - h(view).c) - view.getHeight()) - ((ksf) view.getLayoutParams()).bottomMargin;
    }

    public final int b() {
        int i = this.w;
        if (i >= 0) {
            return i + this.y + this.A;
        }
        abc abcVar = this.f;
        int d = abcVar != null ? abcVar.d() : 0;
        int g = aad.g(this);
        if (g > 0) {
            return Math.min(g + g + d, getHeight());
        }
        return getHeight() / 3;
    }

    public final void c(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            if (drawable3 != null) {
                l(drawable3, getWidth(), getHeight());
                this.r.setCallback(this);
                this.r.setAlpha(this.s);
            }
            aad.G(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ksf;
    }

    public final void d(int i) {
        ViewGroup viewGroup;
        if (i != this.s) {
            if (this.r != null && (viewGroup = this.i) != null) {
                aad.G(viewGroup);
            }
            this.s = i;
            aad.G(this);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        k();
        if (this.i == null && (drawable = this.r) != null && this.s > 0) {
            drawable.mutate().setAlpha(this.s);
            this.r.draw(canvas);
        }
        if (this.p && this.q) {
            if (this.i != null && this.r != null && this.s > 0 && p()) {
                kux kuxVar = this.b;
                if (kuxVar.b < kuxVar.e) {
                    int save = canvas.save();
                    canvas.clipRect(this.r.getBounds(), Region.Op.DIFFERENCE);
                    this.b.d(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.b.d(canvas);
        }
        if (this.d == null || this.s <= 0) {
            return;
        }
        abc abcVar = this.f;
        int d = abcVar != null ? abcVar.d() : 0;
        if (d <= 0) {
            return;
        }
        this.d.setBounds(0, -this.e, getWidth(), d - this.e);
        this.d.mutate().setAlpha(this.s);
        this.d.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.r;
        if (drawable == null || this.s <= 0 || ((view2 = this.j) == null || view2 == this ? view != this.i : view != view2)) {
            z = false;
        } else {
            m(drawable, view, getWidth(), getHeight());
            this.r.mutate().setAlpha(this.s);
            this.r.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        kux kuxVar = this.b;
        if (kuxVar != null) {
            kuxVar.y = drawableState;
            ColorStateList colorStateList2 = kuxVar.m;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = kuxVar.l) != null && colorStateList.isStateful())) {
                kuxVar.f();
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence) {
        kux kuxVar = this.b;
        CharSequence charSequence2 = null;
        if (charSequence == null || !TextUtils.equals(kuxVar.v, charSequence)) {
            kuxVar.v = charSequence;
            kuxVar.w = null;
            kuxVar.f();
        }
        if (this.p) {
            charSequence2 = this.b.v;
        }
        setContentDescription(charSequence2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        TimeInterpolator timeInterpolator;
        if (this.r == null && this.d == null) {
            return;
        }
        int height = getHeight() + this.e;
        int b = b();
        int i = 0;
        boolean z = height < b;
        boolean z2 = aad.ah(this) && !isInEditMode();
        if (this.t == z) {
            return;
        }
        int i2 = 255;
        if (z2) {
            if (height >= b) {
                i2 = 0;
            }
            k();
            ValueAnimator valueAnimator = this.u;
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.u = valueAnimator2;
                if (i2 > this.s) {
                    timeInterpolator = krt.c;
                } else {
                    timeInterpolator = krt.d;
                }
                valueAnimator2.setInterpolator(timeInterpolator);
                this.u.addUpdateListener(new ksq(this, 1));
            } else if (valueAnimator.isRunning()) {
                this.u.cancel();
            }
            this.u.setDuration(this.v);
            this.u.setIntValues(this.s, i2);
            this.u.start();
        } else {
            if (height < b) {
                i = 255;
            }
            d(i);
        }
        this.t = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            j(appBarLayout);
            aad.T(this, aad.ad(appBarLayout));
            if (this.C == null) {
                this.C = new opu(this);
            }
            opu opuVar = this.C;
            if (appBarLayout.d == null) {
                appBarLayout.d = new ArrayList();
            }
            if (opuVar != null && !appBarLayout.d.contains(opuVar)) {
                appBarLayout.d.add(opuVar);
            }
            aad.K(this);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.e(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        opu opuVar = this.C;
        if (opuVar != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).d) != null) {
            list.remove(opuVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        abc abcVar = this.f;
        if (abcVar != null) {
            int d = abcVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!aad.ad(childAt) && childAt.getTop() < d) {
                    aad.F(childAt, d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            h(getChildAt(i6)).g();
        }
        n(i, i2, i3, i4, false);
        o();
        f();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            h(getChildAt(i7)).f();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        k();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        abc abcVar = this.f;
        int d = abcVar != null ? abcVar.d() : 0;
        if ((mode == 0 || this.z) && d > 0) {
            this.y = d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        if (this.B && this.b.E > 1) {
            o();
            n(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            kux kuxVar = this.b;
            int i3 = kuxVar.n;
            if (i3 > 1) {
                TextPaint textPaint = kuxVar.A;
                textPaint.setTextSize(kuxVar.k);
                textPaint.setTypeface(kuxVar.r);
                textPaint.setLetterSpacing(kuxVar.D);
                this.A = Math.round((-kuxVar.A.ascent()) + kuxVar.A.descent()) * (i3 - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.A, 1073741824));
            }
        }
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            View view = this.j;
            if (view == null || view == this) {
                setMinimumHeight(i(viewGroup));
            } else {
                setMinimumHeight(i(view));
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.r;
        if (drawable != null) {
            l(drawable, i, i2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.d;
        if (drawable != null && drawable.isVisible() != z) {
            this.d.setVisible(z, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.r.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r || drawable == this.d;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f9310_resource_name_obfuscated_res_0x7f04030d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ FrameLayout.LayoutParams mo31generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ksf(getContext(), attributeSet);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(kzb.a(context, attributeSet, i, R.style.f203950_resource_name_obfuscated_res_0x7f150843), attributeSet, i);
        int i2;
        ColorStateList b;
        ColorStateList b2;
        TextUtils.TruncateAt truncateAt;
        this.g = true;
        this.o = new Rect();
        this.w = -1;
        this.y = 0;
        this.A = 0;
        Context context2 = getContext();
        kux kuxVar = new kux(this);
        this.b = kuxVar;
        kuxVar.C = krt.e;
        kuxVar.f();
        kuxVar.x = false;
        ktw ktwVar = new ktw(context2);
        this.c = ktwVar;
        TypedArray a = kve.a(context2, attributeSet, ksj.c, i, R.style.f203950_resource_name_obfuscated_res_0x7f150843, new int[0]);
        int i3 = a.getInt(4, 8388691);
        if (kuxVar.i != i3) {
            kuxVar.i = i3;
            kuxVar.f();
        }
        int i4 = a.getInt(0, 8388627);
        if (kuxVar.j != i4) {
            kuxVar.j = i4;
            kuxVar.f();
        }
        int dimensionPixelSize = a.getDimensionPixelSize(5, 0);
        this.n = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.a = dimensionPixelSize;
        if (a.hasValue(8)) {
            this.a = a.getDimensionPixelSize(8, 0);
        }
        if (a.hasValue(7)) {
            this.m = a.getDimensionPixelSize(7, 0);
        }
        if (a.hasValue(9)) {
            this.l = a.getDimensionPixelSize(9, 0);
        }
        if (a.hasValue(6)) {
            this.n = a.getDimensionPixelSize(6, 0);
        }
        this.p = a.getBoolean(20, true);
        e(a.getText(18));
        kuxVar.i(R.style.f199540_resource_name_obfuscated_res_0x7f150587);
        kuxVar.h(R.style.f199440_resource_name_obfuscated_res_0x7f15056c);
        if (a.hasValue(10)) {
            kuxVar.i(a.getResourceId(10, 0));
        }
        if (a.hasValue(1)) {
            kuxVar.h(a.getResourceId(1, 0));
        }
        if (a.hasValue(22)) {
            int i5 = a.getInt(22, -1);
            if (i5 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i5 != 1) {
                truncateAt = i5 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
            } else {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            }
            kuxVar.u = truncateAt;
            kuxVar.f();
        }
        if (a.hasValue(11) && kuxVar.l != (b2 = kws.b(context2, a, 11))) {
            kuxVar.l = b2;
            kuxVar.f();
        }
        if (a.hasValue(2) && kuxVar.m != (b = kws.b(context2, a, 2))) {
            kuxVar.m = b;
            kuxVar.f();
        }
        this.w = a.getDimensionPixelSize(16, -1);
        if (a.hasValue(14) && (i2 = a.getInt(14, 1)) != kuxVar.E) {
            kuxVar.E = i2;
            kuxVar.f();
        }
        if (a.hasValue(21)) {
            kuxVar.B = AnimationUtils.loadInterpolator(context2, a.getResourceId(21, 0));
            kuxVar.f();
        }
        this.v = a.getInt(15, 600);
        c(a.getDrawable(3));
        Drawable drawable = a.getDrawable(17);
        Drawable drawable2 = this.d;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            drawable3 = drawable != null ? drawable.mutate() : drawable3;
            this.d = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.d.setState(getDrawableState());
                }
                wg.b(this.d, aad.f(this));
                this.d.setVisible(getVisibility() == 0, false);
                this.d.setCallback(this);
                this.d.setAlpha(this.s);
            }
            aad.G(this);
        }
        this.x = a.getInt(19, 0);
        boolean p = p();
        kuxVar.c = p;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            j((AppBarLayout) parent);
        }
        if (p && this.r == null) {
            c(new ColorDrawable(ktwVar.b(ktwVar.b, getResources().getDimension(R.dimen.f33100_resource_name_obfuscated_res_0x7f07010e))));
        }
        this.h = a.getResourceId(23, -1);
        this.z = a.getBoolean(13, false);
        this.B = a.getBoolean(12, false);
        a.recycle();
        setWillNotDraw(false);
        aad.V(this, new kxz(this, 1));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ksf(layoutParams);
    }
}
