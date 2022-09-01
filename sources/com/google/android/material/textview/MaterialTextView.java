package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    private static int c(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = kws.a(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private final void d(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, kza.a);
        int c = c(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (c >= 0) {
            up.h(this, c);
        }
    }

    private final void e(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        if (f(context)) {
            Resources.Theme theme = context.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, kza.b, i, i2);
            int c = c(context, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (c != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, kza.b, i, i2);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId == -1) {
                return;
            }
            d(theme, resourceId);
        }
    }

    private static boolean f(Context context) {
        return kws.f(context, R.attr.f18070_resource_name_obfuscated_res_0x7f040736, true);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (f(context)) {
            d(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(kzb.a(context, attributeSet, i, 0), attributeSet, i);
        e(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(kzb.a(context, attributeSet, i, i2), attributeSet, i);
        e(attributeSet, i, i2);
    }
}
