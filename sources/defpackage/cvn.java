package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cvn  reason: default package */
/* loaded from: classes.dex */
public final class cvn implements ifx {
    private static final hhl a = hhq.a("enable_bitmoji_cache_refresh", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new cvm(context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(cvm.class, cvm.class, igf.AUTO_ASYNC_BACKGROUND);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwz.b, irz.a, hsd.a};
        a2.g = ((Long) cvb.g.c()).longValue();
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
