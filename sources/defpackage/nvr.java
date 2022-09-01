package defpackage;

/* compiled from: PG */
/* renamed from: nvr  reason: default package */
/* loaded from: classes2.dex */
public enum nvr {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);
    
    public final int r;
    public final byte[] s;

    nvr(int i) {
        this.r = i;
        this.s = Integer.toString(i).getBytes(lel.a);
    }

    public final nvu b() {
        return (nvu) nvu.a.get(this.r);
    }
}
