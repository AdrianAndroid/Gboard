package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ckr  reason: default package */
/* loaded from: classes.dex */
public final class ckr implements ifx {
    public static final hhl a = hhq.a("enable_expression_content_cache", true);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new ckq(context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(ckq.class, ckq.class, igf.AUTO_ASYNC_BACKGROUND);
        ify a2 = igb.a();
        a2.d(a);
        a2.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
        a2.a = new iiy[]{gwz.b, irz.a, hsd.a};
        b.g = a2;
        return b.a();
    }
}
