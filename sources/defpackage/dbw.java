package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dbw  reason: default package */
/* loaded from: classes.dex */
public final class dbw implements ifx {
    private static final hhl a = hhq.a("enable_fake_app_completion", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new dbv();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(dbx.class, dbv.class, igf.AUTO_ASYNC_BACKGROUND);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwz.b};
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
