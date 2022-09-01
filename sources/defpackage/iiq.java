package defpackage;

import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: iiq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iiq implements mix {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ iiq(fgf fgfVar, ffd ffdVar, fcp fcpVar, fev fevVar, int i) {
        this.e = i;
        this.d = fgfVar;
        this.a = ffdVar;
        this.c = fcpVar;
        this.b = fevVar;
    }

    public /* synthetic */ iiq(fws fwsVar, iih iihVar, iif iifVar, Executor executor, int i, byte[] bArr, byte[] bArr2) {
        this.e = i;
        this.a = fwsVar;
        this.b = iihVar;
        this.c = iifVar;
        this.d = executor;
    }

    public /* synthetic */ iiq(jjb jjbVar, jhw jhwVar, String str, jiq jiqVar, int i) {
        this.e = i;
        this.a = jjbVar;
        this.c = jhwVar;
        this.d = str;
        this.b = jiqVar;
    }

    public /* synthetic */ iiq(jkp jkpVar, List list, List list2, Boolean bool, int i) {
        this.e = i;
        this.c = jkpVar;
        this.a = list;
        this.d = list2;
        this.b = bool;
    }

    public /* synthetic */ iiq(jxn jxnVar, String str, jxr jxrVar, mko mkoVar, int i) {
        this.e = i;
        this.c = jxnVar;
        this.d = str;
        this.b = jxrVar;
        this.a = mkoVar;
    }

    public /* synthetic */ iiq(kcq kcqVar, Object obj, jto jtoVar, mko mkoVar, int i, byte[] bArr) {
        this.e = i;
        this.b = kcqVar;
        this.d = obj;
        this.c = jtoVar;
        this.a = mkoVar;
    }

    public /* synthetic */ iiq(kqp kqpVar, mko mkoVar, miy miyVar, Executor executor, int i) {
        this.e = i;
        this.c = kqpVar;
        this.a = mkoVar;
        this.b = miyVar;
        this.d = executor;
    }

    public /* synthetic */ iiq(kqr kqrVar, mko mkoVar, miy miyVar, Executor executor, int i) {
        this.e = i;
        this.c = kqrVar;
        this.a = mkoVar;
        this.b = miyVar;
        this.d = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [fev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.mix
    public final mko a() {
        switch (this.e) {
            case 0:
                Object obj = this.a;
                Object obj2 = this.b;
                return ((fws) obj).g((iih) obj2, (iif) this.c, this.d);
            case 1:
                Object obj3 = this.d;
                Object obj4 = this.a;
                ffd ffdVar = (ffd) obj4;
                fgf fgfVar = (fgf) obj3;
                fgfVar.f(ffdVar, (fcp) this.c, this.b);
                return kcu.K(null);
            case 2:
                Object obj5 = this.a;
                Object obj6 = this.c;
                Object obj7 = this.d;
                Object obj8 = this.b;
                jjb jjbVar = (jjb) obj5;
                if (jjbVar.e.e()) {
                    jmz jmzVar = (jmz) jjbVar.e.a();
                    jhw jhwVar = (jhw) obj6;
                    opu opuVar = (opu) ((lfm) jhwVar.d).a;
                    synchronized (jmz.class) {
                        if (!jmzVar.d.containsKey(obj7)) {
                            HashMap hashMap = jmzVar.d;
                            jmy jmyVar = new jmy(jmzVar, (String) obj7, opuVar, null, null, null, null);
                            Objects.requireNonNull(jmzVar.a);
                            hashMap.put(obj7, new kpk(jmyVar, new jna(1), 1000L, TimeUnit.MILLISECONDS));
                        }
                    }
                    lfb g = lfb.g((jij) nfm.z(jij.f, ((jht) ((lfm) jhwVar.c).a).q(), nfb.a()));
                    jkv jkvVar = jjbVar.c;
                    miy miyVar = jjbVar.f;
                    jiq jiqVar = (jiq) obj8;
                    String str = jiqVar.b;
                    String str2 = jiqVar.c;
                    int i = jmk.a;
                    return jnd.c(jco.j(jkvVar.c(), new fem(jkvVar, jiqVar, g, miyVar, 16), jkvVar.h)).g(new ivo(jjbVar, 4), jjbVar.d).e(iuu.q, jjbVar.d);
                }
                nzv a = jhv.a();
                a.a = jhu.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
                a.b = "downloadFileGroup: DownloadListener is present but Download Monitor is not provided!";
                return kcu.J(a.e());
            case 3:
                Object obj9 = this.c;
                ?? r3 = this.a;
                ?? r5 = this.d;
                Object obj10 = this.b;
                mko K = kcu.K(true);
                for (int i2 = 0; i2 < r3.size(); i2++) {
                    jkp jkpVar = (jkp) obj9;
                    K = jco.j(K, new jkg(jkpVar, (jit) r3.get(i2), (jiu) kcu.S((Future) r5.get(i2)), 9), jkpVar.c);
                }
                return jco.i(K, new jks((Boolean) obj10, 1), ((jkp) obj9).c);
            case 4:
                Object obj11 = this.b;
                Object obj12 = this.d;
                Object obj13 = this.c;
                ?? r52 = this.a;
                lug lugVar = jsh.a;
                kcq kcqVar = (kcq) obj11;
                kcqVar.f(obj12);
                synchronized (kcqVar.b) {
                    ((kcq) obj11).b.remove(obj12);
                }
                synchronized (obj13) {
                    mld mldVar = ((jto) obj13).b;
                    if (mldVar != null) {
                        mldVar.c(null);
                    }
                }
                return r52;
            case 5:
                Object obj14 = this.c;
                Object obj15 = this.d;
                Object obj16 = this.b;
                ?? r4 = this.a;
                jxn jxnVar = (jxn) obj14;
                jxnVar.f((String) obj15, (jxr) obj16);
                return r4;
            case 6:
                Object obj17 = this.c;
                ?? r32 = this.a;
                ?? r42 = this.b;
                ?? r53 = this.d;
                kqp kqpVar = (kqp) obj17;
                mko h = mio.h(r32, new jzh(kqpVar, 9), mjl.a);
                mko h2 = mio.h(h, r42, r53);
                return mio.h(h2, ldd.c(new kks(kqpVar, h, h2, 2)), mjl.a);
            default:
                return mio.h(this.a, ldd.c(new kks((kqr) this.c, (miy) this.b, (Executor) this.d, 3)), mjl.a);
        }
    }
}
