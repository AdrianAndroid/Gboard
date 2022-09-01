package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: aho  reason: default package */
/* loaded from: classes.dex */
public final class aho implements ahy {
    public static aho a;
    public static aho b;
    private final /* synthetic */ int c;

    public aho(int i) {
        this.c = i;
    }

    @Override // defpackage.ahy
    public final /* synthetic */ CharSequence a(Preference preference) {
        if (this.c != 0) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(R.string.f159060_resource_name_obfuscated_res_0x7f14059d) : editTextPreference.g;
        }
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.l())) {
            return listPreference.j.getString(R.string.f159060_resource_name_obfuscated_res_0x7f14059d);
        }
        return listPreference.l();
    }
}
