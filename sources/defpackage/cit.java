package defpackage;

/* compiled from: PG */
/* renamed from: cit  reason: default package */
/* loaded from: classes.dex */
public final class cit {
    public static final hic J;
    public static final hhl K;
    public static final hhl L;
    public static final hhl M;
    public static final hhl N;
    public static final hhl O;
    public static final hhl P;
    static final hhl Q;
    public static final hhl e;
    static final iqh f;
    public static final hhl a = hhq.h("enable_sticker_candidate_language_tags", "-");
    public static final hhl b = hhq.h("image_supplier_types_for_sticker_candidate", "6");
    public static final hhl c = hhq.a("enable_handle_emoji_for_expression_candidates", false);
    public static final hhl d = hhq.a("enable_emoji_variant_mapping_for_emoji_candidates", false);
    public static final hhl g = hhq.a("enable_handle_bitmoji_for_expression_candidates", false);
    public static final hhl h = hhq.a("enable_semantic_emoji", false);
    public static final hhl i = hhq.a("enable_handle_expression_moment_standard_emoji_kitchen", false);
    public static final hhl j = hhq.a("show_emoji_kitchen_mix_in_expression_moment", false);
    public static final hhl k = hhq.a("show_contextual_emoji_kitchen_in_expression_moment", false);
    public static final hhl l = hhq.a("show_animated_emoji_in_expression_moment", false);
    public static final hhl m = hhq.a("enable_handle_tenor_for_expression_candidates", false);
    public static final hhl n = hhq.f("tenor_max_sentence_word_num", 5);
    public static final hhl o = hhq.f("customoji_max_sentence_word_num", 8);
    public static final hhl p = hhq.f("dynamic_art_max_sentence_word_num", 8);
    public static final hhl q = hhq.f("semantic_emoji_max_sentence_word_num", 8);
    static final hhl r = hhq.a("enable_handle_emoticon_for_expression_candidates", false);
    static final hhl s = hhq.a("enable_my_stickers_option_for_expression_candidates", false);
    public static final hhl t = hhq.a("enable_emoji_group_candidate_ui", false);
    public static final hhl u = hhq.f("emoji_group_candidate_max_size", 4);
    public static final hhl v = hhq.a("higher_ranked_emoji_candidates_at_end", false);
    public static final hhl w = hhq.a("enable_random_image_concept_candidates", false);
    static final hhl x = hhq.h("expression_image_candidates_app_restriction", "*");
    static final hhl y = hhq.h("expression_text_candidates_app_restriction", "*");
    static final hhl z = hhq.f("expression_candidates_max_bitmoji_cache_size", 256);
    public static final hhl A = hhq.f("bitmoji_max_sentence_word_num", 20);
    public static final hhl B = hhq.f("expression_candidates_max_bitmoji_images_per_query", 4);
    static final hhl C = hhq.a("enable_expression_candidate_precaching_for_bitmoji", true);
    public static final hhl D = hhq.a("expression_candidates_require_downloaded_bitmoji_images", false);
    public static final hhl E = hhq.a("expression_candidates_allow_bitmoji_cache_network_requests", false);
    public static final hhl F = hhq.h("enable_expression_moment_language_tags", "-");
    public static final hhl G = hhq.a("enable_expression_moment_push_up", false);
    public static final hhl H = hhq.a("enable_expression_moment_push_up_animation", false);
    public static final hhl I = hhq.a("enable_expression_moment_push_up_animation_close_extension_early", false);

    static {
        hhl h2 = hhq.h("show_emoji_variant_candidate_allowlist", "👃,👂,🦻,🦶,🦵,💪,👍,👎,👏,\u1faf6,🙌,👐,🤲,🤝,🤜,🤛,✊,👊,\u1faf3,\u1faf4,\u1faf1,\u1faf2,🤚,👋,🖐️,✋,🖖,🤟,🤘,✌️,🤞,\u1faf0,🤙,🤌,🤏,👌,🖕,☝️,👆,👇,👉,👈,\u1faf5,✍️,🤳,🙏,💅");
        e = h2;
        f = iqh.a(h2);
        hhq.a("enable_expression_candidates_debug_toast", false);
        hhq.a("enable_customoji", false);
        nfh t2 = ckb.b.t();
        nfh t3 = ckd.e.t();
        ckc ckcVar = ckc.EMOJI_KITCHEN_MIX;
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        ckd ckdVar = (ckd) t3.b;
        ckdVar.b = ckcVar.i;
        ckdVar.a |= 1;
        ckd.b(ckdVar);
        t2.dI(t3);
        nfh t4 = ckd.e.t();
        ckc ckcVar2 = ckc.BITMOJI;
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        ckd ckdVar2 = (ckd) t4.b;
        ckdVar2.b = ckcVar2.i;
        ckdVar2.a |= 1;
        ckd.b(ckdVar2);
        t2.dI(t4);
        nfh t5 = ckd.e.t();
        ckc ckcVar3 = ckc.DYNAMIC_ART;
        if (t5.c) {
            t5.cD();
            t5.c = false;
        }
        ckd ckdVar3 = (ckd) t5.b;
        ckdVar3.b = ckcVar3.i;
        ckdVar3.a |= 1;
        ckd.b(ckdVar3);
        t2.dI(t5);
        nfh t6 = ckd.e.t();
        ckc ckcVar4 = ckc.TENOR_QUERY;
        if (t6.c) {
            t6.cD();
            t6.c = false;
        }
        ckd ckdVar4 = (ckd) t6.b;
        ckdVar4.b = ckcVar4.i;
        ckdVar4.a |= 1;
        ckd.b(ckdVar4);
        t2.dI(t6);
        nfh t7 = ckd.e.t();
        ckc ckcVar5 = ckc.CONTEXTUAL_EMOJI_KITCHEN;
        if (t7.c) {
            t7.cD();
            t7.c = false;
        }
        ckd ckdVar5 = (ckd) t7.b;
        ckdVar5.b = ckcVar5.i;
        ckdVar5.a |= 1;
        ckd.b(ckdVar5);
        t2.dI(t7);
        nfh t8 = ckd.e.t();
        ckc ckcVar6 = ckc.EMOJI_KITCHEN;
        if (t8.c) {
            t8.cD();
            t8.c = false;
        }
        ckd ckdVar6 = (ckd) t8.b;
        ckdVar6.b = ckcVar6.i;
        ckdVar6.a |= 1;
        ckd.b(ckdVar6);
        t2.dI(t8);
        nfh t9 = ckd.e.t();
        ckc ckcVar7 = ckc.EMOJI;
        if (t9.c) {
            t9.cD();
            t9.c = false;
        }
        ckd ckdVar7 = (ckd) t9.b;
        ckdVar7.b = ckcVar7.i;
        ckdVar7.a = 1 | ckdVar7.a;
        ckd.b(ckdVar7);
        t2.dI(t9);
        J = hhq.k("expression_moment_image_supplier_order", (ckb) t2.cz());
        K = hhq.f("dedup_strategy_while_tenor_dup_with_dynamic_art", 0L);
        L = hhq.f("dynamic_art_generic_template_max_count", 1L);
        M = hhq.h("image_content_types_to_log_impression_details", "-");
        N = hhq.h("image_content_types_to_clear_text_after_shares", "");
        O = hhq.h("package_names_not_to_clear_text_after_image_shares", "com.google.android.gm");
        P = hhq.a("enable_emoji_for_dynamic_art_template_candidate", false);
        Q = hhq.a("notify_emoji_candidate_availability", false);
    }
}
