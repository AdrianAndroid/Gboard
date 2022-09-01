package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: dke  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dke implements miy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ dke(cfd cfdVar, int i, jsv jsvVar, int i2) {
        this.d = i2;
        this.b = cfdVar;
        this.a = i;
        this.c = jsvVar;
    }

    public /* synthetic */ dke(dkh dkhVar, int i, String str, int i2) {
        this.d = i2;
        this.b = dkhVar;
        this.a = i;
        this.c = str;
    }

    public /* synthetic */ dke(feo feoVar, int i, String str, int i2) {
        this.d = i2;
        this.b = feoVar;
        this.a = i;
        this.c = str;
    }

    public /* synthetic */ dke(jla jlaVar, int i, jkr jkrVar, int i2) {
        this.d = i2;
        this.c = jlaVar;
        this.a = i;
        this.b = jkrVar;
    }

    public /* synthetic */ dke(kqf kqfVar, int i, List list, int i2) {
        this.d = i2;
        this.b = kqfVar;
        this.a = i;
        this.c = list;
    }

    public /* synthetic */ dke(kqf kqfVar, List list, int i, int i2) {
        this.d = i2;
        this.b = kqfVar;
        this.c = list;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        int i = this.d;
        int i2 = 0;
        int i3 = 1;
        if (i == 0) {
            Object obj2 = this.b;
            int i4 = this.a;
            Object obj3 = this.c;
            Integer num = (Integer) obj;
            ((ltd) ((ltd) dkh.c.b()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/SuperpacksManagerBase", "lambda$registerSuperpackManifest$0", 128, "SuperpacksManagerBase.java")).E("registerSuperpackManifest(): current %d, required %d", num, i4);
            if (num == null) {
                num = -1;
            }
            if (num.intValue() == -1 && ((bzr) ((dkh) obj2).d).j.a()) {
                i2 = 1;
            }
            jsu j = jsv.j();
            j.a = (String) obj3;
            if (1 != i2) {
                i3 = 2;
            }
            j.g(i3);
            j.d(2);
            jsv a = j.a();
            dkh dkhVar = (dkh) obj2;
            return dkhVar.d.e(dkhVar.e, i4, a);
        } else if (i == 1) {
            Object obj4 = this.b;
            int i5 = this.a;
            Object obj5 = this.c;
            Integer num2 = (Integer) obj;
            ((luc) ((luc) cfd.h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "lambda$registerAndUpgradeSuperpacks$5", 474, "SuperDelightManager.java")).J("SuperDelightManager#registerAndUpgradeSuperpacks(%s): current %d, required %d", "delight", num2, Integer.valueOf(i5));
            if (num2.intValue() < i5) {
                return ((cfd) obj4).c("delight", i5, (jsv) obj5);
            }
            jql f = jqm.f();
            f.d("null");
            return kcu.K(f.a());
        } else if (i == 2) {
            Object obj6 = this.b;
            int i6 = this.a;
            Object obj7 = this.c;
            Integer num3 = (Integer) obj;
            if (num3 == null || num3.intValue() != i6) {
                ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "lambda$registerManifest$4", 464, "SpeechPackManager.java")).u("registerManifest() : Fetching hash %d", i6);
                feo feoVar = (feo) obj6;
                bze bzeVar = feoVar.c;
                String str = feoVar.e;
                jsu j2 = jsv.j();
                j2.a = (String) obj7;
                j2.d(2);
                j2.c(2);
                return bzeVar.e(str, i6, j2.a());
            }
            ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "lambda$registerManifest$4", 461, "SpeechPackManager.java")).u("registerManifest() : Reusing hash %d", i6);
            feo feoVar2 = (feo) obj6;
            return feoVar2.c.d(feoVar2.e, i6);
        } else if (i == 3) {
            Object obj8 = this.c;
            int i7 = this.a;
            Object obj9 = this.b;
            if (((Boolean) obj).booleanValue()) {
                jla jlaVar = (jla) obj8;
                kki.v(jlaVar.a, jkr.a(i7));
                return jlaVar.b((jkr) obj9, i7 + 1);
            }
            return kcu.K(false);
        } else if (i == 4) {
            Object obj10 = this.b;
            final ?? r1 = this.c;
            final int i8 = this.a;
            final ngz ngzVar = (ngz) obj;
            final kqf kqfVar = (kqf) obj10;
            return kcu.W(r1).b(ldd.b(new mix() { // from class: kqe
                @Override // defpackage.mix
                public final mko a() {
                    kqf kqfVar2 = kqf.this;
                    ngz ngzVar2 = ngzVar;
                    int i9 = i8;
                    List list = r1;
                    mko K = kcu.K(ngzVar2);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (((Boolean) kcu.S((Future) list.get(i10))).booleanValue()) {
                            K = mio.h(K, ldd.c(new jzh((kqd) kqfVar2.a.get(i10), 5)), mjl.a);
                        }
                    }
                    return K;
                }
            }), kqfVar.b);
        } else {
            Object obj11 = this.b;
            int i9 = this.a;
            ?? r2 = this.c;
            ArrayList arrayList = new ArrayList(i9);
            while (i2 < i9) {
                if (((Boolean) kcu.S((Future) r2.get(i2))).booleanValue()) {
                    arrayList.add(((kqd) ((kqf) obj11).a.get(i2)).a());
                }
                i2++;
            }
            return kcu.Y(arrayList).a(new hcb(18), mjl.a);
        }
    }
}
