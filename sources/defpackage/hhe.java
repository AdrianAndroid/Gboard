package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: hhe  reason: default package */
/* loaded from: classes.dex */
public final class hhe implements ifx {
    private final /* synthetic */ int a;

    public hhe(int i) {
        this.a = i;
    }

    @Override // defpackage.ifx
    public final /* synthetic */ ifw a(Context context) {
        if (this.a == 0) {
            oll.e(context, "applicationContext");
            return new hhd(context);
        }
        oll.e(context, "applicationContext");
        lay e = lby.e(context);
        oll.d(e, "create(applicationContext)");
        return new hgj(e);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        if (this.a == 0) {
            oll.e(context, "applicationContext");
            ige b = igg.b(hhd.class, hhd.class, igf.AUTO_ASYNC_BACKGROUND);
            ify a = igb.a();
            a.i = hgj.class;
            a.d(hgg.a);
            a.d(hgg.b);
            b.g = a;
            return b.a();
        }
        oll.e(context, "applicationContext");
        ige b2 = igg.b(hgj.class, hgj.class, igf.ON_DEMAND);
        ify a2 = igb.a();
        a2.d(hgg.a);
        a2.a = new iiy[]{gwu.b};
        b2.g = a2;
        return b2.a();
    }
}
