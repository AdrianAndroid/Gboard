package defpackage;

/* compiled from: PG */
/* renamed from: kgx  reason: default package */
/* loaded from: classes.dex */
public final class kgx implements kco {
    public final float a;
    private final int b;
    private final lfb c;
    private final int d;

    public kgx() {
    }

    public kgx(int i, int i2, float f, lfb lfbVar) {
        this.d = i;
        this.b = i2;
        this.a = f;
        this.c = lfbVar;
    }

    public static final kgw c() {
        kgw kgwVar = new kgw(null);
        kgwVar.a = 10;
        kgwVar.b = 1.0f;
        kgwVar.d = (byte) 3;
        kgwVar.c = ldu.a;
        kgwVar.e = 1;
        return kgwVar;
    }

    @Override // defpackage.kco
    public final int a() {
        return this.b;
    }

    @Override // defpackage.kco
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kgx)) {
            return false;
        }
        kgx kgxVar = (kgx) obj;
        int i = this.d;
        int i2 = kgxVar.d;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.b == kgxVar.b && Float.floatToIntBits(this.a) == Float.floatToIntBits(kgxVar.a) && this.c.equals(kgxVar.c);
    }

    public final int hashCode() {
        int i = this.d;
        kcp.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        int i = this.d;
        int i2 = this.b;
        float f = this.a;
        String valueOf = String.valueOf(this.c);
        return "TimerConfigurations{enablement=" + kcp.a(i) + ", rateLimitPerSecond=" + i2 + ", samplingProbability=" + f + ", perEventConfigurationFlags=" + valueOf + "}";
    }
}
