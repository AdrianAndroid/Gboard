package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AutoSizeTextView extends jcp {
    private final float a;

    public AutoSizeTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView
    public final void setTextSize(float f) {
        super.setTextSize(f);
        h(this.a / f);
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Throwable th;
        TypedArray typedArray;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, jdl.b, 0, 0);
            try {
                float dimension = typedArray.getDimension(0, 0.0f);
                this.a = dimension;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                h(dimension / getTextSize());
                this.p = 3;
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        h(this.a / f);
    }
}
