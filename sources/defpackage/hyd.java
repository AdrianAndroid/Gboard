package defpackage;

/* compiled from: PG */
/* renamed from: hyd  reason: default package */
/* loaded from: classes.dex */
public enum hyd implements nfp {
    JAVA_DEFAULT_EXCEPTION(0),
    JAVA_ERROR(1),
    JAVA_OUT_OF_MEMORY(2),
    NATIVE_UNKNOWN(3),
    NATIVE_SEGMENTATION_FAULT(4),
    NATIVE_ABORT(5),
    NATIVE_ANR(6);
    
    public final int h;

    hyd(int i2) {
        this.h = i2;
    }

    public static hyd b(int i2) {
        switch (i2) {
            case 0:
                return JAVA_DEFAULT_EXCEPTION;
            case 1:
                return JAVA_ERROR;
            case 2:
                return JAVA_OUT_OF_MEMORY;
            case 3:
                return NATIVE_UNKNOWN;
            case 4:
                return NATIVE_SEGMENTATION_FAULT;
            case 5:
                return NATIVE_ABORT;
            case 6:
                return NATIVE_ANR;
            default:
                return null;
        }
    }

    public static nfq c() {
        return ggq.n;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
