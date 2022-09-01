package defpackage;

/* compiled from: PG */
/* renamed from: ecq  reason: default package */
/* loaded from: classes.dex */
public final class ecq {
    private static final ltg y = ltg.j("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessBarFlags");
    public static final hhl a = hhq.a("enable_fast_access_bar", false);
    public static final hhl b = hhq.h("fast_access_bar_app_whitelist", "");
    public static final hhl c = hhq.f("fast_access_bar_show_threshold", 5);
    public static final hhl d = hhq.a("fast_access_bar_enable_variants_popup_view", false);
    static final hhl e = hhq.a("enable_fast_access_bar_auto_add_space", false);
    static final hhl f = hhq.h("fast_access_bar_auto_add_space_language_blacklist", "zh,ja,ko,th");
    static final hhl g = hhq.h("fast_access_bar_auto_add_space_punctuation_whitelist", ".!");
    static final hhl h = hhq.a("fast_access_bar_internal_dialog_enabled", false);
    static final hhl i = hhq.h("fast_access_bar_enabled_keyboard_types", "prime,digit,symbol,alphabet_qwerty,alphabet_12keys,tri_state_digit");
    static final hhl j = hhq.a("fast_access_bar_enable_designated_variant", false);
    static final hhl k = hhq.e("fast_access_bar_variant_size_ratio", 1.0d);
    static final hhl l = hhq.a("fast_access_bar_enable_frequently_used", false);
    static final hhl m = hhq.f("fast_access_bar_fixed_slot", 5);
    static final hhl n = hhq.f("fast_access_bar_frequent_previous_months", 1);
    public static final hhl o = hhq.a("fast_access_bar_enable_offboarding_tooltip", false);
    public static final hhl p = hhq.h("fast_access_bar_offboarding_time_diffs_in_seconds", "259200");
    public static final hhl q = hhq.a("fast_access_bar_enable_onboarding_tooltip_v2", false);
    public static final hhl r = hhq.h("fast_access_bar_onboarding_time_diffs_in_seconds", "172800,172800");
    public static final hhl s = hhq.a("fast_access_bar_enable_instantly_remove", false);
    public static final hhl t = hhq.a("fast_access_bar_disable_settings_button_when_onboarding", false);
    public static final hhl u = hhq.a("fast_access_bar_disable_access_point", false);
    public static final hhl v = hhq.a("fast_access_bar_disable_settings_option", false);
    public static final hhl w = hhq.e("fast_access_bar_emoji_opacity", 1.0d);
    public static final hhl x = hhq.f("fast_access_bar_frequents_timeout_ms", 500);

    public static llp a(hhl hhlVar) {
        long j2;
        llk llkVar = new llk();
        for (String str : lfy.e(",").i((CharSequence) hhlVar.c())) {
            if (!str.isEmpty()) {
                try {
                    j2 = Long.parseLong(str);
                } catch (NumberFormatException e2) {
                    ((ltd) ((ltd) ((ltd) y.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessBarFlags", "parseLongValuesFromStringFlag", 145, "FastAccessBarFlags.java")).G("Error parsing number %s from flag %s", str, ((hhr) hhlVar).a);
                    j2 = 0;
                }
                if (j2 > 0) {
                    llkVar.h(Long.valueOf(j2));
                } else {
                    ((ltd) ((ltd) y.d()).k("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessBarFlags", "parseLongValuesFromStringFlag", 151, "FastAccessBarFlags.java")).C("Invalid value %d from flag %s", j2, ((hhr) hhlVar).a);
                }
            }
        }
        return llkVar.g();
    }
}
