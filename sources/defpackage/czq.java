package defpackage;

/* compiled from: PG */
/* renamed from: czq  reason: default package */
/* loaded from: classes.dex */
public final class czq {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public czq() {
    }

    public czq(String str, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static czp a() {
        return new czp();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czq) {
            czq czqVar = (czq) obj;
            if (this.a.equals(czqVar.a) && this.b == czqVar.b && this.c == czqVar.c && this.d == czqVar.d && this.e == czqVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        return "DynamicArtLineInfo{name=" + str + ", charMin=" + i + ", charMax=" + i2 + ", fontMin=" + i3 + ", fontMax=" + i4 + "}";
    }
}
