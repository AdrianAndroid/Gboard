package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: kfx  reason: default package */
/* loaded from: classes.dex */
public final class kfx implements kdt {
    public final nox a;
    public final kdq b;
    public final kgc c;
    private final mks d;
    private final kbv e;
    private final boolean f;
    private final kfw g;

    public kfx() {
    }

    public kfx(kdr kdrVar, kfw kfwVar, mks mksVar, nox noxVar, kgc kgcVar, kbv kbvVar, oiy oiyVar, Executor executor, lfb lfbVar) {
        this();
        new AtomicReference(kfr.a);
        new ConcurrentHashMap();
        this.g = kfwVar;
        this.e = kbvVar;
        this.b = kdrVar.a(executor, noxVar, oiyVar);
        this.d = mksVar;
        this.a = noxVar;
        this.c = kgcVar;
        this.f = ((Boolean) lfbVar.c(Boolean.FALSE)).booleanValue();
    }

    public static boolean c(int i) {
        return i != 1;
    }

    public final void a() {
        this.g.a = new kfv() { // from class: kfy
            @Override // defpackage.kfv
            public final void a(int i, String str) {
                kfx.this.d(null, i, str);
            }
        };
    }

    @Override // defpackage.kdt
    public final void ad() {
        if (this.f) {
            a();
        }
    }

    public final void b(kbh kbhVar) {
        d(kbhVar.a, 1, null);
    }

