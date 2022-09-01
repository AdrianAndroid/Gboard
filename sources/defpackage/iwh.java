package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: iwh  reason: default package */
/* loaded from: classes.dex */
public final class iwh extends idb {
    public static final ido[] a = {idd.PERIODIC_TASK_SERVICE_RUN, iwc.CHECK_INPUT_ACTIONS_RESULT, iwc.DB_SIZE, iwc.DEVICE_INTEGRITY_CHECK, iwc.ESS_START, iwc.FETCH_LM_RESULT, iwc.GET_LATEST_UNIFIED_PARAMS_RESULT, iwc.INPUT_ACTION_SOURCE, iwc.INPUT_METRICS, iwc.LC_ARTIFACTS_EXTRACTED, iwc.LC_HANDLER_IMPL, iwc.LC_HANDLER_IMPL_BEAM_SIZE, iwc.LC_HANDLER_IMPL_RESULT, iwc.LC_TASK_FAILURE, iwc.LC_TASK_SUCCESS, iwc.LC_TRAINER_CANCELED, iwc.LC_TRAINER_SCHEDULED, iwc.MAINTENANCE_FAIL_SAFE_COUNT, iwc.MAINTENANCE_TASK_INTERVAL_HOURS, iwc.MAINTENANCE_TASK_RESULT, iwc.MATERIALIZER_START, iwc.MATERIALIZER_TF_EXAMPLE, iwc.TABLE_STATS};
    private static final ltg f = ltg.j("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper");
    private final iwg g;

    public iwh(iwg iwgVar) {
        this.g = iwgVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (idd.PERIODIC_TASK_SERVICE_RUN == idoVar) {
            iwg iwgVar = this.g;
            List list = (List) objArr[0];
            if (((Boolean) itm.b.c()).booleanValue()) {
                long I = ino.K(iwgVar.c, null).I("pref_training_cache_maintenance_task_last_run");
                long currentTimeMillis = System.currentTimeMillis() - I;
                if (I == 0) {
                    iwgVar.a.e("TC.Maint.LRun", -1L);
                } else {
                    iwgVar.a.e("TC.Maint.LRun", TimeUnit.MILLISECONDS.toHours(currentTimeMillis));
                }
                kcu.U(mio.g(iwy.a.b(), iuu.i, iwgVar.d), new ivq(6), iwgVar.d);
            }
        } else if (iwc.CHECK_INPUT_ACTIONS_RESULT == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 33, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.g(((Number) obj).intValue());
        } else if (iwc.DB_SIZE == idoVar) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 40, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a.e("TC.DB.V3.Size", ((Number) obj2).longValue());
        } else if (iwc.DEVICE_INTEGRITY_CHECK == idoVar) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 47, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.g(((Number) obj3).intValue());
        } else if (iwc.ESS_START == idoVar) {
            this.g.d((String) objArr[0]);
        } else if (iwc.FETCH_LM_RESULT == idoVar) {
            Object obj4 = objArr[0];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 57, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.g(((Number) obj4).intValue());
        } else if (iwc.GET_LATEST_UNIFIED_PARAMS_RESULT == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 64, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.g(((Number) obj5).intValue());
        } else if (iwc.INPUT_ACTION_SOURCE == idoVar) {
            Object obj6 = objArr[0];
            if (obj6 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 71, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.g(((Number) obj6).intValue());
        } else if (iwc.INPUT_METRICS == idoVar) {
            iwg iwgVar2 = this.g;
            List list2 = (List) objArr[0];
            nfh t = mbh.aT.t();
            mde mdeVar = ieo.a().a;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbh mbhVar = (mbh) t.b;
            mdeVar.getClass();
            mbhVar.A = mdeVar;
            mbhVar.a |= 536870912;
            mbhVar.d |= 131072;
            mbhVar.aH = true;
            if (!list2.isEmpty()) {
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbh mbhVar2 = (mbh) t.b;
                nga ngaVar = mbhVar2.aD;
                if (!ngaVar.c()) {
                    mbhVar2.aD = nfm.H(ngaVar);
                }
                ndt.cs(list2, mbhVar2.aD);
            }
            idb idbVar = iwgVar2.e;
            iwgVar2.a.f((mbh) t.cz(), 272, idbVar.c, idbVar.d);
        } else if (iwc.LC_ARTIFACTS_EXTRACTED == idoVar) {
            this.g.d((String) objArr[0]);
        } else if (iwc.LC_HANDLER_IMPL == idoVar) {
            this.g.d((String) objArr[0]);
        } else if (iwc.LC_HANDLER_IMPL_BEAM_SIZE == idoVar) {
            Object obj7 = objArr[0];
            if (obj7 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 87, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.g(((Number) obj7).intValue());
        } else if (iwc.LC_HANDLER_IMPL_RESULT == idoVar) {
            this.g.a.d(String.format(Locale.getDefault(), "LC.Handler.Impl.%s.Res", (String) objArr[0]), ((Status) objArr[1]).f);
        } else if (iwc.LC_TASK_FAILURE == idoVar) {
            this.g.d((String) objArr[0]);
        } else if (iwc.LC_TASK_SUCCESS == idoVar) {
            this.g.d((String) objArr[0]);
        } else if (iwc.LC_TRAINER_CANCELED == idoVar) {
            this.g.d((String) objArr[0]);
        } else if (iwc.LC_TRAINER_SCHEDULED == idoVar) {
            this.g.d((String) objArr[0]);
        } else if (iwc.MAINTENANCE_FAIL_SAFE_COUNT == idoVar) {
            this.g.a.c("TC.Maint.FS");
        } else if (iwc.MAINTENANCE_TASK_INTERVAL_HOURS == idoVar) {
            Object obj8 = objArr[0];
            if (obj8 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 112, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a.e("TC.Maint.Interval", ((Number) obj8).longValue());
        } else if (iwc.MAINTENANCE_TASK_RESULT == idoVar) {
            Object obj9 = objArr[0];
            if (obj9 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 119, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.g(((Number) obj9).intValue());
        } else if (iwc.MATERIALIZER_START == idoVar) {
            this.g.d((String) objArr[0]);
        } else if (iwc.MATERIALIZER_TF_EXAMPLE == idoVar) {
            this.g.d((String) objArr[0]);
        } else if (iwc.TABLE_STATS == idoVar) {
            Object obj10 = objArr[1];
            if (obj10 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 132, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 136, "TrainingCacheStatsMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else {
                iwg iwgVar3 = this.g;
                String str = (String) objArr[0];
                long longValue = ((Number) obj10).longValue();
                iwgVar3.a.e(iwg.c(str, "Age"), ((Number) objArr[2]).intValue());
                iwgVar3.a.e(iwg.c(str, "Cnt"), longValue);
            }
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/libraries/inputmethod/trainingcache/metrics/processor/TrainingCacheStatsMetricsProcessorHelper", "doProcessMetrics", 142, "TrainingCacheStatsMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
