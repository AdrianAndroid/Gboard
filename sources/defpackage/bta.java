package defpackage;

import android.content.Context;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bta  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bta implements ahw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bta(aik aikVar, PreferenceGroup preferenceGroup, int i) {
        this.c = i;
        this.b = aikVar;
        this.a = preferenceGroup;
    }

    public /* synthetic */ bta(Context context, SwitchPreference switchPreference, int i) {
        this.c = i;
        this.a = context;
        this.b = switchPreference;
    }

    public /* synthetic */ bta(dno dnoVar, PreferenceGroup preferenceGroup, int i) {
        this.c = i;
        this.b = dnoVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.ahw
    public final void a() {
        int i = this.c;
        if (i == 0) {
            ino.M((Context) this.a).q(R.string.f160660_resource_name_obfuscated_res_0x7f140662, ((TwoStatePreference) this.b).a);
        } else if (i == 1) {
            ((PreferenceGroup) this.a).af(Integer.MAX_VALUE);
            ((aik) this.b).e();
        } else {
            Object obj = this.b;
            Object obj2 = this.a;
            dno dnoVar = (dno) obj;
            dnoVar.f = true;
            boolean z = ((TwoStatePreference) dnoVar.c).a;
            PreferenceGroup preferenceGroup = (PreferenceGroup) obj2;
            int k = preferenceGroup.k();
            for (int i2 = 1; i2 < k; i2++) {
                preferenceGroup.o(i2).R(z);
            }
            dnoVar.b(k - 1, z);
            ieh.j().e(hxs.a, 8);
        }
    }
}
