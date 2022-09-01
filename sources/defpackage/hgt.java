package defpackage;

import j$.util.Map;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: hgt  reason: default package */
/* loaded from: classes.dex */
public final class hgt extends idb {
    public static final ido[] a = {hgu.ALREADY_INSTALLED, hgu.BRELLA_JNI_FAILED_IN_LOADING, hgu.BRELLA_JNI_LOADED_FROM_EMBEDDED_SHARED_OBJECT, hgu.BRELLA_JNI_LOADED_FROM_EMBEDDED_SHARED_OBJECT_WITH_STUB, hgu.BRELLA_JNI_LOADED_FROM_FEATURE_SPLIT, hgu.DEFERRED_INSTALL_FAILED, hgu.DEFERRED_INSTALL_REQUESTED, hgu.NEWLY_INSTALLED};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/featuresplit/metrics/FeatureSplitMetricsProcessorHelper");
    private final hgs g;

    public hgt(hgs hgsVar) {
        this.g = hgsVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (hgu.ALREADY_INSTALLED == idoVar) {
            this.g.a((Collection) objArr[0]);
        } else if (hgu.BRELLA_JNI_FAILED_IN_LOADING == idoVar) {
            this.g.b();
        } else if (hgu.BRELLA_JNI_LOADED_FROM_EMBEDDED_SHARED_OBJECT == idoVar) {
            this.g.b();
        } else if (hgu.BRELLA_JNI_LOADED_FROM_EMBEDDED_SHARED_OBJECT_WITH_STUB == idoVar) {
            this.g.b();
        } else if (hgu.BRELLA_JNI_LOADED_FROM_FEATURE_SPLIT == idoVar) {
            this.g.b();
        } else if (hgu.DEFERRED_INSTALL_FAILED == idoVar) {
            Object obj = objArr[1];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/featuresplit/metrics/FeatureSplitMetricsProcessorHelper", "doProcessMetrics", 43, "FeatureSplitMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            hgs hgsVar = this.g;
            Collection<String> collection = (Collection) objArr[0];
            int intValue = ((Number) obj).intValue();
            oll.e(collection, "newPendingModules");
            for (String str : collection) {
                Object orDefault = Map.EL.getOrDefault(hgs.a, str, "Invalid");
                new StringBuilder("FeatureSplit.").append(orDefault);
                String concat = "FeatureSplit.".concat(String.valueOf(orDefault));
                hgsVar.b.d(concat, 4);
                hgsVar.b.d(concat.concat(".ErrorCode"), intValue);
            }
        } else if (hgu.DEFERRED_INSTALL_REQUESTED == idoVar) {
            this.g.a((Collection) objArr[0]);
        } else if (hgu.NEWLY_INSTALLED == idoVar) {
            this.g.a((Collection) objArr[0]);
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/featuresplit/metrics/FeatureSplitMetricsProcessorHelper", "doProcessMetrics", 55, "FeatureSplitMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
