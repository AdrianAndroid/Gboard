package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cvy  reason: default package */
/* loaded from: classes.dex */
public final class cvy implements npe {
    private final oiy a;
    private final /* synthetic */ int b;

    public cvy(oiy oiyVar, int i) {
        this.b = i;
        this.a = oiyVar;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final cvx b() {
        if (this.b == 0) {
            return new cvx(((egx) this.a).b(), ciz.c(), ciz.e(), ciz.i());
        }
        return new cvx((Context) ((npf) this.a).b, ciz.d(), ciz.e(), ciz.i());
    }
}
