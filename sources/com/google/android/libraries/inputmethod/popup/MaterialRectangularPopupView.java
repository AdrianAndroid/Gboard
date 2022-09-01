package com.google.android.libraries.inputmethod.popup;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.popup.MaterialRectangularPopupView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialRectangularPopupView extends FrameLayout implements ilv {
    public final ilp a;
    private final jdx b;
    private final ily c;
    private View d;
    private LinearLayout e;
    private View f;
    private View g;
    private final int h;
    private final int i;
    private Animator j;
    private Animator k;

    public MaterialRectangularPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final Animator c(int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (i == 0) {
            animatorSet.play(ObjectAnimator.ofFloat(this.f, View.SCALE_X, 0.9f, 1.0f)).with(ObjectAnimator.ofFloat(this.f, View.SCALE_Y, 0.9f, 1.0f)).with(ObjectAnimator.ofFloat(this.g, View.SCALE_Y, 0.9f, 1.0f));
            animatorSet.setDuration(this.h);
            animatorSet.setInterpolator(new DecelerateInterpolator());
        } else {
            animatorSet.play(ObjectAnimator.ofFloat(this.f, View.SCALE_X, 1.0f, 0.9f)).with(ObjectAnimator.ofFloat(this.f, View.SCALE_Y, 1.0f, 0.9f)).with(ObjectAnimator.ofFloat(this.g, View.SCALE_Y, 1.0f, 0.9f));
            animatorSet.setDuration(this.i);
            animatorSet.setInterpolator(new AccelerateInterpolator());
        }
        return animatorSet;
    }

    @Override // defpackage.ilv
    public final iay a(float f, float f2, boolean z) {
        return this.c.k(f, f2);
    }

    @Override // defpackage.ilv
    public final iay b(SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr, boolean z) {
        View view2;
        this.b.b(this);
        this.d = view;
        if (!ialVar.f()) {
            return null;
        }
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            this.c.c(linearLayout, softKeyboardView, view, f, f2, ialVar, iArr);
        }
        View view3 = this.f;
        if (view3 != null && (view2 = this.g) != null) {
            int i = iArr[0];
            view2.measure(0, 0);
            int measuredWidth = view2.getMeasuredWidth();
            double d = -i;
            double width = view.getWidth() - measuredWidth;
            Double.isNaN(width);
            Double.isNaN(d);
            int i2 = (int) (d + (width / 2.0d));
            if (i2 >= 0) {
                view3.measure(0, 0);
                int measuredWidth2 = view3.getMeasuredWidth();
                if (i2 + measuredWidth > measuredWidth2) {
                    i2 = measuredWidth2 - measuredWidth;
                }
            } else {
                i2 = 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).setMargins(marginLayoutParams.leftMargin + i2, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view2.requestLayout();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            iArr[0] = iArr[0] - marginLayoutParams2.leftMargin;
            iArr[1] = iArr[1] - ((marginLayoutParams2.topMargin + ilp.b(view3, this.e)) + this.a.b);
            iArr[2] = iArr[2] | 256;
        }
        return this.c.a();
    }

    @Override // defpackage.ilv
    public final void d(int i) {
        if (i == 0) {
            this.c.e();
        }
    }

    @Override // defpackage.ilv
    public final void e() {
        this.c.d();
    }

    @Override // defpackage.ilv
    public final void f(View.OnClickListener onClickListener) {
        this.c.g(onClickListener);
    }

    @Override // defpackage.ilv
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ilv
    public final boolean h() {
        return this.c.j();
    }

    @Override // defpackage.ilv
    public final boolean i() {
        return this.a.a;
    }

    @Override // defpackage.ilv
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.ilv
    public final void k() {
        View view;
        int measuredWidth;
        View view2 = this.f;
        if (view2 != null && (view = this.g) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i = marginLayoutParams2.leftMargin - marginLayoutParams.leftMargin;
            if (marginLayoutParams.leftMargin != marginLayoutParams2.leftMargin) {
                if (marginLayoutParams.leftMargin + view2.getMeasuredWidth() == marginLayoutParams2.leftMargin + view.getMeasuredWidth()) {
                    measuredWidth = view.getMeasuredWidth();
                } else {
                    measuredWidth = view.getMeasuredWidth() / 2;
                }
                i += measuredWidth;
            }
            float f = i;
            view2.setPivotX(f);
            view2.setPivotY(view2.getMeasuredHeight());
            view.setPivotX(f);
            view.setPivotY(view.getMeasuredHeight());
        }
        this.c.b();
    }

    @Override // defpackage.ilv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.ilv
    public final Animator m(hek hekVar) {
        if (this.k == null) {
            this.k = c(1);
        }
        hekVar.g(this.k, this, 1);
        return this.k;
    }

    @Override // defpackage.ilv
    public final Animator n(hek hekVar, boolean z) {
        if (!z || this.c.c.size() > 1) {
            if (this.j == null) {
                this.j = c(0);
            }
            hekVar.g(this.j, this, 0);
            return this.j;
        }
        return null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        View view;
        super.onFinishInflate();
        this.b.a(this);
        this.e = (LinearLayout) findViewById(R.id.f67260_resource_name_obfuscated_res_0x7f0b084a);
        View findViewById = findViewById(R.id.f67270_resource_name_obfuscated_res_0x7f0b084b);
        if (findViewById == null) {
            findViewById = this.e;
        }
        this.f = findViewById;
        if (findViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            this.c.f(marginLayoutParams.leftMargin, marginLayoutParams.rightMargin);
        }
        this.g = findViewById(R.id.f67290_resource_name_obfuscated_res_0x7f0b084d);
        if (i() || (view = this.g) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        View view = this.f;
        if (view == null || this.g == null) {
            super.onMeasure(i, i2);
            return;
        }
        view.measure(i, i2);
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        if (i()) {
            measuredHeight += this.a.a(this.d);
            View view2 = this.g;
            if (view2 != null) {
                view2.measure(0, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
        setMeasuredDimension(Math.max(measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, getSuggestedMinimumWidth()), Math.max(measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, getSuggestedMinimumHeight()));
    }

    public MaterialRectangularPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new jdx();
        this.a = new ilp(context, attributeSet);
        this.c = new ily(context, attributeSet, new ilx() { // from class: ilq
            @Override // defpackage.hit
            public final Object a(Object obj, Object obj2) {
                return new ilr(MaterialRectangularPopupView.this, (Context) obj, (ilz) obj2);
            }
        });
        this.h = context.getResources().getInteger(R.integer.f132240_resource_name_obfuscated_res_0x7f0c00b6);
        this.i = context.getResources().getInteger(R.integer.f132160_resource_name_obfuscated_res_0x7f0c00ae);
    }
}
