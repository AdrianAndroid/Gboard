package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: jdm  reason: default package */
/* loaded from: classes.dex */
public class jdm extends FrameLayout {
    private float a = 1.0f;

    public jdm(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.setScaleX(this.a);
        view.setScaleY(this.a);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        super.addView(view, i, layoutParams);
    }

    public final void k(float f) {
        if (this.a == f) {
            return;
        }
        this.a = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof jdm) {
                ((jdm) childAt).k(f);
            } else {
                childAt.setScaleX(this.a);
                childAt.setScaleY(this.a);
                childAt.setPivotX(0.0f);
                childAt.setPivotY(0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L29
            float r0 = r4.a
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 == 0) goto L29
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L29
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            float r6 = (float) r6
            float r0 = r4.a
            float r6 = r6 / r0
            int r6 = java.lang.Math.round(r6)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r2)
            super.onMeasure(r5, r6)
            goto L2c
        L29:
            super.onMeasure(r5, r6)
        L2c:
            float r5 = r4.a
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L61
            int r5 = r4.getPaddingLeft()
            int r6 = r4.getPaddingRight()
            int r5 = r5 + r6
            int r6 = r4.getPaddingTop()
            int r0 = r4.getPaddingBottom()
            int r6 = r6 + r0
            int r0 = r4.getMeasuredWidth()
            int r0 = r0 - r5
            float r0 = (float) r0
            float r1 = r4.a
            float r0 = r0 * r1
            float r5 = (float) r5
            float r0 = r0 + r5
            int r5 = (int) r0
            int r0 = r4.getMeasuredHeight()
            int r0 = r0 - r6
            float r0 = (float) r0
            float r1 = r4.a
            float r0 = r0 * r1
            float r6 = (float) r6
            float r0 = r0 + r6
            int r6 = (int) r0
            r4.setMeasuredDimension(r5, r6)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdm.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        super.onViewRemoved(view);
    }

    public jdm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jdm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
