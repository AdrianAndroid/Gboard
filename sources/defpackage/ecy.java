package defpackage;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ecy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ecy implements ahv {
    public final /* synthetic */ TwoStatePreference a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ecy(cmx cmxVar, TwoStatePreference twoStatePreference, int i) {
        this.c = i;
        this.b = cmxVar;
        this.a = twoStatePreference;
    }

    public /* synthetic */ ecy(ino inoVar, TwoStatePreference twoStatePreference, int i) {
        this.c = i;
        this.b = inoVar;
        this.a = twoStatePreference;
    }

    @Override // defpackage.ahv
    public final boolean a(Preference preference, Object obj) {
        if (this.c != 0) {
            Object obj2 = this.b;
            TwoStatePreference twoStatePreference = this.a;
            if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                ((cmx) obj2).a.q(R.string.f160770_resource_name_obfuscated_res_0x7f14066d, bool.booleanValue());
                twoStatePreference.k(bool.booleanValue());
            }
            return false;
        }
        Object obj3 = this.b;
        TwoStatePreference twoStatePreference2 = this.a;
        if (obj instanceof Boolean) {
            Boolean bool2 = (Boolean) obj;
            ((aia) obj3).q(R.string.f160810_resource_name_obfuscated_res_0x7f140671, bool2.booleanValue());
            twoStatePreference2.k(bool2.booleanValue());
        }
        return false;
    }
}
