package defpackage;

/* compiled from: PG */
/* renamed from: mch  reason: default package */
/* loaded from: classes.dex */
public enum mch implements nfp {
    UNKNOWN(0),
    PACKSET_EMPTY(1),
    PACKSET_EMPTY_WITH_SYNCING(2),
    PACKSET_EMPTY_WITH_INIT_NULL(3),
    PACKSET_EMPTY_WITH_INIT_DONE(4),
    GET_PACK_WITH_EXCEPTION(5);
    
    public final int g;

    mch(int i) {
        this.g = i;
    }

    public static mch b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PACKSET_EMPTY;
            }
            if (i == 2) {
                return PACKSET_EMPTY_WITH_SYNCING;
            }
            if (i == 3) {
                return PACKSET_EMPTY_WITH_INIT_NULL;
            }
            if (i == 4) {
                return PACKSET_EMPTY_WITH_INIT_DONE;
            }
            if (i == 5) {
                return GET_PACK_WITH_EXCEPTION;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static nfq c() {
        return mbm.t;
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
