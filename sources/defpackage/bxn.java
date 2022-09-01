package defpackage;

/* compiled from: PG */
/* renamed from: bxn  reason: default package */
/* loaded from: classes.dex */
public final class bxn {
    public static final hhl a = hhq.a("enable_nwp_tflite_engine", true);
    public static final hhl b = hhq.a("enable_p13n_on_nwp_tflite_engine", false);
    public static final hhl c = hhq.a("enable_expressive_concept_triggering_engine", false);
    public static final hhl d = hhq.a("enable_concept_prediction_engine", false);
    public static final hhl e = hhq.a("enable_transformer_expression_engine", false);
    public static final hhl f = hhq.a("remove_candidate_shown_as_inline", true);
    public static final hhl g = hhq.a("enable_inline_suggestions_on_decoder_side", false);
    public static final hhl h = hhq.a("enable_multiword_predictions_as_inline_from_crank_cifg", false);
    public static final hhl i = hhq.a("enable_multiword_suggestions_as_inline_from_crank_cifg", false);
    public static final hhl j = hhq.a("enable_single_word_predictions_as_inline_from_crank_cifg", false);
    public static final hhl k = hhq.a("enable_single_word_suggestions_as_inline_from_crank_cifg", false);
    public static final hhl l = hhq.a("enable_matched_predictions_as_inline_from_crank_cifg", false);
    public static final hhl m = hhq.a("enable_matched_predictions_as_completions_from_crank_cifg", false);
    public static final hhl n = hhq.a("enable_user_history_predictions_as_inline_from_crank_cifg", false);
    public static final hhl o = hhq.a("enable_expressive_concept_model", false);
    public static final hhl p = hhq.h("crank_ranker_supported_language_tags", "en");
    public static final hhl q = hhq.e("concept_prediction_incomplete_sentence_score_weight", 0.9d);
    public static final hhl r = hhq.e("concept_prediction_neutral_triggering_weight", 1.0d);
    public static final hhl s = hhq.e("concept_prediction_triggering_threshold", 0.6d);
    public static final hhl t = hhq.e("ranker_additional_penalty_decoder_static_lm_candidates", 0.0d);
    public static final hhl u = hhq.e("ranker_additional_weight_nwp_and_other", 0.0d);
    public static final hhl v = hhq.e("ranker_additional_weight_slope_emoji", 0.0d);
    public static final hhl w = hhq.e("ranker_additional_weight_intercept_emoji", -0.7d);
    public static final hhl x = hhq.a("nwp_filter_candidates", true);
    public static final hhl y = hhq.f("nwp_cache_size", 500);
    public static final hhl z = hhq.f("nwp_num_vocabulary_predictions", 5);
    public static final hhl A = hhq.f("nwp_min_words_predicted", 2);
    public static final hhl B = hhq.f("nwp_max_words_predicted", 3);
    public static final hhl C = hhq.f("nwp_num_beam_width", 10);
    public static final hhl D = hhq.e("nwp_local_one_step_threshold", -1.05d);
    public static final hhl E = hhq.e("nwp_threshold_for_two_words_predictions", -1.25d);
    public static final hhl F = hhq.e("nwp_threshold_for_three_or_more_words_predictions", -1.15d);
    public static final hhl G = hhq.e("nwp_threshold_for_two_words_completions", -0.4d);
    public static final hhl H = hhq.e("nwp_threshold_for_three_or_more_words_completions", -0.4d);
    public static final hhl I = hhq.h("multiword_blacklist", "she,he");
    public static final hhl J = hhq.a("nwp_enable_hour_of_the_day", false);
    public static final hhl K = hhq.a("nwp_enable_day_of_the_week", false);
    public static final hhl L = hhq.f("nwp_hour_of_the_day_interval", 0);
    public static final hhl M = hhq.h("crank_inline_suggestion_language_tags", "en-US");
    public static final hhl N = hhq.e("threshold_for_single_word_predictions", -0.916d);
    public static final hhl O = hhq.e("threshold_for_single_word_completions", -8.0d);
    public static final hhl P = hhq.e("dominate_threshold_for_single_word_completions", -0.69315d);
    public static final hhl Q = hhq.e("dominate_threshold_for_single_word_predictions", -0.69315d);
    public static final hhl R = hhq.e("dominate_threshold_for_advantage_over_other_candidates", 0.69315d);
    public static final hhl S = hhq.f("num_completions_threshold", 4);
    public static final hhl T = hhq.f("min_char_num_limit_for_single_word_predictions", 9);
    public static final hhl U = hhq.f("min_char_num_limit_for_single_word_completions", 9);
    public static final hhl V = hhq.f("crank_max_char_num_limit", 30);
    public static final hhl W = hhq.f("crank_min_char_num_limit", 10);
    public static final hhl X = hhq.a("crank_trigger_decoder_inline_completion_first", false);
    public static final hhl Y = hhq.a("crank_trigger_decoder_inline_prediction_first", false);
    public static final hhl Z = hhq.a("enable_crank_for_first_supported_locale_in_multilingual", false);
    public static final hhl aa = hhq.a("enable_crank_for_primary_locale_in_multilingual", false);
    public static final hhl ab = hhq.f("expressive_concept_emoji_predictor_max_num_words", 10);
    public static final hhl ac = hhq.f("concept_prediction_num_predictions", 3);
    public static final hhl ad = hhq.f("concept_prediction_num_query_predictions", 1);
    public static final hhl ae = hhq.f("concept_prediction_concept_map_cache_size", 10);
    public static final hhl af = hhq.f("concept_prediction_max_word_num_suffix_match", 0);
    public static final hhl ag = hhq.e("query_prediction_score_threshold", 0.873d);
    public static final hhl ah = hhq.a("enable_neighbor_emoji", false);
    public static final hhl ai = hhq.a("enable_committed_emoji_to_concept", false);
    public static final hhl aj = hhq.a("enable_query_candidate", true);
    public static final hhl ak = hhq.h("blocked_candidate_types", "");
    public static final hhl al = hhq.a("enable_rule_based_concept_prediction", false);
    public static final hhl am = hhq.a("enable_last_word_rule_based_concept_prediction", false);
    public static final hhl an = hhq.a("enable_suffix_rule_based_concept_prediction", false);
    public static final hhl ao = hhq.a("concept_prediction_enable_emoji_renderable_check", false);
    public static final hhl ap = hhq.a("concept_prediction_enable_cache", true);
    public static final hhl aq = hhq.a("concept_prediction_sample_emoji_by_popularity", false);
    public static final hhl ar = hhq.h("expressive_concept_triggering_supported_language_tags", "en");
    public static final hhl as = hhq.f("triggering_model_cache_size", 50);
    public static final hhl at = hhq.h("expressive_concept_superpacks_manifest_url", "https://www.gstatic.com/android/keyboard/modelpack/expressive_concepts/2020031023/superpacks_manifest.json");
    public static final hhl au = hhq.f("expressive_concept_superpacks_manifest_version", 2020031023);
    public static final hhl av = hhq.f("expressive_concept_min_supported_version", 2020022000);
    public static final hhl aw = hhq.h("expressive_concept_triggering_superpacks_manifest_url", "https://www.gstatic.com/android/keyboard/modelpack/expressive_concepts_triggering/2020032611/superpacks_manifest.json");
    public static final hhl ax = hhq.f("expressive_concept_triggering_superpacks_manifest_version", 2020032611);
    public static final hhl ay = hhq.f("expressive_concept_triggering_min_supported_version", 2020032611);
    public static final hhl az = hhq.h("concept_prediction_superpacks_manifest_url", "https://www.gstatic.com/android/keyboard/modelpack/transformer_concept/2020032617/superpacks_manifest.json");
    public static final hhl aA = hhq.f("concept_prediction_superpacks_manifest_version", 2020032617);
    public static final hhl aB = hhq.f("concept_prediction_min_supported_version", 2020032617);
    public static final hhl aC = hhq.h("concept_prediction_supported_language_tags", "en-US");
    public static final hhl aD = hhq.h("nwp_superpacks_manifest_uri", "https://www.gstatic.com/android/keyboard/next_word_predictor/prod/superpacks-manifest-20210413_163718.json");
    public static final hhl aE = hhq.f("nwp_manifest_version", 20210507);
    public static final hhl aF = hhq.f("nwp_min_supported_version", 20190205);
    public static final hhl aG = hhq.h("transformer_expression_superpacks_manifest_url", "https://www.gstatic.com/android/keyboard/modelpack/transformer_expression/2022041306/superpacks_manifest.json");
    public static final hhl aH = hhq.f("transformer_expression_superpacks_manifest_version", 2022041306);
    public static final hhl aI = hhq.f("transformer_expression_min_supported_version", 2022041306);
    public static final hhl aJ = hhq.h("transformer_expression_supported_language_tags", "en");
    public static final hhl aK = hhq.a("disable_crank_when_locked", false);

