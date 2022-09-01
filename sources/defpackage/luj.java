package defpackage;

/* compiled from: PG */
/* renamed from: luj  reason: default package */
/* loaded from: classes.dex */
public final class luj {
    public static final luj a;
    private static final long e;
    public final int b;
    public final int c;
    public final int d;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        e = j;
        a = new luj(0, -1, -1);
    }

    public luj(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(String str, boolean z) {
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int g = g(str.charAt(i2));
            if (g < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << g;
        }
        return i;
    }

    private static int g(char c) {
        return ((int) ((e >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    private static int h(String str, int i, int i2) {
        if (i != i2) {
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                char charAt = (char) (str.charAt(i4) - '0');
                if (charAt >= '\n') {
                    throw lxd.a("invalid precision character", str, i4);
                }
                i3 = (i3 * 10) + charAt;
                if (i3 > 999999) {
                    throw lxd.b("precision too large", str, i, i2);
                }
            }
            if (i3 != 0) {
                return i3;
            }
            if (i2 != i + 1) {
                throw lxd.b("invalid precision", str, i, i2);
            }
            return 0;
        }
        throw lxd.a("missing precision", str, i - 1);
    }

    public final boolean c() {
        return this == a;
    }

    public final boolean d() {
        return (this.b & 128) != 0;
    }

    public final boolean e(int i, boolean z) {
        int i2;
        if (c()) {
            return true;
        }
        int i3 = this.b;
        if (((i ^ (-1)) & i3) != 0) {
            return false;
        }
        if (!z && this.d != -1) {
            return false;
        }
        int i4 = this.c;
        if ((i3 & 9) == 9 || (i2 = i3 & 96) == 96) {
            return false;
        }
        return i2 == 0 || i4 != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luj) {
            luj lujVar = (luj) obj;
            if (lujVar.b == this.b && lujVar.c == this.c && lujVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final void f(StringBuilder sb) {
        if (!c()) {
            int i = this.b & (-129);
            int i2 = 0;
            while (true) {
                int i3 = 1 << i2;
                if (i3 > i) {
                    break;
                }
                if ((i3 & i) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            int i4 = this.c;
            if (i4 != -1) {
                sb.append(i4);
            }
            if (this.d == -1) {
                return;
            }
            sb.append('.');
            sb.append(this.d);
        }
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public static luj b(String str, int i, int i2, boolean z) {
        if (i != i2 || z) {
            int i3 = true != z ? 0 : 128;
            while (i != i2) {
                int i4 = i + 1;
                char charAt = str.charAt(i);
                if (charAt < ' ' || charAt > '0') {
                    int i5 = i4 - 1;
                    if (charAt <= '9') {
                        int i6 = charAt - '0';
                        while (i4 != i2) {
                            int i7 = i4 + 1;
                            char charAt2 = str.charAt(i4);
                            if (charAt2 == '.') {
                                return new luj(i3, i6, h(str, i7, i2));
                            }
                            char c = (char) (charAt2 - '0');
                            if (c >= '\n') {
                                throw lxd.a("invalid width character", str, i7 - 1);
                            }
                            i6 = (i6 * 10) + c;
                            if (i6 > 999999) {
                                throw lxd.b("width too large", str, i5, i2);
                            }
                            i4 = i7;
                        }
                        return new luj(i3, i6, -1);
                    }
                    throw lxd.a("invalid flag", str, i5);
                }
                int g = g(charAt);
                if (g < 0) {
                    if (charAt == '.') {
                        return new luj(i3, -1, h(str, i4, i2));
                    }
                    throw lxd.a("invalid flag", str, i4 - 1);
                }
                int i8 = 1 << g;
                if ((i3 & i8) != 0) {
                    throw lxd.a("repeated flag", str, i4 - 1);
                }
                i3 |= i8;
                i = i4;
            }
            return new luj(i3, -1, -1);
        }
        return a;
    }
}
