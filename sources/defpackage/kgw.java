package defpackage;

/* compiled from: PG */
/* renamed from: kgw  reason: default package */
/* loaded from: classes.dex */
public final class kgw {
    public int a;
    public float b;
    public lfb c;
    public byte d;
    public int e;

    public kgw() {
    }

    public kgw(byte[] bArr) {
        this.c = ldu.a;
    }

    public final kgx a() {
        int i;
        boolean z = true;
        if (this.d != 3 || (i = this.e) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.e == 0) {
                sb.append(" enablement");
            }
            if ((this.d & 1) == 0) {
                sb.append(" rateLimitPerSecond");
            }
            if ((this.d & 2) == 0) {
                sb.append(" samplingProbability");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        kgx kgxVar = new kgx(i, this.a, this.b, this.c);
        jdg.G(true, "Rate limit per second must be >= 0");
        float f = kgxVar.a;
        if (f <= 0.0f || f > 1.0f) {
            z = false;
        }
        jdg.G(z, "Sampling Probability shall be > 0 and <= 1");
        return kgxVar;
    }

    public final void b() {
        this.e = 2;
    }
}
