package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, kxu {
    private static final int[] i = {16842911};
    private static final int[] j = {16842912};
    public final ktk g;
    public boolean h;
    private boolean k;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @Override // androidx.cardview.widget.CardView
    public final void c(ColorStateList colorStateList) {
        this.g.e(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public final void d(float f) {
        super.d(f);
        this.g.i();
    }

    @Override // androidx.cardview.widget.CardView
    public final void e(float f) {
        super.e(f);
        ktk ktkVar = this.g;
        ktkVar.g(ktkVar.n.d(f));
        ktkVar.j.invalidateSelf();
        if (ktkVar.n() || ktkVar.m()) {
            ktkVar.h();
        }
        if (ktkVar.n()) {
            if (!ktkVar.s) {
                super.setBackgroundDrawable(ktkVar.d(ktkVar.d));
            }
            ktkVar.b.setForeground(ktkVar.d(ktkVar.j));
        }
    }

    public final boolean f() {
        ktk ktkVar = this.g;
        return ktkVar != null && ktkVar.t;
    }

    @Override // defpackage.kxu
    public final void ic(kxj kxjVar) {
        RectF rectF = new RectF();
        rectF.set(this.g.d.getBounds());
        setClipToOutline(kxjVar.e(rectF));
        this.g.g(kxjVar);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        laq.j(this, this.g.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (f()) {
            mergeDrawableStates(onCreateDrawableState, i);
        }
        if (this.h) {
            mergeDrawableStates(onCreateDrawableState, j);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.h);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        super.onMeasure(i2, i3);
        ktk ktkVar = this.g;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (ktkVar.q != null) {
            if (ktkVar.b.a) {
                float b = ktkVar.b();
                i4 = (int) Math.ceil(b + b);
                float a = ktkVar.a();
                i5 = (int) Math.ceil(a + a);
            } else {
                i4 = 0;
                i5 = 0;
            }
            int i6 = ktkVar.l() ? ((measuredWidth - ktkVar.f) - ktkVar.g) - i5 : ktkVar.f;
            int i7 = ktkVar.k() ? ktkVar.f : ((measuredHeight - ktkVar.f) - ktkVar.g) - i4;
            int i8 = ktkVar.l() ? ktkVar.f : ((measuredWidth - ktkVar.f) - ktkVar.g) - i5;
            int i9 = ktkVar.k() ? ((measuredHeight - ktkVar.f) - ktkVar.g) - i4 : ktkVar.f;
            int f = aad.f(ktkVar.b);
            ktkVar.q.setLayerInset(2, f != 1 ? i6 : i8, i9, f == 1 ? i6 : i8, i7);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.k) {
            if (!this.g.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.g.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.h != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        ktk ktkVar = this.g;
        if (ktkVar != null) {
            Drawable drawable2 = ktkVar.j;
            if (ktkVar.b.isClickable()) {
                drawable = ktkVar.c();
            } else {
                drawable = ktkVar.e;
            }
            ktkVar.j = drawable;
            Drawable drawable3 = ktkVar.j;
            if (drawable2 == drawable3) {
                return;
            }
            if (!(ktkVar.b.getForeground() instanceof InsetDrawable)) {
                ktkVar.b.setForeground(ktkVar.d(drawable3));
            } else {
                ((InsetDrawable) ktkVar.b.getForeground()).setDrawable(drawable3);
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        ktk ktkVar;
        Drawable drawable;
        if (!f() || !isEnabled()) {
            return;
        }
        this.h = !this.h;
        refreshDrawableState();
        if (Build.VERSION.SDK_INT > 26 && (drawable = (ktkVar = this.g).p) != null) {
            Rect bounds = drawable.getBounds();
            int i2 = bounds.bottom;
            ktkVar.p.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
            ktkVar.p.setBounds(bounds.left, bounds.top, bounds.right, i2);
        }
        this.g.f(this.h);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f14780_resource_name_obfuscated_res_0x7f040579);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(kzb.a(context, attributeSet, i2, R.style.f207340_resource_name_obfuscated_res_0x7f150a22), attributeSet, i2);
        this.h = false;
        this.k = true;
        TypedArray a = kve.a(getContext(), attributeSet, ktl.b, i2, R.style.f207340_resource_name_obfuscated_res_0x7f150a22, new int[0]);
        ktk ktkVar = new ktk(this, attributeSet, i2);
        this.g = ktkVar;
        ktkVar.e(((qg) this.f.a).e);
        ktkVar.c.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        ktkVar.h();
        ktkVar.o = kws.b(ktkVar.b.getContext(), a, 11);
        if (ktkVar.o == null) {
            ktkVar.o = ColorStateList.valueOf(-1);
        }
        ktkVar.i = a.getDimensionPixelSize(12, 0);
        boolean z = a.getBoolean(0, false);
        ktkVar.t = z;
        ktkVar.b.setLongClickable(z);
        ktkVar.m = kws.b(ktkVar.b.getContext(), a, 6);
        Drawable c = kws.c(ktkVar.b.getContext(), a, 2);
        if (c != null) {
            ktkVar.k = c.mutate();
            wf.g(ktkVar.k, ktkVar.m);
            ktkVar.f(ktkVar.b.h);
        } else {
            ktkVar.k = ktk.a;
        }
        LayerDrawable layerDrawable = ktkVar.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.f65980_resource_name_obfuscated_res_0x7f0b07b0, ktkVar.k);
        }
        ktkVar.g = a.getDimensionPixelSize(5, 0);
        ktkVar.f = a.getDimensionPixelSize(4, 0);
        ktkVar.h = a.getInteger(3, 8388661);
        ktkVar.l = kws.b(ktkVar.b.getContext(), a, 7);
        if (ktkVar.l == null) {
            ktkVar.l = ColorStateList.valueOf(kxc.f(ktkVar.b, R.attr.f9410_resource_name_obfuscated_res_0x7f040318));
        }
        ColorStateList b = kws.b(ktkVar.b.getContext(), a, 1);
        ktkVar.e.l(b == null ? ColorStateList.valueOf(0) : b);
        int i3 = kww.b;
        Drawable drawable = ktkVar.p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(ktkVar.l);
        } else {
            kxe kxeVar = ktkVar.r;
        }
        ktkVar.i();
        ktkVar.j();
        super.setBackgroundDrawable(ktkVar.d(ktkVar.d));
        ktkVar.j = ktkVar.b.isClickable() ? ktkVar.c() : ktkVar.e;
        ktkVar.b.setForeground(ktkVar.d(ktkVar.j));
        a.recycle();
    }
}
