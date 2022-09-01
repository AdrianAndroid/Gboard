package com.google.android.apps.inputmethod.libs.preferencewidgets;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.security.InvalidParameterException;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LongPressDelayPreference extends SeekBarDialogWithDefaultButtonPreference {
    private final int K;
    private final int M;

    public LongPressDelayPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dby.c);
        this.K = obtainStyledAttributes.getInteger(0, 100);
        int integer = obtainStyledAttributes.getInteger(1, 10);
        this.M = integer;
        if (integer == 0) {
            throw new InvalidParameterException("valueInterval should not equal to zero.");
        }
        obtainStyledAttributes.recycle();
    }

    private final int al() {
        return Integer.parseInt(u("0"));
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    protected final Object af(int i) {
        return Integer.valueOf(this.K + (i * this.M));
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    public final String ag(int i) {
        return ah(((Integer) af(i)).intValue());
    }

    public final String ah(int i) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setGroupingUsed(false);
        return this.j.getString(R.string.f150550_resource_name_obfuscated_res_0x7f1401aa, numberInstance.format(i));
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        n(ah(al()));
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference, com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public final void k(View view) {
        super.k(view);
        ak((Integer.valueOf(al()).intValue() - this.K) / this.M);
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat, android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        super.onClick(dialogInterface, i);
        if (i == -3) {
            t().w(this.t);
            n(ah(al()));
        } else if (i != -1) {
        } else {
            int intValue = ((Integer) af(ai())).intValue();
            if (!U(Integer.valueOf(intValue))) {
                return;
            }
            ab(String.valueOf(intValue));
            n(ah(intValue));
        }
    }
}
