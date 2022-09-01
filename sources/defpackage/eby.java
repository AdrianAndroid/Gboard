package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eby  reason: default package */
/* loaded from: classes.dex */
public final class eby implements ifx {
    static final hhl a = hhq.a("emotion_model_enabled", false);
    static final hhl b = hhq.h("emotion_model_enabled_locales", "en");

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new ebx();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b2 = igg.b(ebv.class, ebx.class, igf.AUTO_ASYNC_BACKGROUND);
        ify a2 = igb.a();
        a2.d(a);
        a2.c = context.getString(R.string.f160720_resource_name_obfuscated_res_0x7f140668);
        a2.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
        a2.a = new iiy[]{gwz.c, irz.a, hsd.a};
        a2.g = ((Long) cvb.g.c()).longValue();
        a2.b(new iga(b, null, null, false));
        b2.g = a2;
        return b2.a();
    }
}
