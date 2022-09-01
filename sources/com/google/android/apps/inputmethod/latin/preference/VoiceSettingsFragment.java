package com.google.android.apps.inputmethod.latin.preference;

import android.text.Spanned;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import com.android.settingslib.widget.MainSwitchPreference;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;
import com.google.android.libraries.inputmethod.preferencewidgets.LinkableSwitchPreference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VoiceSettingsFragment extends CommonPreferenceFragment {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/latin/preference/VoiceSettingsFragment");
    private ija d;

    @Override // defpackage.an
    public final void T() {
        super.T();
        ija ijaVar = this.d;
        if (ijaVar != null) {
            ijaVar.f();
            this.d = null;
        }
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.an
    public final void U() {
        dxs dxsVar;
        Preference aW;
        PreferenceGroup preferenceGroup;
        super.U();
        if (guv.a() && (preferenceGroup = (aW = aW(R.string.f161110_resource_name_obfuscated_res_0x7f14068f)).I) != null) {
            preferenceGroup.ai(aW);
            MainSwitchPreference mainSwitchPreference = new MainSwitchPreference(fT());
            mainSwitchPreference.M(aW.p);
            mainSwitchPreference.Q(aW.q);
            mainSwitchPreference.n(aW.m());
            mainSwitchPreference.L(aW.t);
            mainSwitchPreference.n = aW.n;
            mainSwitchPreference.K(false);
            preferenceGroup.ah(mainSwitchPreference);
        }
        ap B = B();
        if (B != null && (dxsVar = (dxs) jca.b().orElse(null)) != null) {
            LinkableSwitchPreference linkableSwitchPreference = (LinkableSwitchPreference) aW(R.string.f160780_resource_name_obfuscated_res_0x7f14066e);
            String str = ((fgw) ((AtomicReference) dxsVar.b).get()).e;
            if (str.isEmpty()) {
                str = fT().getString(true != dxsVar.a() ? R.string.f164210_resource_name_obfuscated_res_0x7f1407e6 : R.string.f164200_resource_name_obfuscated_res_0x7f1407e5);
            }
            Spanned a = dxf.c(B, llw.l("learningcenterlink", new chf(new bw(this, dxsVar, 20, null), 10))).a(str);
            if (!TextUtils.equals(a, linkableSwitchPreference.c)) {
                linkableSwitchPreference.c = a;
                linkableSwitchPreference.d();
            }
        }
        SwitchPreference switchPreference = (SwitchPreference) g(R.string.f160930_resource_name_obfuscated_res_0x7f14067d);
        if (switchPreference != null) {
            switchPreference.n = brp.a;
        }
        Object g = g(R.string.f162490_resource_name_obfuscated_res_0x7f14071a);
        if (g != null) {
            ap B2 = B();
            if (B2 != null) {
                ((Preference) g).o = new bro(B2, 0);
            } else {
                ((ltd) ((ltd) c.c()).k("com/google/android/apps/inputmethod/latin/preference/VoiceSettingsFragment", "updateAgsaVoiceSettingsPref", 113, "VoiceSettingsFragment.java")).t("No activity associated with fragment.");
            }
        }
        SwitchPreference switchPreference2 = (SwitchPreference) g(R.string.f161100_resource_name_obfuscated_res_0x7f14068e);
        if (switchPreference2 != null) {
            ap B3 = B();
            if (B3 == null) {
                ((ltd) ((ltd) c.c()).k("com/google/android/apps/inputmethod/latin/preference/VoiceSettingsFragment", "setupVoiceDonationPref", 132, "VoiceSettingsFragment.java")).t("No activity associated with fragment.");
            } else {
                fbf.f(B3);
                switchPreference2.n = new dnk(B3, 1);
                switchPreference2.J(ijf.i(gto.a));
            }
        }
        if (this.d == null) {
            this.d = ijf.c(new bqj(this, 5), new bqj(this, 6), gto.a);
        }
        this.d.e(gyc.b);
    }

    public final void az(boolean z) {
        SwitchPreference switchPreference = (SwitchPreference) g(R.string.f161100_resource_name_obfuscated_res_0x7f14068e);
        if (switchPreference == null) {
            return;
        }
        switchPreference.J(z);
    }
}
