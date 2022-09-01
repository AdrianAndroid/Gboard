package defpackage;

/* compiled from: PG */
/* renamed from: hoh  reason: default package */
/* loaded from: classes.dex */
public final class hoh extends idb {
    public static final ido[] a = {hoj.APP_SMART_COMPOSE, hoj.INLINE_SUGGESTION_SELECTED, hoj.SEND_SWIPE_ON_SPACE};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionMetricsProcessorHelper");
    private final hog g;

    public hoh(hog hogVar) {
        this.g = hogVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        String str;
        if (hoj.APP_SMART_COMPOSE == idoVar) {
            Object obj = objArr[1];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionMetricsProcessorHelper", "doProcessMetrics", 27, "InlineSuggestionMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            hog hogVar = this.g;
            String str2 = (String) objArr[0];
            int intValue = ((Number) obj).intValue();
            if (str2 != null && (str = (String) hog.b.get(str2)) != null) {
                String str3 = hoj.APP_SMART_COMPOSE.d;
                hogVar.c.d(str3 + "." + str, intValue);
            }
        } else if (hoj.INLINE_SUGGESTION_SELECTED == idoVar) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionMetricsProcessorHelper", "doProcessMetrics", 34, "InlineSuggestionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            hog hogVar2 = this.g;
            int intValue2 = ((Number) obj2).intValue();
            ido idoVar2 = hogVar2.a().b;
            if (idoVar2 != null) {
                String b = idoVar2.b();
                if (!lfd.e(b)) {
                    hogVar2.c.d(b, intValue2);
                } else {
                    ((ltd) hog.a.a(hip.a).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionMetricsProcessor", "processIntegerHistogramMetrics", 85, "InlineSuggestionMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar2);
                }
            }
        } else if (hoj.SEND_SWIPE_ON_SPACE == idoVar) {
            hog hogVar3 = this.g;
            ido idoVar3 = hogVar3.a().b;
            if (idoVar3 != null) {
                String b2 = idoVar3.b();
                if (!lfd.e(b2)) {
                    hogVar3.c.c(b2);
                } else {
                    ((ltd) hog.a.a(hip.a).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionMetricsProcessor", "processCounterMetrics", 72, "InlineSuggestionMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar3);
                }
            }
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionMetricsProcessorHelper", "doProcessMetrics", 43, "InlineSuggestionMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
