package com.google.android.libraries.inputmethod.widgets.positionable;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PositionableLinearLayout extends LinearLayout implements jeb {
    private final jec a = new jec();

    public PositionableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.jeb
    public final void a(int i, int i2) {
        this.a.a(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        jec jecVar = this.a;
        if (jecVar == null) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = new int[1];
        int i2 = jecVar.a;
        iArr[0] = i2 != 0 ? i2 != 1 ? i2 != 2 ? 16842915 : 16842917 : 16842918 : 16842916;
        return mergeDrawableStates(super.onCreateDrawableState(i + 1), iArr);
    }
}