    public final void d(final String str, final int i, final String str2) {
        if (this.e.b) {
            kcu.I();
        } else {
            kcu.P(new mix() { // from class: kfz
                @Override // defpackage.mix
                public final mko a() {
                    long a;
                    ActivityManager.MemoryInfo memoryInfo;
                    kgb kgbVar;
                    kfx kfxVar = kfx.this;
                    int i2 = i;
                    String str3 = str;
                    String str4 = str2;
                    kfq kfqVar = (kfq) kfxVar.a.a();
                    if (kfx.c(i2)) {
                        a = kfqVar.c == 3 ? 1000L : -1L;
                    } else {
                        a = kfxVar.b.a(str3);
                    }
                    if (a != -1) {
                        lfb lfbVar = kfqVar.a;
                        nfh t = oos.u.t();
                        kgc kgcVar = kfxVar.c;
                        Process.myPid();
                        kfq a2 = ((kbu) kgcVar.b).a();
                        kki.g();
                        if (a2.b) {
                            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                            Context context = kgcVar.c;
                            if (kcn.a == null) {
                                synchronized (kcn.class) {
                                    if (kcn.a == null) {
                                        Object systemService = context.getSystemService("activity");
                                        jdg.u(systemService);
                                        kcn.a = (ActivityManager) systemService;
                                    }
                                }
                            }
                            kcn.a.getMemoryInfo(memoryInfo2);
                            memoryInfo = memoryInfo2;
                        } else {
                            memoryInfo = null;
                        }
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                File file = new File("/proc/self/status");
                                Charset defaultCharset = Charset.defaultCharset();
                                lym f = lwm.f(file);
                                jdg.u(defaultCharset);
                                String str5 = new String(f.d(), defaultCharset);
                                if (str5.isEmpty()) {
                                    ((ltd) ((ltd) kgc.a.c()).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 220, "MemoryUsageCapture.java")).t("Null or empty proc status");
                                    kgbVar = null;
                                } else {
                                    kgbVar = new kgb();
                                    kgbVar.f = kgc.b(kgb.a, str5);
                                    kgbVar.g = kgc.b(kgb.b, str5);
                                    kgbVar.h = kgc.b(kgb.c, str5);
                                    kgbVar.i = kgc.b(kgb.d, str5);
                                    kgbVar.j = kgc.b(kgb.e, str5);
                                }
                            } catch (IOException e) {
                                ((ltd) ((ltd) ((ltd) kgc.a.c()).i(e)).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getProcStatus", (char) 249, "MemoryUsageCapture.java")).t("Error reading proc status");
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                kgbVar = null;
                            }
                            nfj nfjVar = (nfj) onr.h.t();
                            nfh t2 = onq.c.t();
                            nfh t3 = ono.i.t();
                            if (memoryInfo != null) {
                                int i3 = (int) (memoryInfo.availMem >> 10);
                                if (t3.c) {
                                    t3.cD();
                                    t3.c = false;
                                }
                                ono onoVar = (ono) t3.b;
                                onoVar.a |= 131072;
                                onoVar.b = i3;
                                int i4 = (int) (memoryInfo.totalMem >> 20);
                                if (t3.c) {
                                    t3.cD();
                                    t3.c = false;
                                }
                                ono onoVar2 = (ono) t3.b;
                                onoVar2.a |= 262144;
                                onoVar2.c = i4;
                            }
                            if (kgbVar != null) {
                                Long l = kgbVar.f;
                                if (l != null) {
                                    long longValue = l.longValue();
                                    if (t3.c) {
                                        t3.cD();
                                        t3.c = false;
                                    }
                                    ono onoVar3 = (ono) t3.b;
                                    onoVar3.a |= 524288;
                                    onoVar3.d = longValue;
                                }
                                Long l2 = kgbVar.g;
                                if (l2 != null) {
                                    long longValue2 = l2.longValue();
                                    if (t3.c) {
                                        t3.cD();
                                        t3.c = false;
                                    }
                                    ono onoVar4 = (ono) t3.b;
                                    onoVar4.a |= 1048576;
                                    onoVar4.e = longValue2;
                                }
                                Long l3 = kgbVar.h;
                                if (l3 != null) {
                                    long longValue3 = l3.longValue();
                                    if (t3.c) {
                                        t3.cD();
                                        t3.c = false;
                                    }
                                    ono onoVar5 = (ono) t3.b;
                                    onoVar5.a |= 2097152;
                                    onoVar5.f = longValue3;
                                }
                                Long l4 = kgbVar.i;
                                if (l4 != null) {
                                    long longValue4 = l4.longValue();
                                    if (t3.c) {
                                        t3.cD();
                                        t3.c = false;
                                    }
                                    ono onoVar6 = (ono) t3.b;
                                    onoVar6.a |= 4194304;
                                    onoVar6.g = longValue4;
                                }
                                Long l5 = kgbVar.j;
                                if (l5 != null) {
                                    long longValue5 = l5.longValue();
                                    if (t3.c) {
                                        t3.cD();
                                        t3.c = false;
                                    }
                                    ono onoVar7 = (ono) t3.b;
                                    onoVar7.a |= 8388608;
                                    onoVar7.h = longValue5;
                                }
                            }
                            ono onoVar8 = (ono) t3.cz();
                            if (t2.c) {
                                t2.cD();
                                t2.c = false;
                            }
                            onq onqVar = (onq) t2.b;
                            onoVar8.getClass();
                            onqVar.b = onoVar8;
                            onqVar.a |= 1;
                            if (nfjVar.c) {
                                nfjVar.cD();
                                nfjVar.c = false;
                            }
                            onr onrVar = (onr) nfjVar.b;
                            onq onqVar2 = (onq) t2.cz();
                            onqVar2.getClass();
                            onrVar.b = onqVar2;
                            onrVar.a |= 1;
                            nfh t4 = ooc.c.t();
                            oob j = mhb.j(kgcVar.c);
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            ooc oocVar = (ooc) t4.b;
                            j.getClass();
                            oocVar.b = j;
                            oocVar.a |= 1;
                            if (nfjVar.c) {
                                nfjVar.cD();
                                nfjVar.c = false;
                            }
                            onr onrVar2 = (onr) nfjVar.b;
                            ooc oocVar2 = (ooc) t4.cz();
                            oocVar2.getClass();
                            onrVar2.c = oocVar2;
                            onrVar2.a |= 2;
                            nfh t5 = onp.c.t();
                            Context context2 = kgcVar.c;
                            ActivityManager activityManager = kcn.a;
                            Object systemService2 = context2.getSystemService("power");
                            jdg.u(systemService2);
                            boolean isInteractive = ((PowerManager) systemService2).isInteractive();
                            if (t5.c) {
                                t5.cD();
                                t5.c = false;
                            }
                            onp onpVar = (onp) t5.b;
                            onpVar.a |= 1;
                            onpVar.b = isInteractive;
                            if (nfjVar.c) {
                                nfjVar.cD();
                                nfjVar.c = false;
                            }
                            onr onrVar3 = (onr) nfjVar.b;
                            onp onpVar2 = (onp) t5.cz();
                            onpVar2.getClass();
                            onrVar3.f = onpVar2;
                            onrVar3.a |= 8;
                            if (nfjVar.c) {
                                nfjVar.cD();
                                nfjVar.c = false;
                            }
                            onr onrVar4 = (onr) nfjVar.b;
                            onrVar4.e = i2 - 1;
                            int i5 = onrVar4.a | 4;
                            onrVar4.a = i5;
                            if (str4 != null) {
                                onrVar4.a = i5 | 16;
                                onrVar4.g = str4;
                            }
                            onr onrVar5 = (onr) nfjVar.cz();
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            oos oosVar = (oos) t.b;
                            onrVar5.getClass();
                            oosVar.e = onrVar5;
                            oosVar.a |= 8;
                            kdl a3 = kdm.a();
                            a3.a = str3;
                            a3.b(true);
                            a3.d = Long.valueOf(a);
                            a3.d((oos) t.cz());
                            a3.b = null;
                            if (kfx.c(i2)) {
                                a3.c(true);
                            }
                            return kfxVar.b.b(a3.a());
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    }
                    return mkk.a;
                }
            }, this.d);
        }
    }
}
