package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: brj  reason: default package */
/* loaded from: classes.dex */
public final class brj implements inj {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/latin/preference/LatinVoiceInputPreferenceInitializer");

    @Override // defpackage.inj
    public final void a(Context context, ini iniVar) {
        boolean booleanValue = ((Boolean) jca.b().map(byw.b).orElse(false)).booleanValue();
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/latin/preference/LatinVoiceInputPreferenceInitializer", "initializePreference", 20, "LatinVoiceInputPreferenceInitializer.java")).w("avt available = %s", Boolean.valueOf(booleanValue));
        iniVar.w(R.string.f160780_resource_name_obfuscated_res_0x7f14066e, booleanValue);
        iniVar.w(R.string.f160790_resource_name_obfuscated_res_0x7f14066f, booleanValue);
        if (!booleanValue) {
            iniVar.l(R.string.f160780_resource_name_obfuscated_res_0x7f14066e, false);
            iniVar.l(R.string.f160790_resource_name_obfuscated_res_0x7f14066f, false);
        }
    }
}
