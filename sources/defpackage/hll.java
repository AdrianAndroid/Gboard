package defpackage;

/* compiled from: PG */
/* renamed from: hll  reason: default package */
/* loaded from: classes.dex */
public final class hll {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public hll(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hll)) {
            return false;
        }
        hll hllVar = (hll) obj;
        return this.a == hllVar.a && this.b == hllVar.b && this.c == hllVar.c && this.d == hllVar.d && this.e == hllVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}
