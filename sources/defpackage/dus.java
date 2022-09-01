package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dus  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dus implements mix {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dus(cqp cqpVar, Boolean bool, int i) {
        this.c = i;
        this.a = cqpVar;
        this.b = bool;
    }

    public /* synthetic */ dus(duz duzVar, bkl bklVar, int i) {
        this.c = i;
        this.b = duzVar;
        this.a = bklVar;
    }

    public /* synthetic */ dus(duz duzVar, fia fiaVar, int i) {
        this.c = i;
        this.a = duzVar;
        this.b = fiaVar;
    }

    public /* synthetic */ dus(hjh hjhVar, Object obj, int i) {
        this.c = i;
        this.a = hjhVar;
        this.b = obj;
    }

    public /* synthetic */ dus(hyy hyyVar, hyz hyzVar, int i) {
        this.c = i;
        this.a = hyyVar;
        this.b = hyzVar;
    }

    public /* synthetic */ dus(iqx iqxVar, krr krrVar, int i) {
        this.c = i;
        this.a = iqxVar;
        this.b = krrVar;
    }

    public /* synthetic */ dus(Class cls, gnk gnkVar, int i) {
        this.c = i;
        this.b = cls;
        this.a = gnkVar;
    }

    public /* synthetic */ dus(List list, List list2, int i) {
        this.c = i;
        this.a = list;
        this.b = list2;
    }

    public /* synthetic */ dus(jjb jjbVar, jhp jhpVar, int i) {
        this.c = i;
        this.b = jjbVar;
        this.a = jhpVar;
    }

    public /* synthetic */ dus(jjb jjbVar, jia jiaVar, int i) {
        this.c = i;
        this.b = jjbVar;
        this.a = jiaVar;
    }

    public /* synthetic */ dus(jjb jjbVar, jib jibVar, int i) {
        this.c = i;
        this.b = jjbVar;
        this.a = jibVar;
    }

    public /* synthetic */ dus(jjb jjbVar, jjc jjcVar, int i) {
        this.c = i;
        this.a = jjbVar;
        this.b = jjcVar;
    }

    public /* synthetic */ dus(jqx jqxVar, String str, int i) {
        this.c = i;
        this.a = jqxVar;
        this.b = str;
    }

    public /* synthetic */ dus(kgh kghVar, kgf[] kgfVarArr, int i) {
        this.c = i;
        this.a = kghVar;
        this.b = kgfVarArr;
    }

    public /* synthetic */ dus(knn knnVar, ncr ncrVar, int i) {
        this.c = i;
        this.a = knnVar;
        this.b = ncrVar;
    }

    /* JADX WARN: Type inference failed for: r0v65, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, krr] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [gnk, java.lang.Object] */
    @Override // defpackage.mix
    public final mko a() {
        switch (this.c) {
            case 0:
                Object obj = this.a;
                Object obj2 = this.b;
                oqv k = ((duz) obj).k();
                Object obj3 = k.b;
                nuq nuqVar = fgy.f;
                if (nuqVar == null) {
                    synchronized (fgy.class) {
                        nuqVar = fgy.f;
                        if (nuqVar == null) {
                            nun a = nuq.a();
                            a.c = nup.UNARY;
                            a.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "RequestLanguageDownload");
                            a.b();
                            a.a = ohw.b(fia.b);
                            a.b = ohw.b(fib.b);
                            nuqVar = a.a();
                            fgy.f = nuqVar;
                        }
                    }
                }
                return oig.a(((nsb) obj3).a(nuqVar, (nsa) k.a), obj2);
            case 1:
                cqp cqpVar = (cqp) this.a;
                return ce.e((ats) hjq.a(guw.a()).e(hjq.b(cqpVar.d(), cqpVar.i())).B(((Boolean) this.b).booleanValue()));
            case 2:
                Object obj4 = this.b;
                Object obj5 = this.a;
                oqv k2 = ((duz) obj4).k();
                Object obj6 = k2.b;
                nuq nuqVar2 = fgy.e;
                if (nuqVar2 == null) {
                    synchronized (fgy.class) {
                        nuqVar2 = fgy.e;
                        if (nuqVar2 == null) {
                            nun a2 = nuq.a();
                            a2.c = nup.UNARY;
                            a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "GetLearningCenterContentForConfiguration");
                            a2.b();
                            a2.a = ohw.b(bkl.x);
                            a2.b = ohw.b(fhn.b);
                            nuqVar2 = a2.a();
                            fgy.e = nuqVar2;
                        }
                    }
                }
                return oig.a(((nsb) obj6).a(nuqVar2, (nsa) k2.a), obj5);
            case 3:
                Object obj7 = this.b;
                ?? r1 = this.a;
                Class a3 = gno.a((Class) obj7);
                try {
                    return (mko) r1.a();
                } finally {
                    gno.a(a3);
                }
            case 4:
                return ((hjh) this.a).a.a(this.b);
            case 5:
                return ((hyy) this.a).d((hyz) this.b);
            case 6:
                return ((krj) ((iqx) this.a).d.a).c().c(ldd.d(new kqy((krr) this.b, 0)), mjl.a).h();
            case 7:
                Object obj8 = this.a;
                Object obj9 = this.b;
                nfh t = jiq.f.t();
                String str = ((jjc) obj9).a;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                jiq jiqVar = (jiq) t.b;
                str.getClass();
                jiqVar.a = 1 | jiqVar.a;
                jiqVar.b = str;
                jjb jjbVar = (jjb) obj8;
                String packageName = jjbVar.a.getPackageName();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                jiq jiqVar2 = (jiq) t.b;
                packageName.getClass();
                jiqVar2.a = 2 | jiqVar2.a;
                jiqVar2.c = packageName;
                jiq jiqVar3 = (jiq) t.cz();
                jkv jkvVar = jjbVar.c;
                String str2 = jiqVar3.b;
                int i = jmk.a;
                return jco.i(jco.j(jkvVar.c(), new jko(jkvVar, jiqVar3, 12), jkvVar.h), iuu.p, jjbVar.d);
            case 8:
                jjb jjbVar2 = (jjb) this.b;
                jkv jkvVar2 = jjbVar2.c;
                int i2 = jmk.a;
                return jco.j(jco.j(jkvVar2.c(), new jke(jkvVar2, 17), jkvVar2.h), new ivo(jjbVar2, 3), jjbVar2.d);
            case 9:
                Object obj10 = this.b;
                jhp jhpVar = (jhp) this.a;
                jhs jhsVar = jhpVar.a;
                String str3 = jhsVar.b;
                String str4 = jhsVar.g;
                int i3 = jmk.a;
                jhs jhsVar2 = jhpVar.a;
                if ((jhsVar2.a & 2) != 0) {
                    jjb jjbVar3 = (jjb) obj10;
                    if (!jjbVar3.a.getPackageName().equals(jhsVar2.c)) {
                        jmk.d("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", jhsVar2.b, jjbVar3.a.getPackageName(), jhsVar2.c);
                        return kcu.K(false);
                    }
                } else {
                    nfh nfhVar = (nfh) jhsVar2.N(5);
                    nfhVar.cG(jhsVar2);
                    String packageName2 = ((jjb) obj10).a.getPackageName();
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    jhs jhsVar3 = (jhs) nfhVar.b;
                    packageName2.getClass();
                    jhsVar3.a |= 2;
                    jhsVar3.c = packageName2;
                    jhsVar2 = (jhs) nfhVar.cz();
                }
                nfh t2 = jiq.f.t();
                String str5 = jhsVar2.b;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                jiq jiqVar4 = (jiq) t2.b;
                str5.getClass();
                int i4 = jiqVar4.a | 1;
                jiqVar4.a = i4;
                jiqVar4.b = str5;
                String str6 = jhsVar2.c;
                str6.getClass();
                jiqVar4.a = 2 | i4;
                jiqVar4.c = str6;
                try {
                    final jig jigVar = (jig) nfm.z(jig.v, jhsVar2.q(), nfb.a());
                    final jkv jkvVar3 = ((jjb) obj10).c;
                    final jiq jiqVar5 = (jiq) t2.cz();
                    final miy miyVar = ((jjb) obj10).f;
                    String str7 = jiqVar5.b;
                    return jco.j(jkvVar3.c(), new miy() { // from class: jkt
                        /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
                            r15 = true;
                         */
                        @Override // defpackage.miy
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final defpackage.mko a(java.lang.Object r19) {
                            /*
                                Method dump skipped, instructions count: 1200
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.jkt.a(java.lang.Object):mko");
                        }
                    }, jkvVar3.h);
                } catch (ngd e) {
                    jmk.e(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
                    return kcu.K(false);
                }
            case 10:
                Object obj11 = this.b;
                String str8 = ((jia) this.a).a;
                nfh t3 = jiq.f.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                jiq jiqVar6 = (jiq) t3.b;
                str8.getClass();
                jiqVar6.a = 1 | jiqVar6.a;
                jiqVar6.b = str8;
                jjb jjbVar4 = (jjb) obj11;
                String packageName3 = jjbVar4.a.getPackageName();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                jiq jiqVar7 = (jiq) t3.b;
                packageName3.getClass();
                jiqVar7.a = 2 | jiqVar7.a;
                jiqVar7.c = packageName3;
                jiq jiqVar8 = (jiq) t3.cz();
                jkv jkvVar4 = jjbVar4.c;
                String str9 = jiqVar8.b;
                String str10 = jiqVar8.c;
                int i5 = jmk.a;
                return jco.j(jco.j(jkvVar4.c(), new jko(jkvVar4, jiqVar8, 10), jkvVar4.h), new hzb(jjbVar4, jiqVar8, 5), jjbVar4.d);
            case 11:
                ?? r0 = this.a;
                ?? r12 = this.b;
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < r0.size(); i6++) {
                    jiq jiqVar9 = (jiq) r0.get(i6);
                    jig jigVar2 = (jig) kcu.S((Future) r12.get(i6));
                    if (jigVar2 != null) {
                        arrayList.add(jlq.a(jiqVar9, jigVar2));
                    }
                }
                return kcu.K(arrayList);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj12 = this.a;
                Object obj13 = this.b;
                lug lugVar = jsh.a;
                jqx jqxVar = (jqx) obj12;
                jqxVar.j();
                return jqxVar.d((String) obj13, false);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj14 = this.a;
                Object obj15 = this.b;
                kgh kghVar = (kgh) obj14;
                kdq kdqVar = kghVar.a;
                kdl a4 = kdm.a();
                kgg kggVar = (kgg) kghVar.c.a();
                nfh t4 = onw.b.t();
                kgf[] kgfVarArr = (kgf[]) obj15;
                if (kgfVarArr.length > 0) {
                    nfh t5 = onv.u.t();
                    int i7 = kgfVarArr[0].d;
                    int i8 = kgfVarArr[0].c;
                    long j = kgfVarArr[0].b;
                    long j2 = kgfVarArr[0].a;
                    int i9 = kgfVarArr[0].e;
                    if (t5.c) {
                        t5.cD();
                        t5.c = false;
                    }
                    onv onvVar = (onv) t5.b;
                    onvVar.a |= 32;
                    onvVar.f = 0;
                    int i10 = kgfVarArr[0].f;
                    throw null;
                }
                nfh t6 = oos.u.t();
                if (t6.c) {
                    t6.cD();
                    t6.c = false;
                }
                oos oosVar = (oos) t6.b;
                onw onwVar = (onw) t4.cz();
                onwVar.getClass();
                oosVar.f = onwVar;
                oosVar.a |= 32;
                try {
                    ((kbd) kggVar.f).a();
                } catch (Exception e2) {
                    ((ltd) ((ltd) ((ltd) kgg.a.d()).i(e2)).k("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector", "getMetric", (char) 242, "NetworkMetricCollector.java")).t("Exception while getting network metric extension!");
                }
                a4.d((oos) t6.cz());
                return kdqVar.b(a4.a());
            default:
                Object obj16 = this.a;
                Object obj17 = this.b;
                knn knnVar = (knn) obj16;
                knnVar.f();
                knnVar.e.d(3);
                oqv oqvVar = (oqv) knnVar.b.a();
                Object obj18 = oqvVar.b;
                nuq nuqVar3 = ndb.d;
                if (nuqVar3 == null) {
                    synchronized (ndb.class) {
                        nuqVar3 = ndb.d;
                        if (nuqVar3 == null) {
                            nun a5 = nuq.a();
                            a5.c = nup.UNARY;
                            a5.d = nuq.c("google.internal.expression.sticker.v1.StickerService", "ListStickerPacks");
                            a5.b();
                            a5.a = ohw.b(ncr.c);
                            a5.b = ohw.b(ncs.b);
                            nuqVar3 = a5.a();
                            ndb.d = nuqVar3;
                        }
                    }
                }
                return oig.a(((nsb) obj18).a(nuqVar3, (nsa) oqvVar.a), obj17);
        }
    }
}
