package defpackage;

/* compiled from: PG */
/* renamed from: ctk  reason: default package */
/* loaded from: classes.dex */
public final class ctk extends idb {
    public static final ido[] a = {chu.BACKUP_ATTEMPT, chu.FILE_BACKUP_SUCCESS, chu.FILE_RESTORED_SUCCESS, chu.RESTORE_ATTEMPT, ciu.IMAGE_PREDICTION_CLICKED, csv.CONTENT_CACHE_DOWNLOAD_TASK_ALL_DOWNLOADS_COMPLETED, csv.CONTENT_CACHE_DOWNLOAD_TASK_DOWNLOADS_PARTIALLY_COMPLETED, csw.EMOJI_KITCHEN_MIX_ERROR, csw.EMOJI_KITCHEN_MIX_IMPRESSION, csw.RICH_CONTENT_SUGGESTION_IMAGES_LOADED, csw.RICH_CONTENT_SUGGESTION_IMPRESSION, csw.RICH_CONTENT_SUGGESTION_REQUEST, cta.EMOJIFY_ICON_HIDDEN, cta.EMOJIFY_ICON_SHOWN, cta.EMOJIFY_PATTERN_MISSED_REASON, cta.EMOJIFY_RESULTS_GENERATED, cta.EMOJIFY_RESULT_ACCEPTED, cta.EMOJIFY_RESULT_APPLIED, cta.EMOJIFY_REVERTED_TO_ORIGINAL_TEXT, ctd.BITMOJI_INSTALLED, ctd.BITMOJI_PROMO_GET_CLICKED, ctd.BITMOJI_PROMO_SHOWN, ctd.BITMOJI_SET_UP_ERROR_CLICKED, ctd.BITMOJI_SET_UP_ERROR_SHOWN, ctd.BITMOJI_UPDATE_ERROR_CLICKED, ctd.BITMOJI_UPDATE_ERROR_SHOWN, ctd.CATEGORY_SWITCH, ctd.CLICK, ctd.CONCEPT_PREDICTION_MODEL_LOADED, ctd.CONCEPT_PREDICTION_MODEL_SYNC, ctd.DICTATION_GET_CONCEPT_LIST_REQUEST, ctd.DICTATION_GET_EMOJI_FROM_CONCEPT_REQUEST, ctd.DICTATION_GET_EMOJI_FROM_CONCEPT_RESULTS, ctd.DICTATION_GET_EMOJI_FROM_QUERY_REQUEST, ctd.DICTATION_GET_EMOJI_FROM_QUERY_RESULTS, ctd.DICTATION_RANKED_EMOJI_PREDICTION_CONCEPT_NAME_RESULTS, ctd.DICTATION_RANKED_EMOJI_PREDICTION_REQUEST, ctd.DICTATION_RANKED_EMOJI_PREDICTION_RESULTS, ctd.EMOJI_OR_TEXT_SHARE, ctd.EMOJI_PREDICTOR_MODEL_LOADED, ctd.EMOJI_PREDICTOR_MODEL_SYNC, ctd.ERROR, ctd.EXPRESSION_HEADER_ELEMENTS, ctd.EXPRESSION_HEADER_EMOJI_CLICKED, ctd.EXPRESSION_HEADER_EMOJI_SHOWN, ctd.EXPRESSION_MOMENT_CANDIDATE_CLICK, ctd.EXPRESSION_MOMENT_CANDIDATE_OPEN_TO_SHARE_LATENCY, ctd.EXPRESSION_MOMENT_CANDIDATE_TYPE_CLICK, ctd.EXPRESSION_MOMENT_CANDIDATE_TYPE_SHOWN, ctd.EXPRESSION_MOMENT_CAROUSEL_ENTRY_POINT_CLICKED, ctd.EXPRESSION_MOMENT_CAROUSEL_ENTRY_POINT_SHOWN, ctd.EXPRESSION_MOMENT_DYNAMIC_ART_ABSENT_REASON, ctd.EXPRESSION_MOMENT_RESULT_ABSENT, ctd.EXPRESSION_MOMENT_SUPPLIER_NOT_SUPPORT, ctd.EXPRESSION_MOMENT_SUPPLIER_RESULT_ABSENT, ctd.EXPRESSION_NAVIGATION_ROW_HIDDEN, ctd.EXPRESSION_NAVIGATION_ROW_SHOWN, ctd.EXTENSION_OPEN, ctd.FAVORITING, ctd.FEDERATED_CONV2QUERY_INTERACTION, ctd.GIF_IMAGE_OPENED, ctd.GIF_IMAGE_SEARCH_FAILED, ctd.IMAGE_SHARE, ctd.IMPRESSION, ctd.LITE_EMOJI_PREDICTOR_MODEL_LOADED, ctd.LITE_EMOJI_PREDICTOR_MODEL_SYNC, ctd.PROACTIVE_GIF_CATEGORY_IMPRESSION, ctd.RECENT_SEARCH_CANDIDATE_DELETE_CANCELLED, ctd.RECENT_SEARCH_CANDIDATE_DELETE_CONFIRMED, ctd.SEARCH_CANDIDATE_DELETE_REQUESTED, ctd.SEARCH_EMOJI_DATA_ERROR, ctd.SEARCH_EMOJI_SEARCHED, ctd.SEARCH_PERFORMED, ctd.STICKER_REVAMP_BROWSE_CLICKED, ctd.STICKER_SETTING_ICON_CLICKED, ctd.TAB_OPEN, ctd.TRANSFORMER_EXPRESSION_MODEL_LOADED, ctd.TRANSFORMER_EXPRESSION_MODEL_SYNC, ctd.TRIGGERING_MODEL_LOADED, ctd.TRIGGERING_MODEL_SYNC, ctd.UNIVERSAL_MEDIA_IMAGE_OPENED, ctd.UNIVERSAL_MEDIA_MORE_GIFS_REQUESTED, ctd.UNIVERSAL_MEDIA_MORE_STICKER_RESULTS_CLICKED, ctd.UNIVERSAL_MEDIA_MORE_STICKER_RESULTS_SHOWN, ctd.UNIVERSAL_MEDIA_NO_CONNECTION_CARD_SHOWN, ctd.UNIVERSAL_MEDIA_NO_RESULTS_CARD_SHOWN, hpb.IME_TEXT_CANDIDATE_SELECTED};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper");
    private final ctj g;