    static {
        hhq.a("enable_emoji_predictor_tflite_engine", true);
        hhq.a("enable_lite_emoji_prediction_engine", false);
        hhq.e("nwp_word_length_scaling_factor", 0.0d);
        hhq.f("emoji_cache_size", 500L);
        hhq.f("emoji_num_vocabulary_predictions", 5L);
        hhq.a("expressive_concept_emoji_predictor_suppress_neutral_response", false);
        hhq.f("expressive_concept_emoji_predictor_num_predictions", 2L);
        hhq.e("emoji_predictor_scaling_factor", 0.7d);
        hhq.e("emoji_predictor_unk_threshold", -6.0d);
        hhq.a("emoji_filter_candidates", true);
        hhq.a("emoji_filter_preceding_text", true);
        hhq.h("emoji_predictor_supported_language_tags", "en-US");
        hhq.h("emoji_predictor_superpacks_manifest_uri", "https://www.gstatic.com/android/keyboard/emoji_predictor/superpacks-manifest-20190205.json");
        hhq.f("emoji_predictor_manifest_version", 20190205L);
        hhq.f("emoji_predictor_min_supported_version", 20190205L);
        hhq.h("lite_emoji_prediction_superpacks_manifest_url", "https://www.gstatic.com/android/keyboard/modelpack/lite_emoji_predictor/2020091814/superpacks_manifest.json");
        hhq.f("lite_emoji_prediction_superpacks_manifest_version", 2020091814L);
        hhq.f("lite_emoji_prediction_min_supported_version", 2020081313L);
        hhq.h("lite_emoji_prediction_supported_language_tags", "en");
    }
}
