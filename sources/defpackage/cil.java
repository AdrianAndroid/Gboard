package defpackage;

import android.content.Context;
import j$.util.Collection$EL;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* renamed from: cil  reason: default package */
/* loaded from: classes.dex */
public final class cil extends cih {
    public final Context a;
    public final cke b;
    private final cik c;
    private final idk d;
    private final Random e;
    private final oiy f;

    public cil(Context context, cke ckeVar, cik cikVar, idk idkVar, Random random, oiy oiyVar) {
        this.a = context;
        this.b = ckeVar;
        this.c = cikVar;
        this.d = idkVar;
        this.e = random;
        this.f = oiyVar;
    }

    private final llp h(String str) {
        llp llpVar;
        cik cikVar = this.c;
        boolean z = !cikVar.a.get();
        dau.i(z, "Cache is closed");
        if (!z) {
            llpVar = llp.q();
        } else {
            llpVar = (llp) ((hiz) cikVar.d.c(str)).A(llp.q());
        }
        if (llpVar.isEmpty()) {
            this.d.e(ciu.BITMOJI_CACHE_RESPONSE, 3);
            return llp.q();
        }
        this.d.e(ciu.BITMOJI_CACHE_RESPONSE, 1);
        return llpVar;
    }

    @Override // defpackage.cih
    public final lfb b(List list, mse mseVar) {
        llp h = h((mseVar.b & 64) != 0 ? mseVar.o : mseVar.d);
        return h.isEmpty() ? ldu.a : eju.j(this.a, this.b, mseVar, (cqp) eju.k(this.e, h));
    }

    @Override // defpackage.cih
    public final llp d(List list, mse mseVar) {
        return (llp) Collection$EL.stream(h((mseVar.b & 64) != 0 ? mseVar.o : mseVar.d)).map(new cig(this, mseVar, 2)).filter(ccj.d).map(byw.j).collect(ljr.a);
    }

    @Override // defpackage.cka
    public final ckc e() {
        return ckc.BITMOJI;
    }

    @Override // defpackage.cka
    public final boolean f(mse mseVar) {
        int b = msc.b(mseVar.c);
        return b != 0 && b == 19;
    }

    @Override // defpackage.cka
    public final boolean g(List list) {
        if (!((cix) this.f).b().booleanValue()) {
            return false;
        }
        if (jbc.g("image/png", list)) {
            return true;
        }
        this.d.e(ciu.BITMOJI_CACHE_RESPONSE, 4);
        return false;
    }
}
