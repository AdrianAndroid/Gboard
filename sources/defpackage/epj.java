package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: epj  reason: default package */
/* loaded from: classes.dex */
public final class epj implements ifx {
    private static final hhl a = hhq.a("enable_backup_customized_theme", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new epi(context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(epi.class, epi.class, igf.ON_DEMAND);
        ify a2 = igb.a();
        a2.d(a);
        a2.a = new iiy[]{gwu.b};
        b.g = a2;
        return b.a();
    }
}
