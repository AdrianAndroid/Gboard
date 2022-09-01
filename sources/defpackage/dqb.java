package defpackage;

import android.content.res.Configuration;
import android.view.inputmethod.EditorInfo;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: dqb  reason: default package */
/* loaded from: classes.dex */
public final class dqb extends idb {
    public static final ido[] a = {bzs.h, bzs.l, bzs.m, bzs.j, bzs.k, bzs.g, bzs.s, bzs.i, bzs.r, bzs.q, bzs.p, bzs.c, bzs.t, bzs.u, bzs.o, bzs.n, cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_CLIENT_REQUEST, cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_INPUT_STATE, cap.CANDIDATE_PROPOSED, cap.CLEARCUT_EVENT_LOG, cap.INLINE_SUGGESTION_PROPOSED, cap.INVALID_WORD_UNDERLINED, cap.LANGUAGE_MODEL_LOADER_FINISH_WITH_MISSING, cap.LANGUAGE_MODEL_LOAD_INFO, cap.LANG_ID_DIALOG_AFFIRMATIVE, cap.LANG_ID_DIALOG_DISMISSED, cap.LANG_ID_DIALOG_OPENED_LANGUAGE_SETTINGS, cap.LANG_ID_DIALOG_REJECTED, cap.LANG_ID_FAILED_TO_GET_MODEL_PATH, cap.LANG_ID_FAILED_TO_SAVE_STATE, cap.LANG_ID_FAILED_TO_SAVE_STATE_ON_RETRY, cap.LANG_ID_LANGUAGE_DETECTED, cap.LANG_ID_MODEL_DOWNLOADED, cap.LANG_ID_MODEL_UPDATED, cap.LANG_ID_NOTICE_CLICKED, cap.LANG_ID_NOTICE_IGNORED, cap.LANG_ID_POSTED_SUGGESTION_NOTICE, dda.DATA_PACKAGE_DOWNLOAD_FAILED, dda.DOWNLOADED_FILE_CHECKSUM_ERROR, dda.DOWNLOADED_FILE_OPERATION_FAILED, dda.SETTINGS_ACTIVITY_CREATED, dda.SETTINGS_ACTIVITY_FINISHED, dda.SHARED_PREFERENCE_CHANGED, dda.SYNC_STATS_RECORDED, fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_METADATA, fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_SCHEDULE, fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_START, fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_STOP, fbm.VOICE_DONATION_CONSENT_DIALOG_NEGATIVE_BUTTON_CLICKED, fbm.VOICE_DONATION_CONSENT_DIALOG_POSITIVE_BUTTON_CLICKED, fbm.VOICE_DONATION_CONSENT_DIALOG_SHOWN, fbm.VOICE_DONATION_INTRO_DIALOG_NEGATIVE_BUTTON_CLICKED, fbm.VOICE_DONATION_INTRO_DIALOG_SHOWN, fbm.VOICE_DONATION_PROMO_BANNER_SHOWN, fbm.VOICE_DONATION_RENEWAL_BANNER_SHOWN, fbm.VOICE_INPUT_START, fbm.VOICE_INPUT_STOP, fbm.VOICE_MIC_STATUS_ON_START_INPUTVIEW, fga.ON_FATAL_ERROR, fga.ON_NONFATAL_ERROR, fga.ON_S3RESPONSE, fga.ON_START_RECOGNITION, fga.ON_STOP_RECOGNITION, hlw.SCRUB_DELETE, hlw.SCRUB_DELETE_RESTORE, hlw.SCRUB_MOVE, hpb.IME_TEXT_CANDIDATE_SELECTED, hpb.TEXT_CANDIDATES_APPENDED, hry.INPUT_METHOD_ENTRY_CHANGED, hry.UPDATE_MULTILINGUAL_SETTING, hsp.IMS_CREATED_AFTER_USER_UNLOCKED, hsp.IMS_CREATED_BEFORE_USER_UNLOCKED, hsp.IMS_INPUT_VIEW_CREATED, hsp.IMS_INPUT_VIEW_FINISHED, hsp.IMS_ON_SHOW_INPUT_REQUESTED, hsp.IMS_ON_START_INPUT_VIEW, hvq.KEYBOARD_MODE_CHANGED, hvq.ON_KEYBOARD_BOTTOM_LAYOUT_UPDATED, hxx.INPUT_CONTEXT_RESET, hxx.RUNTIME_PARAMETERS_IME_ONACTIVATE, idd.CONFIGURATION_CHANGE, ifg.KEYBOARD_SHOWN_LATENCY, iik.d, iik.c, ikp.b, isk.a};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper");
    private final dqa g;

