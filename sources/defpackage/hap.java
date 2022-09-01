package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hap  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hap implements miy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ hap(int i, jkv jkvVar, jie jieVar, jig jigVar, kcq kcqVar, Executor executor, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.g = i2;
        this.a = i;
        this.c = jkvVar;
        this.b = jieVar;
        this.d = jigVar;
        this.f = kcqVar;
        this.e = executor;
    }

    public /* synthetic */ hap(Context context, int i, hdl hdlVar, gwk gwkVar, String str, mkr mkrVar, int i2) {
        this.g = i2;
        this.b = context;
        this.a = i;
        this.c = hdlVar;
        this.d = gwkVar;
        this.e = str;
        this.f = mkrVar;
    }

    public /* synthetic */ hap(clg clgVar, llr llrVar, HashMap hashMap, int i, llr llrVar2, llw llwVar, int i2) {
        this.g = i2;
        this.b = clgVar;
        this.d = llrVar;
        this.e = hashMap;
        this.a = i;
        this.c = llrVar2;
        this.f = llwVar;
    }

    public /* synthetic */ hap(hzl hzlVar, hyz hyzVar, String str, String str2, int i, opu opuVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.g = i2;
        this.c = hzlVar;
        this.d = hyzVar;
        this.f = str;
        this.e = str2;
        this.a = i;
        this.b = opuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [mkr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        ndy ndyVar;
        int i = this.g;
        if (i == 0) {
            Object obj2 = this.b;
            int i2 = this.a;
            Object obj3 = this.c;
            Object obj4 = this.d;
            Object obj5 = this.e;
            ?? r7 = this.f;
            llp llpVar = (llp) obj;
            ltg ltgVar = har.a;
            if (llpVar != null && !llpVar.isEmpty()) {
                return kcu.K(llpVar);
            }
            try {
                llp c = har.c(((Context) obj2).getResources().openRawResource(i2));
                hdz a = hdz.a();
                llk e = llp.e();
                lta listIterator = c.listIterator();
                while (listIterator.hasNext()) {
                    hds hdsVar = (hds) listIterator.next();
                    llp b = a.b(hdsVar.b, (hdl) obj3);
                    if (a.g(hdsVar.a, (hdl) obj3)) {
                        String str = hdsVar.a;
                        if (((lrl) b).c == 1) {
                            b = llp.q();
                        }
                        e.h(hds.a(str, b));
                    } else if (((lrl) b).c > 0) {
                        String str2 = (String) b.get(0);
                        if (((lrl) b).c == 1) {
                            b = llp.q();
                        }
                        e.h(hds.a(str2, b));
                    }
                }
                llp g = e.g();
                ((gwk) obj4).d((String) obj5, g, r7);
                return kcu.K(g);
            } catch (IOException e2) {
                ((ltd) ((ltd) ((ltd) har.a.c()).i(e2)).k("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader", "lambda$loadFromFile$0", 256, "BundledEmojiListLoader.java")).w("error save to emoji cache file: %s", obj5);
                return kcu.K(llp.q());
            }
        } else if (i == 1) {
            Object obj6 = this.b;
            Object obj7 = this.d;
            Object obj8 = this.e;
            CancellationException cancellationException = (CancellationException) obj;
            return ((clg) obj6).e((llr) obj7, (HashMap) obj8, this.a, (llr) this.c, (llw) this.f, false);
        } else if (i == 2) {
            Object obj9 = this.c;
            Object obj10 = this.d;
            Object obj11 = this.f;
            Object obj12 = this.e;
            int i3 = this.a;
            Object obj13 = this.b;
            jhs jhsVar = (jhs) obj;
            if ((1 & jhsVar.a) != 0) {
                return ((hzl) obj9).a.b(jhsVar, (hyz) obj10);
            }
            hzl hzlVar = (hzl) obj9;
            String str3 = (String) obj11;
            hzlVar.a.g(str3);
            ConcurrentHashMap concurrentHashMap = hzlVar.b;
            StringBuilder sb = new StringBuilder();
            String str4 = (String) obj12;
            sb.append(str4);
            sb.append(i3);
            if (((Integer) ConcurrentMap.EL.compute(concurrentHashMap, sb.toString(), hzk.a)).intValue() >= 3) {
                throw new IllegalStateException("failed to parse manifest for".concat(str4));
            }
            return hzlVar.a(str4, str3, i3, (opu) obj13, (hyz) obj10);
        } else {
            int i4 = this.a;
            Object obj14 = this.c;
            Object obj15 = this.b;
            Object obj16 = this.d;
            Object obj17 = this.f;
            ?? r72 = this.e;
            nfh nfhVar = (nfh) obj;
            if (i4 == 2) {
                jie jieVar = (jie) obj15;
                String str5 = jieVar.b;
                int i5 = jmk.a;
                jkv jkvVar = (jkv) obj14;
                return jco.j(jco.j(jkvVar.c(), new jkg(jkvVar, jieVar, (jig) obj16, 11), jkvVar.h), new cvr((kcq) obj17, nfhVar, jieVar, 5, null, null, null), r72);
            }
            jie jieVar2 = (jie) obj15;
            String str6 = jieVar2.b;
            int i6 = jieVar2.d;
            int i7 = jieVar2.i;
            if ((jieVar2.a & 8192) != 0) {
                ndyVar = jieVar2.p;
                if (ndyVar == null) {
                    ndyVar = ndy.c;
                }
            } else {
                ndyVar = null;
            }
            nfhVar.cY(jjb.d(str6, i6, i7, null, ndyVar));
            return kcu.K(nfhVar);
        }
    }
}
