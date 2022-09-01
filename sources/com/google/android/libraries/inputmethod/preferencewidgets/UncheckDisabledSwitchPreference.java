package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UncheckDisabledSwitchPreference extends SwitchPreference {
    public UncheckDisabledSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void D(Preference preference, boolean z) {
        super.D(preference, z);
        boolean z2 = this.x;
        this.x = false;
        if (z) {
            k(false);
        } else {
            k(((ino) t()).al(this.t, false, false));
        }
        this.x = z2;
    }
}
