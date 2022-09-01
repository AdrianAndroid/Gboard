package defpackage;

/* compiled from: PG */
/* renamed from: irj  reason: default package */
/* loaded from: classes.dex */
public final class irj extends idb {
    public static final ido[] a = {irk.STATE_REACHED, irk.STATE_REACHED_WITH_NOTES};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/statetracer/StateTracerMetricsProcessorHelper");

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (irk.STATE_REACHED == idoVar) {
            Object obj = objArr[1];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/statetracer/StateTracerMetricsProcessorHelper", "doProcessMetrics", 27, "StateTracerMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            krs.a((String) objArr[0], ((Number) obj).intValue(), null);
        } else if (irk.STATE_REACHED_WITH_NOTES == idoVar) {
            Object obj2 = objArr[1];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/statetracer/StateTracerMetricsProcessorHelper", "doProcessMetrics", 34, "StateTracerMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            krs.a((String) objArr[0], ((Number) obj2).intValue(), (String) objArr[2]);
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/statetracer/StateTracerMetricsProcessorHelper", "doProcessMetrics", 40, "StateTracerMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
