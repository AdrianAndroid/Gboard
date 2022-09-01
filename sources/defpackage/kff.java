package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kff  reason: default package */
/* loaded from: classes.dex */
public final class kff extends kfl implements kch, kdt {
    private static final ltg a = ltg.j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl");
    private final Application b;
    private final kcl c;
    private final kfa d;
    private final key e;
    private final ArrayMap f;
    private final kdq g;
    private final oiy h;
    private final kdx i;
    private final lgb j;
    private final oiy k;

    public kff(kdr kdrVar, Context context, kcl kclVar, nox noxVar, key keyVar, oiy oiyVar, oiy oiyVar2, Executor executor, nox noxVar2, kdx kdxVar, oiy oiyVar3, boolean z) {
        kfa kfeVar;
        ArrayMap arrayMap = new ArrayMap();
        this.f = arrayMap;
        jdg.F(Build.VERSION.SDK_INT >= 24);
        this.g = kdrVar.a(executor, noxVar, oiyVar2);
        Application application = (Application) context;
        this.b = application;
        this.c = kclVar;
        this.h = oiyVar;
        this.e = keyVar;
        this.i = kdxVar;
        this.j = jdg.n(new buf(this, oiyVar3, 10));
        this.k = oiyVar3;
        kfb kfbVar = new kfb(application, arrayMap);
        if (z) {
            kfeVar = new kfd(kfbVar, noxVar2);
        } else {
            kfeVar = new kfe(kfbVar, noxVar2);
        }
        this.d = kfeVar;
    }

