package defpackage;

import android.content.Context;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: ejq  reason: default package */
/* loaded from: classes.dex */
public final class ejq {
    public static final hhl a = hhq.h("curated_gif_urls", "");
    public static final hhl b = hhq.f("universal_media_trending_cache_max_age_seconds", 604800);

    public static hja a(Context context, cma cmaVar) {
        hja b2;
        hja d;
        hiz a2 = cmaVar.a();
        String str = (String) a.c();
        if (!str.isEmpty()) {
            if (str.isEmpty() || !jam.t(context)) {
                d = hjg.d(Collections.emptyList().iterator());
            } else {
                d = hjg.c(kcu.K(llp.o(lre.H(lfy.c(',').b().h().k(str), ehk.q))));
            }
            b2 = b(d, a2);
        } else {
            cxy cxyVar = new cxy();
            String str2 = (String) cyj.i.c();
            if (str2 != null) {
                cxyVar.a = str2;
                String str3 = (String) cyj.a.c();
                if (str3 != null) {
                    cxyVar.b = str3;
                    cxyVar.c(-1L);
                    cxyVar.c = 4;
                    cxyVar.c(((Long) b.c()).longValue());
                    b2 = b(hjg.g(((cmb) cmaVar).c.k(cxyVar.a()), cli.d, mjl.a), a2);
                } else {
                    throw new NullPointerException("Null contentFilterLevel");
                }
            } else {
                throw new NullPointerException("Null baseUrl");
            }
        }
        return hjg.d(lre.R(hjg.c(a2.v(new coa(b2, 20), mjl.a)), b2));
    }

    private static hja b(hja hjaVar, hiz hizVar) {
        return hjg.g(hjaVar, new ebi(hizVar, 8), mjl.a);
    }
}
