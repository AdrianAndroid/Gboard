package com.google.android.libraries.inputmethod.trainingcache.impls.inputmetrics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InputMetricsPeriodicTask implements isc {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/impls/inputmetrics/InputMetricsPeriodicTask");
    private final ixi b;
    private final idk c;

    public InputMetricsPeriodicTask(ixi ixiVar) {
        ieh j = ieh.j();
        this.b = ixiVar;
        this.c = j;
    }

    private static native byte[] generateInputMetrics(byte[] bArr);

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        return isb.FINISHED;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        ixg ixgVar;
        List q;
        long currentTimeMillis = System.currentTimeMillis();
        ixh h = this.b.h(iuy.j, currentTimeMillis + TimeUnit.DAYS.toMillis(-1L), currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            ixg ixgVar2 = (ixg) h.next();
            List i = this.b.i(iuy.e, ixgVar2.b);
            if (i.size() > 1) {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/inputmetrics/InputMetricsPeriodicTask", "getSerializedInputActions", 100, "InputMetricsPeriodicTask.java")).u("Abnormal count of input action collections: %d, should be <= 1.", i.size());
                ixgVar = null;
            } else {
                ixgVar = (ixg) lre.ap(i);
            }
            if (ixgVar != null) {
                q = lre.H(((mrd) ixgVar.b()).a, hwy.n);
            } else {
                q = llp.q();
            }
            if (!q.isEmpty()) {
                nfh t = mqv.d.t();
                nem u = nem.u(ixgVar2.c);
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mqv mqvVar = (mqv) t.b;
                mqvVar.a = 1 | mqvVar.a;
                mqvVar.b = u;
                nga ngaVar = mqvVar.c;
                if (!ngaVar.c()) {
                    mqvVar.c = nfm.H(ngaVar);
                }
                ndt.cs(q, mqvVar.c);
                try {
                    mqw mqwVar = (mqw) nfm.z(mqw.c, generateInputMetrics(((mqv) t.cz()).q()), nfb.b());
                    mqx mqxVar = mqwVar.a;
                    if (mqxVar == null) {
                        mqxVar = mqx.c;
                    }
                    if (mqxVar.a) {
                        nem nemVar = mqwVar.b;
                        nfb b = nfb.b();
                        mer merVar = mer.a;
                        ner l = nemVar.l();
                        nfm nfmVar = (nfm) merVar.N(4);
                        try {
                            try {
                                nho b2 = nhh.a.b(nfmVar);
                                b2.h(nfmVar, nes.p(l), b);
                                b2.f(nfmVar);
                                try {
                                    l.z(0);
                                    nfm.O(nfmVar);
                                    arrayList.add((mer) nfmVar);
                                } catch (ngd e) {
                                    throw e;
                                }
                            } catch (IOException e2) {
                                if (e2.getCause() instanceof ngd) {
                                    throw ((ngd) e2.getCause());
                                }
                                throw new ngd(e2);
                            } catch (nhz e3) {
                                throw e3.a();
                            }
                        } catch (RuntimeException e4) {
                            if (e4.getCause() instanceof ngd) {
                                throw ((ngd) e4.getCause());
                            }
                            throw e4;
                        } catch (ngd e5) {
                            if (e5.a) {
                                throw new ngd(e5);
                            }
                            throw e5;
                        }
                    } else {
                        ltd ltdVar = (ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/trainingcache/impls/inputmetrics/InputMetricsPeriodicTask", "onRunTask", 83, "InputMetricsPeriodicTask.java");
                        mqx mqxVar2 = mqwVar.a;
                        if (mqxVar2 == null) {
                            mqxVar2 = mqx.c;
                        }
                        ltdVar.w("%s", mqxVar2.b);
                    }
                } catch (ngd e6) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e6)).k("com/google/android/libraries/inputmethod/trainingcache/impls/inputmetrics/InputMetricsPeriodicTask", "onRunTask", 'V', "InputMetricsPeriodicTask.java")).t("Failed to parse input metrics response");
                }
            }
        }
        this.c.e(iwc.INPUT_METRICS, arrayList);
        gvt.a(h);
        return kcu.K(isb.FINISHED);
    }
}
