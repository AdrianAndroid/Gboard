package defpackage;

/* compiled from: PG */
/* renamed from: ctn  reason: default package */
/* loaded from: classes.dex */
public final class ctn extends idb {
    public static final ido[] a = {ciu.BITMOJI_CACHE_RESPONSE, ciu.CONTENT_CACHE_RESPONSE, ciu.IMAGE_CANDIDATE_USAGE, ciu.SHARE, ciu.SUPPLIER_EXCEPTION, ciu.SUPPLIER_RESPONSE, clt.EXTRACT_PREBUNDLED_EMOJI_DATA, clt.EXTRACT_PREBUNDLED_EMOJI_METADATA, cqw.BITMOJI_SHARE_API_RESPONSE, cqw.BITMOJI_SHARE_API_RESPONSE_DETAILED_FAILURE, cqw.WHATSAPP_WEBP_CONVERT_ANIMATED_RESPONSE, cqw.WHATSAPP_WEBP_CONVERT_STATIC_RESPONSE, csv.CONTENT_CACHE_CONTENT_FOUND_FOR_KEYWORD, csv.CONTENT_CACHE_CONTENT_NOT_FOUND_FOR_KEYWORD, csv.CONTENT_CACHE_DOWNLOAD_SCHEDULED_ON_CACHE_MISS, csv.CONTENT_CACHE_DOWNLOAD_TASK_ALL_DOWNLOADS_COMPLETED, csv.CONTENT_CACHE_DOWNLOAD_TASK_DOWNLOADS_PARTIALLY_COMPLETED, csv.CONTENT_CACHE_DOWNLOAD_TASK_FAILED_TO_SCHEDULE, csv.CONTENT_CACHE_DOWNLOAD_TASK_FAILED_TO_WRITE_MAPPING_TO_DISK, csv.CONTENT_CACHE_DOWNLOAD_TASK_MAPPING_WRITTEN_TO_DISK, csv.CONTENT_CACHE_DOWNLOAD_TASK_RESCHEDULED_DEVICE_NOT_IDLE, csv.CONTENT_CACHE_DOWNLOAD_TASK_SCHEDULED_SUCCESSFULLY, csv.CONTENT_CACHE_DOWNLOAD_TASK_STARTED, csv.CONTENT_CACHE_DOWNLOAD_TASK_STARTED_AFTER_DELAY, csv.CONTENT_CACHE_DOWNLOAD_TASK_STOPPED, csv.CONTENT_CACHE_KEYWORDS_REQUIRING_UPDATE_FILE_MALFORMED, csv.CONTENT_CACHE_KEYWORDS_REQUIRING_UPDATE_FILE_MISSING, csv.CONTENT_CACHE_KEYWORD_METADATA_FILE_MALFORMED, csv.CONTENT_CACHE_KEYWORD_METADATA_FILE_MISSING, csv.CONTENT_CACHE_MAPPING_FILE_MALFORMED, csv.CONTENT_CACHE_MAPPING_FILE_MISSING, csv.CONTENT_CACHE_REFRESH_SCHEDULED_ON_TTL_EXPIRY, ctd.BITMOJI_CANDIDATE_QUERY_SEARCHED, ctd.BITMOJI_CANDIDATE_QUERY_SUGGESTED, ctd.BITMOJI_CONTEXTUAL_PACKS_SHOWN, ctd.BITMOJI_IMAGE_OPEN_INPUTSTREAM, ctd.FEDERATEDC2Q_INFERENCE_ERROR, ctd.FEDERATEDC2Q_INFERENCE_MODEL_LOAD, ctd.FEDERATEDC2Q_INFERENCE_TRIGGERED_CANDIDATE_COUNT, ctd.FEDERATEDC2Q_TRAINING_CACHE_CLIENT_CREATION, ctd.FEDERATEDC2Q_TRAINING_ENABLED, ctd.GIF_CANDIDATE_QUERY_SEARCHED, ctd.GIF_CANDIDATE_QUERY_SUGGESTED, ctd.UNIVERSAL_MEDIA_CANDIDATE_QUERY_SEARCHED, ctd.UNIVERSAL_MEDIA_CANDIDATE_QUERY_SUGGESTED, ctd.UNIVERSAL_MEDIA_NO_CONNECTION_RETRY_BUTTON_CLICKED, ctf.BITMOJI_CONTEXTUAL_PACKS, ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION, ctf.BITMOJI_FETCHER_GET_PACKS, ctf.BITMOJI_FETCHER_GET_STATUS_RESULT, ctf.BITMOJI_FETCHER_SEARCH, ctf.BITMOJI_FETCHER_SUGGEST, ctf.DYNAMIC_ART_STICKER_GENERATION, ctf.DYNAMIC_ART_STICKER_STATUS, ctf.EXPRESSION_DATA_PRUNE_EVENT, ctf.FEATURED_PACK_INTERACTION, hay.a, hdo.a};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper");
    private final ctm g;

