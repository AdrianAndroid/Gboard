package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private boolean a;
    private boolean b;
    private int c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ei.k);
        aad.L(this, context, ei.k, attributeSet, obtainStyledAttributes, 0, 0);
        this.a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            b(this.a);
        }
    }

    private final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void b(boolean z) {
        if (this.b != z) {
            if (z && !this.a) {
                return;
            }
            this.b = z;
            setOrientation(z ? 1 : 0);
            setGravity(true != z ? 80 : 8388613);
            View findViewById = findViewById(R.id.f128840_resource_name_obfuscated_res_0x7f0b210a);
            if (findViewById != null) {
                findViewById.setVisibility(true != z ? 4 : 8);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0047, code lost:
        if (r1 != false) goto L21;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            boolean r1 = r6.a
            r2 = 0
            if (r1 == 0) goto L16
            int r1 = r6.c
            if (r0 <= r1) goto L14
            boolean r1 = r6.b
            if (r1 == 0) goto L14
            r6.b(r2)
        L14:
            r6.c = r0
        L16:
            boolean r1 = r6.b
            r3 = 1
            if (r1 != 0) goto L2b
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 1
            goto L2d
        L2b:
            r0 = r7
            r1 = 0
        L2d:
            super.onMeasure(r0, r8)
            boolean r0 = r6.a
            if (r0 == 0) goto L47
            boolean r0 = r6.b
            if (r0 != 0) goto L47
            int r0 = r6.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L47
            r6.b(r3)
            goto L49
        L47:
            if (r1 == 0) goto L4c
        L49:
            super.onMeasure(r7, r8)
        L4c:
            int r0 = r6.a(r2)
            if (r0 < 0) goto L95
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            int r5 = r6.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r5 = r5 + r1
            int r1 = r4.topMargin
            int r5 = r5 + r1
            int r1 = r4.bottomMargin
            int r5 = r5 + r1
            boolean r1 = r6.b
            if (r1 == 0) goto L8f
            int r0 = r0 + r3
            int r0 = r6.a(r0)
            if (r0 < 0) goto L96
            android.view.View r0 = r6.getChildAt(r0)
            int r0 = r0.getPaddingTop()
            android.content.res.Resources r1 = r6.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            int r0 = r0 + r1
            goto L93
        L8f:
            int r0 = r6.getPaddingBottom()
        L93:
            int r5 = r5 + r0
            goto L96
        L95:
            r5 = 0
        L96:
            int r0 = defpackage.aad.g(r6)
            if (r0 == r5) goto La4
            r6.setMinimumHeight(r5)
            if (r8 != 0) goto La4
            super.onMeasure(r7, r2)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
