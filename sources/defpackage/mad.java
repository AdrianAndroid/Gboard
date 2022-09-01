package defpackage;

/* compiled from: PG */
/* renamed from: mad  reason: default package */
/* loaded from: classes.dex */
public enum mad implements nfp {
    DYNAMIC_COLOR_UNKNOWN(0),
    DYNAMIC_COLOR_RED(1),
    DYNAMIC_COLOR_GREEN(2),
    DYNAMIC_COLOR_BLUE(3),
    DYNAMIC_COLOR_MAGENTA(4),
    DYNAMIC_COLOR_YELLOW(5);
    
    public final int g;

    mad(int i) {
        this.g = i;
    }

    public static mad b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DYNAMIC_COLOR_RED;
            }
            if (i == 2) {
                return DYNAMIC_COLOR_GREEN;
            }
            if (i == 3) {
                return DYNAMIC_COLOR_BLUE;
            }
            if (i == 4) {
                return DYNAMIC_COLOR_MAGENTA;
            }
            if (i == 5) {
                return DYNAMIC_COLOR_YELLOW;
            }
            return null;
        }
        return DYNAMIC_COLOR_UNKNOWN;
    }

    public static nfq c() {
        return jih.n;
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
