package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cwc  reason: default package */
/* loaded from: classes.dex */
public final class cwc {
    public final String b;
    public final cvx c;
    private final iqi g = iqi.a(cwz.a);
    private final idk h;
    private final ScheduledExecutorService i;
    private final cwf j;
    private static final hhl d = hhq.f("contextual_bitmoji_timeout_ms", -1);
    private static final hhl e = hhq.a("enable_contextual_bitmoji_query_provider", false);
    private static final hhl f = hhq.a("merge_bitmoji_contextual_packs", false);
    public static final hhl a = hhq.f("max_num_of_bitmoji_contextual_packs_merged", 3);

    public cwc(Context context, cvx cvxVar, idk idkVar, ScheduledExecutorService scheduledExecutorService) {
        this.c = cvxVar;
        this.h = idkVar;
        this.i = scheduledExecutorService;
        this.j = new cwf(context);
        this.b = context.getResources().getString(R.string.f149780_resource_name_obfuscated_res_0x7f140144);
    }

    public final hiz a() {
        hiz b;
        hiz x;
        if (!this.g.l()) {
            return hiz.n(llp.q());
        }
        idn a2 = this.h.a(ctg.STICKERS_BITMOJI_CONTEXTUAL_FETCHER_GET_CONTEXTUAL_PACKS);
        if (((Boolean) e.c()).booleanValue()) {
            b = this.j.a();
        } else {
            b = clr.a().b();
        }
        if (((Boolean) f.c()).booleanValue()) {
            x = b.v(new coa(this, 4), mjl.a).x(d, TimeUnit.MILLISECONDS, this.i);
        } else {
            x = b.v(new coa(this, 5), mjl.a).x(d, TimeUnit.MILLISECONDS, this.i);
        }
        Objects.requireNonNull(a2);
        x.d(new cvj(a2, 4), mjl.a);
        return x;
    }
}
