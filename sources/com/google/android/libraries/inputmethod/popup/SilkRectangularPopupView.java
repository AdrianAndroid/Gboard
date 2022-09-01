package com.google.android.libraries.inputmethod.popup;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SilkRectangularPopupView extends FrameLayout implements ilv {
    private static final hhl a = hhq.a("silk_popup_modal_backdrop", false);
    private final jdx b;
    private final ilp c;
    private final imh d;
    private View e;
    private LinearLayout f;
    private View g;
    private final int h;
    private final int i;
    private final Animator[] j;

    public SilkRectangularPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.ilv
    public final iay a(float f, float f2, boolean z) {
        return this.d.k(f, f2);
    }

    @Override // defpackage.ilv
    public final iay b(SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr, boolean z) {
        this.b.b(this);
        this.e = view;
        if (!ialVar.f()) {
            return null;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            this.d.c(linearLayout, softKeyboardView, view, f, f2, ialVar, iArr);
        }
        View view2 = this.g;
        if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            iArr[0] = iArr[0] - marginLayoutParams.leftMargin;
            iArr[1] = iArr[1] - ((marginLayoutParams.topMargin + ilp.b(view2, this.f)) + this.c.b);
            iArr[2] = iArr[2] | 256;
        }
        return this.d.a();
    }

    @Override // defpackage.ilv
    public final /* synthetic */ void d(int i) {
    }

    @Override // defpackage.ilv
    public final void e() {
        this.d.d();
    }

    @Override // defpackage.ilv
    public final void f(View.OnClickListener onClickListener) {
        this.d.g(onClickListener);
    }

    @Override // defpackage.ilv
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ilv
    public final boolean h() {
        return this.d.j();
    }

    @Override // defpackage.ilv
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ilv
    public final boolean j() {
        return ((Boolean) a.c()).booleanValue() && this.d.d.length > 1;
    }

    @Override // defpackage.ilv
    public final void k() {
        View view = this.g;
        if (view == null || this.e == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        jdy.i(this.e, this, rect);
        this.g.setPivotX(rect.centerX() - marginLayoutParams.leftMargin);
        this.g.setPivotY(rect.top - marginLayoutParams.topMargin);
    }

    @Override // defpackage.ilv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.ilv
    public final Animator m(hek hekVar) {
        Animator[] animatorArr;
        Animator animator;
        View view = this.g;
        if (view == null || (animatorArr = this.j) == null || (animator = animatorArr[1]) == null) {
            return null;
        }
        animator.setTarget(view);
        hekVar.g(animator, this, 1);
        return animator;
    }

    @Override // defpackage.ilv
    public final Animator n(hek hekVar, boolean z) {
        Animator[] animatorArr;
        Animator animator;
        LinearLayout linearLayout = this.f;
        if (linearLayout == null || this.g == null || (animatorArr = this.j) == null || (animator = animatorArr[0]) == null) {
            return null;
        }
        if (animator instanceof AnimatorSet) {
            float min = Math.min(Math.min(1.0f, this.h / linearLayout.getMeasuredWidth()), Math.min(1.0f, this.i / this.f.getMeasuredHeight()));
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            int size = childAnimations.size();
            for (int i = 0; i < size; i++) {
                Animator animator2 = childAnimations.get(i);
                if (animator2 instanceof ObjectAnimator) {
                    ((ObjectAnimator) animator2).setFloatValues(min, 1.0f);
                }
            }
        }
        animator.setTarget(this.g);
        hekVar.g(animator, this, 0);
        return animator;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b.a(this);
        this.f = (LinearLayout) findViewById(R.id.f67260_resource_name_obfuscated_res_0x7f0b084a);
        View findViewById = findViewById(R.id.f67270_resource_name_obfuscated_res_0x7f0b084b);
        if (findViewById == null) {
            findViewById = this.f;
        }
        this.g = findViewById;
        if (findViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            this.d.f(marginLayoutParams.leftMargin, marginLayoutParams.rightMargin);
        }
        View findViewById2 = findViewById(R.id.f67300_resource_name_obfuscated_res_0x7f0b084e);
        if (findViewById2 != null) {
            this.d.g = findViewById2;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        View view = this.g;
        if (view == null) {
            super.onMeasure(i, i2);
            return;
        }
        view.measure(i, i2);
        int measuredWidth = this.g.getMeasuredWidth();
        int measuredHeight = this.g.getMeasuredHeight();
        int a2 = this.c.a(this.e);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
        setMeasuredDimension(Math.max(measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, getSuggestedMinimumWidth()), Math.max(measuredHeight + a2 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, getSuggestedMinimumHeight()));
    }

    public SilkRectangularPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new jdx();
        this.c = new ilp(context, attributeSet);
        this.d = new imh(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ilw.b);
        try {
            this.h = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            this.j = hek.h(this, context, attributeSet);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
