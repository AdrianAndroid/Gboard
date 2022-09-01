package defpackage;

/* compiled from: PG */
/* renamed from: kfk  reason: default package */
/* loaded from: classes.dex */
public final class kfk implements kco {
    private final int a;
    private final int b;

    public kfk() {
    }

    public kfk(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public static final kfj c() {
        kfj kfjVar = new kfj();
        kfjVar.a = 10;
        kfjVar.b = (byte) 1;
        kfjVar.c = 1;
        return kfjVar;
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
        if (!(obj instanceof kfk)) {
            return false;
        }
        kfk kfkVar = (kfk) obj;
        int i = this.b;
        int i2 = kfkVar.b;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == kfkVar.a;
    }

    public final int hashCode() {
        int i = this.b;
        kcp.b(i);
        return ((i ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.a;
        return "JankConfigurations{enablement=" + kcp.a(i) + ", rateLimitPerSecond=" + i2 + "}";
    }
}
