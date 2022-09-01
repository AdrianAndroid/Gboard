package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] B = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer C;
    private boolean D;
    private boolean E;
    private ImageView.ScaleType F;
    private Boolean G;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final void x(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.support.v7.widget.Toolbar
    public final void o(Drawable drawable) {
        if (drawable != null && this.C != null) {
            drawable = drawable.mutate();
            wf.f(drawable, this.C.intValue());
        }
        super.o(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        laq.i(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.D || this.E) {
            List a = kvf.a(this, this.s);
            TextView textView = a.isEmpty() ? null : (TextView) Collections.min(a, kvf.a);
            List a2 = kvf.a(this, this.t);
            TextView textView2 = a2.isEmpty() ? null : (TextView) Collections.max(a2, kvf.a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.D && textView != null) {
                    x(textView, pair);
                }
                if (this.E && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        ImageView imageView3 = this.d;
        Drawable drawable2 = imageView3 != null ? imageView3.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.G;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.F;
            if (scaleType == null) {
                return;
            }
            imageView2.setScaleType(scaleType);
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        laq.h(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f18780_resource_name_obfuscated_res_0x7f040792);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(kzb.a(context, attributeSet, i, R.style.f208070_resource_name_obfuscated_res_0x7f150a78), attributeSet, i);
        Context context2 = getContext();
        int i2 = 0;
        TypedArray a = kve.a(context2, attributeSet, ksj.e, i, R.style.f208070_resource_name_obfuscated_res_0x7f150a78, new int[0]);
        if (a.hasValue(2)) {
            this.C = Integer.valueOf(a.getColor(2, -1));
            Drawable e = e();
            if (e != null) {
                o(e);
            }
        }
        this.D = a.getBoolean(4, false);
        this.E = a.getBoolean(3, false);
        int i3 = a.getInt(1, -1);
        if (i3 >= 0 && i3 < 8) {
            this.F = B[i3];
        }
        if (a.hasValue(0)) {
            this.G = Boolean.valueOf(a.getBoolean(0, false));
        }
        a.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            kxe kxeVar = new kxe();
            kxeVar.l(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i2));
            kxeVar.j(context2);
            kxeVar.k(aad.a(this));
            aad.O(this, kxeVar);
        }
    }
}
