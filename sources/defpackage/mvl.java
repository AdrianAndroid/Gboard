package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mvl  reason: default package */
/* loaded from: classes2.dex */
public enum mvl implements nfp {
    UNKNOWN(0),
    MAIN(1),
    CONTACTS(2),
    USER_HISTORY(3),
    PERSONAL_DICTIONARY(4),
    DICTIONARY_METADATA_JSON(5),
    SHORTCUT(6),
    EMOJI_SHORTCUT(17),
    BLOCKLIST(7),
    ICING_SENT(8),
    PERSONALIZED_LSTM(12),
    EMOJI_ANNOTATION(15),
    ICING_RECEIVED(16),
    CONTEXTUAL(19),
    EMAIL(20),
    APP_INDEXING(22),
    CRANK_PIE_NWP(23),
    CRANK_PIE_EMOJI(24),
    CRANK_TFLITE_MWP(28),
    TFLITE_KEY_CORRECTION(29),
    NEURAL_RESCORING(30),
    TFLITE_COMMON_KEY_CORRECTION(31),
    TFLITE_SPACEBAR_CORRECTION(32),
    SPELLCHECKER(33),
    GESTURE_RANKING(34),
    TRANSFORMER_LM(9);
    
    public final int A;

    mvl(int i) {
        this.A = i;
    }

    public static mvl b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return MAIN;
            case 2:
                return CONTACTS;
            case 3:
                return USER_HISTORY;
            case 4:
                return PERSONAL_DICTIONARY;
            case 5:
                return DICTIONARY_METADATA_JSON;
            case 6:
                return SHORTCUT;
            case 7:
                return BLOCKLIST;
            case 8:
                return ICING_SENT;
            case 9:
                return TRANSFORMER_LM;
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 18:
            case 21:
            case 25:
            case 26:
            case 27:
            default:
                return null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return PERSONALIZED_LSTM;
            case 15:
                return EMOJI_ANNOTATION;
            case 16:
                return ICING_RECEIVED;
            case 17:
                return EMOJI_SHORTCUT;
            case 19:
                return CONTEXTUAL;
            case 20:
                return EMAIL;
            case 22:
                return APP_INDEXING;
            case 23:
                return CRANK_PIE_NWP;
            case 24:
                return CRANK_PIE_EMOJI;
            case 28:
                return CRANK_TFLITE_MWP;
            case 29:
                return TFLITE_KEY_CORRECTION;
            case 30:
                return NEURAL_RESCORING;
            case 31:
                return TFLITE_COMMON_KEY_CORRECTION;
            case 32:
                return TFLITE_SPACEBAR_CORRECTION;
            case 33:
                return SPELLCHECKER;
            case 34:
                return GESTURE_RANKING;
        }
    }

    public static nfq c() {
        return msb.s;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
