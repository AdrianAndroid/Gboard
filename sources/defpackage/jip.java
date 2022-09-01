package defpackage;

/* compiled from: PG */
/* renamed from: jip  reason: default package */
/* loaded from: classes.dex */
public enum jip implements nfp {
    NONE(0),
    SUBSCRIBED(1),
    DOWNLOAD_IN_PROGRESS(2),
    DOWNLOAD_FAILED(3),
    DOWNLOAD_COMPLETE(4),
    CORRUPTED(6),
    INTERNAL_ERROR(5);
    
    public final int h;

    jip(int i2) {
        this.h = i2;
    }

    public static jip b(int i2) {
        switch (i2) {
            case 0:
                return NONE;
            case 1:
                return SUBSCRIBED;
            case 2:
                return DOWNLOAD_IN_PROGRESS;
            case 3:
                return DOWNLOAD_FAILED;
            case 4:
                return DOWNLOAD_COMPLETE;
            case 5:
                return INTERNAL_ERROR;
            case 6:
                return CORRUPTED;
            default:
                return null;
        }
    }

    public static nfq c() {
        return jih.f;
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
