package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public opu A;
    private ImageButton B;
    private int C;
    private int D;
    private int E;
    private int F;
    private ColorStateList G;
    private ColorStateList H;
    private boolean I;
    private boolean J;
    private final ArrayList K;
    private final int[] L;
    private ob M;
    private final Runnable N;
    private final opu O;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public mx r;
    public CharSequence s;
    public CharSequence t;
    public final ArrayList u;
    public hs v;
    public nw w;
    public gy x;
    public gk y;
    public final aqq z;

    public Toolbar(Context context) {
        this(context, null);
    }

    private final int A(View view, int i, int[] iArr, int i2) {
        nx nxVar = (nx) view.getLayoutParams();
        int i3 = nxVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int y = y(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, y, max, view.getMeasuredHeight() + y);
        return max - (measuredWidth + nxVar.leftMargin);
    }

    private final int B(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final void C(List list, int i) {
        int f = aad.f(this);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, aad.f(this));
        list.clear();
        if (f != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                nx nxVar = (nx) childAt.getLayoutParams();
                if (nxVar.b == 0 && H(childAt) && x(nxVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            nx nxVar2 = (nx) childAt2.getLayoutParams();
            if (nxVar2.b == 0 && H(childAt2) && x(nxVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void D(View view, boolean z) {
        nx nxVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            nxVar = v();
        } else if (!checkLayoutParams(layoutParams)) {
            nxVar = w(layoutParams);
        } else {
            nxVar = (nx) layoutParams;
        }
        nxVar.b = 1;
        if (!z || this.h == null) {
            addView(view, nxVar);
            return;
        }
        view.setLayoutParams(nxVar);
        this.u.add(view);
    }

    private final void E() {
        if (this.d == null) {
            this.d = new AppCompatImageView(getContext());
        }
    }

    private final void F() {
        if (this.B == null) {
            this.B = new ig(getContext(), null, R.attr.f18770_resource_name_obfuscated_res_0x7f040791);
            nx v = v();
            v.a = (this.m & 112) | 8388611;
            this.B.setLayoutParams(v);
        }
    }

    private final boolean G(View view) {
        return view.getParent() == this || this.u.contains(view);
    }

    private final boolean H(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int I(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return yr.c(marginLayoutParams) + yr.b(marginLayoutParams);
    }

    private static final int J(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void K(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public static final nx v() {
        return new nx();
    }

    protected static final nx w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof nx) {
            return new nx((nx) layoutParams);
        }
        if (layoutParams instanceof ck) {
            return new nx((ck) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new nx((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new nx(layoutParams);
    }

    private final int x(int i) {
        int f = aad.f(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, f) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : f == 1 ? 5 : 3;
    }

    private final int y(View view, int i) {
        nx nxVar = (nx) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = nxVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.F & 112;
        }
        if (i3 != 48) {
            if (i3 == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - nxVar.bottomMargin) - i2;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            if (i4 < nxVar.topMargin) {
                i4 = nxVar.topMargin;
            } else {
                int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                if (i5 < nxVar.bottomMargin) {
                    i4 = Math.max(0, i4 - (nxVar.bottomMargin - i5));
                }
            }
            return paddingTop + i4;
        }
        return getPaddingTop() - i2;
    }

    private final int z(View view, int i, int[] iArr, int i2) {
        nx nxVar = (nx) view.getLayoutParams();
        int i3 = nxVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int y = y(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, y, max + measuredWidth, view.getMeasuredHeight() + y);
        return max + measuredWidth + nxVar.rightMargin;
    }

    public final int a() {
        mx mxVar = this.r;
        if (mxVar != null) {
            return mxVar.g ? mxVar.a : mxVar.b;
        }
        return 0;
    }

    public final int b() {
        mx mxVar = this.r;
        if (mxVar != null) {
            return mxVar.g ? mxVar.b : mxVar.a;
        }
        return 0;
    }

    public final int c() {
        gm gmVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (gmVar = actionMenuView.a) == null || !gmVar.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.E, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof nx);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.D, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.B;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final jt f() {
        if (this.M == null) {
            this.M = new ob(this, true);
        }
        return this.M;
    }

    public final Menu g() {
        k();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu g = actionMenuView.g();
            if (this.w == null) {
                this.w = new nw(this);
            }
            this.a.c.o();
            ((gm) g).h(this.w, this.i);
        }
        return this.a.g();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return v();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new nx(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.B;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final void i() {
        nw nwVar = this.w;
        go goVar = nwVar == null ? null : nwVar.b;
        if (goVar != null) {
            goVar.collapseActionView();
        }
    }

    public final void j() {
        if (this.r == null) {
            this.r = new mx();
        }
    }

    public final void k() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.O;
            actionMenuView2.i(this.x, this.y);
            nx v = v();
            v.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(v);
            D(this.a, false);
        }
    }

    public final void l(Drawable drawable) {
        if (drawable != null) {
            E();
            if (!G(this.d)) {
                D(this.d, true);
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && G(imageView)) {
                removeView(this.d);
                this.u.remove(this.d);
            }
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void m(int i) {
        n(i != 0 ? getContext().getText(i) : null);
    }

    public final void n(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            F();
        }
        ImageButton imageButton = this.B;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            ez.d(this.B, charSequence);
        }
    }

    public void o(Drawable drawable) {
        if (drawable != null) {
            F();
            if (!G(this.B)) {
                D(this.B, true);
            }
        } else {
            ImageButton imageButton = this.B;
            if (imageButton != null && G(imageButton)) {
                removeView(this.B);
                this.u.remove(this.B);
            }
        }
        ImageButton imageButton2 = this.B;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.J = false;
            actionMasked = 9;
        }
        if (!this.J) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.J = true;
                }
                if (i != 10 || i == 3) {
                    this.J = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.J = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02af A[LOOP:0: B:43:0x02ad->B:44:0x02af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d1 A[LOOP:1: B:47:0x02cf->B:48:0x02d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f5 A[LOOP:2: B:51:0x02f3->B:52:0x02f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0345 A[LOOP:3: B:60:0x0343->B:61:0x0345, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0236  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.L;
        boolean b = oi.b(this);
        int i9 = !b ? 1 : 0;
        int i10 = 0;
        if (H(this.B)) {
            K(this.B, i, 0, i2, this.C);
            i3 = this.B.getMeasuredWidth() + I(this.B);
            i4 = Math.max(0, this.B.getMeasuredHeight() + J(this.B));
            i5 = View.combineMeasuredStates(0, this.B.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (H(this.g)) {
            K(this.g, i, 0, i2, this.C);
            i3 = this.g.getMeasuredWidth() + I(this.g);
            i4 = Math.max(i4, this.g.getMeasuredHeight() + J(this.g));
            i5 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
        }
        int d = d();
        int max = Math.max(d, i3);
        iArr[b ? 1 : 0] = Math.max(0, d - i3);
        if (H(this.a)) {
            K(this.a, i, max, i2, this.C);
            i6 = this.a.getMeasuredWidth() + I(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + J(this.a));
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int c = c();
        int max2 = max + Math.max(c, i6);
        iArr[i9] = Math.max(0, c - i6);
        if (H(this.h)) {
            max2 += B(this.h, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.h.getMeasuredHeight() + J(this.h));
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        if (H(this.d)) {
            max2 += B(this.d, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.d.getMeasuredHeight() + J(this.d));
            i5 = View.combineMeasuredStates(i5, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((nx) childAt.getLayoutParams()).b == 0 && H(childAt)) {
                max2 += B(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + J(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.p + this.q;
        int i13 = this.n + this.o;
        if (H(this.b)) {
            B(this.b, i, max2 + i13, i2, i12, iArr);
            i10 = this.b.getMeasuredWidth() + I(this.b);
            int measuredHeight = this.b.getMeasuredHeight() + J(this.b);
            i7 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
            i8 = measuredHeight;
        } else {
            i7 = i5;
            i8 = 0;
        }
        if (H(this.c)) {
            i10 = Math.max(i10, B(this.c, i, max2 + i13, i2, i8 + i12, iArr));
            i8 += this.c.getMeasuredHeight() + J(this.c);
            i7 = View.combineMeasuredStates(i7, this.c.getMeasuredState());
        }
        int max3 = Math.max(i4, i8);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i10 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof ny)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ny nyVar = (ny) parcelable;
        super.onRestoreInstanceState(nyVar.d);
        ActionMenuView actionMenuView = this.a;
        gm gmVar = actionMenuView != null ? actionMenuView.a : null;
        int i = nyVar.a;
        if (i != 0 && this.w != null && gmVar != null && (findItem = gmVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (!nyVar.b) {
            return;
        }
        removeCallbacks(this.N);
        post(this.N);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        j();
        mx mxVar = this.r;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z == mxVar.g) {
            return;
        }
        mxVar.g = z;
        if (!mxVar.h) {
            mxVar.a = mxVar.e;
            mxVar.b = mxVar.f;
        } else if (z) {
            int i2 = mxVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = mxVar.e;
            }
            mxVar.a = i2;
            int i3 = mxVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = mxVar.f;
            }
            mxVar.b = i3;
        } else {
            int i4 = mxVar.c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = mxVar.e;
            }
            mxVar.a = i4;
            int i5 = mxVar.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = mxVar.f;
            }
            mxVar.b = i5;
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        go goVar;
        ny nyVar = new ny(super.onSaveInstanceState());
        nw nwVar = this.w;
        if (nwVar != null && (goVar = nwVar.b) != null) {
            nyVar.a = goVar.a;
        }
        nyVar.b = t();
        return nyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
            actionMasked = 0;
        }
        if (!this.I) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.I = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    public final void p(View.OnClickListener onClickListener) {
        F();
        this.B.setOnClickListener(onClickListener);
    }

    public final void q(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void r(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!G(this.c)) {
                D(this.c, true);
            }
        } else {
            TextView textView = this.c;
            if (textView != null && G(textView)) {
                removeView(this.c);
                this.u.remove(this.c);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.t = charSequence;
    }

    public final void s(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!G(this.b)) {
                D(this.b, true);
            }
        } else {
            TextView textView = this.b;
            if (textView != null && G(textView)) {
                removeView(this.b);
                this.u.remove(this.b);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.s = charSequence;
    }

    public final boolean t() {
        hs hsVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (hsVar = actionMenuView.c) == null || !hsVar.l()) ? false : true;
    }

    public final boolean u() {
        hs hsVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (hsVar = actionMenuView.c) == null || !hsVar.m()) ? false : true;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f18780_resource_name_obfuscated_res_0x7f040792);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return w(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = 8388627;
        this.K = new ArrayList();
        this.u = new ArrayList();
        this.L = new int[2];
        this.z = new aqq((byte[]) null, (char[]) null);
        new ArrayList();
        this.O = new opu(this);
        this.N = new az(this, 20);
        gkn w = gkn.w(getContext(), attributeSet, ei.y, i, 0);
        aad.L(this, context, ei.y, attributeSet, (TypedArray) w.a, i, 0);
        this.k = w.l(28, 0);
        this.l = w.l(19, 0);
        this.F = w.j(0, this.F);
        this.m = w.j(2, 48);
        int g = w.g(22, 0);
        g = w.t(27) ? w.g(27, g) : g;
        this.q = g;
        this.p = g;
        this.o = g;
        this.n = g;
        int g2 = w.g(25, -1);
        if (g2 >= 0) {
            this.n = g2;
        }
        int g3 = w.g(24, -1);
        if (g3 >= 0) {
            this.o = g3;
        }
        int g4 = w.g(26, -1);
        if (g4 >= 0) {
            this.p = g4;
        }
        int g5 = w.g(23, -1);
        if (g5 >= 0) {
            this.q = g5;
        }
        this.C = w.h(13, -1);
        int g6 = w.g(9, Integer.MIN_VALUE);
        int g7 = w.g(5, Integer.MIN_VALUE);
        int h = w.h(7, 0);
        int h2 = w.h(8, 0);
        j();
        mx mxVar = this.r;
        mxVar.h = false;
        if (h != Integer.MIN_VALUE) {
            mxVar.e = h;
            mxVar.a = h;
        }
        if (h2 != Integer.MIN_VALUE) {
            mxVar.f = h2;
            mxVar.b = h2;
        }
        if (g6 != Integer.MIN_VALUE || g7 != Integer.MIN_VALUE) {
            mxVar.a(g6, g7);
        }
        this.D = w.g(10, Integer.MIN_VALUE);
        this.E = w.g(6, Integer.MIN_VALUE);
        this.e = w.n(4);
        this.f = w.p(3);
        CharSequence p = w.p(21);
        if (!TextUtils.isEmpty(p)) {
            s(p);
        }
        CharSequence p2 = w.p(18);
        if (!TextUtils.isEmpty(p2)) {
            r(p2);
        }
        this.i = getContext();
        q(w.l(17, 0));
        Drawable n = w.n(16);
        if (n != null) {
            o(n);
        }
        CharSequence p3 = w.p(15);
        if (!TextUtils.isEmpty(p3)) {
            n(p3);
        }
        Drawable n2 = w.n(11);
        if (n2 != null) {
            l(n2);
        }
        CharSequence p4 = w.p(12);
        if (!TextUtils.isEmpty(p4)) {
            if (!TextUtils.isEmpty(p4)) {
                E();
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(p4);
            }
        }
        if (w.t(29)) {
            ColorStateList m = w.m(29);
            this.G = m;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(m);
            }
        }
        if (w.t(20)) {
            ColorStateList m2 = w.m(20);
            this.H = m2;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(m2);
            }
        }
        if (w.t(14)) {
            new ft(getContext()).inflate(w.l(14, 0), g());
        }
        w.r();
    }
}
