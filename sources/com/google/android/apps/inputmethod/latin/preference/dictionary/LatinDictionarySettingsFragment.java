package com.google.android.apps.inputmethod.latin.preference.dictionary;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.personaldictionary.preference.CrossProfileDictionaryPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinDictionarySettingsFragment extends brr {
    public LatinDictionarySettingsFragment() {
        gxo.c(10);
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final void aA() {
        Context fT = fT();
        if (!jez.e(fT)) {
            return;
        }
        Preference aW = aW(R.string.f165340_resource_name_obfuscated_res_0x7f14085d);
        CrossProfileDictionaryPreference crossProfileDictionaryPreference = new CrossProfileDictionaryPreference(aW.j);
        crossProfileDictionaryPreference.K(false);
        if (jez.i(fT)) {
            crossProfileDictionaryPreference.P(R.string.f165360_resource_name_obfuscated_res_0x7f14085f);
            crossProfileDictionaryPreference.N(R.string.f165350_resource_name_obfuscated_res_0x7f14085e);
            crossProfileDictionaryPreference.M(aW.p);
            aW.P(R.string.f166070_resource_name_obfuscated_res_0x7f1408b1);
            aW.N(R.string.f166060_resource_name_obfuscated_res_0x7f1408b0);
        } else {
            aW.P(R.string.f165360_resource_name_obfuscated_res_0x7f14085f);
            aW.N(R.string.f165350_resource_name_obfuscated_res_0x7f14085e);
            crossProfileDictionaryPreference.M(aW.p + 1);
            crossProfileDictionaryPreference.P(R.string.f166070_resource_name_obfuscated_res_0x7f1408b1);
            crossProfileDictionaryPreference.N(R.string.f166060_resource_name_obfuscated_res_0x7f1408b0);
        }
        fL().ah(crossProfileDictionaryPreference);
    }
}
