package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: hxq  reason: default package */
/* loaded from: classes.dex */
public final class hxq implements ifx {
    static final hhl a = hhq.h("key_throttler_extension_language_tags", "zh,ko,ja");

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new hxp();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(hxl.class, hxp.class, igf.AUTO_UI);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwz.c};
        a2.b(new iga(a, null, null, false));
        b.g = a2;
        return b.a();
    }
}
