package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceImageView extends ImageView {
    private int a;
    private int b;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView
    public final int getMaxHeight() {
        return this.b;
    }

    @Override // android.widget.ImageView
    public final int getMaxWidth() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r0 == 0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r3) goto Lf
            if (r0 != 0) goto L1f
            r0 = 0
        Lf:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r5 = r6.a
            if (r5 == r2) goto L1f
            if (r5 < r4) goto L1b
            if (r0 != 0) goto L1f
        L1b:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
        L1f:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 == r3) goto L28
            if (r0 != 0) goto L39
            goto L29
        L28:
            r1 = r0
        L29:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r4 = r6.b
            if (r4 == r2) goto L39
            if (r4 < r0) goto L35
            if (r1 != 0) goto L39
        L35:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
        L39:
            super.onMeasure(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.internal.PreferenceImageView.onMeasure(int, int):void");
    }

    @Override // android.widget.ImageView
    public final void setMaxHeight(int i) {
        this.b = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public final void setMaxWidth(int i) {
        this.a = i;
        super.setMaxWidth(i);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.j, i, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
}
