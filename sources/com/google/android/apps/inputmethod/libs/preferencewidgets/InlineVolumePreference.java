package com.google.android.apps.inputmethod.libs.preferencewidgets;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InlineVolumePreference extends InlineSeekBarPreference {
    public InlineVolumePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.InlineSeekBarPreference
    public final void l(int i) {
        aa(i * ((InlineSeekBarPreference) this).d);
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.InlineSeekBarPreference
    public final int o(int i) {
        return Math.round(p(i * ((InlineSeekBarPreference) this).d) / ((InlineSeekBarPreference) this).d);
    }
}
