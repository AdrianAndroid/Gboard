package defpackage;

/* compiled from: PG */
/* renamed from: hie  reason: default package */
/* loaded from: classes.dex */
public enum hie implements nfp {
    DEFAULT(0),
    PHENOTYPE(1),
    MANAGED_CONFIG(2),
    OEM(3),
    OVERRIDE(4),
    HERMETRIC_OVERRIDE(5);
    
    public final int g;

    hie(int i) {
        this.g = i;
    }

    public static hie b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PHENOTYPE;
            }
            if (i == 2) {
                return MANAGED_CONFIG;
            }
            if (i == 3) {
                return OEM;
            }
            if (i == 4) {
                return OVERRIDE;
            }
            if (i == 5) {
                return HERMETRIC_OVERRIDE;
            }
            return null;
        }
        return DEFAULT;
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
