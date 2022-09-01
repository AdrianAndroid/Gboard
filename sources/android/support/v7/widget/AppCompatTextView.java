package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements acv, acd {
    private final jh a;
    private boolean b;
    private final isu c;
    private final adx e;
    private bek f;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private final bek c() {
        if (this.f == null) {
            this.f = new bek(this);
        }
        return this.f;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        isu isuVar = this.c;
        if (isuVar != null) {
            isuVar.b();
        }
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // defpackage.acv
    public final void eU(ColorStateList colorStateList) {
        this.a.m(colorStateList);
        this.a.e();
    }

    @Override // defpackage.acv
    public final void eV(PorterDuff.Mode mode) {
        this.a.n(mode);
        this.a.e();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (d) {
            return super.getAutoSizeMaxTextSize();
        }
        jh jhVar = this.a;
        if (jhVar == null) {
            return -1;
        }
        return jhVar.a();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (d) {
            return super.getAutoSizeMinTextSize();
        }
        jh jhVar = this.a;
        if (jhVar == null) {
            return -1;
        }
        return jhVar.b();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (d) {
            return super.getAutoSizeStepGranularity();
        }
        jh jhVar = this.a;
        if (jhVar == null) {
            return -1;
        }
        return jhVar.c();
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        jh jhVar = this.a;
        return jhVar != null ? jhVar.q() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        jh jhVar = this.a;
        if (jhVar == null) {
            return 0;
        }
        return jhVar.d();
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return up.c(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        adx adxVar;
        if (Build.VERSION.SDK_INT >= 28 || (adxVar = this.e) == null) {
            return super.getTextClassifier();
        }
        return adxVar.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jh.s(this, onCreateInputConnection, editorInfo);
        cz.c(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        jh jhVar = this.a;
        if (jhVar == null || d || !jhVar.p()) {
            return;
        }
        this.a.f();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        aen.b();
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        jh jhVar = this.a;
        if (jhVar == null) {
            return;
        }
        jhVar.j(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        jh jhVar = this.a;
        if (jhVar == null) {
            return;
        }
        jhVar.k(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (d) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        jh jhVar = this.a;
        if (jhVar == null) {
            return;
        }
        jhVar.l(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        isu isuVar = this.c;
        if (isuVar != null) {
            isuVar.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        isu isuVar = this.c;
        if (isuVar != null) {
            isuVar.d(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? ej.a(context, i) : null;
        Drawable a2 = i2 != 0 ? ej.a(context, i2) : null;
        Drawable a3 = i3 != 0 ? ej.a(context, i3) : null;
        if (i4 != 0) {
            drawable = ej.a(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a, a2, a3, drawable);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? ej.a(context, i) : null;
        Drawable a2 = i2 != 0 ? ej.a(context, i2) : null;
        Drawable a3 = i3 != 0 ? ej.a(context, i3) : null;
        if (i4 != 0) {
            drawable = ej.a(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(a, a2, a3, drawable);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(up.d(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        c();
        aen.b();
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            up.f(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            up.g(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        up.h(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        adx adxVar;
        if (Build.VERSION.SDK_INT >= 28 || (adxVar = this.e) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            adxVar.b = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (d) {
            super.setTextSize(i, f);
            return;
        }
        jh jhVar = this.a;
        if (jhVar == null) {
            return;
        }
        jhVar.o(i, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.b) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = vu.a(getContext(), typeface, i);
        }
        this.b = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.b = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nt.a(context);
        this.b = false;
        nr.d(this, getContext());
        isu isuVar = new isu(this);
        this.c = isuVar;
        isuVar.c(attributeSet, i);
        jh jhVar = new jh(this);
        this.a = jhVar;
        jhVar.g(attributeSet, i);
        jhVar.e();
        this.e = new adx(this);
        c().v(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }
}
