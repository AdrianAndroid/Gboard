package defpackage;

/* compiled from: PG */
/* renamed from: kfq  reason: default package */
/* loaded from: classes.dex */
public final class kfq implements kco {
    public final lfb a;
    public final boolean b;
    public final int c;
    private final int d;

    public kfq() {
    }

    public kfq(int i, int i2, lfb lfbVar, boolean z) {
        this.c = i;
        this.d = i2;
        this.a = lfbVar;
        this.b = z;
    }

    public static kfp c() {
        kfp kfpVar = new kfp((byte[]) null);
        kfpVar.a = 3;
        kfpVar.e = ldu.a;
        kfpVar.b = true;
        kfpVar.c = (byte) 31;
        kfpVar.d = 1;
        return kfpVar;
    }

    @Override // defpackage.kco
    public final int a() {
        return this.d;
    }

    @Override // defpackage.kco
    public final boolean b() {
        return this.c == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kfq)) {
            return false;
        }
        kfq kfqVar = (kfq) obj;
        int i = this.c;
        int i2 = kfqVar.c;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.d == kfqVar.d && this.a.equals(kfqVar.a) && this.b == kfqVar.b;
    }

    public final int hashCode() {
        int i = this.c;
        kcp.b(i);
        int i2 = 1237;
        int i3 = (((((((((((i ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003;
        if (true == this.b) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.d;
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        return "MemoryConfigurations{enablement=" + kcp.a(i) + ", rateLimitPerSecond=" + i2 + ", recordMetricPerProcess=false, metricExtensionProvider=" + valueOf + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + z + "}";
    }
}
