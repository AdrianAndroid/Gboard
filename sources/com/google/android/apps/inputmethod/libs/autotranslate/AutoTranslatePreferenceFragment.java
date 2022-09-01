package com.google.android.apps.inputmethod.libs.autotranslate;

import android.content.Context;
import androidx.preference.SwitchPreference;
import com.google.android.apps.inputmethod.libs.translate.SystemTranslateProvider;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AutoTranslatePreferenceFragment extends CommonPreferenceFragment {
    private SystemTranslateProvider c;

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final void aA() {
        Context fT = fT();
        SwitchPreference switchPreference = (SwitchPreference) aW(R.string.f160660_resource_name_obfuscated_res_0x7f140662);
        switchPreference.k(ino.M(fT).x(R.string.f160660_resource_name_obfuscated_res_0x7f140662, true));
        switchPreference.o = new bta(fT, switchPreference, 0);
        Context fS = fS();
        if (this.c == null) {
            this.c = new SystemTranslateProvider(fS);
        }
        this.c.a(fU().getConfiguration().locale, new eyi(this, fS, 1));
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final int aB() {
        return 0;
    }
}
