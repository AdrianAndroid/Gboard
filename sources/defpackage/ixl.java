package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ixl  reason: default package */
/* loaded from: classes.dex */
public final class ixl implements ifx {
    public static final hhl a = hhq.a("enable_dynamic_trainer", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new ixk(context, gxo.c(19));
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(ixm.class, ixk.class, igf.AUTO_ASYNC_BACKGROUND);
        ify a2 = igb.a();
        a2.d(a);
        a2.a = new iiy[]{gwu.b, hgl.a};
        b.g = a2;
        return b.a();
    }
}
