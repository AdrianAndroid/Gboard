package com.google.android.apps.inputmethod.latin.preference;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AdvancedSettingsFragment extends brr {
    @Override // defpackage.brr, com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.an
    public final void U() {
        super.U();
        PreferenceGroup preferenceGroup = (PreferenceGroup) g(R.string.f164600_resource_name_obfuscated_res_0x7f14080f);
        Object g = g(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
        if (preferenceGroup == null || g == null) {
            return;
        }
        if (dca.b(fS())) {
            Preference preference = (Preference) g;
            if (preference.I != preferenceGroup) {
                return;
            }
            preferenceGroup.ai(preference);
            preference.M(-1);
            fL().ah(preference);
            return;
        }
        PreferenceScreen fL = fL();
        Preference preference2 = (Preference) g;
        if (preference2.I != fL) {
            return;
        }
        fL.ai(preference2);
        preference2.M(-1);
        preferenceGroup.ah(preference2);
    }
}