    public dqb(dqa dqaVar) {
        this.g = dqaVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (bzs.h == idoVar) {
            Object obj = objArr[3];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 46, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 50, "LatinCommonMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else {
                this.g.af((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj).intValue(), ((Number) objArr[4]).longValue(), (jxy) objArr[5]);
            }
        } else if (bzs.l == idoVar) {
            Object obj2 = objArr[3];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 57, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 61, "LatinCommonMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else {
                this.g.ag((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj2).intValue(), ((Number) objArr[4]).longValue());
            }
        } else if (bzs.m == idoVar) {
            Object obj3 = objArr[3];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 68, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.ah((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj3).intValue(), (Throwable) objArr[4]);
        } else if (bzs.j == idoVar) {
            Object obj4 = objArr[3];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 75, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 79, "LatinCommonMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else {
                this.g.ai((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj4).intValue(), ((Number) objArr[4]).longValue(), (jxy) objArr[5]);
            }
        } else if (bzs.k == idoVar) {
            Object obj5 = objArr[3];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 86, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 90, "LatinCommonMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else {
                this.g.aj((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj5).intValue(), ((Number) objArr[4]).longValue());
            }
        } else if (bzs.g == idoVar) {
            Object obj6 = objArr[3];
            if (obj6 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 97, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.ak((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj6).intValue());
        } else if (bzs.s == idoVar) {
            Object obj7 = objArr[3];
            if (obj7 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 104, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.al((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj7).intValue(), (Throwable) objArr[4]);
        } else if (bzs.i == idoVar) {
            Object obj8 = objArr[3];
            if (obj8 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 111, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.am((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj8).intValue());
        } else if (bzs.r == idoVar) {
            Object obj9 = objArr[3];
            if (obj9 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 118, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.an((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj9).intValue(), (Throwable) objArr[4]);
        } else if (bzs.q == idoVar) {
            Object obj10 = objArr[3];
            if (obj10 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 125, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.ao((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj10).intValue(), (jxz) objArr[4]);
        } else if (bzs.p == idoVar) {
            Object obj11 = objArr[3];
            if (obj11 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 132, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.ap((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj11).intValue());
        } else if (bzs.c == idoVar) {
            this.g.ac((String) objArr[0]);
        } else if (bzs.t == idoVar) {
            this.g.ae((String) objArr[0]);
        } else if (bzs.u == idoVar) {
            this.g.ad((String) objArr[0]);
        } else if (bzs.o == idoVar) {
            Object obj12 = objArr[3];
            if (obj12 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 148, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.aq((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj12).intValue(), (Throwable) objArr[4]);
        } else if (bzs.n == idoVar) {
            Object obj13 = objArr[3];
            if (obj13 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 155, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.ar((String) objArr[0], (String) objArr[1], (String) objArr[2], ((Number) obj13).intValue(), (Throwable) objArr[4]);
        } else if (cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_CLIENT_REQUEST == idoVar) {
            Object obj14 = objArr[0];
            if (obj14 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 162, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 166, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 170, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 174, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 178, "LatinCommonMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else if (objArr[5] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 182, "LatinCommonMetricsProcessorHelper.java")).t("the 5th argument is null!");
                return false;
            } else {
                dqa dqaVar = this.g;
                int intValue = ((Number) obj14).intValue();
                long longValue = ((Number) objArr[1]).longValue();
                long longValue2 = ((Number) objArr[2]).longValue();
                boolean booleanValue = ((Boolean) objArr[3]).booleanValue();
                boolean booleanValue2 = ((Boolean) objArr[4]).booleanValue();
                ((Number) objArr[5]).longValue();
                dqaVar.aF(intValue, longValue, longValue2, booleanValue, booleanValue2);
            }
        } else if (cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_INPUT_STATE == idoVar) {
            Object obj15 = objArr[0];
            if (obj15 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 189, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 193, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 197, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 201, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 205, "LatinCommonMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else if (objArr[5] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 209, "LatinCommonMetricsProcessorHelper.java")).t("the 5th argument is null!");
                return false;
            } else {
                dqa dqaVar2 = this.g;
                int intValue2 = ((Number) obj15).intValue();
                long longValue3 = ((Number) objArr[1]).longValue();
                long longValue4 = ((Number) objArr[2]).longValue();
                boolean booleanValue3 = ((Boolean) objArr[3]).booleanValue();
                boolean booleanValue4 = ((Boolean) objArr[4]).booleanValue();
                ((Number) objArr[5]).longValue();
                dqaVar2.aF(intValue2, longValue3, longValue4, booleanValue3, booleanValue4);
            }
        } else if (cap.CANDIDATE_PROPOSED == idoVar) {
            this.g.a((mty) objArr[0]);
        } else if (cap.CLEARCUT_EVENT_LOG == idoVar) {
            Object obj16 = objArr[0];
            if (obj16 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 219, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.b(((Number) obj16).intValue(), (mbh) objArr[1]);
        } else if (cap.INLINE_SUGGESTION_PROPOSED == idoVar) {
            Object obj17 = objArr[1];
            if (obj17 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 226, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            this.g.k((mty) objArr[0], ((Boolean) obj17).booleanValue());
        } else if (cap.INVALID_WORD_UNDERLINED == idoVar) {
            Object obj18 = objArr[0];
            if (obj18 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 233, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.m(((Number) obj18).intValue());
        } else if (cap.LANGUAGE_MODEL_LOADER_FINISH_WITH_MISSING == idoVar) {
            Object obj19 = objArr[0];
            if (obj19 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 240, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.H(((Number) obj19).intValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4]);
        } else if (cap.LANGUAGE_MODEL_LOAD_INFO == idoVar) {
            this.g.G((List) objArr[0]);
        } else if (cap.LANG_ID_DIALOG_AFFIRMATIVE == idoVar) {
            this.g.u((jav) objArr[0]);
        } else if (cap.LANG_ID_DIALOG_DISMISSED == idoVar) {
            this.g.B((jav) objArr[0]);
        } else if (cap.LANG_ID_DIALOG_OPENED_LANGUAGE_SETTINGS == idoVar) {
            this.g.D((jav) objArr[0]);
        } else if (cap.LANG_ID_DIALOG_REJECTED == idoVar) {
            this.g.E((jav) objArr[0]);
        } else if (cap.LANG_ID_FAILED_TO_GET_MODEL_PATH == idoVar) {
            this.g.v((mch) objArr[0]);
        } else if (cap.LANG_ID_FAILED_TO_SAVE_STATE == idoVar) {
            this.g.w();
        } else if (cap.LANG_ID_FAILED_TO_SAVE_STATE_ON_RETRY == idoVar) {
            this.g.x();
        } else if (cap.LANG_ID_LANGUAGE_DETECTED == idoVar) {
            this.g.y((jav) objArr[0]);
        } else if (cap.LANG_ID_MODEL_DOWNLOADED == idoVar) {
            Object obj20 = objArr[0];
            if (obj20 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 274, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.z(((Number) obj20).intValue());
        } else if (cap.LANG_ID_MODEL_UPDATED == idoVar) {
            Object obj21 = objArr[0];
            if (obj21 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 281, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.A(((Number) obj21).intValue());
        } else if (cap.LANG_ID_NOTICE_CLICKED == idoVar) {
            this.g.I((jav) objArr[0]);
        } else if (cap.LANG_ID_NOTICE_IGNORED == idoVar) {
            this.g.C((jav) objArr[0]);
        } else if (cap.LANG_ID_POSTED_SUGGESTION_NOTICE == idoVar) {
            this.g.F((jav) objArr[0]);
        } else if (dda.DATA_PACKAGE_DOWNLOAD_FAILED == idoVar) {
            this.g.d((String) objArr[0], (String) objArr[1]);
        } else if (dda.DOWNLOADED_FILE_CHECKSUM_ERROR == idoVar) {
            this.g.d((String) objArr[0], (String) objArr[1]);
        } else if (dda.DOWNLOADED_FILE_OPERATION_FAILED == idoVar) {
            this.g.d((String) objArr[0], (String) objArr[1]);
        } else if (dda.SETTINGS_ACTIVITY_CREATED == idoVar) {
            Object obj22 = objArr[0];
            if (obj22 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 306, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.Z(((Number) obj22).intValue());
        } else if (dda.SETTINGS_ACTIVITY_FINISHED == idoVar) {
            this.g.aa();
        } else if (dda.SHARED_PREFERENCE_CHANGED == idoVar) {
            this.g.aE((String) objArr[0]);
        } else if (dda.SYNC_STATS_RECORDED == idoVar) {
            Object obj23 = objArr[0];
            if (obj23 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 319, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 323, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 327, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 331, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else {
                this.g.as(((Boolean) obj23).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue());
            }
        } else if (fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_METADATA == idoVar) {
            Object obj24 = objArr[0];
            if (obj24 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 338, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 342, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 346, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 350, "LatinCommonMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else if (objArr[5] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 354, "LatinCommonMetricsProcessorHelper.java")).t("the 5th argument is null!");
                return false;
            } else {
                this.g.K(((Number) obj24).intValue(), (String) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue(), ((Number) objArr[4]).floatValue(), ((Number) objArr[5]).floatValue());
            }
        } else if (fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_SCHEDULE == idoVar) {
            this.g.L();
        } else if (fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_START == idoVar) {
            this.g.M();
        } else if (fbm.ONDEVICE_DICTATION_PERFORMANCE_EVALUATION_STOP == idoVar) {
            this.g.N();
        } else if (fbm.VOICE_DONATION_CONSENT_DIALOG_NEGATIVE_BUTTON_CLICKED == idoVar) {
            Object obj25 = objArr[1];
            if (obj25 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 370, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 374, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else {
                this.g.av((mev) objArr[0], ((Number) obj25).intValue(), ((Number) objArr[2]).intValue());
            }
        } else if (fbm.VOICE_DONATION_CONSENT_DIALOG_POSITIVE_BUTTON_CLICKED == idoVar) {
            Object obj26 = objArr[1];
            if (obj26 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 381, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 385, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else {
                this.g.aw((mev) objArr[0], ((Number) obj26).intValue(), ((Number) objArr[2]).intValue());
            }
        } else if (fbm.VOICE_DONATION_CONSENT_DIALOG_SHOWN == idoVar) {
            Object obj27 = objArr[1];
            if (obj27 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 392, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 396, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else {
                this.g.ax((mev) objArr[0], ((Number) obj27).intValue(), ((Number) objArr[2]).intValue());
            }
        } else if (fbm.VOICE_DONATION_INTRO_DIALOG_NEGATIVE_BUTTON_CLICKED == idoVar) {
            Object obj28 = objArr[1];
            if (obj28 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 403, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 407, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else {
                this.g.ay((mev) objArr[0], ((Number) obj28).intValue(), ((Number) objArr[2]).intValue());
            }
        } else if (fbm.VOICE_DONATION_INTRO_DIALOG_SHOWN == idoVar) {
            Object obj29 = objArr[1];
            if (obj29 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 414, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 418, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else {
                this.g.az((mev) objArr[0], ((Number) obj29).intValue(), ((Number) objArr[2]).intValue());
            }
        } else if (fbm.VOICE_DONATION_PROMO_BANNER_SHOWN == idoVar) {
            Object obj30 = objArr[0];
            if (obj30 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 425, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 429, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                this.g.aA(((Number) obj30).intValue(), ((Number) objArr[1]).intValue());
            }
        } else if (fbm.VOICE_DONATION_RENEWAL_BANNER_SHOWN == idoVar) {
            Object obj31 = objArr[0];
            if (obj31 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 436, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.aB(((Number) obj31).intValue());
        } else if (fbm.VOICE_INPUT_START == idoVar) {
            Object obj32 = objArr[4];
            if (obj32 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 443, "LatinCommonMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else if (objArr[5] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 447, "LatinCommonMetricsProcessorHelper.java")).t("the 5th argument is null!");
                return false;
            } else if (objArr[6] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 451, "LatinCommonMetricsProcessorHelper.java")).t("the 6th argument is null!");
                return false;
            } else if (objArr[7] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 455, "LatinCommonMetricsProcessorHelper.java")).t("the 7th argument is null!");
                return false;
            } else if (objArr[8] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 459, "LatinCommonMetricsProcessorHelper.java")).t("the 8th argument is null!");
                return false;
            } else if (objArr[9] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 463, "LatinCommonMetricsProcessorHelper.java")).t("the 9th argument is null!");
                return false;
            } else {
                this.g.aC((jav) objArr[0], (Collection) objArr[1], (few) objArr[2], (String) objArr[3], ((Boolean) obj32).booleanValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).longValue(), ((Number) objArr[8]).longValue(), ((Boolean) objArr[9]).booleanValue());
            }
        } else if (fbm.VOICE_INPUT_STOP == idoVar) {
            this.g.aD();
        } else if (fbm.VOICE_MIC_STATUS_ON_START_INPUTVIEW == idoVar) {
            this.g.ab((mey) objArr[0]);
        } else if (fga.ON_FATAL_ERROR == idoVar) {
            Object obj33 = objArr[0];
            if (obj33 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 476, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 480, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                this.g.R(((Number) obj33).intValue(), ((Number) objArr[1]).intValue());
            }
        } else if (fga.ON_NONFATAL_ERROR == idoVar) {
            Object obj34 = objArr[0];
            if (obj34 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 487, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 491, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                this.g.S(((Number) obj34).intValue(), ((Number) objArr[1]).intValue());
            }
        } else if (fga.ON_S3RESPONSE == idoVar) {
            this.g.V((String) objArr[0], (String) objArr[1]);
        } else if (fga.ON_START_RECOGNITION == idoVar) {
            this.g.T();
        } else if (fga.ON_STOP_RECOGNITION == idoVar) {
            Object obj35 = objArr[0];
            if (obj35 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 504, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.U(((Number) obj35).intValue());
        } else if (hlw.SCRUB_DELETE == idoVar) {
            Object obj36 = objArr[0];
            if (obj36 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 511, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.W(((Number) obj36).intValue());
        } else if (hlw.SCRUB_DELETE_RESTORE == idoVar) {
            this.g.X();
        } else if (hlw.SCRUB_MOVE == idoVar) {
            this.g.Y();
        } else if (hpb.IME_TEXT_CANDIDATE_SELECTED == idoVar) {
            this.g.j((hln) objArr[0]);
        } else if (hpb.TEXT_CANDIDATES_APPENDED == idoVar) {
            hln hlnVar = (hln) objArr[1];
            this.g.aJ((List) objArr[0]);
        } else if (hry.INPUT_METHOD_ENTRY_CHANGED == idoVar) {
            Object obj37 = objArr[3];
            if (obj37 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 530, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            }
            this.g.l((hqt) objArr[0], (hqt) objArr[1], (Collection) objArr[2], ((Boolean) obj37).booleanValue());
        } else if (hry.UPDATE_MULTILINGUAL_SETTING == idoVar) {
            this.g.au((hqt) objArr[0], (Collection) objArr[1]);
        } else if (hsp.IMS_CREATED_AFTER_USER_UNLOCKED == idoVar) {
            Object obj38 = objArr[0];
            if (obj38 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 540, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 544, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                dqa dqaVar3 = this.g;
                ((Number) obj38).longValue();
                ((Number) objArr[1]).longValue();
                dqaVar3.aH();
            }
        } else if (hsp.IMS_CREATED_BEFORE_USER_UNLOCKED == idoVar) {
            Object obj39 = objArr[0];
            if (obj39 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 551, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 555, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                dqa dqaVar4 = this.g;
                ((Number) obj39).longValue();
                ((Number) objArr[1]).longValue();
                dqaVar4.aH();
            }
        } else if (hsp.IMS_INPUT_VIEW_CREATED == idoVar) {
            Object obj40 = objArr[0];
            if (obj40 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 562, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 566, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                dqa dqaVar5 = this.g;
                ((Number) obj40).longValue();
                ((Number) objArr[1]).longValue();
                dqaVar5.aG();
            }
        } else if (hsp.IMS_INPUT_VIEW_FINISHED == idoVar) {
            this.g.g((mcu) objArr[0]);
        } else if (hsp.IMS_ON_SHOW_INPUT_REQUESTED == idoVar) {
            Object obj41 = objArr[0];
            if (obj41 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 576, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 580, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                this.g.J(((Number) obj41).intValue(), ((Boolean) objArr[1]).booleanValue());
            }
        } else if (hsp.IMS_ON_START_INPUT_VIEW == idoVar) {
            Object obj42 = objArr[1];
            if (obj42 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 587, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[2] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 591, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 595, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[5] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 599, "LatinCommonMetricsProcessorHelper.java")).t("the 5th argument is null!");
                return false;
            } else {
                int intValue3 = ((Number) obj42).intValue();
                boolean booleanValue5 = ((Boolean) objArr[2]).booleanValue();
                ((Boolean) objArr[3]).booleanValue();
                this.g.aI((EditorInfo) objArr[0], intValue3, booleanValue5, (iau) objArr[4], ((Boolean) objArr[5]).booleanValue());
            }
        } else if (hvq.KEYBOARD_MODE_CHANGED == idoVar) {
            Object obj43 = objArr[0];
            if (obj43 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 606, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.o(((Number) obj43).intValue());
        } else if (hvq.ON_KEYBOARD_BOTTOM_LAYOUT_UPDATED == idoVar) {
            this.g.n();
        } else if (hxx.INPUT_CONTEXT_RESET == idoVar) {
            Object obj44 = objArr[0];
            if (obj44 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 616, "LatinCommonMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.P(((Number) obj44).intValue());
        } else if (hxx.RUNTIME_PARAMETERS_IME_ONACTIVATE == idoVar) {
            this.g.Q((mvi) objArr[0]);
        } else if (idd.CONFIGURATION_CHANGE == idoVar) {
            this.g.c((Configuration) objArr[0]);
        } else if (ifg.KEYBOARD_SHOWN_LATENCY == idoVar) {
            Object obj45 = objArr[1];
            if (obj45 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 629, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            this.g.q((ifh) objArr[0], ((Number) obj45).longValue());
        } else if (iik.d == idoVar) {
            Object obj46 = objArr[1];
            if (obj46 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 636, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 640, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 644, "LatinCommonMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else {
                this.g.h((String) objArr[0], ((Number) obj46).intValue(), (Throwable) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            }
        } else if (iik.c == idoVar) {
            this.g.i((iih) objArr[0], (iij) objArr[1]);
        } else if (ikp.b == idoVar) {
            Object obj47 = objArr[2];
            if (obj47 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 654, "LatinCommonMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 658, "LatinCommonMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else {
                this.g.O((mcy) objArr[0], (jav) objArr[1], ((Number) obj47).intValue(), ((Number) objArr[3]).intValue());
            }
        } else if (isk.a == idoVar) {
            Object obj48 = objArr[1];
            if (obj48 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 665, "LatinCommonMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            this.g.at((String) objArr[0], ((Number) obj48).intValue(), (isa) objArr[2], (ise) objArr[3]);
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessorHelper", "doProcessMetrics", 671, "LatinCommonMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
