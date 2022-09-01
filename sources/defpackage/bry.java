package defpackage;

import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: bry  reason: default package */
/* loaded from: classes.dex */
public final class bry extends idb {
    public static final ido[] a = {bsa.a, hfe.EVENT_HANDLED, hsp.IMS_INPUT_VIEW_FINISHED, hsp.IMS_ON_START_INPUT_VIEW};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/latin/searchhint/AGSAMetricsProcessorHelper");
    private final brx g;

    public bry(brx brxVar) {
        this.g = brxVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        int i;
        if (bsa.a == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/searchhint/AGSAMetricsProcessorHelper", "doProcessMetrics", 31, "AGSAMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a.d("AGSA.HintAction", ((Number) obj).intValue());
        } else if (hfe.EVENT_HANDLED == idoVar) {
            brx brxVar = this.g;
            hfd hfdVar = (hfd) objArr[0];
            if (hfdVar != null && brxVar.b && ((i = hfdVar.b[0].c) == 66 || i == -10018)) {
                brxVar.a.c("AGSA.SearchPressed");
                brxVar.c = true;
            }
        } else if (hsp.IMS_INPUT_VIEW_FINISHED == idoVar) {
            brx brxVar2 = this.g;
            mcu mcuVar = (mcu) objArr[0];
            if (brxVar2.b) {
                brxVar2.a.b("AGSA.SessionEnd", brxVar2.c);
            }
        } else if (hsp.IMS_ON_START_INPUT_VIEW == idoVar) {
            Object obj2 = objArr[1];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/searchhint/AGSAMetricsProcessorHelper", "doProcessMetrics", 44, "AGSAMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/searchhint/AGSAMetricsProcessorHelper", "doProcessMetrics", 48, "AGSAMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/searchhint/AGSAMetricsProcessorHelper", "doProcessMetrics", 52, "AGSAMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[5] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/searchhint/AGSAMetricsProcessorHelper", "doProcessMetrics", 56, "AGSAMetricsProcessorHelper.java")).t("the 5th argument is null!");
                return false;
            } else {
                brx brxVar3 = this.g;
                ((Number) obj2).intValue();
                ((Boolean) objArr[2]).booleanValue();
                ((Boolean) objArr[3]).booleanValue();
                iau iauVar = (iau) objArr[4];
                ((Boolean) objArr[5]).booleanValue();
                brxVar3.b = han.AGSA.a((EditorInfo) objArr[0]);
                brxVar3.c = false;
            }
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/searchhint/AGSAMetricsProcessorHelper", "doProcessMetrics", 62, "AGSAMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
