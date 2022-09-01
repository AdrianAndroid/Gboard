package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: dnv  reason: default package */
/* loaded from: classes.dex */
public final class dnv extends idb {
    public static final ido[] a = {cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_CLIENT_REQUEST, cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_INPUT_STATE, cap.ABANDON_REQUEST_DUE_TO_STALE_CLIENT_REQUEST, cap.APPLY_CLIENT_DIFF_REQUEST, cap.FLUSH_NATIVE_METRICS, cap.LOG_NATIVE_METRICS, cap.LOG_NATIVE_METRICS_ARRAY, cap.LOG_NATIVE_METRICS_WITH_CLIENT_REQUEST_ID, cap.LOG_NATIVE_METRICS_WITH_TYPING_METRICS, hry.INPUT_METHOD_ENTRY_CHANGED};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper");
    private final dnu g;

    public dnv(dnu dnuVar) {
        this.g = dnuVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_CLIENT_REQUEST == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 32, "Latin5NativeMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 36, "Latin5NativeMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 40, "Latin5NativeMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 44, "Latin5NativeMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 48, "Latin5NativeMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else if (objArr[5] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 52, "Latin5NativeMetricsProcessorHelper.java")).t("the 5th argument is null!");
                return false;
            } else {
                dnu dnuVar = this.g;
                ((Number) obj).intValue();
                ((Number) objArr[1]).longValue();
                ((Number) objArr[2]).longValue();
                ((Boolean) objArr[3]).booleanValue();
                ((Boolean) objArr[4]).booleanValue();
                dnuVar.g(((Number) objArr[5]).longValue());
            }
        } else if (cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_INPUT_STATE == idoVar) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 59, "Latin5NativeMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 63, "Latin5NativeMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 67, "Latin5NativeMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 71, "Latin5NativeMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 75, "Latin5NativeMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else if (objArr[5] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 79, "Latin5NativeMetricsProcessorHelper.java")).t("the 5th argument is null!");
                return false;
            } else {
                dnu dnuVar2 = this.g;
                ((Number) obj2).intValue();
                ((Number) objArr[1]).longValue();
                ((Number) objArr[2]).longValue();
                ((Boolean) objArr[3]).booleanValue();
                ((Boolean) objArr[4]).booleanValue();
                dnuVar2.g(((Number) objArr[5]).longValue());
            }
        } else if (cap.ABANDON_REQUEST_DUE_TO_STALE_CLIENT_REQUEST == idoVar) {
            Object obj3 = objArr[1];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 86, "Latin5NativeMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 90, "Latin5NativeMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else {
                dnu dnuVar3 = this.g;
                String str = (String) objArr[0];
                ((Number) obj3).intValue();
                long longValue = ((Number) objArr[2]).longValue();
                if (((Boolean) doa.a.c()).booleanValue()) {
                    dnuVar3.a(longValue, true);
                }
            }
        } else if (cap.APPLY_CLIENT_DIFF_REQUEST == idoVar) {
            Object obj4 = objArr[0];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 97, "Latin5NativeMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            dnu dnuVar4 = this.g;
            long longValue2 = ((Number) obj4).longValue();
            if (((Boolean) doa.a.c()).booleanValue()) {
                dnuVar4.a(longValue2, false);
            }
        } else if (cap.FLUSH_NATIVE_METRICS == idoVar) {
            dnu dnuVar5 = this.g;
            Delight5Facilitator g = Delight5Facilitator.g();
            if (g != null) {
                dnuVar5.c(g.h.e.a.getAllPendingMetrics());
            }
        } else if (cap.LOG_NATIVE_METRICS == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 107, "Latin5NativeMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.d(((Number) obj5).longValue(), -1L);
        } else if (cap.LOG_NATIVE_METRICS_ARRAY == idoVar) {
            this.g.c((mvd) objArr[0]);
        } else if (cap.LOG_NATIVE_METRICS_WITH_CLIENT_REQUEST_ID == idoVar) {
            Object obj6 = objArr[0];
            if (obj6 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 117, "Latin5NativeMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 121, "Latin5NativeMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                this.g.d(((Number) obj6).longValue(), ((Number) objArr[1]).longValue());
            }
        } else if (cap.LOG_NATIVE_METRICS_WITH_TYPING_METRICS == idoVar) {
            Object obj7 = objArr[0];
            if (obj7 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 128, "Latin5NativeMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 132, "Latin5NativeMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 136, "Latin5NativeMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 140, "Latin5NativeMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else {
                dnu dnuVar6 = this.g;
                long longValue3 = ((Number) obj7).longValue();
                mes mesVar = (mes) objArr[1];
                long longValue4 = ((Number) objArr[2]).longValue();
                boolean booleanValue = ((Boolean) objArr[3]).booleanValue();
                long longValue5 = ((Number) objArr[4]).longValue();
                if (longValue4 > 0 && (dnuVar6.i <= 0 || !booleanValue)) {
                    dnuVar6.i = longValue4;
                }
                dnuVar6.j = longValue4;
                if (mesVar != null) {
                    dnuVar6.a += mesVar.b;
                    dnuVar6.b += mesVar.c;
                    dnuVar6.c += mesVar.d;
                    dnuVar6.d += mesVar.e;
                    dnuVar6.e += mesVar.f;
                    dnuVar6.f += mesVar.g;
                    dnuVar6.g += mesVar.h;
                    dnuVar6.h += mesVar.i;
                }
                dnuVar6.d(longValue3, longValue5);
            }
        } else if (hry.INPUT_METHOD_ENTRY_CHANGED == idoVar) {
            Object obj8 = objArr[3];
            if (obj8 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 147, "Latin5NativeMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            dnu dnuVar7 = this.g;
            hqt hqtVar = (hqt) objArr[0];
            Collection collection = (Collection) objArr[2];
            ((Boolean) obj8).booleanValue();
            dnuVar7.k = (hqt) objArr[1];
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/Latin5NativeMetricsProcessorHelper", "doProcessMetrics", 153, "Latin5NativeMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
