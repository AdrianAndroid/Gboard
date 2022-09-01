package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: ion  reason: default package */
/* loaded from: classes.dex */
public final class ion extends idb {
    public static final ido[] a = {hfe.EVENT_HANDLED, hsp.IMS_CREATED_AFTER_USER_UNLOCKED, ifg.JANK_SCROLL_INSTRUMENT, ifg.START_JANK_MONITOR, ifg.STOP_JANK_MONITOR};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/primes2/metricsprocessor/common/PrimesMetricsProcessorHelper");
    private final iom g;

    public ion(iom iomVar) {
        this.g = iomVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (hfe.EVENT_HANDLED == idoVar) {
            iom iomVar = this.g;
            hfd hfdVar = (hfd) objArr[0];
            oll.e(hfdVar, "event");
            int i = hfdVar.p;
            if (i == 1) {
                iomVar.a(kbh.a("KEY_EVENT_TAP"), 0.01d);
            } else if (i == 4) {
                iomVar.a(kbh.a("KEY_EVENT_GESTURE"), 0.01d);
            }
        } else if (hsp.IMS_CREATED_AFTER_USER_UNLOCKED == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/primes2/metricsprocessor/common/PrimesMetricsProcessorHelper", "doProcessMetrics", 33, "PrimesMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/primes2/metricsprocessor/common/PrimesMetricsProcessorHelper", "doProcessMetrics", 37, "PrimesMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                iom iomVar2 = this.g;
                ((Number) obj).longValue();
                ((Number) objArr[1]).longValue();
                iomVar2.a(kbh.a("IMS_ON_CREATE"), 0.4d);
            }
        } else if (ifg.JANK_SCROLL_INSTRUMENT == idoVar) {
            RecyclerView recyclerView = (RecyclerView) objArr[0];
            kbh kbhVar = (kbh) objArr[1];
        } else if (ifg.START_JANK_MONITOR == idoVar) {
            kbh kbhVar2 = (kbh) objArr[0];
        } else if (ifg.STOP_JANK_MONITOR == idoVar) {
            kbh kbhVar3 = (kbh) objArr[0];
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/primes2/metricsprocessor/common/PrimesMetricsProcessorHelper", "doProcessMetrics", 52, "PrimesMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
