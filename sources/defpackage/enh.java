package defpackage;

/* compiled from: PG */
/* renamed from: enh  reason: default package */
/* loaded from: classes.dex */
final class enh {
    public final Integer a;
    public final Integer b;

    public enh() {
    }

    public enh(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof enh) {
            enh enhVar = (enh) obj;
            if (this.a.equals(enhVar.a) && this.b.equals(enhVar.b)) {
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
        return "OffsetLengthTuple{offset=" + num + ", length=" + num2 + "}";
    }
}
