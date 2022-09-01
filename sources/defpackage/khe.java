package defpackage;

/* compiled from: PG */
/* renamed from: khe  reason: default package */
/* loaded from: classes.dex */
public final class khe implements kco {
    public final float a;
    private final int b;

    public khe() {
    }

    public khe(int i, float f) {
        this.b = i;
        this.a = f;
    }

    public static final khd c() {
        khd khdVar = new khd();
        khdVar.a = 0.5f;
        khdVar.b = (byte) 1;
        khdVar.c = 1;
        return khdVar;
    }

    @Override // defpackage.kco
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.kco
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof khe)) {
            return false;
        }
        khe kheVar = (khe) obj;
        int i = this.b;
        int i2 = kheVar.b;
        if (i == 0) {
            throw null;
        }
        return i == i2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(kheVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        kcp.b(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        int i = this.b;
        float f = this.a;
        return "TraceConfigurations{enablement=" + kcp.a(i) + ", samplingProbability=" + f + "}";
    }
}
