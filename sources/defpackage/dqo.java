package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dqo  reason: default package */
/* loaded from: classes.dex */
public final class dqo implements ifx {
    static final hhl a = hhq.a("enable_migration", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new dqn();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(dqe.class, dqn.class, igf.AUTO_ASYNC);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwz.b};
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