    public ctn(ctm ctmVar) {
        this.g = ctmVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (ciu.BITMOJI_CACHE_RESPONSE == idoVar) {
            Object obj = objArr[0];
            if (obj == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 29, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj).intValue());
        } else if (ciu.CONTENT_CACHE_RESPONSE == idoVar) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 36, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj2).intValue());
        } else if (ciu.IMAGE_CANDIDATE_USAGE == idoVar) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 43, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj3).intValue());
        } else if (ciu.SHARE == idoVar) {
            Object obj4 = objArr[0];
            if (obj4 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 50, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj4).intValue());
        } else if (ciu.SUPPLIER_EXCEPTION == idoVar) {
            Object obj5 = objArr[0];
            if (obj5 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 57, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj5).intValue());
        } else if (ciu.SUPPLIER_RESPONSE == idoVar) {
            Object obj6 = objArr[0];
            if (obj6 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 64, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj6).intValue());
        } else if (clt.EXTRACT_PREBUNDLED_EMOJI_DATA == idoVar) {
            Object obj7 = objArr[0];
            if (obj7 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 71, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj7).intValue());
        } else if (clt.EXTRACT_PREBUNDLED_EMOJI_METADATA == idoVar) {
            Object obj8 = objArr[0];
            if (obj8 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 78, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj8).intValue());
        } else if (cqw.BITMOJI_SHARE_API_RESPONSE == idoVar) {
            Object obj9 = objArr[0];
            if (obj9 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 85, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj9).intValue());
        } else if (cqw.BITMOJI_SHARE_API_RESPONSE_DETAILED_FAILURE == idoVar) {
            Object obj10 = objArr[0];
            if (obj10 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 92, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj10).intValue());
        } else if (cqw.WHATSAPP_WEBP_CONVERT_ANIMATED_RESPONSE == idoVar) {
            Object obj11 = objArr[0];
            if (obj11 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 99, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj11).intValue());
        } else if (cqw.WHATSAPP_WEBP_CONVERT_STATIC_RESPONSE == idoVar) {
            Object obj12 = objArr[0];
            if (obj12 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 106, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj12).intValue());
        } else if (csv.CONTENT_CACHE_CONTENT_FOUND_FOR_KEYWORD == idoVar) {
            this.g.b.d("ContentCache.event", 10);
        } else if (csv.CONTENT_CACHE_CONTENT_NOT_FOUND_FOR_KEYWORD == idoVar) {
            this.g.b.d("ContentCache.event", 11);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_SCHEDULED_ON_CACHE_MISS == idoVar) {
            this.g.b.d("ContentCache.event", 16);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_ALL_DOWNLOADS_COMPLETED == idoVar) {
            this.g.b.d("ContentCache.event", 3);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_DOWNLOADS_PARTIALLY_COMPLETED == idoVar) {
            this.g.b.d("ContentCache.event", 15);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_FAILED_TO_SCHEDULE == idoVar) {
            this.g.b.d("ContentCache.event", 14);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_FAILED_TO_WRITE_MAPPING_TO_DISK == idoVar) {
            this.g.b.d("ContentCache.event", 12);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_MAPPING_WRITTEN_TO_DISK == idoVar) {
            this.g.b.d("ContentCache.event", 4);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_RESCHEDULED_DEVICE_NOT_IDLE == idoVar) {
            this.g.b.d("ContentCache.event", 22);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_SCHEDULED_SUCCESSFULLY == idoVar) {
            this.g.b.d("ContentCache.event", 13);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_STARTED == idoVar) {
            this.g.b.d("ContentCache.event", 0);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_STARTED_AFTER_DELAY == idoVar) {
            this.g.b.d("ContentCache.event", 1);
        } else if (csv.CONTENT_CACHE_DOWNLOAD_TASK_STOPPED == idoVar) {
            this.g.b.d("ContentCache.event", 2);
        } else if (csv.CONTENT_CACHE_KEYWORDS_REQUIRING_UPDATE_FILE_MALFORMED == idoVar) {
            this.g.b.d("ContentCache.event", 21);
        } else if (csv.CONTENT_CACHE_KEYWORDS_REQUIRING_UPDATE_FILE_MISSING == idoVar) {
            this.g.b.d("ContentCache.event", 20);
        } else if (csv.CONTENT_CACHE_KEYWORD_METADATA_FILE_MALFORMED == idoVar) {
            this.g.b.d("ContentCache.event", 19);
        } else if (csv.CONTENT_CACHE_KEYWORD_METADATA_FILE_MISSING == idoVar) {
            this.g.b.d("ContentCache.event", 18);
        } else if (csv.CONTENT_CACHE_MAPPING_FILE_MALFORMED == idoVar) {
            this.g.b.d("ContentCache.event", 9);
        } else if (csv.CONTENT_CACHE_MAPPING_FILE_MISSING == idoVar) {
            this.g.b.d("ContentCache.event", 8);
        } else if (csv.CONTENT_CACHE_REFRESH_SCHEDULED_ON_TTL_EXPIRY == idoVar) {
            this.g.b.d("ContentCache.event", 17);
        } else if (ctd.BITMOJI_CANDIDATE_QUERY_SEARCHED == idoVar) {
            Object obj13 = objArr[0];
            if (obj13 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 173, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj13).intValue());
        } else if (ctd.BITMOJI_CANDIDATE_QUERY_SUGGESTED == idoVar) {
            Object obj14 = objArr[0];
            if (obj14 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 180, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj14).intValue());
        } else if (ctd.BITMOJI_CONTEXTUAL_PACKS_SHOWN == idoVar) {
            Object obj15 = objArr[0];
            if (obj15 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 187, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj15).intValue());
        } else if (ctd.BITMOJI_IMAGE_OPEN_INPUTSTREAM == idoVar) {
            Object obj16 = objArr[0];
            if (obj16 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 194, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Boolean) obj16).booleanValue());
        } else if (ctd.FEDERATEDC2Q_INFERENCE_ERROR == idoVar) {
            Object obj17 = objArr[0];
            if (obj17 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 201, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj17).intValue());
        } else if (ctd.FEDERATEDC2Q_INFERENCE_MODEL_LOAD == idoVar) {
            Object obj18 = objArr[0];
            if (obj18 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 208, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Boolean) obj18).booleanValue());
        } else if (ctd.FEDERATEDC2Q_INFERENCE_TRIGGERED_CANDIDATE_COUNT == idoVar) {
            Object obj19 = objArr[0];
            if (obj19 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 215, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj19).intValue());
        } else if (ctd.FEDERATEDC2Q_TRAINING_CACHE_CLIENT_CREATION == idoVar) {
            Object obj20 = objArr[0];
            if (obj20 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 222, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Boolean) obj20).booleanValue());
        } else if (ctd.FEDERATEDC2Q_TRAINING_ENABLED == idoVar) {
            Object obj21 = objArr[0];
            if (obj21 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 229, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.a(((Boolean) obj21).booleanValue());
        } else if (ctd.GIF_CANDIDATE_QUERY_SEARCHED == idoVar) {
            Object obj22 = objArr[0];
            if (obj22 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 236, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj22).intValue());
        } else if (ctd.GIF_CANDIDATE_QUERY_SUGGESTED == idoVar) {
            Object obj23 = objArr[0];
            if (obj23 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 243, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj23).intValue());
        } else if (ctd.UNIVERSAL_MEDIA_CANDIDATE_QUERY_SEARCHED == idoVar) {
            Object obj24 = objArr[0];
            if (obj24 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 250, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj24).intValue());
        } else if (ctd.UNIVERSAL_MEDIA_CANDIDATE_QUERY_SUGGESTED == idoVar) {
            Object obj25 = objArr[0];
            if (obj25 == null) {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 257, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                return false;
            }
            this.g.c(((Number) obj25).intValue());
        } else if (ctd.UNIVERSAL_MEDIA_NO_CONNECTION_RETRY_BUTTON_CLICKED != idoVar) {
            if (ctf.BITMOJI_CONTEXTUAL_PACKS == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (ctf.BITMOJI_ERROR_CARD_CLICKED_ACTION == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (ctf.BITMOJI_FETCHER_GET_PACKS == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (ctf.BITMOJI_FETCHER_GET_STATUS_RESULT == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (ctf.BITMOJI_FETCHER_SEARCH == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (ctf.BITMOJI_FETCHER_SUGGEST == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (ctf.DYNAMIC_ART_STICKER_GENERATION == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (ctf.DYNAMIC_ART_STICKER_STATUS == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (ctf.EXPRESSION_DATA_PRUNE_EVENT == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (ctf.FEATURED_PACK_INTERACTION == idoVar) {
                this.g.b((ctc) objArr[0]);
            } else if (hay.a == idoVar) {
                Object obj26 = objArr[0];
                if (obj26 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 297, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.c(((Number) obj26).intValue());
            } else if (hdo.a == idoVar) {
                Object obj27 = objArr[0];
                if (obj27 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 304, "ExpressionSimpleCountersMetricsProcessorHelper.java")).t("the 0th argument is null!");
                    return false;
                }
                this.g.c(((Number) obj27).intValue());
            } else {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessorHelper", "doProcessMetrics", 310, "ExpressionSimpleCountersMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
                return false;
            }
        }
        return true;
    }
}
