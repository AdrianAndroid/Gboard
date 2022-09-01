package defpackage;

/* compiled from: PG */
@Deprecated
/* renamed from: eur  reason: default package */
/* loaded from: classes.dex */
public enum eur implements nfp {
    GRAVITY_BOTTOM(1),
    GRAVITY_LEFT(2),
    GRAVITY_RIGHT(3),
    GRAVITY_TOP(4);
    
    public final int e;

    eur(int i) {
        this.e = i;
    }

    public static eur b(int i) {
        if (i != 1) {
            if (i == 2) {
                return GRAVITY_LEFT;
            }
            if (i == 3) {
                return GRAVITY_RIGHT;
            }
            if (i == 4) {
                return GRAVITY_TOP;
            }
            return null;
        }
        return GRAVITY_BOTTOM;
    }

    public static nfq c() {
        return cgs.g;
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
