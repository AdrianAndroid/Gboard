package defpackage;

/* compiled from: PG */
/* renamed from: jxy  reason: default package */
/* loaded from: classes.dex */
public enum jxy implements nfp {
    DOWNLOAD_STOP_REASON_UNSPECIFIED(0),
    CANCELLATION(1),
    JOB_STOPPED(2),
    PARAMETERS_CHANGED(3),
    PREEMPTED(4),
    UNRECOGNIZED(-1);
    
    private final int g;

    jxy(int i) {
        this.g = i;
    }

    @Override // defpackage.nfp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
