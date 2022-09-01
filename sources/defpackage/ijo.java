package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ijo  reason: default package */
/* loaded from: classes.dex */
public final class ijo implements ifx {
    static final hhl a = hhq.a("enable_on_device_metrics_aggregation", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new ijp();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(ijm.class, ijp.class, igf.ON_DEMAND);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwu.b};
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
