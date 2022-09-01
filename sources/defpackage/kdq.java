package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kdq  reason: default package */
/* loaded from: classes.dex */
public final class kdq {
    public final kdn a;
    public final oiy b;
    public final khu c;
    public final oiy d;
    public final lfb e;
    public final lfb f;
    private final kbv g;
    private final Executor h;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, oiy] */
    public kdq(kdn kdnVar, oiy oiyVar, kbv kbvVar, khv khvVar, oiy oiyVar2, lfb lfbVar, lfb lfbVar2, Executor executor, nox noxVar, oiy oiyVar3) {
        this.a = kdnVar;
        this.g = kbvVar;
        this.b = oiyVar;
        this.h = executor;
        this.d = new doc(oiyVar2, 10);
        Context b = ((lba) khvVar.a).b();
        Executor executor2 = (Executor) khvVar.b.a();
        executor2.getClass();
        this.c = new khu(b, executor2, (khy) khvVar.c.a(), noxVar, ((Boolean) khvVar.d.a()).booleanValue(), oiyVar3);
        this.e = lfbVar;
        this.f = lfbVar2;
    }

    public final long a(String str) {
        if (!this.g.b) {
            khu khuVar = this.c;
            khr khrVar = khuVar.d;
            int intValue = ((Integer) khrVar.b.a()).intValue();
            if (intValue == 0) {
                return -1L;
            }
            if (intValue != Integer.MAX_VALUE) {
                synchronized (khrVar.a) {
                    if (khrVar.c >= intValue) {
                        long j = khrVar.d;
                        gjz gjzVar = khrVar.e;
                        if (SystemClock.elapsedRealtime() - j <= 1000) {
                            return -1L;
                        }
                    }
                }
            }
            boolean z = khuVar.c;
            khz khzVar = khuVar.b;
            if (!z) {
                return -1L;
            }
            return khzVar.a(str);
        }
        return -1L;
    }

    public final mko b(final kdm kdmVar) {
        return this.g.b ? kcu.I() : kcu.P(new mix() { // from class: kdp
            @Override // defpackage.mix
            public final mko a() {
                oor d;
                kdq kdqVar = kdq.this;
                kdm kdmVar2 = kdmVar;
                if (kdmVar2.g) {
                    nfh t = oor.d.t();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    oor oorVar = (oor) t.b;
                    oorVar.c = 2;
                    oorVar.a |= 4;
                    d = (oor) t.cz();
                } else {
                    Long l = kdmVar2.f;
                    khu khuVar = kdqVar.c;
                    boolean z = khuVar.c;
                    khz khzVar = khuVar.b;
                    if (z) {
                        d = khzVar.b(l);
                    } else {
                        d = khzVar.d();
                    }
                }
                if (d.b == -1) {
                    return mkk.a;
                }
                kdu kduVar = (kdu) kdqVar.b.a();
                oos oosVar = kdmVar2.c;
                nfh nfhVar = (nfh) oosVar.N(5);
                nfhVar.cG(oosVar);
                nfh t2 = ooe.g.t();
                int i = kduVar.h;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                ooe ooeVar = (ooe) t2.b;
                ooeVar.d = i - 1;
                int i2 = ooeVar.a | 4;
                ooeVar.a = i2;
                String str = kduVar.b;
                if (str != null) {
                    i2 |= 1;
                    ooeVar.a = i2;
                    ooeVar.b = str;
                }
                int i3 = i2 | 8;
                ooeVar.a = i3;
                ooeVar.e = 462718519L;
                String str2 = kduVar.d;
                if (str2 != null) {
                    i3 |= 2;
                    ooeVar.a = i3;
                    ooeVar.c = str2;
                }
                String str3 = kduVar.c;
                if (str3 != null) {
                    ooeVar.a = i3 | 16;
                    ooeVar.f = str3;
                }
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                oos oosVar2 = (oos) nfhVar.b;
                ooe ooeVar2 = (ooe) t2.cz();
                oos oosVar3 = oos.u;
                ooeVar2.getClass();
                oosVar2.p = ooeVar2;
                oosVar2.a |= 16777216;
                if (gkm.d(kduVar.a)) {
                    nfh t3 = ooi.d.t();
                    long freeSpace = kduVar.e.a().getFreeSpace() / 1024;
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    ooi ooiVar = (ooi) t3.b;
                    ooiVar.a |= 1;
                    ooiVar.b = freeSpace;
                    long longValue = ((Long) kduVar.f.a()).longValue();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    ooi ooiVar2 = (ooi) t3.b;
                    ooiVar2.a |= 2;
                    ooiVar2.c = longValue;
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    oos oosVar4 = (oos) nfhVar.b;
                    ooi ooiVar3 = (ooi) t3.cz();
                    ooiVar3.getClass();
                    oosVar4.r = ooiVar3;
                    oosVar4.a |= 67108864;
                }
                lgb lgbVar = kduVar.g;
                RuntimeException runtimeException = null;
                String str4 = lgbVar == null ? null : ((kbh) lgbVar.a()).a;
                if (!TextUtils.isEmpty(str4)) {
                    ood oodVar = oosVar.t;
                    if (oodVar == null) {
                        oodVar = ood.c;
                    }
                    nfh nfhVar2 = (nfh) oodVar.N(5);
                    nfhVar2.cG(oodVar);
                    if (((ood) nfhVar2.b).b.isEmpty()) {
                        if (nfhVar2.c) {
                            nfhVar2.cD();
                            nfhVar2.c = false;
                        }
                        ood oodVar2 = (ood) nfhVar2.b;
                        str4.getClass();
                        oodVar2.a |= 1;
                        oodVar2.b = str4;
                    } else {
                        String str5 = str4 + "::" + ((ood) nfhVar2.b).b;
                        if (nfhVar2.c) {
                            nfhVar2.cD();
                            nfhVar2.c = false;
                        }
                        ood oodVar3 = (ood) nfhVar2.b;
                        oodVar3.a |= 1;
                        oodVar3.b = str5;
                    }
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    oos oosVar5 = (oos) nfhVar.b;
                    ood oodVar4 = (ood) nfhVar2.cz();
                    oodVar4.getClass();
                    oosVar5.t = oodVar4;
                    oosVar5.a |= 268435456;
                }
                oos oosVar6 = (oos) nfhVar.cz();
                nfh nfhVar3 = (nfh) oosVar6.N(5);
                nfhVar3.cG(oosVar6);
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                oos oosVar7 = (oos) nfhVar3.b;
                d.getClass();
                oosVar7.m = d;
                oosVar7.a |= 4194304;
                if (kdmVar2.h != null) {
                    lfb lfbVar = kdqVar.e;
                    if (lfbVar.e()) {
                        ooh b = ((kbz) lfbVar.a()).b();
                        if (nfhVar3.c) {
                            nfhVar3.cD();
                            nfhVar3.c = false;
                        }
                        oos oosVar8 = (oos) nfhVar3.b;
                        b.getClass();
                        oosVar8.n = b;
                        oosVar8.a |= 8388608;
                    }
                }
                lfb lfbVar2 = kdqVar.f;
                if (lfbVar2.e()) {
                    llp a = ((kdk) lfbVar2.a()).a();
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    oos oosVar9 = (oos) nfhVar3.b;
                    nga ngaVar = oosVar9.o;
                    if (!ngaVar.c()) {
                        oosVar9.o = nfm.H(ngaVar);
                    }
                    ndt.cs(a, oosVar9.o);
                }
                String str6 = kdmVar2.a;
                if (kdmVar2.b) {
                    if (str6 != null) {
                        if (nfhVar3.c) {
                            nfhVar3.cD();
                            nfhVar3.c = false;
                        }
                        oos oosVar10 = (oos) nfhVar3.b;
                        oosVar10.a |= 4;
                        oosVar10.d = str6;
                    } else {
                        if (nfhVar3.c) {
                            nfhVar3.cD();
                            nfhVar3.c = false;
                        }
                        oos oosVar11 = (oos) nfhVar3.b;
                        oosVar11.a &= -5;
                        oosVar11.d = oos.u.d;
                    }
                } else if (str6 == null) {
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    oos oosVar12 = (oos) nfhVar3.b;
                    oosVar12.a &= -3;
                    oosVar12.c = oos.u.c;
                } else {
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    oos oosVar13 = (oos) nfhVar3.b;
                    oosVar13.a = 2 | oosVar13.a;
                    oosVar13.c = str6;
                }
                Object a2 = kdqVar.d.a();
                onm onmVar = kdmVar2.d;
                if (a2 != null || onmVar != null) {
                    if (a2 != null && onmVar != null) {
                        nfm nfmVar = (nfm) a2;
                        nfh nfhVar4 = (nfh) nfmVar.N(5);
                        nfhVar4.cG(nfmVar);
                        nfj nfjVar = (nfj) nfhVar4;
                        nfjVar.cG(onmVar);
                        a2 = (onm) nfjVar.cz();
                    } else if (a2 == null) {
                        jdg.u(onmVar);
                        a2 = onmVar;
                    }
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    oos oosVar14 = (oos) nfhVar3.b;
                    a2.getClass();
                    oosVar14.s = (onm) a2;
                    oosVar14.a |= 134217728;
                }
                String str7 = kdmVar2.e;
                if (str7 != null) {
                    nfh t4 = ood.c.t();
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    ood oodVar5 = (ood) t4.b;
                    oodVar5.a |= 1;
                    oodVar5.b = str7;
                    if (nfhVar3.c) {
                        nfhVar3.cD();
                        nfhVar3.c = false;
                    }
                    oos oosVar15 = (oos) nfhVar3.b;
                    ood oodVar6 = (ood) t4.cz();
                    oodVar6.getClass();
                    oosVar15.t = oodVar6;
                    oosVar15.a |= 268435456;
                }
                kdn kdnVar = kdqVar.a;
                oos oosVar16 = (oos) nfhVar3.cz();
                llp llpVar = (llp) kdnVar.b.a();
                llk f = llp.f(llpVar.size());
                int size = llpVar.size();
                for (int i4 = 0; i4 < size; i4++) {
                    try {
                        f.h(((kij) llpVar.get(i4)).b(oosVar16));
                    } catch (RuntimeException e) {
                        ((ltd) ((ltd) ((ltd) kdn.a.d()).i(e)).k("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", 'B', "MetricDispatcher.java")).t("One transmitter failed to send message");
                        if (runtimeException == null) {
                            runtimeException = e;
                        } else {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(runtimeException, e);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (runtimeException != null) {
                    throw runtimeException;
                }
                mko a3 = kcu.Y(f.g()).a(hcb.o, mjl.a);
                khr khrVar = kdqVar.c.d;
                gjz gjzVar = khrVar.e;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (khrVar.a) {
                    khrVar.c++;
                    if (elapsedRealtime - khrVar.d > 1000) {
                        khrVar.c = 0;
                        khrVar.d = elapsedRealtime;
                    }
                }
                return a3;
            }
        }, this.h);
    }

    public final boolean c(String str) {
        return a(str) != -1;
    }
}
