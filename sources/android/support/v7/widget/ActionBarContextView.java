package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarContextView extends hi {
    public CharSequence g;
    public CharSequence h;
    public View i;
    public boolean j;
    private View k;
    private View l;
    private LinearLayout m;
    private TextView n;
    private TextView o;
    private int p;
    private int q;
    private int r;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private final void o() {
        if (this.m == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.f133190_resource_name_obfuscated_res_0x7f0e0000, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.m = linearLayout;
            this.n = (TextView) linearLayout.findViewById(R.id.f52100_resource_name_obfuscated_res_0x7f0b004e);
            this.o = (TextView) this.m.findViewById(R.id.f52090_resource_name_obfuscated_res_0x7f0b004d);
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
        }
        this.n.setText(this.g);
        this.o.setText(this.h);
        boolean z = !TextUtils.isEmpty(this.g);
        boolean isEmpty = TextUtils.isEmpty(this.h);
        boolean z2 = !isEmpty;
        int i = 8;
        this.o.setVisibility(true != isEmpty ? 0 : 8);
        LinearLayout linearLayout2 = this.m;
        if (z || z2) {
            i = 0;
        }
        linearLayout2.setVisibility(i);
        if (this.m.getParent() == null) {
            addView(this.m);
        }
    }

    @Override // defpackage.hi
    public final void c(int i) {
        this.e = i;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h(fm fmVar) {
        View view = this.i;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.r, (ViewGroup) this, false);
            this.i = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.i);
        }
        View findViewById = this.i.findViewById(R.id.f52180_resource_name_obfuscated_res_0x7f0b005d);
        this.k = findViewById;
        findViewById.setOnClickListener(new hk(fmVar, 0));
        Menu a = fmVar.a();
        hs hsVar = this.d;
        if (hsVar != null) {
            hsVar.n();
        }
        this.d = new hs(getContext());
        this.d.p();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ((gm) a).h(this.d, this.b);
        hs hsVar2 = this.d;
        hb hbVar = hsVar2.f;
        if (hsVar2.f == null) {
            hsVar2.f = (hb) hsVar2.d.inflate(R.layout.f133210_resource_name_obfuscated_res_0x7f0e0003, (ViewGroup) this, false);
            hsVar2.f.a(hsVar2.c);
            hsVar2.i();
        }
        hb hbVar2 = hsVar2.f;
        if (hbVar != hbVar2) {
            ((ActionMenuView) hbVar2).k(hsVar2);
        }
        this.c = (ActionMenuView) hbVar2;
        aad.O(this.c, null);
        addView(this.c, layoutParams);
    }

    public final void i() {
        removeAllViews();
        this.l = null;
        this.c = null;
        this.d = null;
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void j(View view) {
        LinearLayout linearLayout;
        View view2 = this.l;
        if (view2 != null) {
            removeView(view2);
        }
        this.l = view;
        if (view != null && (linearLayout = this.m) != null) {
            removeView(linearLayout);
            this.m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void k(CharSequence charSequence) {
        this.h = charSequence;
        o();
    }

    public final void l(CharSequence charSequence) {
        this.g = charSequence;
        o();
        aad.N(this, charSequence);
    }

    public final void m(boolean z) {
        if (z != this.j) {
            requestLayout();
        }
        this.j = z;
    }

    public final void n() {
        hs hsVar = this.d;
        if (hsVar != null) {
            hsVar.m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs hsVar = this.d;
        if (hsVar != null) {
            hsVar.k();
            this.d.q();
        }
    }

    @Override // defpackage.hi, android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = oi.b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.i;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a = a(paddingRight, i5, b);
            paddingRight = a(a + f(this.i, a, paddingTop, paddingTop2, b), i6, b);
        }
        LinearLayout linearLayout = this.m;
        if (linearLayout != null && this.l == null && linearLayout.getVisibility() != 8) {
            paddingRight += f(this.m, paddingRight, paddingTop, paddingTop2, b);
        }
        View view2 = this.l;
        if (view2 != null) {
            f(view2, paddingRight, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            f(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.e;
        if (i4 <= 0) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i5 = i4 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        View view = this.i;
        if (view != null) {
            int e = e(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            paddingLeft = e - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = e(this.c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.m;
        if (linearLayout != null && this.l == null) {
            if (this.j) {
                this.m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.m.getMeasuredWidth();
                int i6 = measuredWidth <= paddingLeft ? paddingLeft - measuredWidth : paddingLeft;
                this.m.setVisibility(measuredWidth > paddingLeft ? 8 : 0);
                paddingLeft = i6;
            } else {
                paddingLeft = e(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i7 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            if (layoutParams.height == -2) {
                i3 = Integer.MIN_VALUE;
            }
            if (layoutParams.height >= 0) {
                i5 = Math.min(layoutParams.height, i5);
            }
            this.l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
        }
        if (this.e <= 0) {
            int childCount = getChildCount();
            int i8 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i8) {
                    i8 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i8);
            return;
        }
        setMeasuredDimension(size, i4);
    }

    @Override // defpackage.hi, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f7600_resource_name_obfuscated_res_0x7f04022e);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gkn w = gkn.w(context, attributeSet, ei.d, i, 0);
        aad.O(this, w.n(0));
        this.p = w.l(5, 0);
        this.q = w.l(4, 0);
        this.e = w.k(3, 0);
        this.r = w.l(2, R.layout.f133230_resource_name_obfuscated_res_0x7f0e0005);
        w.r();
    }
}
