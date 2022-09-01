package com.google.android.apps.inputmethod.libs.expression.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import j$.util.Objects;
import j$.util.function.IntFunction;
import j$.util.stream.IntStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class WrapWidthTextView extends AppCompatTextView {
    public WrapWidthTextView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        final Layout layout;
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && (layout = getLayout()) != null) {
            IntStream range = IntStream.CC.range(0, layout.getLineCount());
            Objects.requireNonNull(layout);
            i = View.MeasureSpec.makeMeasureSpec(((int) Math.ceil(((Float) range.mapToObj(new IntFunction() { // from class: dbj
                @Override // j$.util.function.IntFunction
                public final Object apply(int i3) {
                    return Float.valueOf(layout.getLineWidth(i3));
                }
            }).max(xr.i).orElse(Float.valueOf(0.0f))).floatValue())) + getCompoundPaddingLeft() + getCompoundPaddingRight(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public WrapWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
