package defpackage;

/* compiled from: PG */
/* renamed from: gyi  reason: default package */
/* loaded from: classes.dex */
public final class gyi {
    public final Integer a;
    public final Integer b;

    public gyi() {
    }

    public gyi(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public static gyi a(Integer num, Integer num2) {
        return new gyi(num, num2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gyi) {
            gyi gyiVar = (gyi) obj;
            if (this.a.equals(gyiVar.a) && this.b.equals(gyiVar.b)) {
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
        return "ImportResultStatusTuple{status=" + num + ", count=" + num2 + "}";
    }
}
