package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView a;
    public Button b;
    public int c;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    private final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.a;
        if (aad.aj(textView)) {
            aad.W(textView, aad.k(textView), i2, aad.j(textView), i3);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        }
        return true;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.f68690_resource_name_obfuscated_res_0x7f0b0907);
        this.b = (Button) findViewById(R.id.f68680_resource_name_obfuscated_res_0x7f0b0906);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f33410_resource_name_obfuscated_res_0x7f070137);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f33400_resource_name_obfuscated_res_0x7f070136);
        Layout layout = this.a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.c <= 0 || this.b.getMeasuredWidth() <= this.c) {
            if (true != z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
