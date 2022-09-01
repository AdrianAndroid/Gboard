package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kyd  reason: default package */
/* loaded from: classes.dex */
public class kyd extends FrameLayout {
    private static final View.OnTouchListener h = new kyc();
    public kye a;
    kxj b;
    public int c;
    public final float d;
    public final int e;
    public Rect f;
    public boolean g;
    private final float i;
    private final int j;
    private ColorStateList k;
    private PorterDuff.Mode l;

    /* JADX INFO: Access modifiers changed from: protected */
    public kyd(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        kye kyeVar = this.a;
        if (kyeVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = kyeVar.e.getRootWindowInsets()) != null) {
            kyeVar.i = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            kyeVar.i();
        }
        aad.K(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        kye kyeVar = this.a;
        if (kyeVar != null) {
            kyj a = kyj.a();
            opu opuVar = kyeVar.m;
            synchronized (a.a) {
                z = true;
                if (!a.g(opuVar) && !a.h(opuVar)) {
                    z = false;
                }
            }
            if (!z) {
                return;
            }
            kye.a.post(new kvl(kyeVar, 4));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        kye kyeVar = this.a;
        if (kyeVar == null || !kyeVar.k) {
            return;
        }
        kyeVar.h();
        kyeVar.k = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.j > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.j;
            if (measuredWidth <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.k != null) {
            drawable = drawable.mutate();
            wf.g(drawable, this.k);
            wf.h(drawable, this.l);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.k = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            wf.g(mutate, colorStateList);
            wf.h(mutate, this.l);
            if (mutate == getBackground()) {
                return;
            }
            super.setBackgroundDrawable(mutate);
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.l = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            wf.h(mutate, mode);
            if (mutate == getBackground()) {
                return;
            }
            super.setBackgroundDrawable(mutate);
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.g || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        kye kyeVar = this.a;
        if (kyeVar == null) {
            return;
        }
        kyeVar.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public kyd(Context context, AttributeSet attributeSet) {
        super(kzb.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, kyf.a);
        if (obtainStyledAttributes.hasValue(6)) {
            aad.S(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.b = kxj.a(context2, attributeSet, 0, 0).a();
        }
        float f = obtainStyledAttributes.getFloat(3, 1.0f);
        this.i = f;
        setBackgroundTintList(kws.b(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(kvj.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(h);
        setFocusable(true);
        if (getBackground() == null) {
            int h2 = kxc.h(kxc.f(this, R.attr.f10000_resource_name_obfuscated_res_0x7f040356), kxc.f(this, R.attr.f9670_resource_name_obfuscated_res_0x7f040334), f);
            kxj kxjVar = this.b;
            if (kxjVar != null) {
                String str = kye.b;
                kxe kxeVar = new kxe(kxjVar);
                kxeVar.l(ColorStateList.valueOf(h2));
                gradientDrawable = kxeVar;
            } else {
                Resources resources = getResources();
                String str2 = kye.b;
                float dimension = resources.getDimension(R.dimen.f40780_resource_name_obfuscated_res_0x7f070569);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(h2);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                wf.g(gradientDrawable, colorStateList);
            }
            aad.O(this, gradientDrawable);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : h);
        super.setOnClickListener(onClickListener);
    }
}
