package defpackage;

/* compiled from: PG */
/* renamed from: hjz  reason: default package */
/* loaded from: classes.dex */
public final class hjz {
    public byte a;
    private long b;
    private long c;
    private long d;

    public hjz() {
    }

    public hjz(hka hkaVar) {
        this.b = hkaVar.a;
        this.c = hkaVar.b;
        this.d = hkaVar.c;
        this.a = Byte.MAX_VALUE;
    }

    public final hka a() {
        if (this.a != Byte.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            if ((this.a & 1) == 0) {
                sb.append(" desiredDisplayTimeMillis");
            }
            if ((this.a & 2) == 0) {
                sb.append(" startDisplayTimeMillis");
            }
            if ((this.a & 4) == 0) {
                sb.append(" desiredDismissTimeMillis");
            }
            if ((this.a & 8) == 0) {
                sb.append(" lastPausedTimeMillis");
            }
            if ((this.a & 16) == 0) {
                sb.append(" lastResumeTimeMillis");
            }
            if ((this.a & 32) == 0) {
                sb.append(" totalDisplayTimeBeforeLastPause");
            }
            if ((this.a & 64) == 0) {
                sb.append(" isPaused");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new hka(this.b, this.c, this.d);
    }

    public final void b(long j) {
        this.d = j;
        this.a = (byte) (this.a | 4);
    }

    public final void c(long j) {
        this.b = j;
        this.a = (byte) (this.a | 1);
    }

    public final void d(long j) {
        this.c = j;
        this.a = (byte) (this.a | 2);
    }
}
