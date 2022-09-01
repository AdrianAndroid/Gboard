package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kks  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kks implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kks(jxr jxrVar, jvc jvcVar, mkr mkrVar, int i) {
        this.d = i;
        this.a = jxrVar;
        this.c = jvcVar;
        this.b = mkrVar;
    }

    public /* synthetic */ kks(kkm kkmVar, String str, kjj kjjVar, int i) {
        this.d = i;
        this.a = kkmVar;
        this.b = str;
        this.c = kjjVar;
    }

    public /* synthetic */ kks(kqp kqpVar, mko mkoVar, mko mkoVar2, int i) {
        this.d = i;
        this.c = kqpVar;
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    public /* synthetic */ kks(kqr kqrVar, miy miyVar, Executor executor, int i) {
        this.d = i;
        this.c = kqrVar;
        this.a = miyVar;
        this.b = executor;
    }

    public /* synthetic */ kks(opu opuVar, miy miyVar, Executor executor, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.d = i;
        this.c = opuVar;
        this.a = miyVar;
        this.b = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [jvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [mko, java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        String str;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                Object obj2 = this.a;
                ?? r1 = this.c;
                Map map = (Map) obj;
                return kcu.W(map.values()).a(new cak((jxr) obj2, (jvc) r1, map, 16), this.b);
            } else if (i == 2) {
                Object obj3 = this.c;
                ?? r0 = this.a;
                ?? r12 = this.b;
                if (!kcu.S(r0).equals(kcu.S(r12))) {
                    kqp kqpVar = (kqp) obj3;
                    mko h = mio.h(r12, ldd.c(new jmg(kqpVar, (mko) r12, 7)), kqpVar.c);
                    synchronized (kqpVar.e) {
                    }
                    return h;
                }
                return mkk.a;
            } else {
                if (i == 3) {
                    Object obj4 = this.c;
                    return ((kqr) obj4).b.d(this.a, this.b);
                }
                Object obj5 = this.c;
                Void r14 = (Void) obj;
                return ((kqr) ((opu) obj5).a).b.d(this.a, this.b);
            }
        }
        Object obj6 = this.a;
        Object obj7 = this.b;
        Object obj8 = this.c;
        List<String> list = (List) obj;
        kkm kkmVar = (kkm) obj6;
        if (!kkmVar.d) {
            list = llp.r("");
        }
        llk e = llp.e();
        for (String str2 : list) {
            if (!kku.c.containsKey(lfc.a(obj7, str2))) {
                kjj kjjVar = (kjj) obj8;
                kle kleVar = new kle(kjjVar, (String) obj7, str2, kkmVar.b);
                if (kkmVar.c) {
                    Context context = kjjVar.c;
                    str = kkr.a(context).getString(kkmVar.a, "");
                } else {
                    str = str2;
                }
                mko b = kleVar.b(str);
                mkh q = mkh.q(b);
                Objects.requireNonNull(kleVar);
                e.h(mio.h(mio.h(q, new jzh(kleVar, 4), kjjVar.e()), new kkt(kjjVar, b, kkmVar, str2, 0), kjjVar.e()));
            }
        }
        return kcu.W(e.g()).a(hcb.p, ((kjj) obj8).e());
    }
}
