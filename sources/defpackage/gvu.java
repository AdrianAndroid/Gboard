package defpackage;

/* compiled from: PG */
/* renamed from: gvu  reason: default package */
/* loaded from: classes.dex */
public enum gvu {
    BYTES(1),
    KILOBYTES(1000),
    MEGABYTES(1000000),
    GIGABYTES(1000000000),
    KIBIBYTES(1024),
    MEBIBYTES(1048576),
    GIBIBYTES(1073741824);
    
    public final long h;

    gvu(long j) {
        this.h = j;
    }

    public final long a(long j, gvu gvuVar) {
        long j2 = gvuVar.h;
        long j3 = Long.MAX_VALUE / j2;
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j >= (-j3)) {
            return (j * j2) / this.h;
        }
        return Long.MIN_VALUE;
    }

    public final long b(long j) {
        return BYTES.a(j, this);
    }

    public final long c(long j) {
        return KIBIBYTES.a(j, this);
    }

    public final long d(long j) {
        return MEBIBYTES.a(j, this);
    }
}
