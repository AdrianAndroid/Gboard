package defpackage;

/* compiled from: PG */
/* renamed from: mdi  reason: default package */
/* loaded from: classes.dex */
public enum mdi implements nfp {
    UNKNOWN(0),
    ZERO(1),
    INTERSTITIAL(2),
    NO_SUGGESTIONS_ERROR(3),
    RETRYABLE_ERROR(4),
    DISPLAY_CONTENT(5);
    
    private final int g;

    mdi(int i) {
        this.g = i;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
