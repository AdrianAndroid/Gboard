package defpackage;

/* compiled from: PG */
/* renamed from: hzh  reason: default package */
/* loaded from: classes.dex */
public final class hzh extends idb {
    public static final ido[] a = {hzn.MDD_DOWNLOAD_FAILED, hzn.MDD_DOWNLOAD_FINISHED, hzn.MDD_DOWNLOAD_REQUESTED, hzn.MDD_DOWNLOAD_STARTED};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/mdd/MDDMetricsProcessorHelper");
    private final hzg g;

    public hzh(hzg hzgVar) {
        this.g = hzgVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (hzn.MDD_DOWNLOAD_FAILED == idoVar) {
            Object obj = objArr[1];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/mdd/MDDMetricsProcessorHelper", "doProcessMetrics", 27, "MDDMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            hzg hzgVar = this.g;
            String str = (String) objArr[0];
            int intValue = ((Number) obj).intValue();
            Exception exc = (Exception) objArr[2];
            String a2 = hzg.a(str, intValue);
            if (!hzgVar.b.ai(a2)) {
                ((ltd) ((ltd) hzg.a.c()).k("com/google/android/libraries/inputmethod/mdd/MDDMetricsProcessor", "processDownloadFailed", 68, "MDDMetricsProcessor.java")).w("%s is not requested", str);
            } else {
                int I = (int) ((hzgVar.c.c - hzgVar.b.I(a2)) / 1000);
                nfh t = mcm.g.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mcm mcmVar = (mcm) t.b;
                str.getClass();
                int i = mcmVar.a | 1;
                mcmVar.a = i;
                mcmVar.b = str;
                int i2 = i | 2;
                mcmVar.a = i2;
                mcmVar.c = intValue;
                int i3 = i2 | 8;
                mcmVar.a = i3;
                mcmVar.e = false;
                mcmVar.a = i3 | 4;
                mcmVar.d = I;
                String simpleName = exc.getClass().getSimpleName();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mcm mcmVar2 = (mcm) t.b;
                simpleName.getClass();
                mcmVar2.a |= 16;
                mcmVar2.f = simpleName;
                hzgVar.b((mcm) t.cz());
            }
        } else if (hzn.MDD_DOWNLOAD_FINISHED == idoVar) {
            Object obj2 = objArr[1];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/mdd/MDDMetricsProcessorHelper", "doProcessMetrics", 34, "MDDMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            hzg hzgVar2 = this.g;
            String str2 = (String) objArr[0];
            int intValue2 = ((Number) obj2).intValue();
            String a3 = hzg.a(str2, intValue2);
            if (!hzgVar2.b.ai(a3)) {
                ((ltd) ((ltd) hzg.a.c()).k("com/google/android/libraries/inputmethod/mdd/MDDMetricsProcessor", "processDownloadSuccess", 87, "MDDMetricsProcessor.java")).w("%s is not requested", str2);
            } else {
                int I2 = (int) ((hzgVar2.c.c - hzgVar2.b.I(a3)) / 1000);
                nfh t2 = mcm.g.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mcm mcmVar3 = (mcm) t2.b;
                str2.getClass();
                int i4 = mcmVar3.a | 1;
                mcmVar3.a = i4;
                mcmVar3.b = str2;
                int i5 = i4 | 2;
                mcmVar3.a = i5;
                mcmVar3.c = intValue2;
                int i6 = i5 | 8;
                mcmVar3.a = i6;
                mcmVar3.e = true;
                mcmVar3.a = i6 | 4;
                mcmVar3.d = I2;
                hzgVar2.b((mcm) t2.cz());
            }
        } else if (hzn.MDD_DOWNLOAD_REQUESTED == idoVar) {
            Object obj3 = objArr[1];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/mdd/MDDMetricsProcessorHelper", "doProcessMetrics", 41, "MDDMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            hzg hzgVar3 = this.g;
            String a4 = hzg.a((String) objArr[0], ((Number) obj3).intValue());
            if (!hzgVar3.b.ai(a4)) {
                hzgVar3.b.i(a4, hzgVar3.c.c);
            }
        } else if (hzn.MDD_DOWNLOAD_STARTED == idoVar) {
            Object obj4 = objArr[1];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/mdd/MDDMetricsProcessorHelper", "doProcessMetrics", 48, "MDDMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            String str3 = (String) objArr[0];
            ((Number) obj4).intValue();
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/mdd/MDDMetricsProcessorHelper", "doProcessMetrics", 54, "MDDMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
