package defpackage;

import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bqr  reason: default package */
/* loaded from: classes.dex */
public final class bqr extends idb {
    public static final ido[] a = {cab.a, dda.DATA_PACKAGE_DOWNLOAD_FAILED, dda.DATA_PACKAGE_DOWNLOAD_SUCCEEDED, dda.FEDERATED_LEARNING_STATUS, dda.NATIVE_LANGUAGE_HINT_ADDED_LAYOUT, dja.DATA_LOADED, dja.DATA_MISSING, dja.DATA_REQUESTED, erh.BUILDER_ACTIVITY_CREATED, erh.CATEGORY_PREVIEW_THEME, erh.CATEGORY_SELECT_THEME, erh.CATEGORY_SHOW_ALL, erh.CATEGORY_SHOW_MORE, erh.CATEGORY_SWIPE, erh.CREATED, erh.DELETED, erh.EDITED, erh.EDITOR_ACTIVITY_CREATED, erh.KEY_BORDER_OPTION_CHANGED, erh.PACKAGE_DOWNLOADED, erh.PREVIEWED, erh.RESTORE_PACKAGE_DOWNLOADED, erh.SELECTED, erh.SELECTOR_ACTIVITY_CREATED, evk.PRECOMPUTED_FEATURES_NUM_BYTES_DELETED, evk.PRECOMPUTED_FEATURES_NUM_BYTES_MOVED, evk.PRECOMPUTED_FEATURES_NUM_FAILED_DELETE, evk.PRECOMPUTED_FEATURES_NUM_FAILED_MOVE, evk.PRECOMPUTED_FEATURES_NUM_FILES_DELETED, evk.PRECOMPUTED_FEATURES_NUM_FILES_MOVED, evr.NUM_SESSION, evr.NUM_VOICE_RECORDING, evu.CLEANUP_CYCLE_LENGTH, evu.CLEANUP_DONE, evu.CLEANUP_NUM_BYTES_CACHED, evu.CLEANUP_NUM_BYTES_DELETED, evu.CLEANUP_NUM_EVENTS_CACHED, evu.CLEANUP_NUM_EVENTS_DELETED, evu.CLEANUP_START, evu.CLEAR_DONE, evu.CLEAR_START, evu.POLICY_CONFIG_VERSION, evu.RECORD_STATS_DONE, evu.RECORD_STATS_START, evu.TOTAL_SIZE_KB, exw.a, ezo.CHANGE_LANGUAGE, ezo.COMMIT, ezo.CONNECTION_FAIL, ezo.CONNECTION_FAIL_HTTP_CODE, ezo.OPEN, ezo.QUERY_LATENCY, ezo.QUERY_LENGTH, ezo.QUERY_RESULT, ezo.SESSION_COMMIT, ezo.SOURCE_LANGUAGE, gvd.a, gvd.g, gvd.e, gvd.f, gvd.b, gvd.h, gvd.i, gvd.j, gvd.d, gvd.c, hfe.EVENT_HANDLED, hpb.IME_ACTIVATED, hpb.KEYBOARD_ACTIVATED, hsp.IMS_INPUT_VIEW_FINISHED, iqb.a, ixv.a};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper");
    private final bqq g;

