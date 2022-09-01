package defpackage;

/* compiled from: PG */
/* renamed from: mas  reason: default package */
/* loaded from: classes.dex */
public enum mas implements nfp {
    DEFAULT_COMPLETED(0),
    NO_IDENTIFIED_LANG_RESULT(1),
    EXCEPTION_ENCOUNTER(2),
    LOAD_MODEL_FAILED(3),
    EMPTY_TEXT_TO_IDENTIFY(4),
    NOT_PERFORM_DETECTION(5),
    ONLY_SENTENCE_RESULT(6);
    
    public final int h;

    mas(int i2) {
        this.h = i2;
    }

    public static mas b(int i2) {
        switch (i2) {
            case 0:
                return DEFAULT_COMPLETED;
            case 1:
                return NO_IDENTIFIED_LANG_RESULT;
            case 2:
                return EXCEPTION_ENCOUNTER;
            case 3:
                return LOAD_MODEL_FAILED;
            case 4:
                return EMPTY_TEXT_TO_IDENTIFY;
            case 5:
                return NOT_PERFORM_DETECTION;
            case 6:
                return ONLY_SENTENCE_RESULT;
            default:
                return null;
        }
    }

    public static nfq c() {
        return jih.t;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
