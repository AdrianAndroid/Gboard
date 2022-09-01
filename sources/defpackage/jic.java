package defpackage;

/* compiled from: PG */
/* renamed from: jic  reason: default package */
/* loaded from: classes.dex */
public enum jic implements nfp {
    UNDEFINED(0),
    SHARED_PREFERENCES_ONLY(1),
    SHARED_PREFERENCES_AND_PROTOSTORE(2),
    PROTOSTORE_ONLY(3);
    
    private final int e;

    jic(int i) {
        this.e = i;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
