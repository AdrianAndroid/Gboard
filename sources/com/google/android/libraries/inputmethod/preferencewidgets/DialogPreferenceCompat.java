package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DialogPreferenceCompat extends DialogPreference implements DialogInterface.OnClickListener {
    public inu L;

    public DialogPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = true;
        this.C = false;
    }

    public void ae(cv cvVar) {
    }

    public void k(View view) {
    }

    public void l(boolean z) {
    }

    public void o(cu cuVar) {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        inu inuVar = this.L;
        if (inuVar != null) {
            ((aic) inuVar).ag = i;
        }
    }
}
