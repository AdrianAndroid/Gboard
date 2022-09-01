package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cuy  reason: default package */
/* loaded from: classes.dex */
public final class cuy {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/searchsuggest/SearchSuggestFetcher");
    private final mkr b;
    private final mks c;
    private final ihq d;

    private cuy(mkr mkrVar, mks mksVar, ihq ihqVar) {
        this.b = mkrVar;
        this.c = mksVar;
        this.d = ihqVar;
    }

    public static cuy a() {
        return new cuy(gxo.a(6), gxo.c(6), ihq.a(4));
    }

    public final mko b(String str, int i) {
        ihq ihqVar = this.d;
        iig a2 = iih.a();
        a2.h(cva.d.buildUpon().appendQueryParameter("client", "gboardandroid").appendQueryParameter("json", "1").appendQueryParameter("q", str).appendQueryParameter("ds", i + (-1) != 1 ? "" : "i").appendQueryParameter("hl", hqp.e().toLanguageTag()).build());
        a2.d();
        a2.g();
        a2.e(iil.b);
        a2.f(5);
        return hiz.k(ihqVar.c(a2.a())).s(new cij(str, 2), this.b).w(cva.e, TimeUnit.MILLISECONDS, this.c);
    }
}
