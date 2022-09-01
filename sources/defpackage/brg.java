package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: brg  reason: default package */
/* loaded from: classes.dex */
public final class brg implements inj {
    private hqq a;

    @Override // defpackage.inj
    public final void a(Context context, ini iniVar) {
        Object g = iniVar.g(R.string.f162410_resource_name_obfuscated_res_0x7f140712);
        if (hjg.r() && g != null) {
            brf brfVar = new brf((Preference) g, context);
            this.a = brfVar;
            brfVar.d(mjl.a);
        }
        if (gqa.a(context).e) {
            iniVar.t(R.string.f162400_resource_name_obfuscated_res_0x7f140711);
        }
        if (iniVar.g(R.string.f162430_resource_name_obfuscated_res_0x7f140714) != null) {
            iniVar.t(R.string.f162430_resource_name_obfuscated_res_0x7f140714);
        }
        Object g2 = iniVar.g(R.string.f162450_resource_name_obfuscated_res_0x7f140716);
        if (g2 != null) {
            if (((Boolean) emb.a.c()).booleanValue()) {
                ((Preference) g2).o = new bro(iniVar, 1);
            } else {
                iniVar.t(R.string.f162450_resource_name_obfuscated_res_0x7f140716);
            }
        }
        if (iniVar.g(R.string.f162470_resource_name_obfuscated_res_0x7f140718) != null) {
            if (((Boolean) bss.a.c()).booleanValue() && li.e()) {
                return;
            }
            iniVar.t(R.string.f162470_resource_name_obfuscated_res_0x7f140718);
        }
    }
}
