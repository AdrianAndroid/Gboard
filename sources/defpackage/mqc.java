package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mqc  reason: default package */
/* loaded from: classes2.dex */
public enum mqc implements nfp {
    UNKNOWN_ENGINE(0),
    FAKE(1),
    FAKE_DEPENDENT(2),
    DELIGHT_DECODER(3),
    LSTM_NWP(4),
    PIE_NWP(5),
    PIE_EMOJI_PRED(6),
    TFLITE_NWP(7),
    HOST_APPLICATION_CANDIDATE_ENGINE(8),
    TFLITE_EMOJI_PRED(9),
    TWIDDLER_MULTIWORD(10),
    HANDWRITING_SD_RECOGNIZER(11),
    TFLITE_MWP(12),
    EXPRESSIVE_CONCEPT_EMOJI_PRED(13),
    FAKE_SLEEPING(14),
    EXPRESSIVE_CONCEPT_TRIGGERING(15),
    CONCEPT_PRED(16),
    LITE_EMOJI_PRED(17),
    TRANSFORMER_EXPRESSION_PRED(18);
    
    public final int t;

    mqc(int i) {
        this.t = i;
    }

    public static mqc b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ENGINE;
            case 1:
                return FAKE;
            case 2:
                return FAKE_DEPENDENT;
            case 3:
                return DELIGHT_DECODER;
            case 4:
                return LSTM_NWP;
            case 5:
                return PIE_NWP;
            case 6:
                return PIE_EMOJI_PRED;
            case 7:
                return TFLITE_NWP;
            case 8:
                return HOST_APPLICATION_CANDIDATE_ENGINE;
            case 9:
                return TFLITE_EMOJI_PRED;
            case 10:
                return TWIDDLER_MULTIWORD;
            case 11:
                return HANDWRITING_SD_RECOGNIZER;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return TFLITE_MWP;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return EXPRESSIVE_CONCEPT_EMOJI_PRED;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return FAKE_SLEEPING;
            case 15:
                return EXPRESSIVE_CONCEPT_TRIGGERING;
            case 16:
                return CONCEPT_PRED;
            case 17:
                return LITE_EMOJI_PRED;
            case 18:
                return TRANSFORMER_EXPRESSION_PRED;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mgk.m;
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
