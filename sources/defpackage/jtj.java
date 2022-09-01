package defpackage;

/* compiled from: PG */
/* renamed from: jtj  reason: default package */
/* loaded from: classes.dex */
public final class jtj {
    public final String a;
    public final int b;
    public final int c;
    public final char d;
    public final boolean e;
    public final boolean f;

    public jtj() {
    }

    public jtj(String str, int i, int i2, char c, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = c;
        this.e = z;
        this.f = z2;
    }

    public static jti a() {
        jti jtiVar = new jti();
        jtiVar.c = (byte) (jtiVar.c | 1);
        jtiVar.b((char) 0);
        jtiVar.b = true;
        jtiVar.c = (byte) (jtiVar.c | 16);
        jtiVar.e(0);
        jtiVar.c(false);
        jtiVar.d(Integer.MAX_VALUE);
        return jtiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtj) {
            jtj jtjVar = (jtj) obj;
            String str = this.a;
            if (str != null ? str.equals(jtjVar.a) : jtjVar.a == null) {
                if (this.b == jtjVar.b && this.c == jtjVar.c && this.d == jtjVar.d && this.e == jtjVar.e && this.f == jtjVar.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 1237;
        int hashCode = ((((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * (-721379959)) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        char c = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        return "Column{name=" + str + ", width=0, minWidth=" + i + ", maxWidth=" + i2 + ", border=" + c + ", autoWidth=" + z + ", leftAligned=" + z2 + "}";
    }
}
