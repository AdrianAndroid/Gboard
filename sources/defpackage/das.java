package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: das  reason: default package */
/* loaded from: classes.dex */
public final class das {
    public static final hhl a = hhq.a("enable_sticker_share_usage_histogram", false);
    public final Executor b;
    public final kqr c;
    private final idk d;

    public das(kqi kqiVar, Executor executor, idk idkVar) {
        kqg a2 = kqh.a();
        kor a3 = kos.a(guw.a());
        a3.d("protodatastore");
        a3.e("ExpressionUsageHistogram.pb");
        a2.f(a3.a());
        a2.e(dao.b);
        this.c = kqiVar.a(a2.a());
        this.b = executor;
        this.d = idkVar;
    }

    public static das a() {
        return new das(ift.a(), gxo.a(10), ieh.j());
    }

    public final hiz b(dan... danVarArr) {
        if (!((Boolean) a.c()).booleanValue()) {
            return hiz.n(null);
        }
        idn a2 = this.d.a(ctg.USAGE_HISTOGRAM_STORE_INCREMENT_COUNTER);
        hiz k = hiz.k(this.c.b(new cxo(danVarArr, System.currentTimeMillis(), 2), this.b));
        Objects.requireNonNull(a2);
        k.d(new cvj(a2, 8), mjl.a);
        return k;
    }
}
