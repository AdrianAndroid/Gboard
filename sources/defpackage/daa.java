package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: daa  reason: default package */
/* loaded from: classes.dex */
public final class daa implements ifx {
    public static final hhl a = hhq.a("enable_expression_training_cache_processor", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new czz();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(dae.class, czz.class, igf.ON_DEMAND);
        ify a2 = igb.a();
        a2.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
        a2.a = new iiy[]{gwz.b};
        a2.d(a);
        a2.i = iwl.class;
        b.g = a2;
        return b.a();
    }
}
