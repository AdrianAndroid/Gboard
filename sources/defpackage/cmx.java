package defpackage;

import android.content.Context;
import androidx.preference.TwoStatePreference;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cmx  reason: default package */
/* loaded from: classes.dex */
public final class cmx implements inj {
    public ino a;
    private final iqi b = iqi.a(cmo.a);

    @Override // defpackage.inj
    public final void a(Context context, ini iniVar) {
        this.a = ino.M(context);
        if (this.b.f() && !((String) cmo.b.c()).equals("-") && (!gqa.a(context).e || ((Boolean) cmo.p.c()).booleanValue())) {
            iniVar.x(R.string.f160770_resource_name_obfuscated_res_0x7f14066d);
            if (this.a.ah(R.string.f160770_resource_name_obfuscated_res_0x7f14066d)) {
                return;
            }
            if (!((Boolean) cmo.s.c()).booleanValue()) {
                Object g = iniVar.g(R.string.f160770_resource_name_obfuscated_res_0x7f14066d);
                if (!(g instanceof TwoStatePreference)) {
                    return;
                }
                TwoStatePreference twoStatePreference = (TwoStatePreference) g;
                twoStatePreference.n = new ecy(this, twoStatePreference, 1);
                iniVar.l(R.string.f160770_resource_name_obfuscated_res_0x7f14066d, false);
                return;
            }
            iniVar.l(R.string.f160770_resource_name_obfuscated_res_0x7f14066d, true);
            return;
        }
        iniVar.s(R.string.f160770_resource_name_obfuscated_res_0x7f14066d);
    }
}
