package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dqc  reason: default package */
/* loaded from: classes.dex */
public final class dqc {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsUtils");
    private static final llw b;

    static {
        lls i = llw.i(16);
        i.a("prime", mcg.PRIME);
        i.a("digit", mcg.DIGIT);
        i.a("symbol", mcg.SYMBOL);
        i.a("smiley", mcg.SMILEY);
        i.a("emoticon", mcg.EMOTICON);
        i.a("emoji_search_result", mcg.EMOJI_SEARCH_RESULT);
        i.a("gif_search_result", mcg.GIF_SEARCH_RESULT);
        i.a("universal_media_search_result", mcg.UNIVERSAL_MEDIA_SEARCH_RESULT);
        i.a("bitmoji_search_result", mcg.BITMOJI_SEARCH_RESULT);
        i.a("sticker_search_result", mcg.STICKER_SEARCH_RESULT);
        i.a("text_editing", mcg.TEXTEDITING);
        i.a("clipboard", mcg.CLIPBOARD_KEYBOARD);
        i.a("ocr_result", mcg.OCR_RESULT);
        i.a("search_result", mcg.SEARCH_RESULT);
        i.a("rich_symbol", mcg.RICH_SYMBOL);
        b = i.l();
    }

    public static mcg a(ibz ibzVar) {
        mcg mcgVar = (mcg) b.get(ibzVar.l);
        if (mcgVar == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsUtils", "getGKKeyboardType", 139, "LatinCommonMetricsUtils.java")).w("Failed to get enum for keyboard type: %s", ibzVar);
            return mcg.UNKNOWN_KEYBOARD;
        }
        return mcgVar;
    }

    public static int b(Context context, String str) {
        if (context.getString(R.string.f153990_resource_name_obfuscated_res_0x7f140334).equals(str)) {
            return 3;
        }
        if (context.getString(R.string.f153910_resource_name_obfuscated_res_0x7f14032c).equals(str)) {
            return 4;
        }
        if (context.getString(R.string.f153960_resource_name_obfuscated_res_0x7f140331).equals(str)) {
            return 20;
        }
        if (context.getString(R.string.f153930_resource_name_obfuscated_res_0x7f14032e).equals(str)) {
            return 5;
        }
        if (context.getString(R.string.f154000_resource_name_obfuscated_res_0x7f140335).equals(str)) {
            return 6;
        }
        if (context.getString(R.string.f153980_resource_name_obfuscated_res_0x7f140333).equals(str)) {
            return 8;
        }
        if (context.getString(R.string.f153870_resource_name_obfuscated_res_0x7f140328).equals(str)) {
            return 15;
        }
        if (context.getString(R.string.f154030_resource_name_obfuscated_res_0x7f140338).equals(str)) {
            return 7;
        }
        if (context.getString(R.string.f153890_resource_name_obfuscated_res_0x7f14032a).equals(str)) {
            return 9;
        }
        if (context.getString(R.string.f153970_resource_name_obfuscated_res_0x7f140332).equals(str)) {
            return 10;
        }
        if (context.getString(R.string.f153900_resource_name_obfuscated_res_0x7f14032b).equals(str)) {
            return 11;
        }
        if (context.getString(R.string.f153920_resource_name_obfuscated_res_0x7f14032d).equals(str)) {
            return 12;
        }
        if (context.getString(R.string.f154010_resource_name_obfuscated_res_0x7f140336).equals(str)) {
            return 13;
        }
        if (context.getString(R.string.f153880_resource_name_obfuscated_res_0x7f140329).equals(str)) {
            return 14;
        }
        if (context.getString(R.string.f153940_resource_name_obfuscated_res_0x7f14032f).equals(str)) {
            return 16;
        }
        if (context.getString(R.string.f153950_resource_name_obfuscated_res_0x7f140330).equals(str)) {
            return 17;
        }
        return context.getString(R.string.f154020_resource_name_obfuscated_res_0x7f140337).equals(str) ? 21 : 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int c(String str) {
        char c;
        switch (str.hashCode()) {
            case -1802995678:
                if (str.equals("tablet_large")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -881377690:
                if (str.equals("tablet")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3714:
                if (str.equals("tv")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 112903375:
                if (str.equals("watch")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 293976283:
                if (str.equals("foldable")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                return 3;
            }
            if (c == 2) {
                return 4;
            }
            if (c == 3) {
                return 5;
            }
            if (c == 4) {
                return 6;
            }
            return c != 5 ? 1 : 7;
        }
        return 2;
    }

    public static int d(Context context) {
        int b2 = ino.M(context).b("ime_select_reason", 0);
        if (b2 < 11) {
            return lwm.l(b2);
        }
        return 1;
    }

    public static int e(Context context, hqt hqtVar) {
        int n = iin.n(context, hqtVar);
        if (n != 1) {
            if (n == 2) {
                return 3;
            }
            if (n == 3) {
                return 4;
            }
            if (n == 4) {
                return 5;
            }
            return n != 5 ? 1 : 6;
        }
        return 2;
    }

    public static void f(Context context, int i) {
        ino M = ino.M(context);
        int i2 = i - 1;
        if (i != 0) {
            M.h("ime_select_reason", i2);
            return;
        }
        throw null;
    }
}
