package defpackage;

/* compiled from: PG */
/* renamed from: ool  reason: default package */
/* loaded from: classes2.dex */
public enum ool implements nfp {
    UNKNOWN(0),
    CREDENTIAL_ENCRYPTED(1),
    DEVICE_ENCRYPTED(2);
    
    public final int d;

    ool(int i) {
        this.d = i;
    }

    public static ool b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CREDENTIAL_ENCRYPTED;
            }
            if (i == 2) {
                return DEVICE_ENCRYPTED;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static nfq c() {
        return ons.i;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
