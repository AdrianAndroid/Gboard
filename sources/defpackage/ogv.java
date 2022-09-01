package defpackage;

import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* renamed from: ogv  reason: default package */
/* loaded from: classes2.dex */
final class ogv {
    public final String a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public ogv(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    public final char a() {
        int i;
        int i2;
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 == this.b) {
            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.a)));
        }
        char c = this.g[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int b = b(i3);
                            this.c++;
                            if (b >= 128) {
                                if (b >= 192 && b <= 247) {
                                    if (b <= 223) {
                                        i = b & 31;
                                        i2 = 1;
                                    } else if (b <= 239) {
                                        i = b & 15;
                                        i2 = 2;
                                    } else {
                                        i = b & 7;
                                        i2 = 3;
                                    }
                                    for (int i4 = 0; i4 < i2; i4++) {
                                        int i5 = this.c + 1;
                                        this.c = i5;
                                        if (i5 != this.b && this.g[i5] == '\\') {
                                            int i6 = i5 + 1;
                                            this.c = i6;
                                            int b2 = b(i6);
                                            this.c++;
                                            if ((b2 & 192) == 128) {
                                                i = (i << 6) + (b2 & 63);
                                            }
                                        }
                                    }
                                    b = (char) i;
                                }
                                b = 63;
                            }
                            return (char) b;
                    }
            }
        }
        return c;
    }

    public final int b(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.b) {
            throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.a)));
        }
        char[] cArr = this.g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else if (c < 'A' || c > 'F') {
            throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.a)));
        } else {
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else if (c2 < 'A' || c2 > 'F') {
            throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.a)));
        } else {
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public final String c() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        char c3;
        int i5;
        char c4;
        char c5;
        while (true) {
            i = this.c;
            i2 = this.b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        this.c = i + 1;
        while (true) {
            i3 = this.c;
            i4 = this.b;
            if (i3 >= i4 || (c5 = this.g[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.c = i3 + 1;
        }
        if (i3 < i4) {
            this.e = i3;
            if (this.g[i3] == ' ') {
                while (true) {
                    i3 = this.c;
                    i5 = this.b;
                    if (i3 >= i5 || (c4 = this.g[i3]) == '=' || c4 != ' ') {
                        break;
                    }
                    this.c = i3 + 1;
                }
                if (this.g[i3] != '=' || i3 == i5) {
                    throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.a)));
                }
            }
            this.c = i3 + 1;
            while (true) {
                int i6 = this.c;
                if (i6 >= this.b || this.g[i6] != ' ') {
                    break;
                }
                this.c = i6 + 1;
            }
            int i7 = this.e;
            int i8 = this.d;
            if (i7 - i8 > 4) {
                char[] cArr = this.g;
                if (cArr[i8 + 3] == '.' && (((c = cArr[i8]) == 'O' || c == 'o') && (((c2 = cArr[i8 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i8 + 2]) == 'D' || c3 == 'd')))) {
                    i8 += 4;
                    this.d = i8;
                }
            }
            return new String(this.g, i8, i7 - i8);
        }
        throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.a)));
    }
}
