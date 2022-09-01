package defpackage;

/* compiled from: PG */
/* renamed from: kgt  reason: default package */
/* loaded from: classes.dex */
public final class kgt implements kco {
    public final lfb a;
    private final int b;

    public kgt() {
    }

    public kgt(int i, lfb lfbVar) {
        this.b = i;
        this.a = lfbVar;
    }

    public static final kgs c() {
        kgs kgsVar = new kgs(null);
        kgsVar.b();
        kgsVar.a = ldu.a;
        kgsVar.b = 1;
        return kgsVar;
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
        if (!(obj instanceof kgt)) {
            return false;
        }
        kgt kgtVar = (kgt) obj;
        int i = this.b;
        int i2 = kgtVar.b;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a.equals(kgtVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        kcp.b(i);
        return ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        return "StorageConfigurations{enablement=" + kcp.a(i) + ", manualCapture=false, dirStatsConfigurations=" + valueOf + "}";
    }
}
