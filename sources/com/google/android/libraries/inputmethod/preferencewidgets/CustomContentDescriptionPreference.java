package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CustomContentDescriptionPreference extends Preference {
    public String a;

    public CustomContentDescriptionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        if (!TextUtils.isEmpty(this.a)) {
            aisVar.a.setContentDescription(this.a);
        }
    }
}