    public ctk(ctj ctjVar) {
        this.g = ctjVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (chu.BACKUP_ATTEMPT == idoVar) {
            this.g.Q();
        } else if (chu.FILE_BACKUP_SUCCESS == idoVar) {
            this.g.R((chr) objArr[0]);
        } else if (chu.FILE_RESTORED_SUCCESS == idoVar) {
            this.g.S((chr) objArr[0]);
        } else if (chu.RESTORE_ATTEMPT == idoVar) {
            this.g.b.c("ExpressionBackup.restore.attempt");
        } else if (ciu.IMAGE_PREDICTION_CLICKED == idoVar) {
            this.g.ai((hln) objArr[0], (mse) objArr[1]);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_ALL_DOWNLOADS_COMPLETED == idoVar) {
            this.g.o((maj) objArr[0]);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_DOWNLOADS_PARTIALLY_COMPLETED == idoVar) {
            this.g.o((maj) objArr[0]);
        } else if (csw.EMOJI_KITCHEN_MIX_ERROR == idoVar) {
            this.g.E((mdh) objArr[0]);
        } else if (csw.EMOJI_KITCHEN_MIX_IMPRESSION == idoVar) {
            this.g.F((String) objArr[0]);
        } else if (csw.RICH_CONTENT_SUGGESTION_IMAGES_LOADED == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 61, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 65, "ExpressionMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                this.g.q(((Number) obj).intValue(), ((Number) objArr[1]).intValue());
            }
        } else if (csw.RICH_CONTENT_SUGGESTION_IMPRESSION == idoVar) {
            Object obj2 = objArr[2];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 72, "ExpressionMetricsProcessorHelper.java")).t("the 2th argument is null!");
                return false;
            } else if (objArr[3] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 76, "ExpressionMetricsProcessorHelper.java")).t("the 3th argument is null!");
                return false;
            } else if (objArr[4] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 80, "ExpressionMetricsProcessorHelper.java")).t("the 4th argument is null!");
                return false;
            } else {
                this.g.u((String) objArr[0], (mdj) objArr[1], ((Number) obj2).longValue(), ((Number) objArr[3]).longValue(), ((Number) objArr[4]).longValue());
            }
        } else if (csw.RICH_CONTENT_SUGGESTION_REQUEST == idoVar) {
            this.g.v((String) objArr[0], (String) objArr[1]);
        } else if (cta.EMOJIFY_ICON_HIDDEN == idoVar) {
            this.g.I((may) objArr[0]);
        } else if (cta.EMOJIFY_ICON_SHOWN == idoVar) {
            this.g.J((may) objArr[0]);
        } else if (cta.EMOJIFY_PATTERN_MISSED_REASON == idoVar) {
            this.g.K((max) objArr[0]);
        } else if (cta.EMOJIFY_RESULTS_GENERATED == idoVar) {
            this.g.N((maz) objArr[0]);
        } else if (cta.EMOJIFY_RESULT_ACCEPTED == idoVar) {
            this.g.L((maz) objArr[0]);
        } else if (cta.EMOJIFY_RESULT_APPLIED == idoVar) {
            this.g.M((maz) objArr[0]);
        } else if (cta.EMOJIFY_REVERTED_TO_ORIGINAL_TEXT == idoVar) {
            this.g.O((maz) objArr[0]);
        } else if (ctd.BITMOJI_INSTALLED == idoVar) {
            this.g.b();
        } else if (ctd.BITMOJI_PROMO_GET_CLICKED == idoVar) {
            this.g.c();
        } else if (ctd.BITMOJI_PROMO_SHOWN == idoVar) {
            this.g.d();
        } else if (ctd.BITMOJI_SET_UP_ERROR_CLICKED == idoVar) {
            this.g.g();
        } else if (ctd.BITMOJI_SET_UP_ERROR_SHOWN == idoVar) {
            this.g.h();
        } else if (ctd.BITMOJI_UPDATE_ERROR_CLICKED == idoVar) {
            this.g.i();
        } else if (ctd.BITMOJI_UPDATE_ERROR_SHOWN == idoVar) {
            this.g.j();
        } else if (ctd.CATEGORY_SWITCH == idoVar) {
            this.g.k((mbc) objArr[0]);
        } else if (ctd.CLICK == idoVar) {
            this.g.l((mbc) objArr[0]);
        } else if (ctd.CONCEPT_PREDICTION_MODEL_LOADED == idoVar) {
            this.g.n();
        } else if (ctd.CONCEPT_PREDICTION_MODEL_SYNC == idoVar) {
            this.g.m();
        } else if (ctd.DICTATION_GET_CONCEPT_LIST_REQUEST == idoVar) {
            this.g.w();
        } else if (ctd.DICTATION_GET_EMOJI_FROM_CONCEPT_REQUEST == idoVar) {
            this.g.x();
        } else if (ctd.DICTATION_GET_EMOJI_FROM_CONCEPT_RESULTS == idoVar) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 150, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.y(((Number) obj3).intValue());
        } else if (ctd.DICTATION_GET_EMOJI_FROM_QUERY_REQUEST == idoVar) {
            this.g.z();
        } else if (ctd.DICTATION_GET_EMOJI_FROM_QUERY_RESULTS == idoVar) {
            Object obj4 = objArr[0];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 160, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.A(((Number) obj4).intValue());
        } else if (ctd.DICTATION_RANKED_EMOJI_PREDICTION_CONCEPT_NAME_RESULTS == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 167, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.B(((Number) obj5).intValue());
        } else if (ctd.DICTATION_RANKED_EMOJI_PREDICTION_REQUEST == idoVar) {
            this.g.C();
        } else if (ctd.DICTATION_RANKED_EMOJI_PREDICTION_RESULTS == idoVar) {
            Object obj6 = objArr[0];
            if (obj6 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 177, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.D(((Number) obj6).intValue());
        } else if (ctd.EMOJI_OR_TEXT_SHARE == idoVar) {
            this.g.as((String) objArr[0], (mbc) objArr[1]);
        } else if (ctd.EMOJI_PREDICTOR_MODEL_LOADED == idoVar) {
            this.g.H();
        } else if (ctd.EMOJI_PREDICTOR_MODEL_SYNC == idoVar) {
            this.g.G();
        } else if (ctd.ERROR == idoVar) {
            this.g.P((mbc) objArr[0]);
        } else if (ctd.EXPRESSION_HEADER_ELEMENTS == idoVar) {
            Object obj7 = objArr[0];
            if (obj7 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 196, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.T(((Number) obj7).intValue());
        } else if (ctd.EXPRESSION_HEADER_EMOJI_CLICKED == idoVar) {
            this.g.U();
        } else if (ctd.EXPRESSION_HEADER_EMOJI_SHOWN == idoVar) {
            this.g.V();
        } else if (ctd.EXPRESSION_MOMENT_CANDIDATE_CLICK == idoVar) {
            Object obj8 = objArr[0];
            if (obj8 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 209, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.W(((Number) obj8).intValue());
        } else if (ctd.EXPRESSION_MOMENT_CANDIDATE_OPEN_TO_SHARE_LATENCY == idoVar) {
            Object obj9 = objArr[0];
            if (obj9 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 216, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.X(((Number) obj9).longValue());
        } else if (ctd.EXPRESSION_MOMENT_CANDIDATE_TYPE_CLICK == idoVar) {
            Object obj10 = objArr[0];
            if (obj10 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 223, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.Y(((Number) obj10).intValue());
        } else if (ctd.EXPRESSION_MOMENT_CANDIDATE_TYPE_SHOWN == idoVar) {
            Object obj11 = objArr[0];
            if (obj11 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 230, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.Z(((Number) obj11).intValue());
        } else if (ctd.EXPRESSION_MOMENT_CAROUSEL_ENTRY_POINT_CLICKED == idoVar) {
            this.g.aa();
        } else if (ctd.EXPRESSION_MOMENT_CAROUSEL_ENTRY_POINT_SHOWN == idoVar) {
            this.g.ab();
        } else if (ctd.EXPRESSION_MOMENT_DYNAMIC_ART_ABSENT_REASON == idoVar) {
            Object obj12 = objArr[0];
            if (obj12 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 243, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.ac(((Number) obj12).intValue());
        } else if (ctd.EXPRESSION_MOMENT_RESULT_ABSENT == idoVar) {
            this.g.ad();
        } else if (ctd.EXPRESSION_MOMENT_SUPPLIER_NOT_SUPPORT == idoVar) {
            Object obj13 = objArr[0];
            if (obj13 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 253, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.ae(((Number) obj13).intValue());
        } else if (ctd.EXPRESSION_MOMENT_SUPPLIER_RESULT_ABSENT == idoVar) {
            Object obj14 = objArr[0];
            if (obj14 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 260, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.af(((Number) obj14).intValue());
        } else if (ctd.EXPRESSION_NAVIGATION_ROW_HIDDEN == idoVar) {
            this.g.ag();
        } else if (ctd.EXPRESSION_NAVIGATION_ROW_SHOWN == idoVar) {
            ctj ctjVar = this.g;
            ctjVar.az(ctjVar.c, 289);
        } else if (ctd.EXTENSION_OPEN == idoVar) {
            ctj ctjVar2 = this.g;
            mbc mbcVar = (mbc) objArr[0];
            nfh nfhVar = ctjVar2.c;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mbh mbhVar = (mbh) nfhVar.b;
            mbh mbhVar2 = mbh.aT;
            mbcVar.getClass();
            mbhVar.as = mbcVar;
            mbhVar.d |= 4;
            ctjVar2.az(ctjVar2.c, 248);
        } else if (ctd.FAVORITING == idoVar) {
            ctj ctjVar3 = this.g;
            mbc mbcVar2 = (mbc) objArr[0];
            nfh nfhVar2 = ctjVar3.c;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            mbh mbhVar3 = (mbh) nfhVar2.b;
            mbh mbhVar4 = mbh.aT;
            mbcVar2.getClass();
            mbhVar3.as = mbcVar2;
            mbhVar3.d |= 4;
            ctjVar3.az(ctjVar3.c, 233);
        } else if (ctd.FEDERATED_CONV2QUERY_INTERACTION == idoVar) {
            Object obj15 = objArr[0];
            if (obj15 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 279, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 283, "ExpressionMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                this.g.ah(((Number) obj15).floatValue(), ((Number) objArr[1]).floatValue());
            }
        } else if (ctd.GIF_IMAGE_OPENED == idoVar) {
            this.g.aA((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
        } else if (ctd.GIF_IMAGE_SEARCH_FAILED == idoVar) {
            ctj ctjVar4 = this.g;
            ctjVar4.az(ctjVar4.c, 144);
        } else if (ctd.IMAGE_SHARE == idoVar) {
            this.g.aj((mbc) objArr[0], (crc) objArr[1]);
        } else if (ctd.IMPRESSION == idoVar) {
            this.g.ak((mbc) objArr[0]);
        } else if (ctd.LITE_EMOJI_PREDICTOR_MODEL_LOADED == idoVar) {
            this.g.am();
        } else if (ctd.LITE_EMOJI_PREDICTOR_MODEL_SYNC == idoVar) {
            this.g.al();
        } else if (ctd.PROACTIVE_GIF_CATEGORY_IMPRESSION == idoVar) {
            ctj ctjVar5 = this.g;
            ctjVar5.az(ctjVar5.c, 183);
        } else if (ctd.RECENT_SEARCH_CANDIDATE_DELETE_CANCELLED == idoVar) {
            Object obj16 = objArr[0];
            if (obj16 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 311, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.an(((Number) obj16).intValue());
        } else if (ctd.RECENT_SEARCH_CANDIDATE_DELETE_CONFIRMED == idoVar) {
            Object obj17 = objArr[0];
            if (obj17 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 318, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.ao(((Number) obj17).intValue());
        } else if (ctd.SEARCH_CANDIDATE_DELETE_REQUESTED == idoVar) {
            Object obj18 = objArr[0];
            if (obj18 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 325, "ExpressionMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            } else if (objArr[1] == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 329, "ExpressionMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            } else {
                this.g.ap(((Number) obj18).intValue(), ((Number) objArr[1]).intValue());
            }
        } else if (ctd.SEARCH_EMOJI_DATA_ERROR == idoVar) {
            Object obj19 = objArr[1];
            if (obj19 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 336, "ExpressionMetricsProcessorHelper.java")).t("the 1th argument is null!");
                return false;
            }
            this.g.aq((clx) objArr[0], ((Number) obj19).intValue());
        } else if (ctd.SEARCH_EMOJI_SEARCHED == idoVar) {
            this.g.ar((String) objArr[0]);
        } else if (ctd.SEARCH_PERFORMED == idoVar) {
            ctj ctjVar6 = this.g;
            mbc mbcVar3 = (mbc) objArr[0];
            nfh nfhVar3 = ctjVar6.c;
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            mbh mbhVar5 = (mbh) nfhVar3.b;
            mbh mbhVar6 = mbh.aT;
            mbcVar3.getClass();
            mbhVar5.as = mbcVar3;
            mbhVar5.d |= 4;
            ctjVar6.az(ctjVar6.c, 226);
        } else if (ctd.STICKER_REVAMP_BROWSE_CLICKED == idoVar) {
            ctj ctjVar7 = this.g;
            ctjVar7.az(ctjVar7.c, 204);
        } else if (ctd.STICKER_SETTING_ICON_CLICKED == idoVar) {
            ctj ctjVar8 = this.g;
            ctjVar8.az(ctjVar8.c, 205);
        } else if (ctd.TAB_OPEN == idoVar) {
            ctj ctjVar9 = this.g;
            mbc mbcVar4 = (mbc) objArr[0];
            nfh nfhVar4 = ctjVar9.c;
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            mbh mbhVar7 = (mbh) nfhVar4.b;
            mbh mbhVar8 = mbh.aT;
            mbcVar4.getClass();
            mbhVar7.as = mbcVar4;
            mbhVar7.d |= 4;
            ctjVar9.az(ctjVar9.c, 223);
        } else if (ctd.TRANSFORMER_EXPRESSION_MODEL_LOADED == idoVar) {
            this.g.au();
        } else if (ctd.TRANSFORMER_EXPRESSION_MODEL_SYNC == idoVar) {
            this.g.at();
        } else if (ctd.TRIGGERING_MODEL_LOADED == idoVar) {
            ctj ctjVar10 = this.g;
            nfh nfhVar5 = ctjVar10.c;
            nfh t = mam.d.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mam mamVar = (mam) t.b;
            mamVar.b = 2;
            mamVar.a |= 1;
            mam mamVar2 = (mam) t.b;
            mamVar2.c = 1;
            mamVar2.a |= 2;
            mam mamVar3 = (mam) t.cz();
            if (nfhVar5.c) {
                nfhVar5.cD();
                nfhVar5.c = false;
            }
            mbh mbhVar9 = (mbh) nfhVar5.b;
            mbh mbhVar10 = mbh.aT;
            mamVar3.getClass();
            mbhVar9.ay = mamVar3;
            mbhVar9.d |= 256;
            ctjVar10.az(ctjVar10.c, 246);
        } else if (ctd.TRIGGERING_MODEL_SYNC == idoVar) {
            ctj ctjVar11 = this.g;
            nfh nfhVar6 = ctjVar11.c;
            nfh t2 = mam.d.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mam mamVar4 = (mam) t2.b;
            mamVar4.b = 2;
            mamVar4.a |= 1;
            mam mamVar5 = (mam) t2.b;
            mamVar5.c = 2;
            mamVar5.a |= 2;
            mam mamVar6 = (mam) t2.cz();
            if (nfhVar6.c) {
                nfhVar6.cD();
                nfhVar6.c = false;
            }
            mbh mbhVar11 = (mbh) nfhVar6.b;
            mbh mbhVar12 = mbh.aT;
            mamVar6.getClass();
            mbhVar11.ay = mamVar6;
            mbhVar11.d |= 256;
            ctjVar11.az(ctjVar11.c, 246);
        } else if (ctd.UNIVERSAL_MEDIA_IMAGE_OPENED == idoVar) {
            ctj ctjVar12 = this.g;
            String str = (String) objArr[1];
            ctjVar12.aw((String) objArr[3]);
            ctjVar12.av((String) objArr[4]);
            nfh t3 = met.f.t();
            mai ax = ctj.ax((hfl) objArr[0], (String) objArr[2]);
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            met metVar = (met) t3.b;
            ax.getClass();
            metVar.d = ax;
            int i = metVar.a | 4;
            metVar.a = i;
            if (str != null) {
                metVar.a = i | 1;
                metVar.b = str;
            }
            nfh nfhVar7 = ctjVar12.c;
            if (nfhVar7.c) {
                nfhVar7.cD();
                nfhVar7.c = false;
            }
            mbh mbhVar13 = (mbh) nfhVar7.b;
            met metVar2 = (met) t3.cz();
            mbh mbhVar14 = mbh.aT;
            metVar2.getClass();
            mbhVar13.M = metVar2;
            mbhVar13.b |= 65536;
            ctjVar12.az(ctjVar12.c, 93);
        } else if (ctd.UNIVERSAL_MEDIA_MORE_GIFS_REQUESTED == idoVar) {
            ctj ctjVar13 = this.g;
            ctjVar13.aw((String) objArr[2]);
            ctjVar13.av((String) objArr[3]);
            nfh nfhVar8 = ctjVar13.c;
            nfh t4 = met.f.t();
            mai ax2 = ctj.ax((hfl) objArr[0], (String) objArr[1]);
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            met metVar3 = (met) t4.b;
            ax2.getClass();
            metVar3.d = ax2;
            metVar3.a |= 4;
            if (nfhVar8.c) {
                nfhVar8.cD();
                nfhVar8.c = false;
            }
            mbh mbhVar15 = (mbh) nfhVar8.b;
            met metVar4 = (met) t4.cz();
            mbh mbhVar16 = mbh.aT;
            metVar4.getClass();
            mbhVar15.M = metVar4;
            mbhVar15.b |= 65536;
            ctjVar13.az(ctjVar13.c, 91);
        } else if (ctd.UNIVERSAL_MEDIA_MORE_STICKER_RESULTS_CLICKED == idoVar) {
            ctj ctjVar14 = this.g;
            String str2 = (String) objArr[1];
            ctjVar14.aw((String) objArr[3]);
            ctjVar14.av((String) objArr[4]);
            nfh nfhVar9 = ctjVar14.c;
            nfh t5 = met.f.t();
            mai ax3 = ctj.ax((hfl) objArr[0], (String) objArr[2]);
            if (t5.c) {
                t5.cD();
                t5.c = false;
            }
            met metVar5 = (met) t5.b;
            ax3.getClass();
            metVar5.d = ax3;
            metVar5.a |= 4;
            int ay = ctj.ay(str2);
            if (t5.c) {
                t5.cD();
                t5.c = false;
            }
            met metVar6 = (met) t5.b;
            metVar6.c = ay - 1;
            metVar6.a |= 2;
            if (nfhVar9.c) {
                nfhVar9.cD();
                nfhVar9.c = false;
            }
            mbh mbhVar17 = (mbh) nfhVar9.b;
            met metVar7 = (met) t5.cz();
            mbh mbhVar18 = mbh.aT;
            metVar7.getClass();
            mbhVar17.M = metVar7;
            mbhVar17.b |= 65536;
            ctjVar14.az(ctjVar14.c, 92);
        } else if (ctd.UNIVERSAL_MEDIA_MORE_STICKER_RESULTS_SHOWN == idoVar) {
            ctj ctjVar15 = this.g;
            ctjVar15.az(ctjVar15.c, 164);
        } else if (ctd.UNIVERSAL_MEDIA_NO_CONNECTION_CARD_SHOWN == idoVar) {
            ctj ctjVar16 = this.g;
            hfl hflVar = (hfl) objArr[0];
            String str3 = (String) objArr[1];
            ctjVar16.aw((String) objArr[2]);
            ctjVar16.av((String) objArr[3]);
            nfh nfhVar10 = ctjVar16.c;
            nfh t6 = met.f.t();
            if (t6.c) {
                t6.cD();
                t6.c = false;
            }
            met metVar8 = (met) t6.b;
            metVar8.e = 2;
            metVar8.a |= 16;
            mai ax4 = ctj.ax(hflVar, str3);
            if (t6.c) {
                t6.cD();
                t6.c = false;
            }
            met metVar9 = (met) t6.b;
            ax4.getClass();
            metVar9.d = ax4;
            metVar9.a |= 4;
            if (nfhVar10.c) {
                nfhVar10.cD();
                nfhVar10.c = false;
            }
            mbh mbhVar19 = (mbh) nfhVar10.b;
            met metVar10 = (met) t6.cz();
            mbh mbhVar20 = mbh.aT;
            metVar10.getClass();
            mbhVar19.M = metVar10;
            mbhVar19.b |= 65536;
            ctjVar16.az(ctjVar16.c, 94);
        } else if (ctd.UNIVERSAL_MEDIA_NO_RESULTS_CARD_SHOWN == idoVar) {
            ctj ctjVar17 = this.g;
            hfl hflVar2 = (hfl) objArr[0];
            String str4 = (String) objArr[1];
            ctjVar17.aw((String) objArr[2]);
            ctjVar17.av((String) objArr[3]);
            nfh nfhVar11 = ctjVar17.c;
            nfh t7 = met.f.t();
            if (t7.c) {
                t7.cD();
                t7.c = false;
            }
            met metVar11 = (met) t7.b;
            metVar11.e = 1;
            metVar11.a |= 16;
            mai ax5 = ctj.ax(hflVar2, str4);
            if (t7.c) {
                t7.cD();
                t7.c = false;
            }
            met metVar12 = (met) t7.b;
            ax5.getClass();
            metVar12.d = ax5;
            metVar12.a |= 4;
            if (nfhVar11.c) {
                nfhVar11.cD();
                nfhVar11.c = false;
            }
            mbh mbhVar21 = (mbh) nfhVar11.b;
            met metVar13 = (met) t7.cz();
            mbh mbhVar22 = mbh.aT;
            metVar13.getClass();
            mbhVar21.M = metVar13;
            mbhVar21.b |= 65536;
            ctjVar17.az(ctjVar17.c, 94);
        } else if (hpb.IME_TEXT_CANDIDATE_SELECTED == idoVar) {
            this.g.a((hln) objArr[0]);
        } else {
            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessorHelper", "doProcessMetrics", 390, "ExpressionMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
            return false;
        }
        return true;
    }
}
