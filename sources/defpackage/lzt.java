package defpackage;

/* compiled from: PG */
/* renamed from: lzt  reason: default package */
/* loaded from: classes.dex */
public enum lzt implements nfp {
    UNKNOWN_STATE(0),
    PENDING(1),
    COMPLETE(2),
    ERROR(3),
    CANCELLED(4);
    
    public final int f;

    lzt(int i) {
        this.f = i;
    }

    public static lzt b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PENDING;
            }
            if (i == 2) {
                return COMPLETE;
            }
            if (i == 3) {
                return ERROR;
            }
            if (i == 4) {
                return CANCELLED;
            }
            return null;
        }
        return UNKNOWN_STATE;
    }

    public static nfq c() {
        return jih.j;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
