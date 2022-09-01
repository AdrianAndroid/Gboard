package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* renamed from: haj  reason: default package */
/* loaded from: classes.dex */
public final class haj implements ifx {
    private static final hhl a = hhq.a("edge_to_edge", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        oll.e(context, "applicationContext");
        return new hai((Application) context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        oll.e(context, "applicationContext");
        ige b = igg.b(hai.class, hai.class, igf.AUTO_UI);
        ify a2 = igb.a();
        a2.d(a);
        a2.f = 30;
        b.g = a2;
        return b.a();
    }
}
