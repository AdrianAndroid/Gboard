package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dmo  reason: default package */
/* loaded from: classes.dex */
public final class dmo implements ifx {
    private static final hhl a = hhq.a("enable_language_reporter", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new dmn();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(dml.class, dmn.class, igf.AUTO_ASYNC);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwz.b};
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
