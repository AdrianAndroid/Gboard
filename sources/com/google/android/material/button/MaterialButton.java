package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.inputmethod.latin.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialButton extends ia implements Checkable, kxu {
    private static final int[] e = {16842911};
    private static final int[] f = {16842912};
    public final ktg b;
    public ColorStateList c;
    private final LinkedHashSet g;
    private PorterDuff.Mode h;
    private Drawable i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final String k() {
        return (true != i() ? Button.class : CompoundButton.class).getName();
    }

    private final void l() {
        if (o()) {
            up.i(this, this.i, null, null);
        } else if (n()) {
            up.i(this, null, null, this.i);
        } else if (!p()) {
        } else {
            up.i(this, null, this.i, null);
        }
    }

    private final void m(int i, int i2) {
        Layout.Alignment alignment;
        int min;
        if (this.i == null || getLayout() == null) {
            return;
        }
        boolean z = true;
        if (o() || n()) {
            this.l = 0;
            int textAlignment = getTextAlignment();
            if (textAlignment != 1) {
                if (textAlignment != 6 && textAlignment != 3) {
                    if (textAlignment != 4) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                int gravity = getGravity() & 8388615;
                if (gravity != 1) {
                    if (gravity != 5 && gravity != 8388613) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            int i3 = this.p;
            if (i3 != 1 && i3 != 3 && ((i3 != 2 || alignment != Layout.Alignment.ALIGN_NORMAL) && (this.p != 4 || alignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i4 = this.j;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicWidth();
                }
                int lineCount = getLineCount();
                int i5 = 0;
                for (int i6 = 0; i6 < lineCount; i6++) {
                    CharSequence subSequence = getText().subSequence(getLayout().getLineStart(i6), getLayout().getLineEnd(i6));
                    TextPaint paint = getPaint();
                    String obj = subSequence.toString();
                    if (getTransformationMethod() != null) {
                        obj = getTransformationMethod().getTransformation(obj, this).toString();
                    }
                    i5 = Math.max(i5, Math.min((int) paint.measureText(obj), getLayout().getEllipsizedWidth()));
                }
                int j = ((((i - i5) - aad.j(this)) - i4) - this.m) - aad.k(this);
                if (alignment == Layout.Alignment.ALIGN_CENTER) {
                    j /= 2;
                }
                boolean z2 = aad.f(this) == 1;
                if (this.p != 4) {
                    z = false;
                }
                if (z2 != z) {
                    j = -j;
                }
                if (this.k == j) {
                    return;
                }
                this.k = j;
                h(false);
                return;
            }
            this.k = 0;
            h(false);
        } else if (p()) {
            this.k = 0;
            if (this.p == 16) {
                this.l = 0;
                h(false);
                return;
            }
            int i7 = this.j;
            if (i7 == 0) {
                i7 = this.i.getIntrinsicHeight();
            }
            if (getLineCount() > 1) {
                min = getLayout().getHeight();
            } else {
                TextPaint paint2 = getPaint();
                String obj2 = getText().toString();
                if (getTransformationMethod() != null) {
                    obj2 = getTransformationMethod().getTransformation(obj2, this).toString();
                }
                Rect rect = new Rect();
                paint2.getTextBounds(obj2, 0, obj2.length(), rect);
                min = Math.min(rect.height(), getLayout().getHeight());
            }
            int max = Math.max(0, (((((i2 - min) - getPaddingTop()) - i7) - this.m) - getPaddingBottom()) / 2);
            if (this.l == max) {
                return;
            }
            this.l = max;
            h(false);
        }
    }

    private final boolean n() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    private final boolean o() {
        int i = this.p;
        return i == 1 || i == 2;
    }

    private final boolean p() {
        int i = this.p;
        return i == 16 || i == 32;
    }

    public final void c(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            h(true);
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void d(int i) {
        c(ej.a(getContext(), i));
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        Object obj;
        if (j()) {
            return this.b.j;
        }
        isu isuVar = this.a;
        if (isuVar != null && (obj = isuVar.a) != null) {
            return ((nu) obj).a;
        }
        return null;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        Object obj;
        if (j()) {
            return this.b.i;
        }
        isu isuVar = this.a;
        if (isuVar != null && (obj = isuVar.a) != null) {
            return ((nu) obj).b;
        }
        return null;
    }

    public final void h(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            wf.g(mutate, this.c);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                wf.h(this.i, mode);
            }
            int i = this.j;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.j;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.k;
            int i4 = this.l;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z);
        }
        if (!z) {
            Drawable[] h = acq.h(this);
            Drawable drawable3 = h[0];
            Drawable drawable4 = h[1];
            Drawable drawable5 = h[2];
            if ((!o() || drawable3 == this.i) && ((!n() || drawable5 == this.i) && (!p() || drawable4 == this.i))) {
                return;
            }
            l();
            return;
        }
        l();
    }

    public final boolean i() {
        ktg ktgVar = this.b;
        return ktgVar != null && ktgVar.p;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n;
    }

    public final boolean j() {
        ktg ktgVar = this.b;
        return ktgVar != null && !ktgVar.n;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (j()) {
            laq.j(this, this.b.a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (i()) {
            mergeDrawableStates(onCreateDrawableState, e);
        }
        if (this.n) {
            mergeDrawableStates(onCreateDrawableState, f);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.ia, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(k());
        accessibilityEvent.setChecked(this.n);
    }

    @Override // defpackage.ia, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(k());
        accessibilityNodeInfo.setCheckable(i());
        accessibilityNodeInfo.setChecked(this.n);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ia, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ktf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ktf ktfVar = (ktf) parcelable;
        super.onRestoreInstanceState(ktfVar.d);
        setChecked(ktfVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ktf ktfVar = new ktf(super.onSaveInstanceState());
        ktfVar.a = this.n;
        return ktfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ia, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.b.q) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (!this.i.setState(getDrawableState())) {
                return;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!j()) {
            super.setBackgroundColor(i);
            return;
        }
        ktg ktgVar = this.b;
        if (ktgVar.a() == null) {
            return;
        }
        ktgVar.a().setTint(i);
    }

    @Override // defpackage.ia, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!j()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.b.d();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    @Override // defpackage.ia, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ej.a(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        f(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        g(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!i() || !isEnabled() || this.n == z) {
            return;
        }
        this.n = z;
        refreshDrawableState();
        if (getParent() instanceof kth) {
            kth kthVar = (kth) getParent();
            throw null;
        } else if (this.o) {
        } else {
            this.o = true;
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((kte) it.next()).a();
            }
            this.o = false;
        }
    }

    @Override // android.view.View
    public final void setElevation(float f2) {
        super.setElevation(f2);
        if (j()) {
            this.b.a().k(f2);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.n);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f14580_resource_name_obfuscated_res_0x7f040565);
    }

    @Override // defpackage.kxu
    public final void ic(kxj kxjVar) {
        if (j()) {
            this.b.e(kxjVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(kzb.a(context, attributeSet, i, R.style.f207250_resource_name_obfuscated_res_0x7f150a16), attributeSet, i);
        this.g = new LinkedHashSet();
        this.n = false;
        this.o = false;
        Context context2 = getContext();
        TypedArray a = kve.a(context2, attributeSet, kti.a, i, R.style.f207250_resource_name_obfuscated_res_0x7f150a16, new int[0]);
        this.m = a.getDimensionPixelSize(12, 0);
        this.h = kvj.b(a.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.c = kws.b(getContext(), a, 14);
        this.i = kws.c(getContext(), a, 10);
        this.p = a.getInteger(11, 1);
        this.j = a.getDimensionPixelSize(13, 0);
        ktg ktgVar = new ktg(this, kxj.a(context2, attributeSet, i, R.style.f207250_resource_name_obfuscated_res_0x7f150a16).a());
        this.b = ktgVar;
        ktgVar.c = a.getDimensionPixelOffset(1, 0);
        ktgVar.d = a.getDimensionPixelOffset(2, 0);
        ktgVar.e = a.getDimensionPixelOffset(3, 0);
        ktgVar.f = a.getDimensionPixelOffset(4, 0);
        if (a.hasValue(8)) {
            int dimensionPixelSize = a.getDimensionPixelSize(8, -1);
            ktgVar.g = dimensionPixelSize;
            ktgVar.e(ktgVar.b.d(dimensionPixelSize));
            ktgVar.o = true;
        }
        ktgVar.h = a.getDimensionPixelSize(20, 0);
        ktgVar.i = kvj.b(a.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        ktgVar.j = kws.b(ktgVar.a.getContext(), a, 6);
        ktgVar.k = kws.b(ktgVar.a.getContext(), a, 19);
        ktgVar.l = kws.b(ktgVar.a.getContext(), a, 16);
        ktgVar.p = a.getBoolean(5, false);
        ktgVar.s = a.getDimensionPixelSize(9, 0);
        ktgVar.q = a.getBoolean(21, true);
        int k = aad.k(ktgVar.a);
        int paddingTop = ktgVar.a.getPaddingTop();
        int j = aad.j(ktgVar.a);
        int paddingBottom = ktgVar.a.getPaddingBottom();
        if (a.hasValue(0)) {
            ktgVar.d();
        } else {
            MaterialButton materialButton = ktgVar.a;
            kxe kxeVar = new kxe(ktgVar.b);
            kxeVar.j(ktgVar.a.getContext());
            wf.g(kxeVar, ktgVar.j);
            PorterDuff.Mode mode = ktgVar.i;
            if (mode != null) {
                wf.h(kxeVar, mode);
            }
            kxeVar.n(ktgVar.h, ktgVar.k);
            kxe kxeVar2 = new kxe(ktgVar.b);
            kxeVar2.setTint(0);
            kxeVar2.t(ktgVar.h);
            ktgVar.m = new kxe(ktgVar.b);
            wf.f(ktgVar.m, -1);
            ktgVar.r = new RippleDrawable(kww.b(ktgVar.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{kxeVar2, kxeVar}), ktgVar.c, ktgVar.e, ktgVar.d, ktgVar.f), ktgVar.m);
            super.setBackgroundDrawable(ktgVar.r);
            kxe a2 = ktgVar.a();
            if (a2 != null) {
                a2.k(ktgVar.s);
                a2.setState(ktgVar.a.getDrawableState());
            }
        }
        aad.W(ktgVar.a, k + ktgVar.c, paddingTop + ktgVar.e, j + ktgVar.d, paddingBottom + ktgVar.f);
        a.recycle();
        setCompoundDrawablePadding(this.m);
        h(this.i != null);
    }

    public final void f(ColorStateList colorStateList) {
        if (j()) {
            ktg ktgVar = this.b;
            if (ktgVar.j == colorStateList) {
                return;
            }
            ktgVar.j = colorStateList;
            if (ktgVar.a() == null) {
                return;
            }
            wf.g(ktgVar.a(), ktgVar.j);
            return;
        }
        isu isuVar = this.a;
        if (isuVar == null) {
            return;
        }
        if (isuVar.a == null) {
            isuVar.a = new nu();
        }
        nu nuVar = (nu) isuVar.a;
        nuVar.a = colorStateList;
        nuVar.d = true;
        isuVar.b();
    }

    public final void g(PorterDuff.Mode mode) {
        if (j()) {
            ktg ktgVar = this.b;
            if (ktgVar.i == mode) {
                return;
            }
            ktgVar.i = mode;
            if (ktgVar.a() == null || ktgVar.i == null) {
                return;
            }
            wf.h(ktgVar.a(), ktgVar.i);
            return;
        }
        isu isuVar = this.a;
        if (isuVar == null) {
            return;
        }
        if (isuVar.a == null) {
            isuVar.a = new nu();
        }
        nu nuVar = (nu) isuVar.a;
        nuVar.b = mode;
        nuVar.c = true;
        isuVar.b();
    }
}
