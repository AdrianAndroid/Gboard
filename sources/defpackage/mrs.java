package defpackage;

/* compiled from: PG */
/* renamed from: mrs  reason: default package */
/* loaded from: classes2.dex */
public enum mrs implements nfp {
    CANDIDATE_SOURCE_UNKNOWN(0),
    EXPRESSION_RULE_BASED(1),
    EXPRESSION_TRANSFORMER_CONCEPT_MODEL(2),
    TFLITE_NWP(3),
    TFLITE_MWP(4),
    EXPRESSION_TWO_TOWER_MODEL(5),
    TFLITE_LSTM_EMOJI(6),
    LITE_EMOJI_PRED(7),
    EMOJI_NEIGHBOR(8),
    TRANSFORMER_EXPRESSION_PRED(9);
    
    private final int k;

    mrs(int i) {
        this.k = i;
    }

    public static mrs b(int i) {
        switch (i) {
            case 0:
                return CANDIDATE_SOURCE_UNKNOWN;
            case 1:
                return EXPRESSION_RULE_BASED;
            case 2:
                return EXPRESSION_TRANSFORMER_CONCEPT_MODEL;
            case 3:
                return TFLITE_NWP;
            case 4:
                return TFLITE_MWP;
            case 5:
                return EXPRESSION_TWO_TOWER_MODEL;
            case 6:
                return TFLITE_LSTM_EMOJI;
            case 7:
                return LITE_EMOJI_PRED;
            case 8:
                return EMOJI_NEIGHBOR;
            case 9:
                return TRANSFORMER_EXPRESSION_PRED;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mgk.s;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
