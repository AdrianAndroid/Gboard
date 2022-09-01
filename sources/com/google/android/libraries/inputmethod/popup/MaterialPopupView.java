package com.google.android.libraries.inputmethod.popup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialPopupView extends BasicPopupView {
    private final ilp c;
    private View d;
    private View e;
    private View f;

    public MaterialPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.google.android.libraries.inputmethod.popup.BasicPopupView, defpackage.ill, defpackage.ilv
    public final iay b(SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr, boolean z) {
        this.d = view;
        iay b = super.b(softKeyboardView, view, f, f2, ialVar, iArr, z);
        View view2 = this.f;
        if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            iArr[0] = (marginLayoutParams.rightMargin - marginLayoutParams.leftMargin) / 2;
            iArr[1] = marginLayoutParams.bottomMargin - view.getPaddingBottom();
            iArr[2] = 323;
        }
        return b;
    }

    @Override // defpackage.ill, defpackage.ilv
    public final boolean i() {
        return this.c.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.popup.BasicPopupView, defpackage.ill, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.f67260_resource_name_obfuscated_res_0x7f0b084a);
        this.f = findViewById(R.id.f67380_resource_name_obfuscated_res_0x7f0b0856);
        setLayoutDirection(0);
    }

    public MaterialPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ilp(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        View view;
        View view2 = this.e;
        if (view2 == null || (view = this.f) == null) {
            super.onMeasure(i, i2);
            return;
        }
        view2.measure(i, i2);
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view2.getMeasuredHeight() + this.c.a(this.d);
        view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i() ? measuredHeight : view2.getMeasuredHeight(), 1073741824));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        setMeasuredDimension(Math.max(measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, getSuggestedMinimumWidth()), Math.max(measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, getSuggestedMinimumHeight()));
    }
}
