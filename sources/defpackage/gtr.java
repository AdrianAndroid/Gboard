package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: gtr  reason: default package */
/* loaded from: classes.dex */
public final class gtr implements ifx {
    protected static final hhl a = hhq.a("enable_managed_device_check", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new gtq(context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(gtq.class, gtq.class, igf.AUTO_ASYNC);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwu.b};
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
