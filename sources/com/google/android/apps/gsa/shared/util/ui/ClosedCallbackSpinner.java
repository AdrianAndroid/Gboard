package com.google.android.apps.gsa.shared.util.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClosedCallbackSpinner extends iz {
    private boolean e = false;
    private int f = -1;

    public ClosedCallbackSpinner(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!this.e || !z) {
            return;
        }
        this.e = false;
    }

    @Override // defpackage.iz, android.widget.Spinner, android.view.View
    public final boolean performClick() {
        this.e = true;
        return super.performClick();
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public final void setSelection(int i) {
        AdapterView.OnItemSelectedListener onItemSelectedListener;
        super.setSelection(i);
        if (i == this.f && (onItemSelectedListener = getOnItemSelectedListener()) != null) {
            onItemSelectedListener.onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
        this.e = false;
        this.f = i;
    }

    public ClosedCallbackSpinner(Context context, int i) {
        super(context, i);
    }

    public ClosedCallbackSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClosedCallbackSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ClosedCallbackSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.widget.AbsSpinner
    public final void setSelection(int i, boolean z) {
        AdapterView.OnItemSelectedListener onItemSelectedListener;
        super.setSelection(i, z);
        if (i == this.f && (onItemSelectedListener = getOnItemSelectedListener()) != null) {
            onItemSelectedListener.onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
        this.e = false;
        this.f = i;
    }
}
