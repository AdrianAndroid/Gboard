package defpackage;

import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.android.inputmethod.latin.R;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: dno  reason: default package */
/* loaded from: classes.dex */
public final class dno {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/languageselection/preference/MultilingualSettings");
    public final PreferenceGroup b;
    public final SwitchPreference c;
    final HashSet d = new HashSet();
    int e = -1;
    public boolean f;
    Boolean g;

    public dno(PreferenceGroup preferenceGroup) {
        this.b = preferenceGroup;
        SwitchPreference switchPreference = new SwitchPreference(preferenceGroup.j);
        this.c = switchPreference;
        switchPreference.k(true);
        switchPreference.K(false);
        switchPreference.P(R.string.f165300_resource_name_obfuscated_res_0x7f140859);
        switchPreference.o = new bta(this, preferenceGroup, 2);
    }

    public final void b(int i, boolean z) {
        if (i == 0) {
            this.c.N(R.string.f165280_resource_name_obfuscated_res_0x7f140857);
        } else if (z) {
            this.c.N(R.string.f165290_resource_name_obfuscated_res_0x7f140858);
        } else {
            this.c.n(null);
        }
    }

    public final lmz a() {
        return ((TwoStatePreference) this.c).a ? lmz.p(this.d) : lrr.a;
    }
}
