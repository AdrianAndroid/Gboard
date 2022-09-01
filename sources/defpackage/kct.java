package defpackage;

/* compiled from: PG */
/* renamed from: kct  reason: default package */
/* loaded from: classes.dex */
public final class kct implements kco {
    private final int a;
    private final kcs b;

    public kct() {
    }

    public kct(int i, kcs kcsVar) {
        this.a = i;
        this.b = kcsVar;
    }

    public static final mhd c() {
        mhd mhdVar = new mhd();
        mhdVar.b = kcs.a;
        mhdVar.a = 1;
        return mhdVar;
    }

    @Override // defpackage.kco
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.kco
    public final boolean b() {
        return this.a == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kct)) {
            return false;
        }
        kct kctVar = (kct) obj;
        int i = this.a;
        int i2 = kctVar.a;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.b.equals(kctVar.b);
    }

    public final int hashCode() {
        int i = this.a;
        kcp.b(i);
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        return "BatteryConfigurations{enablement=" + kcp.a(i) + ", metricExtensionProvider=" + valueOf + "}";
    }
}
