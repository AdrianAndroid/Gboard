package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bvh  reason: default package */
/* loaded from: classes.dex */
public final class bvh implements ifx {
    private static final hhl a = hhq.a("enable_backup_clipboard_data", true);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new bvg(context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(bvg.class, bvg.class, igf.ON_DEMAND);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwu.b};
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
