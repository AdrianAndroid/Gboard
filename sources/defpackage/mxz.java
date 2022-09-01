package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mxz  reason: default package */
/* loaded from: classes2.dex */
public enum mxz implements nfp {
    EQUAL(1),
    UNEQUAL(2),
    GREATER(3),
    GREATER_OR_EQUAL(4),
    LESS(5),
    LESS_OR_EQUAL(6),
    IN(7),
    BETWEEN(8),
    GLOB(9),
    LIKE(10),
    FIND_IN_SET(11),
    DELTA_MOD_BETWEEN(12);
    
    public final int m;

    mxz(int i) {
        this.m = i;
    }

    public static mxz b(int i) {
        switch (i) {
            case 1:
                return EQUAL;
            case 2:
                return UNEQUAL;
            case 3:
                return GREATER;
            case 4:
                return GREATER_OR_EQUAL;
            case 5:
                return LESS;
            case 6:
                return LESS_OR_EQUAL;
            case 7:
                return IN;
            case 8:
                return BETWEEN;
            case 9:
                return GLOB;
            case 10:
                return LIKE;
            case 11:
                return FIND_IN_SET;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return DELTA_MOD_BETWEEN;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mxe.f;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
