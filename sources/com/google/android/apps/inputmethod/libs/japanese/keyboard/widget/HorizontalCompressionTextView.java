package com.google.android.apps.inputmethod.libs.japanese.keyboard.widget;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HorizontalCompressionTextView extends AppCompatTextView {
    private TextPaint e;
    private static final TransformationMethod b = new jdu(1);
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/HorizontalCompressionTextView");
    static final hhl a = hhq.e("horizontal_compression_textview_ratio", 1.0d);

    public HorizontalCompressionTextView(Context context) {
        this(context, null);
    }

    private final StaticLayout d(int i, float f) {
        if (this.e == null) {
            this.e = new TextPaint();
        }
        this.e.set(getPaint());
        this.e.setTextScaleX(f);
        if (jam.b) {
            return new StaticLayout(getText(), this.e, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(getText(), 0, getText().length(), this.e, i);
        obtain.setAlignment(getLayout() != null ? getLayout().getAlignment() : Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setMaxLines(Integer.MAX_VALUE).setHyphenationFrequency(getHyphenationFrequency());
        if (Build.VERSION.SDK_INT >= 28) {
            obtain.setJustificationMode(getJustificationMode());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obtain.setTextDirection(getTextDirectionHeuristic()).setUseLineSpacingFromFallbacks(isFallbackLineSpacing());
        }
        return obtain.build();
    }

    final float c() {
        return d(Integer.MAX_VALUE, 1.0f).getLineWidth(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth() - (getCompoundPaddingLeft() + getCompoundPaddingRight());
        float min = Math.min(1.0f, width / c());
        int i5 = 0;
        while (true) {
            if (i5 < 5) {
                if (d(width, min).getLineCount() <= 1) {
                    break;
                }
                min *= 0.97f;
                i5++;
            } else {
                ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/HorizontalCompressionTextView", "calculateScaleX", 237, "HorizontalCompressionTextView.java")).S(min, width);
                break;
            }
        }
        setTextScaleX(min);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            super.onMeasure(i, i2);
            return;
        }
        float c2 = c();
        float floatValue = ((Double) a.c()).floatValue();
        float pow = floatValue == 1.0f ? c2 : (1.0f - ((float) Math.pow(floatValue, c2))) / (1.0f - floatValue);
        setTextScaleX(pow / c2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) pow) + getCompoundPaddingLeft() + getCompoundPaddingRight(), mode), i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (isInLayout()) {
            forceLayout();
        } else {
            requestLayout();
        }
    }

    public HorizontalCompressionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSingleLine(true);
        setHorizontallyScrolling(false);
        setTransformationMethod(b);
    }
}
