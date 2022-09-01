package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cua  reason: default package */
/* loaded from: classes.dex */
public final class cua implements ifx {
    static final hhl a = hhq.a("preload_sticker_pack_similarity", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new ctz();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(cty.class, ctz.class, igf.AUTO_ASYNC_BACKGROUND);
        ify a2 = igb.a();
        a2.d(a);
        a2.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
        a2.a = new iiy[]{gwz.c};
        a2.g = ((Long) cvb.g.c()).longValue();
        b.g = a2;
        return b.a();
    }
}
