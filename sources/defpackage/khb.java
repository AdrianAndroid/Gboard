package defpackage;

/* compiled from: PG */
/* renamed from: khb  reason: default package */
/* loaded from: classes.dex */
public final class khb implements kco {
    private final int a;
    private final lfb b;
    private final boolean c;
    private final int d;
    private final kfl e;

    public khb() {
    }

    public khb(kfl kflVar, lfb lfbVar, byte[] bArr, byte[] bArr2) {
        this.d = 2;
        this.a = 10;
        this.e = kflVar;
        this.b = lfbVar;
        this.c = true;
    }

    @Override // defpackage.kco
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kco
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof khb)) {
            return false;
        }
        khb khbVar = (khb) obj;
        int i = this.d;
        int i2 = khbVar.d;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == khbVar.a && this.e.equals(khbVar.e) && this.b.equals(khbVar.b) && this.c == khbVar.c;
    }

    public final int hashCode() {
        int i = this.d;
        kcp.b(i);
        return ((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.d;
        int i2 = this.a;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        return "TikTokTraceConfigurations{enablement=" + kcp.a(i) + ", rateLimitPerSecond=" + i2 + ", dynamicSampler=" + valueOf + ", traceMetricExtensionProvider=" + valueOf2 + ", recordTimerDuration=" + z + "}";
    }
}
