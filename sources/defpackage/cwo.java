package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cwo  reason: default package */
/* loaded from: classes.dex */
public final class cwo implements cwx {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/sticker/ExpressiveStickerFetcher");
    public final lgb b;
    public final mkr c;
    public final idk d;
    private final cya e;
    private final mks f;
    private final dxs g;

    public cwo(lgb lgbVar, mkr mkrVar, mks mksVar, dxs dxsVar, cya cyaVar, idk idkVar, byte[] bArr, byte[] bArr2) {
        this.b = lgbVar;
        this.c = mkrVar;
        this.f = mksVar;
        this.g = dxsVar;
        this.e = cyaVar;
        this.d = idkVar;
    }

    public static cwo a(Context context) {
        return new cwo(cwn.c(context.getApplicationContext()), gxo.a(10), gxo.c(10), dxs.u(), cya.a(), ieh.j(), null, null);
    }

    @Override // defpackage.cwx
    public final hja e(String str) {
        if (!((Boolean) cwz.d.c()).booleanValue()) {
            return hjg.e(new buf(this, str, 4));
        }
        dxs dxsVar = this.g;
        czd i = cze.i();
        if (str == null) {
            throw new NullPointerException("Null query");
        }
        ((cxw) i).b = str;
        return hjg.g(dxsVar.k(i.a()), cuv.g, this.c);
    }

    @Override // defpackage.cwx
    public final mko k(int i) {
        mko g;
        idn a2 = this.d.a(ctg.STICKERS_EXPRESSIVE_FETCHER_GET_PACKS);
        knk knkVar = ((cwn) this.b).a().a;
        if (i == 1) {
            g = mio.g(((knn) knkVar).d(), jky.r, mjl.a);
        } else {
            knn knnVar = (knn) knkVar;
            g = mio.g(knnVar.d(), new kdw(knnVar, 5), knnVar.a);
        }
        mko L = kcu.L(kcu.R(mio.g(g, cuv.h, this.c), 30L, TimeUnit.SECONDS, this.f));
        Objects.requireNonNull(a2);
        L.d(new cvj(a2, 6), mjl.a);
        return L;
    }

    @Override // defpackage.cwx
    public final mko n(String str) {
        idn a2 = this.d.a(ctg.STICKERS_EXPRESSIVE_FETCHER_SUGGEST);
        cya cyaVar = this.e;
        hfg f = cye.f();
        f.c(str);
        f.b(5);
        mko b = cyaVar.b(f.a());
        Objects.requireNonNull(a2);
        b.d(new cvj(a2, 6), mjl.a);
        return b;
    }
}
