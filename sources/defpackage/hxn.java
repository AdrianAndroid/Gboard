package defpackage;

/* compiled from: PG */
/* renamed from: hxn  reason: default package */
/* loaded from: classes.dex */
public final class hxn extends idb {
    public static final ido[] a = {hxo.EMOJI_KEY_IGNORED, hxo.EMOJI_KEY_TAPS_DURING_THROTTLING, hxo.GLOBE_KEY_IGNORED, hxo.GLOBE_KEY_TAPS_DURING_THROTTLING};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/keythrottler/KeyThrotterMetricsProcessorHelper");
    private final hxm g;

    public hxn(hxm hxmVar) {
        this.g = hxmVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (hxo.EMOJI_KEY_IGNORED == idoVar) {
            this.g.d();
            return true;
        } else if (hxo.EMOJI_KEY_TAPS_DURING_THROTTLING == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/keythrottler/KeyThrotterMetricsProcessorHelper", "doProcessMetrics", 30, "KeyThrotterMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj).intValue());
            return true;
        } else if (hxo.GLOBE_KEY_IGNORED == idoVar) {
            this.g.d();
            return true;
        } else if (hxo.GLOBE_KEY_TAPS_DURING_THROTTLING == idoVar) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/keythrottler/KeyThrotterMetricsProcessorHelper", "doProcessMetrics", 40, "KeyThrotterMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj2).intValue());
            return true;
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/keythrottler/KeyThrotterMetricsProcessorHelper", "doProcessMetrics", 46, "KeyThrotterMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
    }
}
