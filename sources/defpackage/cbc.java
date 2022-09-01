package defpackage;

/* compiled from: PG */
/* renamed from: cbc  reason: default package */
/* loaded from: classes.dex */
public final class cbc {
    public final Integer a;
    public final Integer b;

    public cbc() {
    }

    public cbc(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public static cbc a(Integer num, Integer num2) {
        return new cbc(num, num2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbc) {
            cbc cbcVar = (cbc) obj;
            if (this.a.equals(cbcVar.a) && this.b.equals(cbcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Integer num = this.a;
        Integer num2 = this.b;
        return "ResIdVersionTuple{resId=" + num + ", version=" + num2 + "}";
    }
}
