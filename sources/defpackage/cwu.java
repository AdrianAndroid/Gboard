package defpackage;

import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cwu  reason: default package */
/* loaded from: classes.dex */
public final class cwu implements cwx {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/sticker/MultiStickerFetcher");
    private final llp b;
    private final mks c;
    private final idk d;
    private final long e = cva.e;

    public cwu(cwx cwxVar, cwx... cwxVarArr) {
        mks c = gxo.c(9);
        ieh j = ieh.j();
        this.c = c;
        this.d = j;
        llk e = llp.e();
        e.h(cwxVar);
        e.i(cwxVarArr);
        this.b = e.g();
    }

    private static mko b(Iterable iterable) {
        llp i = llp.i(iterable);
        return kcu.W(i).a(new bof(i, 13), mjl.a);
    }

    public final mko a(mko mkoVar) {
        long j = this.e;
        return j > 0 ? kcu.R(mkoVar, j, TimeUnit.MILLISECONDS, this.c) : mkoVar;
    }

    @Override // defpackage.cwx
    public final hja e(String str) {
        throw null;
    }

    @Override // defpackage.cwx
    public final mko k(int i) {
        idn a2 = this.d.a(ctg.STICKERS_MULTI_FETCHER_GET_PACKS);
        mko b = b(lre.ab(this.b, new cus(this, 4)));
        Objects.requireNonNull(a2);
        b.d(new cvj(a2, 7), mjl.a);
        return b;
    }

    @Override // defpackage.cwx
    public final mko n(String str) {
        idn a2 = this.d.a(ctg.STICKERS_MULTI_FETCHER_SUGGEST);
        mko b = b(lre.ab(this.b, new cjq(this, str, 5)));
        Objects.requireNonNull(a2);
        b.d(new cvj(a2, 7), mjl.a);
        return b;
    }
}
