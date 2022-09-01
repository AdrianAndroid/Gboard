package defpackage;

/* compiled from: PG */
/* renamed from: hka  reason: default package */
/* loaded from: classes.dex */
public final class hka {
    public final long a;
    public final long b;
    public final long c;

    public hka() {
    }

    public hka(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hka) {
            hka hkaVar = (hka) obj;
            if (this.a == hkaVar.a && this.b == hkaVar.b && this.c == hkaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003)) * 1525764945) ^ 1237;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return "TooltipProperty{desiredDisplayTimeMillis=" + j + ", startDisplayTimeMillis=" + j2 + ", desiredDismissTimeMillis=" + j3 + ", lastPausedTimeMillis=0, lastResumeTimeMillis=0, totalDisplayTimeBeforeLastPause=0, isPaused=false}";
    }
}
