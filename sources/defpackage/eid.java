package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: eid  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eid implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ eid(eie eieVar, hiz hizVar, hiz hizVar2, hiz hizVar3, int i) {
        this.e = i;
        this.a = eieVar;
        this.b = hizVar;
        this.c = hizVar2;
        this.d = hizVar3;
    }

    public /* synthetic */ eid(eij eijVar, hiz hizVar, hiz hizVar2, hiz hizVar3, int i) {
        this.e = i;
        this.a = eijVar;
        this.b = hizVar;
        this.c = hizVar2;
        this.d = hizVar3;
    }

    public /* synthetic */ eid(ewt ewtVar, evg evgVar, String str, String str2, int i) {
        this.e = i;
        this.b = ewtVar;
        this.a = evgVar;
        this.c = str;
        this.d = str2;
    }

    public /* synthetic */ eid(hiz hizVar, hiz hizVar2, hiz hizVar3, hiz hizVar4, int i) {
        this.e = i;
        this.a = hizVar;
        this.b = hizVar2;
        this.c = hizVar3;
        this.d = hizVar4;
    }

    public /* synthetic */ eid(ilk ilkVar, String str, mkr mkrVar, ilj iljVar, int i) {
        this.e = i;
        this.b = ilkVar;
        this.d = str;
        this.c = mkrVar;
        this.a = iljVar;
    }

    public /* synthetic */ eid(jmi jmiVar, AtomicInteger atomicInteger, List list, List list2, int i, byte[] bArr) {
        this.e = i;
        this.a = jmiVar;
        this.d = atomicInteger;
        this.b = list;
        this.c = list2;
    }

    public /* synthetic */ eid(jzj jzjVar, mko mkoVar, String str, juu juuVar, int i) {
        this.e = i;
        this.b = jzjVar;
        this.c = mkoVar;
        this.d = str;
        this.a = juuVar;
    }

    public /* synthetic */ eid(kcq kcqVar, jtn jtnVar, jto jtoVar, Object obj, int i, byte[] bArr) {
        this.e = i;
        this.c = kcqVar;
        this.a = jtnVar;
        this.b = jtoVar;
        this.d = obj;
    }

    public /* synthetic */ eid(kio kioVar, mko mkoVar, mko mkoVar2, mko mkoVar3, int i) {
        this.e = i;
        this.a = kioVar;
        this.b = mkoVar;
        this.c = mkoVar2;
        this.d = mkoVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [jtn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th;
        jtx jtxVar;
        jtx jtxVar2 = null;
        switch (this.e) {
            case 0:
                Object obj = this.a;
                Object obj2 = this.b;
                Object obj3 = this.c;
                cwt cwtVar = (cwt) ((hiz) this.d).z();
                cxd a = cxe.a();
                eie eieVar = (eie) obj;
                a.h((llp) ((hiz) obj2).z(), eieVar.j);
                a.d((llp) ((hiz) obj3).z());
                a.e(eieVar.h.g(cwtVar.b));
                a.b = cwtVar.b;
                a.c = cwtVar.c;
                a.d = cwtVar.d;
                return a.a();
            case 1:
                Object obj4 = this.a;
                Object obj5 = this.b;
                Object obj6 = this.c;
                Object obj7 = this.d;
                nfh t = chn.f.t();
                chk chkVar = (chk) ((hiz) obj4).A(chk.b);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                chn chnVar = (chn) t.b;
                chkVar.getClass();
                chnVar.c = chkVar;
                chnVar.a |= 2;
                chm chmVar = (chm) ((hiz) obj5).A(chm.b);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                chn chnVar2 = (chn) t.b;
                chmVar.getClass();
                chnVar2.d = chmVar;
                chnVar2.a |= 4;
                cho choVar = (cho) ((hiz) obj6).A(cho.b);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                chn chnVar3 = (chn) t.b;
                choVar.getClass();
                chnVar3.b = choVar;
                chnVar3.a |= 1;
                Iterable iterable = (Iterable) ((hiz) obj7).A(new ArrayList());
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                chn chnVar4 = (chn) t.b;
                nga ngaVar = chnVar4.e;
                if (!ngaVar.c()) {
                    chnVar4.e = nfm.H(ngaVar);
                }
                ndt.cs(iterable, chnVar4.e);
                return (chn) t.cz();
            case 2:
                Object obj8 = this.a;
                Object obj9 = this.b;
                Object obj10 = this.c;
                cwt cwtVar2 = (cwt) ((hiz) this.d).z();
                cxd a2 = cxe.a();
                eij eijVar = (eij) obj8;
                a2.h((llp) ((hiz) obj9).z(), eijVar.i);
                a2.d((llp) ((hiz) obj10).z());
                a2.e(eijVar.g.g(cwtVar2.b));
                a2.b = cwtVar2.b;
                a2.c = cwtVar2.c;
                a2.d = cwtVar2.d;
                return a2.a();
            case 3:
                ((ewt) this.b).f((evg) this.a, (String) this.c, (String) this.d);
                return true;
            case 4:
                Object obj11 = this.b;
                Object obj12 = this.d;
                ?? r3 = this.c;
                final ilk ilkVar = (ilk) obj11;
                final ilj iljVar = (ilj) this.a;
                return gdd.a(ilkVar.b).b(ilkVar.c, "", (String) obj12).a(r3, new ged() { // from class: ild
                    @Override // defpackage.ged
                    public final Object a(gen genVar) {
                        gcs[] gcsVarArr;
                        int i;
                        gct gctVar;
                        String str;
                        long j;
                        long j2;
                        ilk ilkVar2 = ilk.this;
                        ilj iljVar2 = iljVar;
                        if (!genVar.e()) {
                            ((ltd) ((ltd) ((ltd) ilk.a.c()).i(genVar.b())).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", "fetchConfigurationInternal", (char) 256, "PhenotypeModule.java")).t("Failed to retrieve configuration snapshot.");
                            Exception b = genVar.b();
                            return b != null ? gni.d(b) : gni.d(new IllegalStateException("Failed to get snapshot."));
                        }
                        gct gctVar2 = (gct) genVar.c();
                        gcs[] gcsVarArr2 = gctVar2.d;
                        String str2 = "handlePhenotypeConfigurationUpdates";
                        if (gcsVarArr2 == null || gcsVarArr2.length == 0) {
                            ((ltd) ((ltd) ilk.a.c()).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", str2, 271, "PhenotypeModule.java")).t("Get empty configurations.");
                            iljVar2.f = true;
                            return gni.e(gctVar2);
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        iljVar2.g = gctVar2.f;
                        HashSet hashSet = !gctVar2.f ? new HashSet() : null;
                        hhx i2 = hhq.i();
                        gcs[] gcsVarArr3 = gctVar2.d;
                        int length = gcsVarArr3.length;
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        while (i3 < length) {
                            gcs gcsVar = gcsVarArr3[i3];
                            if (gcsVar == null) {
                                gctVar = gctVar2;
                                str = str2;
                                j = elapsedRealtime;
                                gcsVarArr = gcsVarArr3;
                                i = length;
                            } else {
                                gcsVarArr = gcsVarArr3;
                                gcx[] gcxVarArr = gcsVar.b;
                                i = length;
                                int length2 = gcxVarArr.length;
                                gctVar = gctVar2;
                                int i6 = 0;
                                while (i6 < length2) {
                                    int i7 = length2;
                                    gcx gcxVar = gcxVarArr[i6];
                                    gcx[] gcxVarArr2 = gcxVarArr;
                                    int i8 = gcxVar.g;
                                    String str3 = str2;
                                    if (i8 == 1) {
                                        j2 = elapsedRealtime;
                                        if (gcxVar.b() >= 0 || !gcxVar.a.endsWith("new_user_timestamp")) {
                                            hie hieVar = hie.PHENOTYPE;
                                            String str4 = gcxVar.a;
                                            long b2 = gcxVar.b();
                                            hhn hhnVar = (hhn) i2;
                                            hhnVar.a();
                                            ilk.d(hhnVar.a.f(hieVar, str4, b2, hhnVar.b, hhnVar.c), hashSet);
                                        } else {
                                            ((ltd) ((ltd) ilk.a.c()).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", "handlePhenotypeConfigurationUpdatesInternal", 316, "PhenotypeModule.java")).F("Skip read flag: %s with value: %s", gcxVar.a, gcxVar.b());
                                            ilkVar2.e.e(hhv.READ_TIMESTAMP_ERROR, 1);
                                        }
                                    } else if (i8 == 2) {
                                        j2 = elapsedRealtime;
                                        hie hieVar2 = hie.PHENOTYPE;
                                        String str5 = gcxVar.a;
                                        boolean e = gcxVar.e();
                                        hhn hhnVar2 = (hhn) i2;
                                        hhnVar2.a();
                                        ilk.d(hhnVar2.a.c(hieVar2, str5, e, hhnVar2.b, hhnVar2.c), hashSet);
                                    } else if (i8 == 3) {
                                        j2 = elapsedRealtime;
                                        hie hieVar3 = hie.PHENOTYPE;
                                        String str6 = gcxVar.a;
                                        double a3 = gcxVar.a();
                                        hhn hhnVar3 = (hhn) i2;
                                        hhnVar3.a();
                                        ilk.d(hhnVar3.a.e(hieVar3, str6, a3, hhnVar3.b, hhnVar3.c), hashSet);
                                    } else if (i8 == 4) {
                                        j2 = elapsedRealtime;
                                        hie hieVar4 = hie.PHENOTYPE;
                                        String str7 = gcxVar.a;
                                        String c = gcxVar.c();
                                        hhn hhnVar4 = (hhn) i2;
                                        hhnVar4.a();
                                        ilk.d(hhnVar4.a.g(hieVar4, str7, c, hhnVar4.b, hhnVar4.c), hashSet);
                                    } else if (i8 != 5) {
                                        ((ltd) ((ltd) ilk.a.c()).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", "handlePhenotypeConfigurationUpdatesInternal", 342, "PhenotypeModule.java")).u("Unhandled type: %s", gcxVar.g);
                                        j2 = elapsedRealtime;
                                    } else {
                                        hie hieVar5 = hie.PHENOTYPE;
                                        String str8 = gcxVar.a;
                                        byte[] f = gcxVar.f();
                                        hhn hhnVar5 = (hhn) i2;
                                        hhnVar5.a();
                                        j2 = elapsedRealtime;
                                        ilk.d(hhnVar5.a.d(hieVar5, str8, f, hhnVar5.b, hhnVar5.c), hashSet);
                                    }
                                    i6++;
                                    length2 = i7;
                                    gcxVarArr = gcxVarArr2;
                                    str2 = str3;
                                    elapsedRealtime = j2;
                                }
                                str = str2;
                                j = elapsedRealtime;
                                gcx[] gcxVarArr3 = gcsVar.b;
                                if (gcxVarArr3 != null) {
                                    i4 += gcxVarArr3.length;
                                }
                                String[] strArr = gcsVar.c;
                                if (strArr != null) {
                                    int length3 = strArr.length;
                                    int i9 = 0;
                                    while (i9 < length3) {
                                        String str9 = strArr[i9];
                                        hie hieVar6 = hie.PHENOTYPE;
                                        hhn hhnVar6 = (hhn) i2;
                                        hhnVar6.a();
                                        hhu hhuVar = hhnVar6.a;
                                        String[] strArr2 = strArr;
                                        lmx lmxVar = hhnVar6.b;
                                        lmx lmxVar2 = hhnVar6.c;
                                        int i10 = length3;
                                        if (!hhuVar.t(hieVar6, hhuVar.c, str9, lmxVar, lmxVar2) && !hhuVar.t(hieVar6, hhuVar.d, str9, lmxVar, lmxVar2) && !hhuVar.t(hieVar6, hhuVar.e, str9, lmxVar, lmxVar2) && !hhuVar.t(hieVar6, hhuVar.f, str9, lmxVar, lmxVar2)) {
                                            hhuVar.t(hieVar6, hhuVar.g, str9, lmxVar, lmxVar2);
                                        }
                                        i9++;
                                        strArr = strArr2;
                                        length3 = i10;
                                    }
                                    i5 += gcsVar.c.length;
                                }
                            }
                            i3++;
                            gcsVarArr3 = gcsVarArr;
                            length = i;
                            gctVar2 = gctVar;
                            str2 = str;
                            elapsedRealtime = j;
                        }
                        gct gctVar3 = gctVar2;
                        String str10 = str2;
                        long j3 = elapsedRealtime;
                        iljVar2.c = i4;
                        if (hashSet != null) {
                            hie hieVar7 = hie.PHENOTYPE;
                            hhn hhnVar7 = (hhn) i2;
                            hhnVar7.a();
                            hhu hhuVar2 = hhnVar7.a;
                            lmx lmxVar3 = hhnVar7.b;
                            lmx lmxVar4 = hhnVar7.c;
                            HashSet hashSet2 = hashSet;
                            i5 += hhuVar2.a(hieVar7, hhuVar2.c, hashSet2, lmxVar3, lmxVar4) + hhuVar2.a(hieVar7, hhuVar2.d, hashSet2, lmxVar3, lmxVar4) + hhuVar2.a(hieVar7, hhuVar2.e, hashSet2, lmxVar3, lmxVar4) + hhuVar2.a(hieVar7, hhuVar2.f, hashSet2, lmxVar3, lmxVar4) + hhuVar2.a(hieVar7, hhuVar2.g, hashSet2, lmxVar3, lmxVar4);
                        }
                        iljVar2.d = i5;
                        i2.close();
                        ((ltd) ((ltd) ilk.a.b()).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", "handlePhenotypeConfigurationUpdatesInternal", 367, "PhenotypeModule.java")).v("Latency of updating configurations from phenotype (experiment v4): %s", SystemClock.elapsedRealtime() - elapsedRealtime2);
                        long elapsedRealtime3 = SystemClock.elapsedRealtime() - j3;
                        ilkVar2.e.g(hhw.PHENOTYPE_HANDLE_CONFIGURATION_UPDATE, elapsedRealtime3);
                        ((ltd) ((ltd) ilk.a.b()).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", str10, 280, "PhenotypeModule.java")).v("Latency of updating configurations from phenotype (ExperimentV4): %s", elapsedRealtime3);
                        return gni.e(gctVar3);
                    }
                }).a(r3, new ged() { // from class: ile
                    @Override // defpackage.ged
                    public final Object a(gen genVar) {
                        ilk ilkVar2 = ilk.this;
                        if (!genVar.e()) {
                            Exception b = genVar.b();
                            ((ltd) ((ltd) ((ltd) ilk.a.c()).i(b)).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", "commitConfigurationInternal", (char) 380, "PhenotypeModule.java")).t("Failed to update configurations.");
                            if (b != null) {
                                return gni.d(b);
                            }
                            return gni.d(new IllegalStateException("Failed to get snapshot."));
                        }
                        String str = ((gct) genVar.c()).a;
                        gdd.a(ilkVar2.b).a(str);
                        ilkVar2.d.j("__last_committed_token__", str);
                        return gni.e(null);
                    }
                });
            case 5:
                Object obj13 = this.a;
                Object obj14 = this.d;
                ?? r6 = this.b;
                ?? r7 = this.c;
                AtomicInteger atomicInteger = (AtomicInteger) obj14;
                if (atomicInteger.get() > 0) {
                    atomicInteger.get();
                }
                jmi jmiVar = (jmi) obj13;
                Uri u = lxj.u(jmiVar.a, (lfb) jmiVar.i);
                for (Uri uri : r6) {
                    try {
                        ((kcq) ((jmi) obj13).d).t(uri);
                    } catch (IOException e) {
                        jmk.e(e, "%s: Failed to release unaccounted file!", "ExpirationHandler");
                    }
                }
                int i = jmk.a;
                jmiVar.c(u, r7);
                return null;
            case 6:
                Object obj15 = this.c;
                ?? r2 = this.a;
                Object obj16 = this.b;
                Object obj17 = this.d;
                SystemClock.elapsedRealtime();
                Object a3 = r2.a(((jto) obj16).c);
                lug lugVar = jsh.a;
                ((kcq) obj15).f(obj17);
                SystemClock.elapsedRealtime();
                return a3;
            case 7:
                Object obj18 = this.b;
                ?? r0 = this.c;
                Object obj19 = this.d;
                Object obj20 = this.a;
                try {
                    jtxVar = (jtx) kcu.S(r0);
                    try {
                        lug lugVar2 = jsh.a;
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        jtxVar2 = jtxVar;
                        Throwable w = lwm.w(th);
                        jsr f = ((juu) obj20).f();
                        if (!(w instanceof jwn) || !((jwn) w).a()) {
                            ((luc) ((luc) ((luc) jsh.a.d()).i(w)).k("com/google/android/libraries/micore/superpacks/packs/PackUtil", "logDownloadError", 54, "PackUtil.java")).w("Error downloading: %s", f.f());
                        } else {
                            ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/packs/PackUtil", "logDownloadError", 52, "PackUtil.java")).w("Download for %s was canceled", f.f());
                        }
                        th = w;
                        jtxVar = jtxVar2;
                        jzj jzjVar = (jzj) obj18;
                        jzg.d(jzjVar.b, jzjVar.c, (String) obj19, jtxVar, th, jzjVar.e, System.currentTimeMillis());
                        return jtxVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                jzj jzjVar2 = (jzj) obj18;
                jzg.d(jzjVar2.b, jzjVar2.c, (String) obj19, jtxVar, th, jzjVar2.e, System.currentTimeMillis());
                return jtxVar;
            default:
                Object obj21 = this.a;
                ?? r22 = this.b;
                ?? r5 = this.c;
                ?? r62 = this.d;
                nfh t2 = kin.h.t();
                kio kioVar = (kio) obj21;
                String str = kioVar.b;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                kin kinVar = (kin) t2.b;
                int i2 = 1 | kinVar.a;
                kinVar.a = i2;
                kinVar.b = str;
                String str2 = kioVar.a;
                int i3 = i2 | 2;
                kinVar.a = i3;
                kinVar.c = str2;
                boolean z = kioVar.c;
                kinVar.a = i3 | 4;
                kinVar.d = z;
                try {
                    lfb lfbVar = (lfb) kcu.S(r22);
                    if (lfbVar.e()) {
                        String str3 = (String) lfbVar.a();
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        kin kinVar2 = (kin) t2.b;
                        kinVar2.a |= 16;
                        kinVar2.f = str3;
                    }
                } catch (Exception unused) {
                }
                try {
                    List list = (List) kcu.S(r5);
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    kin kinVar3 = (kin) t2.b;
                    nfs nfsVar = kinVar3.g;
                    if (!nfsVar.c()) {
                        kinVar3.g = nfm.D(nfsVar);
                    }
                    ndt.cs(list, kinVar3.g);
                } catch (Exception unused2) {
                }
                try {
                    lfb lfbVar2 = (lfb) kcu.S(r62);
                    if (lfbVar2.e()) {
                        String str4 = (String) lfbVar2.a();
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        kin kinVar4 = (kin) t2.b;
                        kinVar4.a |= 8;
                        kinVar4.e = str4;
                    }
                } catch (Exception unused3) {
                }
                nfj nfjVar = (nfj) kig.c.t();
                nfjVar.d(kin.i, (kin) t2.cz());
                return (kig) nfjVar.cz();
        }
    }
}
