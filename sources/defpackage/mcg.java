package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mcg  reason: default package */
/* loaded from: classes.dex */
public enum mcg implements nfp {
    UNKNOWN_KEYBOARD(0),
    PRIME(1),
    DIGIT(2),
    SYMBOL(3),
    SMILEY(4),
    EMOTICON(5),
    EMOJI_SEARCH_RESULT(6),
    EMOJI_HANDWRITING(7),
    GIF_SEARCH_RESULT(8),
    UNIVERSAL_MEDIA_SEARCH_RESULT(9),
    BITMOJI_SEARCH_RESULT(10),
    STICKER_SEARCH_RESULT(11),
    NATIVE_CARD_SEARCH_RESULT(12),
    NATIVE_CARD_INSTANT_SEARCH_RESULT(13),
    TEXTEDITING(14),
    CLIPBOARD_KEYBOARD(15),
    OCR_RESULT(16),
    SEARCH_RESULT(17),
    RICH_SYMBOL(18);
    
    public final int t;

    mcg(int i) {
        this.t = i;
    }

    public static mcg b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_KEYBOARD;
            case 1:
                return PRIME;
            case 2:
                return DIGIT;
            case 3:
                return SYMBOL;
            case 4:
                return SMILEY;
            case 5:
                return EMOTICON;
            case 6:
                return EMOJI_SEARCH_RESULT;
            case 7:
                return EMOJI_HANDWRITING;
            case 8:
                return GIF_SEARCH_RESULT;
            case 9:
                return UNIVERSAL_MEDIA_SEARCH_RESULT;
            case 10:
                return BITMOJI_SEARCH_RESULT;
            case 11:
                return STICKER_SEARCH_RESULT;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return NATIVE_CARD_SEARCH_RESULT;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return NATIVE_CARD_INSTANT_SEARCH_RESULT;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return TEXTEDITING;
            case 15:
                return CLIPBOARD_KEYBOARD;
            case 16:
                return OCR_RESULT;
            case 17:
                return SEARCH_RESULT;
            case 18:
                return RICH_SYMBOL;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mbm.s;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
