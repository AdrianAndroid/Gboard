package com.google.android.libraries.inputmethod.keyboardmode;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KeyboardSideFrame extends LinearLayout {
    public hwj a;
    private final int b;

    public KeyboardSideFrame(Context context) {
        super(context);
        this.b = Integer.MAX_VALUE;
    }

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hwl.b);
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.f54540_resource_name_obfuscated_res_0x7f0b01ad);
        gqa a = gqa.a(getContext());
        if (findViewById != null) {
            findViewById.setOnClickListener(new fat(this, 19));
            if (!a.x()) {
                gqa.y(findViewById);
            }
        }
        View findViewById2 = findViewById(R.id.f129270_resource_name_obfuscated_res_0x7f0b214b);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new fat(this, 20));
            if (!a.x()) {
                gqa.y(findViewById2);
            }
        }
        View findViewById3 = findViewById(R.id.f54110_resource_name_obfuscated_res_0x7f0b017f);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new hvr(this, findViewById3));
            if (a.x()) {
                return;
            }
            gqa.y(findViewById3);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.b;
        if (size > i3) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    public KeyboardSideFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = a(context, attributeSet);
    }

    public KeyboardSideFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = a(context, attributeSet);
    }

    public KeyboardSideFrame(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = a(context, attributeSet);
    }
}
