package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cga  reason: default package */
/* loaded from: classes.dex */
public final class cga implements ifx {
    public static final hhl a = hhq.a("enable_device_intelligence", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new cfz(context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(cfr.class, cfz.class, igf.AUTO_UI);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwz.b, hsd.a};
        a2.f = 30;
        a2.c = context.getString(R.string.f161950_resource_name_obfuscated_res_0x7f1406e4);
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
