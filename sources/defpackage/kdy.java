package defpackage;

/* compiled from: PG */
/* renamed from: kdy  reason: default package */
/* loaded from: classes.dex */
public final class kdy implements kco {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public kdy() {
    }

    public kdy(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }

    @Override // defpackage.kco
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.kco
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kdy)) {
            return false;
        }
        kdy kdyVar = (kdy) obj;
        int i = this.f;
        int i2 = kdyVar.f;
        if (i == 0) {
            throw null;
        }
        return i2 == 1 && this.a == kdyVar.a && this.b == kdyVar.b && this.c == kdyVar.c && this.d == kdyVar.d && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(kdyVar.e);
    }

    public final int hashCode() {
        kcp.b(this.f);
        return ((((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)));
    }

    public final String toString() {
        int i = this.f;
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = this.d;
        double d = this.e;
        return "CpuProfilingConfigurations{enablement=" + kcp.a(i) + ", maxBufferSizeBytes=" + i2 + ", sampleDurationMs=" + i3 + ", sampleDurationSkewMs=" + i4 + ", sampleFrequencyMicro=" + i5 + ", samplesPerEpoch=" + d + "}";
    }
}
