package defpackage;

/* compiled from: PG */
/* renamed from: ipe  reason: default package */
/* loaded from: classes.dex */
public final class ipe {
    public static final ipe a = a().a();
    public final int b;
    public final int c;
    public final int d;

    public ipe() {
    }

    public ipe(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static ipd a() {
        ipd ipdVar = new ipd();
        ipdVar.b(0);
        ipdVar.c(0);
        ipdVar.d(0);
        return ipdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ipe) {
            ipe ipeVar = (ipe) obj;
            if (this.b == ipeVar.b && this.c == ipeVar.c && this.d == ipeVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        return "DataPolicy{ttlDays=" + i + ", maxCount=" + i2 + ", maxCountHardLimit=" + i3 + "}";
    }
}
