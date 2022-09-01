package defpackage;

import android.content.Context;
import java.io.FileNotFoundException;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cuh  reason: default package */
/* loaded from: classes.dex */
public final class cuh {
    public static final hhl a = hhq.e("sticker_pack_recommendations_shared_packs_weight", 1.0d);
    public static final hhl b = hhq.e("sticker_pack_recommendations_favorited_packs_weight", 1.0d);
    public static final hhl c = hhq.e("sticker_pack_recommendations_favorited_packs_decay", 0.8d);
    public static final hhl d = hhq.e("sticker_pack_recommendations_score_threshold", 0.0d);
    public static final hhl e = hhq.f("sticker_pack_recommendations_cache_seconds", 120);
    public final mkr f;
    public final das g;
    public volatile cue h = new cue(0, -1, kcu.I());
    private final cuc i;
    private cug j;

    public cuh(Context context, mkr mkrVar) {
        cuc c2 = cuc.c(context);
        das a2 = das.a();
        this.f = mkrVar;
        this.i = c2;
        this.g = a2;
        this.j = b(c2, mkrVar);
    }

    private static cug b(cuc cucVar, mkr mkrVar) {
        Locale e2 = hqp.e();
        cub b2 = cucVar.b(e2);
        if (b2 == null || !b2.c.equals(e2)) {
            cucVar.d();
            b2 = null;
        }
        if (b2 == null) {
            return cug.a(hiz.k(kcu.J(new FileNotFoundException("No sticker pack similarity file returned from the superpacks manager"))), -1);
        }
        return cug.a(hiz.k(mkrVar.hQ(new bof(b2.a, 9))), b2.b);
    }

    public final synchronized cug a() {
        cuc cucVar = this.i;
        Locale e2 = hqp.e();
        cub b2 = cucVar.b(e2);
        int i = -1;
        if (b2 != null && b2.c.equals(e2)) {
            i = b2.b;
        }
        cug cugVar = this.j;
        if (i != cugVar.b || hji.d(cugVar.a)) {
            this.j = b(this.i, this.f);
        }
        return this.j;
    }
}
