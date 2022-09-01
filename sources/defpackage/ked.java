package defpackage;

/* compiled from: PG */
/* renamed from: ked  reason: default package */
/* loaded from: classes.dex */
public final class ked implements kco {
    public final float a;
    private final int b;

    public ked() {
    }

    public ked(int i, float f) {
        this.b = i;
        this.a = f;
    }

    public static final khd c() {
        khd khdVar = new khd();
        khdVar.a = 100.0f;
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
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ked)) {
            return false;
        }
        ked kedVar = (ked) obj;
        int i = this.b;
        int i2 = kedVar.b;
        if (i == 0) {
            throw null;
        }
        return i == i2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(kedVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        kcp.b(i);
        return (((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003;
    }

    public final String toString() {
        int i = this.b;
        float f = this.a;
        return "CrashConfigurations{enablement=" + kcp.a(i) + ", startupSamplePercentage=" + f + ", metricExtensionProvider=null}";
    }
}
