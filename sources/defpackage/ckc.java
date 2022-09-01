package defpackage;

/* compiled from: PG */
/* renamed from: ckc  reason: default package */
/* loaded from: classes.dex */
public enum ckc implements nfp {
    UNKNOWN(0),
    TENOR_QUERY(1),
    EMOJI(2),
    EMOJI_KITCHEN(3),
    EMOJI_KITCHEN_MIX(4),
    CONTEXTUAL_EMOJI_KITCHEN(5),
    BITMOJI(6),
    DYNAMIC_ART(7);
    
    public final int i;

    ckc(int i) {
        this.i = i;
    }

    public static ckc b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TENOR_QUERY;
            case 2:
                return EMOJI;
            case 3:
                return EMOJI_KITCHEN;
            case 4:
                return EMOJI_KITCHEN_MIX;
            case 5:
                return CONTEXTUAL_EMOJI_KITCHEN;
            case 6:
                return BITMOJI;
            case 7:
                return DYNAMIC_ART;
            default:
                return null;
        }
    }

    public static nfq c() {
        return cgs.e;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
