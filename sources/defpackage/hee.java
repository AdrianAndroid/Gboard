package defpackage;

/* compiled from: PG */
/* renamed from: hee  reason: default package */
/* loaded from: classes.dex */
public final class hee {
    public static final hee a = a("", 0, 0);
    public final String b;
    public final int c;
    public final int d;

    public hee(String str, int i, int i2) {
        if (str != null) {
            this.b = str;
            this.c = i;
            this.d = i2;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public static hee a(String str, int i, int i2) {
        return new hee(str, i, i2);
    }

    public final hee b(String str) {
        return this.b.equals(str) ? this : a(str, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hee) {
            hee heeVar = (hee) obj;
            if (this.b.equals(heeVar.b) && this.c == heeVar.c && this.d == heeVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        String str = this.b;
        int i = this.c;
        int i2 = this.d;
        return "DrawParams{text=" + str + ", width=" + i + ", height=" + i2 + "}";
    }

    public hee() {
    }
}
