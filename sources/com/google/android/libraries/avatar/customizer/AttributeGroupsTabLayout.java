package com.google.android.libraries.avatar.customizer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AttributeGroupsTabLayout extends kyv {
    public AttributeGroupsTabLayout(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kyv, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        double ceil;
        super.onMeasure(i, i2);
        if (b() == 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = viewGroup.getChildAt(0).getMeasuredWidth();
        float f = measuredWidth;
        float f2 = measuredWidth2;
        if (f >= ((childCount - 1) + 0.4f) * f2) {
            return;
        }
        int i3 = measuredWidth / measuredWidth2;
        float f3 = (f / f2) % 1.0f;
        if (f3 >= 0.6f) {
            ceil = Math.ceil(f / (i3 + 0.6f));
        } else if (f3 > 0.4f) {
            return;
        } else {
            ceil = Math.ceil(f / ((i3 - 1) + 0.6f));
        }
        int i4 = (int) ceil;
        for (int i5 = 0; i5 < childCount; i5++) {
            viewGroup.getChildAt(i5).setMinimumWidth(i4);
        }
    }

    public AttributeGroupsTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AttributeGroupsTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
