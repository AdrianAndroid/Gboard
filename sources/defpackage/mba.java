package defpackage;

/* compiled from: PG */
/* renamed from: mba  reason: default package */
/* loaded from: classes.dex */
public enum mba implements nfp {
    UNKNOWN(0),
    RECENTS(1),
    CONTEXTUAL(2),
    CURATED(3);
    
    public final int e;

    mba(int i) {
        this.e = i;
    }

    public static mba b(int i) {
        if (i != 0) {
            if (i == 1) {
                return RECENTS;
            }
            if (i == 2) {
                return CONTEXTUAL;
            }
            if (i == 3) {
                return CURATED;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static nfq c() {
        return maw.h;
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
