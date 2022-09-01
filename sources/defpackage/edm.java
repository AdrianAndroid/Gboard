package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.extension.IGifKeyboardExtension;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: edm  reason: default package */
/* loaded from: classes.dex */
public final class edm implements ifx {
    public static final hhl a = hhq.h("unsupported_languages_for_gif_search", "iw,prs-AF,ur,ku,ps,ji,ug,trw,my,pa-Guru,ja");

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new edl();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        String string = context.getString(R.string.f155000_resource_name_obfuscated_res_0x7f1403a7);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwz.b, irz.a, hsd.a, irs.a};
        a2.g = ((Long) cvb.g.c()).longValue();
        a2.b(new iga(a, null, null, true));
        a2.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
        igc i = hek.i();
        i.b(ibz.a(string));
        iao b = iap.b();
        b.d(R.id.f54800_resource_name_obfuscated_res_0x7f0b01c8, jbt.n(context, R.string.f155000_resource_name_obfuscated_res_0x7f1403a7));
        ige b2 = igg.b(IGifKeyboardExtension.class, edl.class, igf.ON_DEMAND);
        b2.g = a2;
        b2.e = i;
        b2.f = b;
        return b2.a();
    }
}
