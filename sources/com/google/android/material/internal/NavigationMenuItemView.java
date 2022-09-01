package com.google.android.material.internal;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends kuz implements ha {
    private static final int[] d = {16842912};
    public boolean c;
    private int e;
    private final CheckedTextView i;
    private FrameLayout j;
    private go k;
    private final yd l;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.ha
    public final go a() {
        return this.k;
    }

    @Override // defpackage.ha
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ha
    public final void f(go goVar) {
        StateListDrawable stateListDrawable;
        this.k = goVar;
        int i = goVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != goVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.f9410_resource_name_obfuscated_res_0x7f040318, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(d, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            aad.O(this, stateListDrawable);
        }
        boolean isCheckable = goVar.isCheckable();
        refreshDrawableState();
        if (this.c != isCheckable) {
            this.c = isCheckable;
            this.l.d(this.i, 2048);
        }
        boolean isChecked = goVar.isChecked();
        refreshDrawableState();
        this.i.setChecked(isChecked);
        setEnabled(goVar.isEnabled());
        this.i.setText(goVar.d);
        Drawable icon = goVar.getIcon();
        if (icon != null) {
            int i2 = this.e;
            icon.setBounds(0, 0, i2, i2);
        }
        up.i(this.i, icon, null, null);
        View actionView = goVar.getActionView();
        if (actionView != null) {
            if (this.j == null) {
                this.j = (FrameLayout) ((ViewStub) findViewById(R.id.f53860_resource_name_obfuscated_res_0x7f0b0153)).inflate();
            }
            this.j.removeAllViews();
            this.j.addView(actionView);
        }
        setContentDescription(goVar.l);
        ez.d(this, goVar.m);
        go goVar2 = this.k;
        if (goVar2.d != null || goVar2.getIcon() != null || this.k.getActionView() == null) {
            this.i.setVisibility(0);
            FrameLayout frameLayout = this.j;
            if (frameLayout == null) {
                return;
            }
            kw kwVar = (kw) frameLayout.getLayoutParams();
            kwVar.width = -2;
            this.j.setLayoutParams(kwVar);
            return;
        }
        this.i.setVisibility(8);
        FrameLayout frameLayout2 = this.j;
        if (frameLayout2 == null) {
            return;
        }
        kw kwVar2 = (kw) frameLayout2.getLayoutParams();
        kwVar2.width = -1;
        this.j.setLayoutParams(kwVar2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        go goVar = this.k;
        if (goVar != null && goVar.isCheckable() && goVar.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kva kvaVar = new kva(this);
        this.l = kvaVar;
        q(0);
        LayoutInflater.from(context).inflate(R.layout.f133980_resource_name_obfuscated_res_0x7f0e006c, (ViewGroup) this, true);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.f33280_resource_name_obfuscated_res_0x7f070127);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.f53870_resource_name_obfuscated_res_0x7f0b0154);
        this.i = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        aad.M(checkedTextView, kvaVar);
    }
}