    public bqr(bqq bqqVar) {
        this.g = bqqVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        String str;
        if (cab.a == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 38, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            bqq.v(((Number) obj).intValue());
        } else if (dda.DATA_PACKAGE_DOWNLOAD_FAILED == idoVar) {
            String str2 = (String) objArr[1];
            this.g.w((String) objArr[0]);
        } else if (dda.DATA_PACKAGE_DOWNLOAD_SUCCEEDED == idoVar) {
            this.g.k((String) objArr[0]);
        } else if (dda.FEDERATED_LEARNING_STATUS == idoVar) {
            bqq bqqVar = this.g;
            bqqVar.c.d("FederatedLearning.status", ((Integer) objArr[0]).intValue());
            bqqVar.c.b("FederatedLearning.eligible", ((Boolean) objArr[1]).booleanValue());
        } else if (dda.NATIVE_LANGUAGE_HINT_ADDED_LAYOUT == idoVar) {
            bqq bqqVar2 = this.g;
            jav javVar = (jav) objArr[0];
            Set<hqt> set = (Set) objArr[1];
            if (((Boolean) bqp.b.c()).booleanValue()) {
                bqqVar2.c.d("NativeLanguageHintSearch.UserEvents", bqqVar2.u());
                str = "NativeLanguageHintSearch.AddedLayout.";
            } else {
                bqqVar2.c.d("NativeLanguageHint.UserEvents", bqqVar2.u());
                str = "NativeLanguageHint.AddedLayout.";
            }
            String concat = str.concat(String.valueOf(jbs.d(bqq.c(javVar))));
            boolean x = bqqVar2.b.x(R.string.f162150_resource_name_obfuscated_res_0x7f1406f8, false);
            for (hqt hqtVar : set) {
                bqqVar2.c.d(concat, bqq.a(hqtVar, x));
            }
        } else if (dja.DATA_LOADED == idoVar) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 57, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj2).intValue());
        } else if (dja.DATA_MISSING == idoVar) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 64, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj3).intValue());
        } else if (dja.DATA_REQUESTED == idoVar) {
            this.g.j();
        } else if (erh.BUILDER_ACTIVITY_CREATED == idoVar) {
            this.g.j();
        } else if (erh.CATEGORY_PREVIEW_THEME == idoVar) {
            Object obj4 = objArr[0];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 77, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj4).intValue());
        } else if (erh.CATEGORY_SELECT_THEME == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 84, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj5).intValue());
        } else if (erh.CATEGORY_SHOW_ALL == idoVar) {
            Object obj6 = objArr[0];
            if (obj6 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 91, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj6).intValue());
        } else if (erh.CATEGORY_SHOW_MORE == idoVar) {
            Object obj7 = objArr[0];
            if (obj7 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 98, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj7).intValue());
        } else if (erh.CATEGORY_SWIPE == idoVar) {
            Object obj8 = objArr[0];
            if (obj8 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 105, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj8).intValue());
        } else if (erh.CREATED == idoVar) {
            this.g.j();
        } else if (erh.DELETED == idoVar) {
            this.g.j();
        } else if (erh.EDITED == idoVar) {
            this.g.j();
        } else if (erh.EDITOR_ACTIVITY_CREATED == idoVar) {
            this.g.j();
        } else if (erh.KEY_BORDER_OPTION_CHANGED == idoVar) {
            Object obj9 = objArr[0];
            if (obj9 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 124, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.i(((Boolean) obj9).booleanValue());
        } else if (erh.PACKAGE_DOWNLOADED == idoVar) {
            Object obj10 = objArr[0];
            if (obj10 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 131, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.i(((Boolean) obj10).booleanValue());
        } else if (erh.PREVIEWED == idoVar) {
            this.g.c.d("Theme.previewTheme", bvq.d((erm) objArr[0]) - 1);
        } else if (erh.RESTORE_PACKAGE_DOWNLOADED == idoVar) {
            Object obj11 = objArr[0];
            if (obj11 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 141, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.i(((Boolean) obj11).booleanValue());
        } else if (erh.SELECTED == idoVar) {
            this.g.c.d("Theme.selectTheme", bvq.d((erm) objArr[0]) - 1);
        } else if (erh.SELECTOR_ACTIVITY_CREATED == idoVar) {
            this.g.j();
        } else if (evk.PRECOMPUTED_FEATURES_NUM_BYTES_DELETED == idoVar) {
            Object obj12 = objArr[0];
            if (obj12 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 154, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj12).longValue());
        } else if (evk.PRECOMPUTED_FEATURES_NUM_BYTES_MOVED == idoVar) {
            Object obj13 = objArr[0];
            if (obj13 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 161, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj13).longValue());
        } else if (evk.PRECOMPUTED_FEATURES_NUM_FAILED_DELETE == idoVar) {
            Object obj14 = objArr[0];
            if (obj14 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 168, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj14).intValue());
        } else if (evk.PRECOMPUTED_FEATURES_NUM_FAILED_MOVE == idoVar) {
            Object obj15 = objArr[0];
            if (obj15 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 175, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj15).intValue());
        } else if (evk.PRECOMPUTED_FEATURES_NUM_FILES_DELETED == idoVar) {
            Object obj16 = objArr[0];
            if (obj16 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 182, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj16).intValue());
        } else if (evk.PRECOMPUTED_FEATURES_NUM_FILES_MOVED == idoVar) {
            Object obj17 = objArr[0];
            if (obj17 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 189, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.n(((Number) obj17).intValue());
        } else if (evr.NUM_SESSION == idoVar) {
            Object obj18 = objArr[0];
            if (obj18 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 196, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj18).longValue());
        } else if (evr.NUM_VOICE_RECORDING == idoVar) {
            Object obj19 = objArr[0];
            if (obj19 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 203, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj19).longValue());
        } else if (evu.CLEANUP_CYCLE_LENGTH == idoVar) {
            Object obj20 = objArr[0];
            if (obj20 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 210, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj20).longValue());
        } else if (evu.CLEANUP_DONE == idoVar) {
            Object obj21 = objArr[0];
            if (obj21 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 217, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.i(((Boolean) obj21).booleanValue());
        } else if (evu.CLEANUP_NUM_BYTES_CACHED == idoVar) {
            Object obj22 = objArr[0];
            if (obj22 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 224, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj22).longValue());
        } else if (evu.CLEANUP_NUM_BYTES_DELETED == idoVar) {
            Object obj23 = objArr[0];
            if (obj23 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 231, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj23).longValue());
        } else if (evu.CLEANUP_NUM_EVENTS_CACHED == idoVar) {
            Object obj24 = objArr[0];
            if (obj24 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 238, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj24).longValue());
        } else if (evu.CLEANUP_NUM_EVENTS_DELETED == idoVar) {
            Object obj25 = objArr[0];
            if (obj25 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 245, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj25).longValue());
        } else if (evu.CLEANUP_START == idoVar) {
            this.g.j();
        } else if (evu.CLEAR_DONE == idoVar) {
            Object obj26 = objArr[0];
            if (obj26 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 255, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.i(((Boolean) obj26).booleanValue());
        } else if (evu.CLEAR_START == idoVar) {
            this.g.j();
        } else if (evu.POLICY_CONFIG_VERSION == idoVar) {
            Object obj27 = objArr[0];
            if (obj27 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 265, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj27).longValue());
        } else if (evu.RECORD_STATS_DONE == idoVar) {
            Object obj28 = objArr[0];
            if (obj28 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 272, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.i(((Boolean) obj28).booleanValue());
        } else if (evu.RECORD_STATS_START == idoVar) {
            this.g.j();
        } else if (evu.TOTAL_SIZE_KB == idoVar) {
            Object obj29 = objArr[0];
            if (obj29 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 282, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj29).longValue());
        } else {
            exw exwVar = exw.a;
            if (exwVar == idoVar) {
                this.g.c.d(exwVar.c, ((exx) objArr[0]).j);
            } else if (ezo.CHANGE_LANGUAGE == idoVar) {
                Object obj30 = objArr[0];
                if (obj30 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 292, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj30).intValue());
            } else if (ezo.COMMIT == idoVar) {
                Object obj31 = objArr[0];
                if (obj31 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 299, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj31).intValue());
            } else if (ezo.CONNECTION_FAIL == idoVar) {
                Object obj32 = objArr[0];
                if (obj32 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 306, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj32).intValue());
            } else if (ezo.CONNECTION_FAIL_HTTP_CODE == idoVar) {
                Object obj33 = objArr[0];
                if (obj33 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 313, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj33).intValue());
            } else if (ezo.OPEN == idoVar) {
                Object obj34 = objArr[0];
                if (obj34 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 320, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj34).intValue());
            } else if (ezo.QUERY_LATENCY == idoVar) {
                Object obj35 = objArr[0];
                if (obj35 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 327, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.o(((Number) obj35).longValue());
            } else if (ezo.QUERY_LENGTH == idoVar) {
                Object obj36 = objArr[0];
                if (obj36 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 334, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj36).intValue());
            } else if (ezo.QUERY_RESULT == idoVar) {
                Object obj37 = objArr[0];
                if (obj37 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 341, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj37).intValue());
            } else if (ezo.SESSION_COMMIT == idoVar) {
                Object obj38 = objArr[0];
                if (obj38 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 348, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj38).intValue());
            } else if (ezo.SOURCE_LANGUAGE == idoVar) {
                Object obj39 = objArr[0];
                if (obj39 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 355, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj39).intValue());
            } else if (gvd.a == idoVar) {
                Object obj40 = objArr[0];
                if (obj40 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 362, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.g(((Number) obj40).intValue());
            } else if (gvd.g == idoVar) {
                Object obj41 = objArr[0];
                if (obj41 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 369, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.h(((Number) obj41).intValue());
            } else if (gvd.e == idoVar) {
                this.g.j();
            } else if (gvd.f == idoVar) {
                Object obj42 = objArr[0];
                if (obj42 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 379, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                } else if (objArr[1] == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 383, "LatinCountersMetricsProcessorHelper.java")).t("the 1th argument is null!");
                    return false;
                } else {
                    bqq bqqVar3 = this.g;
                    long longValue = ((Number) obj42).longValue();
                    long longValue2 = ((Number) objArr[1]).longValue();
                    bqqVar3.c.e("BackupAgent.originalFilesSize", longValue);
                    bqqVar3.c.e("BackupAgent.backupFilesSize", longValue2);
                }
            } else if (gvd.b == idoVar) {
                Object obj43 = objArr[0];
                if (obj43 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 390, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                bqq bqqVar4 = this.g;
                bqqVar4.c.d("BackupAgent.backupRestoreError", ((Number) obj43).intValue());
            } else if (gvd.h == idoVar) {
                Object obj44 = objArr[0];
                if (obj44 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 397, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                bqq bqqVar5 = this.g;
                bqqVar5.c.e("BackupAgent.backupRestoreInterval", ((Number) obj44).longValue());
            } else if (gvd.i == idoVar) {
                Object obj45 = objArr[0];
                if (obj45 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 404, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                bqq bqqVar6 = this.g;
                bqqVar6.c.b("BackupAgent.clientSideEncryption", ((Boolean) obj45).booleanValue());
            } else if (gvd.j == idoVar) {
                Object obj46 = objArr[0];
                if (obj46 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 411, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                bqq bqqVar7 = this.g;
                bqqVar7.c.b("BackupAgent.deviceToDeviceTransfer", ((Boolean) obj46).booleanValue());
            } else if (gvd.d == idoVar) {
                Object obj47 = objArr[0];
                if (obj47 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 418, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                bqq bqqVar8 = this.g;
                bqqVar8.c.e("BackupAgent.restoreRetryPostponed", ((Number) obj47).longValue());
            } else if (gvd.c == idoVar) {
                Object obj48 = objArr[0];
                if (obj48 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 425, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                bqq bqqVar9 = this.g;
                bqqVar9.c.d("BackupAgent.restoreTimes", ((Number) obj48).intValue());
            } else if (hfe.EVENT_HANDLED == idoVar) {
                this.g.l((hfd) objArr[0]);
            } else if (hpb.IME_ACTIVATED == idoVar) {
                this.g.m((EditorInfo) objArr[0]);
            } else if (hpb.KEYBOARD_ACTIVATED == idoVar) {
                bqq bqqVar10 = this.g;
                hsy hsyVar = (hsy) objArr[0];
                String str3 = (String) objArr[2];
                bqqVar10.d = (ibz) objArr[1];
                bqqVar10.e = (jav) objArr[3];
            } else if (hsp.IMS_INPUT_VIEW_FINISHED == idoVar) {
                bqq bqqVar11 = this.g;
                mcu mcuVar = (mcu) objArr[0];
                bqqVar11.d = null;
                bqqVar11.e = null;
            } else if (iqb.a == idoVar) {
                Object obj49 = objArr[0];
                if (obj49 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 444, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                bqq bqqVar12 = this.g;
                int intValue = ((Number) obj49).intValue();
                iqa iqaVar = (iqa) objArr[1];
                if (TextUtils.isEmpty("RateUs.Settings")) {
                    ((ltd) ((ltd) bqq.a.c()).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessor", "processRateUsUsage", 592, "LatinCountersMetricsProcessor.java")).u("processRateUsUsage() : Unknown source %d", 1);
                } else {
                    bqqVar12.c.d("RateUs.Settings", bqq.b(intValue));
                }
            } else if (ixv.a == idoVar) {
                Object obj50 = objArr[0];
                if (obj50 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 451, "LatinCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.n(((Number) obj50).intValue());
            } else {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessorHelper", "doProcessMetrics", 457, "LatinCountersMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
                return false;
            }
        }
        return true;
    }
}
