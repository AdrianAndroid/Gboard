package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckableImageButton extends ig implements Checkable {
    private static final int[] c = {16842912};
    public boolean a;
    public boolean b;
    private boolean d;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.a) {
            return mergeDrawableStates(super.onCreateDrawableState(i + 1), c);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof kuv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        kuv kuvVar = (kuv) parcelable;
        super.onRestoreInstanceState(kuvVar.d);
        setChecked(kuvVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        kuv kuvVar = new kuv(super.onSaveInstanceState());
        kuvVar.a = this.a;
        return kuvVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.d) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f12690_resource_name_obfuscated_res_0x7f040496);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.d = true;
        aad.M(this, new kuu(this));
    }
}
