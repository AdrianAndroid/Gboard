package com.google.android.libraries.inputmethod.widgets.checkable;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckableLinearLayout extends LinearLayout implements Checkable {
    private boolean a;

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jea.a);
        this.a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.Checkable
    @ViewDebug.ExportedProperty
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        return !this.a ? super.onCreateDrawableState(i) : mergeDrawableStates(super.onCreateDrawableState(i + 1), new int[]{16842912});
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("super_state");
            this.a = bundle.getBoolean("checked");
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super_state", super.onSaveInstanceState());
        bundle.putBoolean("checked", this.a);
        return bundle;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (z != this.a) {
            this.a = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }
}
