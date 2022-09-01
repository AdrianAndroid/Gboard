package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ia  reason: default package */
/* loaded from: classes.dex */
public class ia extends Button implements acd, acv {
    public final isu a;
    private final jh b;
    private bek c;

    public ia(Context context) {
        this(context, null);
    }

    private final bek c() {
        if (this.c == null) {
            this.c = new bek(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        isu isuVar = this.a;
        if (isuVar != null) {
            isuVar.b();
        }
        jh jhVar = this.b;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // defpackage.acv
    public final void eU(ColorStateList colorStateList) {
        this.b.m(colorStateList);
        this.b.e();
    }

    @Override // defpackage.acv
    public final void eV(PorterDuff.Mode mode) {
        this.b.n(mode);
        this.b.e();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (d) {
            return super.getAutoSizeMaxTextSize();
        }
        jh jhVar = this.b;
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
        jh jhVar = this.b;
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
        jh jhVar = this.b;
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
        jh jhVar = this.b;
        return jhVar != null ? jhVar.q() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        jh jhVar = this.b;
        if (jhVar == null) {
            return 0;
        }
        return jhVar.d();
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return up.c(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jh jhVar = this.b;
        if (jhVar != null) {
            jhVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        jh jhVar = this.b;
        if (jhVar == null || d || !jhVar.p()) {
            return;
        }
        this.b.f();
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
        jh jhVar = this.b;
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
        jh jhVar = this.b;
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
        jh jhVar = this.b;
        if (jhVar == null) {
            return;
        }
        jhVar.l(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        isu isuVar = this.a;
        if (isuVar != null) {
            isuVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        isu isuVar = this.a;
        if (isuVar != null) {
            isuVar.d(i);
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jh jhVar = this.b;
        if (jhVar != null) {
            jhVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (d) {
            super.setTextSize(i, f);
            return;
        }
        jh jhVar = this.b;
        if (jhVar == null) {
            return;
        }
        jhVar.o(i, f);
    }

    public ia(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f8590_resource_name_obfuscated_res_0x7f0402ab);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nt.a(context);
        nr.d(this, getContext());
        isu isuVar = new isu(this);
        this.a = isuVar;
        isuVar.c(attributeSet, i);
        jh jhVar = new jh(this);
        this.b = jhVar;
        jhVar.g(attributeSet, i);
        jhVar.e();
        c().v(attributeSet, i);
    }
}
