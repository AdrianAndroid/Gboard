package defpackage;

/* compiled from: PG */
/* renamed from: jxz  reason: default package */
/* loaded from: classes.dex */
public enum jxz implements nfp {
    FILE_DELETION_REASON_UNSPECIFIED(0),
    EXPLICIT_GC(1),
    CHILL_GC(2),
    DELETE_PACKS(3),
    RELEASE_SUPERPACK(4),
    INVALID_PACK(5),
    DELETE_FETCHED(6),
    INVALID_UNSTAGED_FILE(7),
    AGGRESSIVE_GC(8),
    MANIFEST_GC(9),
    POST_SYNC_GC(10),
    DATA_CLEAR_REQUEST(11),
    UNRECOGNIZED(-1);
    
    private final int n;

    jxz(int i) {
        this.n = i;
    }

    @Override // defpackage.nfp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
