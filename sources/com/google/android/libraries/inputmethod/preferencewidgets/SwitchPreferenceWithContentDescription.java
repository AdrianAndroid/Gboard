package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceWithContentDescription extends SwitchPreference {
    private static final int[] c = {16843379};
    private final String d;

    public SwitchPreferenceWithContentDescription(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
        this.d = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        String str = this.d;
        if (str != null) {
            aisVar.a.setContentDescription(str);
        }
    }
}
