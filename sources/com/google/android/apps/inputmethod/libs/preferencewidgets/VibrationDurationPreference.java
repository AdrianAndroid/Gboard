package com.google.android.apps.inputmethod.libs.preferencewidgets;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VibrationDurationPreference extends SeekBarDialogWithDefaultButtonPreference {
    private final Vibrator K;

    public VibrationDurationPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = (Vibrator) context.getSystemService("vibrator");
        this.z = Integer.valueOf(al());
    }

    private final int al() {
        return hxk.a(this.j).d;
    }

    private final int am() {
        int al = al();
        if (al > 0) {
            al++;
        }
        int H = ino.H(u(Integer.toString(al)), al);
        return H <= 0 ? H : H - 1;
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    protected final Object af(int i) {
        return Integer.valueOf(i);
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    public final String ag(int i) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setGroupingUsed(false);
        return this.j.getString(R.string.f150550_resource_name_obfuscated_res_0x7f1401aa, numberInstance.format(i));
    }

    public final String ah(int i) {
        if (i < 0) {
            return this.j.getString(true != jam.c ? R.string.f166120_resource_name_obfuscated_res_0x7f1408b8 : R.string.f166110_resource_name_obfuscated_res_0x7f1408b7);
        }
        return ag(i);
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference
    public final void aj(int i) {
        Vibrator vibrator = this.K;
        if (vibrator == null || i <= 0) {
            return;
        }
        vibrator.vibrate(i);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        n(ah(am()));
    }

    @Override // com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference, com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public final void k(View view) {
        super.k(view);
        ak(am());
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat, android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        super.onClick(dialogInterface, i);
        if (i == -3) {
            t().w(this.t);
            n(ah(al()));
        } else if (i != -1) {
        } else {
            int intValue = Integer.valueOf(ai()).intValue();
            if (!U(Integer.valueOf(intValue))) {
                return;
            }
            ab(Integer.toString(intValue != 0 ? intValue + 1 : intValue));
            n(ah(intValue));
        }
    }
}
