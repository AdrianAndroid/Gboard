package com.google.android.libraries.material.progress;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class MaterialProgressBar extends ProgressBar {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private jhe f;
    private Drawable g;

    private MaterialProgressBar(Context context) {
        super(context, null, 16842872);
        super.getProgress();
    }

    private static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            throw new IllegalArgumentException("Invalid attribute value for mtrlLinearGrowFrom: " + i);
        }
        return 0;
    }

    private final int b() {
        return isIndeterminate() ? this.a : this.b;
    }

    private final Drawable c() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    private final void d() {
        if (b() == 0 && isIndeterminate()) {
            Context context = getContext();
            if (Build.VERSION.SDK_INT < 26 ? Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f : ValueAnimator.areAnimatorsEnabled()) {
                if (!((PowerManager) context.getSystemService("power")).isPowerSaveMode()) {
                    if (c() != this.f) {
                        this.g.setVisible(false, false);
                        this.g.setCallback(null);
                        unscheduleDrawable(this.g);
                        setIndeterminateDrawable(this.f);
                        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
                    }
                }
            }
            if (c() != this.g) {
                this.f.a();
                this.f.setCallback(null);
                unscheduleDrawable(this.f);
                setIndeterminateDrawable(this.g);
                onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
            }
        }
        Drawable c = c();
        if (c == null) {
            return;
        }
        boolean i = i();
        if (!(c instanceof jgy) || i) {
            c.setVisible(i, true);
        } else {
            ((jgy) c).a();
        }
    }

    private final void e(TypedArray typedArray, boolean z) {
        int[] iArr;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int[] iArr2 = jhl.a;
        int i = typedArray.getInt(7, 3);
        if (typedArray.hasValue(1)) {
            iArr = getResources().getIntArray(typedArray.getResourceId(1, -1));
        } else {
            iArr = typedArray.hasValue(0) ? new int[]{typedArray.getColor(0, 0)} : null;
        }
        if (iArr == null) {
            iArr = getResources().getIntArray(R.array.f1650_resource_name_obfuscated_res_0x7f030044);
        }
        if (i == 1) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f39360_resource_name_obfuscated_res_0x7f070463);
        } else if (i == 2) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f39350_resource_name_obfuscated_res_0x7f070462);
        } else if (i == 3) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f39340_resource_name_obfuscated_res_0x7f070461);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        this.c = dimensionPixelSize;
        if (i == 1) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f39390_resource_name_obfuscated_res_0x7f070466);
        } else if (i == 2) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f39380_resource_name_obfuscated_res_0x7f070465);
        } else if (i == 3) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f39370_resource_name_obfuscated_res_0x7f070464);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (i == 1) {
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.f39330_resource_name_obfuscated_res_0x7f070460);
        } else if (i == 2) {
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.f39320_resource_name_obfuscated_res_0x7f07045f);
        } else if (i == 3) {
            dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.f39310_resource_name_obfuscated_res_0x7f07045e);
        } else {
            throw new IllegalStateException("Invalid progress circle size");
        }
        if (z) {
            this.g = ur.a(getContext(), R.drawable.f50800_resource_name_obfuscated_res_0x7f080384);
            jhe jheVar = new jhe(dimensionPixelSize2, dimensionPixelSize3, iArr);
            this.f = jheVar;
            setIndeterminateDrawable(jheVar);
            return;
        }
        setProgressDrawable(new jhb(dimensionPixelSize2, dimensionPixelSize3, iArr[0]));
    }

    private final void f(TypedArray typedArray, boolean z) {
        int color;
        int[] iArr = jhl.a;
        if (typedArray.hasValue(0)) {
            color = typedArray.getColor(0, -1);
        } else {
            color = getResources().getColor(R.color.f30750_resource_name_obfuscated_res_0x7f0607ba);
        }
        int i = color;
        int color2 = typedArray.getColor(8, -1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        int i2 = typedArray.getInt(6, 0);
        float f2 = color2 != -1 ? 1.0f : f;
        if (z) {
            setIndeterminateDrawable(new jhk(this.d, i, color2, f2, this.a == 2, a(i2)));
        } else {
            setProgressDrawable(new jhh(this.d, i, color2, f2, a(i2)));
        }
    }

    private final void g() {
        h();
        if (isIndeterminate()) {
            getProgressDrawable().setVisible(false, false);
            getIndeterminateDrawable().setVisible(i(), true);
            return;
        }
        getProgressDrawable().setVisible(i(), true);
        getIndeterminateDrawable().setVisible(false, false);
    }

    private final void h() {
        if (isIndeterminate()) {
            if (this.a != 0) {
                setMinimumHeight(this.d);
            } else {
                setMinimumHeight(0);
            }
        } else if (this.b != 0) {
            setMinimumHeight(this.d);
        } else {
            setMinimumHeight(0);
        }
    }

    private final boolean i() {
        if (!aad.ag(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    private final void j(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jhl.a, i, R.style.f204050_resource_name_obfuscated_res_0x7f150851);
        this.d = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        int i2 = obtainStyledAttributes.getInt(3, 0);
        this.a = i2;
        if (i2 == 0) {
            e(obtainStyledAttributes, true);
        } else if (i2 == 1 || i2 == 2) {
            f(obtainStyledAttributes, true);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        int i3 = obtainStyledAttributes.getInt(2, 1);
        this.b = i3;
        if (i3 == 0) {
            e(obtainStyledAttributes, false);
        } else if (i3 == 1) {
            f(obtainStyledAttributes, false);
        } else {
            throw new IllegalArgumentException("Invalid determinate progress style");
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (i()) {
            if (getVisibility() != 0) {
                setVisibility(0);
            } else if (!i()) {
            } else {
                c().setVisible(true, false);
            }
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        if (c() instanceof jgy) {
            ((jgy) c()).a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        c().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (b() == 0) {
            setMeasuredDimension(this.c + getPaddingLeft() + getPaddingRight(), this.c + getPaddingTop() + getPaddingBottom());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.d;
        int i4 = this.e;
        setMeasuredDimension(measuredWidth, resolveSizeAndState(i3 + i4 + i4 + getPaddingTop() + getPaddingBottom(), i2, 0));
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (b() != 0) {
            int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
            int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
            Drawable indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            }
            Drawable progressDrawable = getProgressDrawable();
            if (progressDrawable == null) {
                return;
            }
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d();
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        h();
        Drawable c = c();
        if (c != null) {
            c.setVisible(i(), false);
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.getProgress();
        j(context, attributeSet, 0);
        g();
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.getProgress();
        j(context, attributeSet, i);
        g();
    }
}
