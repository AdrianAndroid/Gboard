package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: dgs  reason: default package */
/* loaded from: classes.dex */
public final class dgs extends idb {
    public static final ido[] a = {dgt.HANDWRITING_OPERATION, dgt.HANDWRITING_RECOGNITION};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessorHelper");
    private final dgr g;

    public dgs(dgr dgrVar) {
        this.g = dgrVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        String str;
        if (dgt.HANDWRITING_OPERATION == idoVar) {
            Object obj = objArr[2];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessorHelper", "doProcessMetrics", 29, "HandwritingMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            }
            dgr dgrVar = this.g;
            mbi mbiVar = (mbi) objArr[0];
            jav javVar = (jav) objArr[1];
            int intValue = ((Number) obj).intValue();
            ido idoVar2 = dgrVar.f.b;
            String str2 = (String) dgr.b.get(idoVar2);
            String str3 = javVar != null ? javVar.g : "";
            if (dgr.c.contains(str3)) {
                str = "CJ";
            } else {
                str = dgr.d.contains(str3) ? "Indic" : "Other";
            }
            if (str2 != null) {
                dgrVar.e.d(String.format(Locale.US, "%s.%s", str2, str), mbiVar.w);
            } else {
                ((luc) dgr.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessor", "processHandwritingOperation", 255, "HandwritingMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar2);
            }
            if (jam.b) {
                jwy jwyVar = dgrVar.g;
                if (mbiVar == mbi.ACTIVATE) {
                    Object obj2 = jwyVar.c;
                    jwyVar.b = new dgq();
                }
                if (((dgq) jwyVar.a).b(mbiVar, intValue)) {
                    ((luc) ((luc) dgr.a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessor$LocalQualityMetrics", "recordAndLog", 167, "HandwritingMetricsProcessor.java")).w("%s", "Process Lifetime Stats: ".concat(String.valueOf(((dgq) jwyVar.a).a())));
                }
                if (((dgq) jwyVar.b).b(mbiVar, intValue)) {
                    ((luc) ((luc) dgr.a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessor$LocalQualityMetrics", "recordAndLog", 171, "HandwritingMetricsProcessor.java")).w("%s", "Session Lifetime Stats: ".concat(String.valueOf(((dgq) jwyVar.b).a())));
                }
            }
            nfh t = mbh.aT.t();
            nfh t2 = mbj.e.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbj mbjVar = (mbj) t2.b;
            mbjVar.b = mbiVar.w;
            mbjVar.a |= 1;
            nfh t3 = mfb.d.t();
            String str4 = javVar.n;
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mfb mfbVar = (mfb) t3.b;
            str4.getClass();
            mfbVar.a |= 1;
            mfbVar.b = str4;
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbj mbjVar2 = (mbj) t2.b;
            mfb mfbVar2 = (mfb) t3.cz();
            mfbVar2.getClass();
            mbjVar2.c = mfbVar2;
            mbjVar2.a |= 2;
            if (intValue > 0) {
                nfh t4 = maf.o.t();
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                maf mafVar = (maf) t4.b;
                mafVar.a |= 64;
                mafVar.e = intValue;
                maf mafVar2 = (maf) t4.cz();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbj mbjVar3 = (mbj) t2.b;
                mafVar2.getClass();
                mbjVar3.d = mafVar2;
                mbjVar3.a |= 4;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbh mbhVar = (mbh) t.b;
            mbj mbjVar4 = (mbj) t2.cz();
            mbjVar4.getClass();
            mbhVar.I = mbjVar4;
            mbhVar.b |= 1024;
            mde mdeVar = ieo.a().a;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbh mbhVar2 = (mbh) t.b;
            mdeVar.getClass();
            mbhVar2.A = mdeVar;
            mbhVar2.a |= 536870912;
            idi idiVar = dgrVar.e;
            mbh mbhVar3 = (mbh) t.cz();
            idb idbVar = dgrVar.f;
            idiVar.f(mbhVar3, 73, idbVar.c, idbVar.d);
        } else if (dgt.HANDWRITING_RECOGNITION == idoVar) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessorHelper", "doProcessMetrics", 36, "HandwritingMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessorHelper", "doProcessMetrics", 40, "HandwritingMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessorHelper", "doProcessMetrics", 44, "HandwritingMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessorHelper", "doProcessMetrics", 48, "HandwritingMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else {
                dgr dgrVar2 = this.g;
                int intValue2 = ((Number) obj3).intValue();
                int intValue3 = ((Number) objArr[1]).intValue();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                int intValue4 = ((Number) objArr[3]).intValue();
                jav javVar2 = (jav) objArr[4];
                ido idoVar3 = dgrVar2.f.b;
                if (((String) dgr.b.get(idoVar3)) == null) {
                    ((luc) dgr.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessor", "processCounterMetrics", 208, "HandwritingMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar3);
                }
                nfh t5 = mbh.aT.t();
                nfh t6 = maf.o.t();
                if (t6.c) {
                    t6.cD();
                    t6.c = false;
                }
                maf mafVar3 = (maf) t6.b;
                mafVar3.a |= 64;
                mafVar3.e = intValue3;
                maf mafVar4 = (maf) t6.cz();
                nfh t7 = mbk.g.t();
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                mbk mbkVar = (mbk) t7.b;
                int i = mbkVar.a | 1;
                mbkVar.a = i;
                mbkVar.b = intValue2;
                mafVar4.getClass();
                mbkVar.d = mafVar4;
                mbkVar.a = 4 | i;
                nfh t8 = mfb.d.t();
                String str5 = javVar2.n;
                if (t8.c) {
                    t8.cD();
                    t8.c = false;
                }
                mfb mfbVar3 = (mfb) t8.b;
                str5.getClass();
                mfbVar3.a |= 1;
                mfbVar3.b = str5;
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                mbk mbkVar2 = (mbk) t7.b;
                mfb mfbVar4 = (mfb) t8.cz();
                mfbVar4.getClass();
                mbkVar2.e = mfbVar4;
                mbkVar2.a |= 8;
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                mbk mbkVar3 = (mbk) t7.b;
                mbkVar3.a |= 2;
                mbkVar3.c = booleanValue;
                nfh t9 = meo.c.t();
                if (t9.c) {
                    t9.cD();
                    t9.c = false;
                }
                meo meoVar = (meo) t9.b;
                meoVar.a |= 1;
                meoVar.b = intValue4;
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                mbk mbkVar4 = (mbk) t7.b;
                meo meoVar2 = (meo) t9.cz();
                meoVar2.getClass();
                mbkVar4.f = meoVar2;
                mbkVar4.a |= 16;
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                mbh mbhVar4 = (mbh) t5.b;
                mbk mbkVar5 = (mbk) t7.cz();
                mbkVar5.getClass();
                mbhVar4.H = mbkVar5;
                mbhVar4.b |= 512;
                mde mdeVar2 = ieo.a().a;
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                mbh mbhVar5 = (mbh) t5.b;
                mdeVar2.getClass();
                mbhVar5.A = mdeVar2;
                mbhVar5.a |= 536870912;
                idi idiVar2 = dgrVar2.e;
                mbh mbhVar6 = (mbh) t5.cz();
                idb idbVar2 = dgrVar2.f;
                idiVar2.f(mbhVar6, 72, idbVar2.c, idbVar2.d);
            }
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/metrics/HandwritingMetricsProcessorHelper", "doProcessMetrics", 54, "HandwritingMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
