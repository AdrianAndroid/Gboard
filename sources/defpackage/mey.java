package defpackage;

/* compiled from: PG */
/* renamed from: mey  reason: default package */
/* loaded from: classes.dex */
public enum mey implements nfp {
    UNKNOWN(0),
    AVAILABLE(1),
    HIDDEN_INCOGNITO_MODE(2),
    HIDDEN_EDITOR_NO_MIC_IME_OPTION(3),
    HIDDEN_VOICE_INPUT_UNAVAILABLE(4),
    HIDDEN_SETTING_OFF(5),
    HIDDEN_EMAIL_INPUT_TYPE(6),
    HIDDEN_PASSWORD_NUMBER_DATE_INPUT_TYPE(7),
    HIDDEN_INTERNAL_FIELD(8);
    
    public final int j;

    mey(int i) {
        this.j = i;
    }

    public static mey b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return AVAILABLE;
            case 2:
                return HIDDEN_INCOGNITO_MODE;
            case 3:
                return HIDDEN_EDITOR_NO_MIC_IME_OPTION;
            case 4:
                return HIDDEN_VOICE_INPUT_UNAVAILABLE;
            case 5:
                return HIDDEN_SETTING_OFF;
            case 6:
                return HIDDEN_EMAIL_INPUT_TYPE;
            case 7:
                return HIDDEN_PASSWORD_NUMBER_DATE_INPUT_TYPE;
            case 8:
                return HIDDEN_INTERNAL_FIELD;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mdw.o;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
