package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ixz  reason: default package */
/* loaded from: classes.dex */
public final class ixz implements ifx {
    static final hhl a = hhq.a("enable_training_process_termination", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new ixy(context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(ixu.class, ixy.class, igf.AUTO_ASYNC_BACKGROUND);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwu.b};
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