    public mko a(Activity activity) {
        kfh kfhVar;
        ooo oooVar;
        kfc a2 = kfc.a(activity);
        khu khuVar = this.g.c;
        boolean z = khuVar.c;
        khz khzVar = khuVar.b;
        if (!z || !khzVar.c()) {
            return mkk.a;
        }
        synchronized (this.f) {
            kfhVar = (kfh) this.f.remove(a2);
            if (this.f.isEmpty()) {
                this.d.d();
            }
        }
        if (kfhVar == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 364, "FrameMetricServiceImpl.java")).w("Measurement not found: %s", a2);
            return mkk.a;
        }
        String b = a2.b();
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
            for (kfm kfmVar : ((kfn) this.k.a()).b) {
                int b2 = kez.b(kfmVar.a);
                if (b2 == 0) {
                    b2 = 1;
                }
                if (b2 - 1 != 0) {
                    kfmVar.b.replace("%EVENT_NAME%", b);
                } else {
                    String str = kfmVar.b;
                }
            }
            String.format("J<%s>", b);
        }
        if (kfhVar.h != 0) {
            if (((kfn) this.k.a()).c && kfhVar.m <= TimeUnit.SECONDS.toMillis(9L) && kfhVar.f != 0) {
                this.i.a((String) this.j.a());
            }
            int elapsedRealtime = ((int) (SystemClock.elapsedRealtime() - kfhVar.c)) + 1;
            nfh t = ook.o.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ook ookVar = (ook) t.b;
            int i = ookVar.a | 16;
            ookVar.a = i;
            ookVar.f = elapsedRealtime;
            int i2 = kfhVar.f;
            int i3 = i | 1;
            ookVar.a = i3;
            ookVar.b = i2;
            int i4 = kfhVar.h;
            int i5 = i3 | 2;
            ookVar.a = i5;
            ookVar.c = i4;
            int i6 = kfhVar.i;
            int i7 = i5 | 4;
            ookVar.a = i7;
            ookVar.d = i6;
            int i8 = kfhVar.k;
            int i9 = i7 | 32;
            ookVar.a = i9;
            ookVar.g = i8;
            int i10 = kfhVar.m;
            int i11 = i9 | 64;
            ookVar.a = i11;
            ookVar.h = i10;
            int i12 = kfhVar.j;
            ookVar.a = i11 | 8;
            ookVar.e = i12;
            int i13 = kfhVar.n;
            if (i13 != Integer.MIN_VALUE) {
                int[] iArr = kfh.b;
                int[] iArr2 = kfhVar.e;
                nfh t2 = ooo.c.t();
                int i14 = 0;
                while (true) {
                    if (i14 < 52) {
                        if (iArr[i14] <= i13) {
                            int i15 = iArr2[i14];
                            if (i15 > 0 || (i14 > 0 && iArr2[i14 - 1] > 0)) {
                                t2.eN(i15);
                                t2.eM(iArr[i14]);
                            }
                            i14++;
                        } else {
                            t2.eN(0);
                            t2.eM(i13 + 1);
                            oooVar = (ooo) t2.cz();
                            break;
                        }
                    } else {
                        if (iArr2[51] > 0) {
                            t2.eM(i13 + 1);
                            t2.eN(0);
                        }
                        oooVar = (ooo) t2.cz();
                    }
                }
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ook ookVar2 = (ook) t.b;
                oooVar.getClass();
                ookVar2.n = oooVar;
                int i16 = ookVar2.a | 2048;
                ookVar2.a = i16;
                int i17 = kfhVar.g;
                int i18 = i16 | 512;
                ookVar2.a = i18;
                ookVar2.l = i17;
                int i19 = kfhVar.l;
                ookVar2.a = i18 | 1024;
                ookVar2.m = i19;
            }
            for (int i20 = 0; i20 < 28; i20++) {
                if (kfhVar.d[i20] > 0) {
                    nfh t3 = ooj.e.t();
                    int i21 = kfhVar.d[i20];
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    ooj oojVar = (ooj) t3.b;
                    int i22 = oojVar.a | 1;
                    oojVar.a = i22;
                    oojVar.b = i21;
                    int[] iArr3 = kfh.a;
                    int i23 = iArr3[i20];
                    int i24 = i22 | 2;
                    oojVar.a = i24;
                    oojVar.c = i23;
                    int i25 = i20 + 1;
                    if (i25 < 28) {
                        int i26 = iArr3[i25];
                        oojVar.a = i24 | 4;
                        oojVar.d = i26 - 1;
                    }
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    ook ookVar3 = (ook) t.b;
                    ooj oojVar2 = (ooj) t3.cz();
                    oojVar2.getClass();
                    nga ngaVar = ookVar3.j;
                    if (!ngaVar.c()) {
                        ookVar3.j = nfm.H(ngaVar);
                    }
                    ookVar3.j.add(oojVar2);
                }
            }
            ook ookVar4 = (ook) t.cz();
            lfb a3 = kez.a(this.b);
            if (a3.e()) {
                nfh nfhVar = (nfh) ookVar4.N(5);
                nfhVar.cG(ookVar4);
                int intValue = ((Integer) a3.a()).intValue();
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                ook ookVar5 = (ook) nfhVar.b;
                ookVar5.a |= 256;
                ookVar5.k = intValue;
                ookVar4 = (ook) nfhVar.cz();
            }
            nfh t4 = oos.u.t();
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            oos oosVar = (oos) t4.b;
            ookVar4.getClass();
            oosVar.j = ookVar4;
            oosVar.a |= 1024;
            kdq kdqVar = this.g;
            kdl a4 = kdm.a();
            a4.d((oos) t4.cz());
            String str2 = null;
            a4.b = null;
            if (true == a2.b) {
                str2 = "Activity";
            }
            a4.c = str2;
            a4.a = a2.b();
            if (a2.a == null) {
                z2 = false;
            }
            a4.b(z2);
            return kdqVar.b(a4.a());
        }
        return mkk.a;
    }

    @Override // defpackage.kdt
    public void ad() {
        this.c.a(this.d);
        this.c.a(this.e);
    }

    public /* synthetic */ String b(oiy oiyVar) {
        return ((kfn) oiyVar.a()).a.replace("%PACKAGE_NAME%", this.b.getPackageName());
    }

    @Override // defpackage.kch
    public void c(Activity activity) {
        synchronized (this.f) {
            this.f.clear();
        }
    }

    public void d(Activity activity) {
        kfc a2 = kfc.a(activity);
        if (!this.g.c(a2.b())) {
            return;
        }
        synchronized (this.f) {
            if (this.f.size() >= 25) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 292, "FrameMetricServiceImpl.java")).w("Too many concurrent measurements, ignoring %s", a2);
                return;
            }
            kfh kfhVar = (kfh) this.f.put(a2, ((kfi) this.h).a());
            if (kfhVar != null) {
                this.f.put(a2, kfhVar);
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 305, "FrameMetricServiceImpl.java")).w("measurement already started: %s", a2);
                return;
            }
            if (this.f.size() == 1) {
                this.d.c();
            }
            if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                String.format("J<%s>", a2.b());
            }
        }
    }
}
