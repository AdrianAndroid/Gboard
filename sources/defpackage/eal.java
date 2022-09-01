package defpackage;

import android.content.Context;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eal  reason: default package */
/* loaded from: classes.dex */
public final class eal {
    public static final hhl a = hhq.f("contextual_emoji_kitchen_result_ordering_strategy", 0);
    public static final hhl b = hhq.f("max_num_contextual_emoji_kitchen_results", 8);
    static final hhl c = hhq.a("enable_curated_emoji_kitchen", false);
    public static final hhl d = hhq.a("randomize_order_of_curated_emoji_kitchen_results", true);
    public final dzi e;
    public final lgb f;
    private final cri g;
    private final iqi h = iqi.a(dzn.c);
    private final Executor i;

    public eal(Context context) {
        cri b2 = cri.b(context, "recent_content_suggestion_shared");
        hrx.y(context);
        dzi a2 = dzi.a(context);
        lgb n = jdg.n(new drf(context, 7));
        mks a3 = gxo.a(1);
        this.g = b2;
        this.i = a3;
        this.e = a2;
        this.f = n;
    }

    public final hiz a() {
        hiz n;
        hiz p;
        if (!this.h.o() || ((Long) b.c()).longValue() < 0) {
            n = hiz.n(llp.q());
        } else {
            n = hiz.p(new evl(this, 1), this.i);
        }
        if (!((Boolean) c.c()).booleanValue()) {
            p = hiz.n(llp.q());
        } else {
            p = hiz.p(new bof(this, 20), this.i);
        }
        llp llpVar = (llp) Collection$EL.stream(this.g.e()).map(dwn.k).collect(ljr.a);
        if (((Boolean) dzn.a.c()).booleanValue()) {
            llpVar = fgy.o(llpVar);
        }
        return hiz.L(n, p).d(new cak(llpVar, n, p, 6), this.i);
    }

    public final List b(String str) {
        return (List) Collection$EL.stream(this.e.c(ffb.l(str))).map(dwn.l).collect(Collectors.toCollection(cag.h));
    }
}
