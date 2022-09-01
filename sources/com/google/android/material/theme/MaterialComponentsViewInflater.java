package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final hz a(Context context, AttributeSet attributeSet) {
        return new kyx(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final ia b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final ib c(Context context, AttributeSet attributeSet) {
        return new ktn(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final ik d(Context context, AttributeSet attributeSet) {
        return new kwp(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
