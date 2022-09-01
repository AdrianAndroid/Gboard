package com.google.android.libraries.inputmethod.popup;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SilkPopupView extends BasicPopupView {
    private final ilp c;
    private View d;

    public SilkPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.google.android.libraries.inputmethod.popup.BasicPopupView, defpackage.ill, defpackage.ilv
    public final iay b(SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr, boolean z) {
        iay b = super.b(softKeyboardView, view, f, f2, ialVar, iArr, z);
        this.d.measure(0, 0);
        Rect rect = new Rect();
        jdy.i(view, softKeyboardView, rect);
        int centerX = rect.centerX();
        int measuredWidth = this.d.getMeasuredWidth() / 2;
        int i = centerX - measuredWidth;
        if (i < 0) {
            iArr[0] = -i;
        } else {
            int width = softKeyboardView.getWidth();
            int i2 = centerX + measuredWidth;
            if (i2 > width) {
                iArr[0] = width - i2;
            }
        }
        iArr[1] = iArr[1] + (((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).bottomMargin - this.c.b);
        iArr[2] = iArr[2] | 256;
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.popup.BasicPopupView, defpackage.ill, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = findViewById(R.id.f67380_resource_name_obfuscated_res_0x7f0b0856);
    }

    public SilkPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ilp(context, attributeSet);
    }
}
