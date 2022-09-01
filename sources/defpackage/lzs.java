package defpackage;

/* compiled from: PG */
/* renamed from: lzs  reason: default package */
/* loaded from: classes.dex */
public enum lzs implements nfp {
    UNDEFINED(0),
    OFFLINE(1),
    UNKNOWN(2),
    NETWORK_LEVEL_NOT_MET(3),
    QUALITY_NOT_MET(4),
    QUALITY_UNKNOWN(5),
    QUALITY_MET(6),
    UNSTABLE_NOT_MET(7);
    
    private final int i;

    lzs(int i) {
        this.i = i;
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
