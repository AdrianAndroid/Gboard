package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mov  reason: default package */
/* loaded from: classes2.dex */
public final class mov implements Closeable {
    public long e;
    public int f;
    public String g;
    private final Reader j;
    private int[] n;
    public boolean a = false;
    public final char[] b = new char[1024];
    public int c = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    public int d = 0;
    public int h = 1;
    private String[] o = new String[32];
    public int[] i = new int[32];

    public mov(Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        iArr[0] = 6;
        this.j = reader;
    }

    private final int q(boolean z) {
        char[] cArr = this.b;
        int i = this.c;
        int i2 = this.k;
        while (true) {
            if (i == i2) {
                this.c = i;
                if (!v(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(e()));
                    }
                    return -1;
                }
                i = this.c;
                i2 = this.k;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.l++;
                this.m = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.c = i3;
                    if (i3 == i2) {
                        this.c = i3 - 1;
                        boolean v = v(2);
                        this.c++;
                        if (!v) {
                            return 47;
                        }
                    }
                    s();
                    int i4 = this.c;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.c = i4 + 1;
                        while (true) {
                            if (this.c + 2 <= this.k || v(2)) {
                                char[] cArr2 = this.b;
                                int i5 = this.c;
                                if (cArr2[i5] != '\n') {
                                    for (int i6 = 0; i6 < 2; i6++) {
                                        if (this.b[this.c + i6] == "*/".charAt(i6)) {
                                        }
                                    }
                                    i = 2 + this.c;
                                    i2 = this.k;
                                    break;
                                }
                                this.l++;
                                this.m = i5 + 1;
                                this.c++;
                            } else {
                                throw r("Unterminated comment");
                            }
                        }
                    } else if (c2 != '/') {
                        return 47;
                    } else {
                        this.c = i4 + 1;
                        u();
                        i = this.c;
                        i2 = this.k;
                    }
                } else if (c != '#') {
                    this.c = i3;
                    return c;
                } else {
                    this.c = i3;
                    s();
                    u();
                    i = this.c;
                    i2 = this.k;
                }
            }
            i = i3;
        }
    }

    private final IOException r(String str) {
        throw new mow(str.concat(e()));
    }

    private final void s() {
        if (this.a) {
            return;
        }
        throw r("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void t(int i) {
        int i2 = this.h;
        int[] iArr = this.n;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.n = Arrays.copyOf(iArr, i3);
            this.i = Arrays.copyOf(this.i, i3);
            this.o = (String[]) Arrays.copyOf(this.o, i3);
        }
        int[] iArr2 = this.n;
        int i4 = this.h;
        this.h = i4 + 1;
        iArr2[i4] = i;
    }

    private final void u() {
        char c;
        do {
            if (this.c >= this.k && !v(1)) {
                return;
            }
            char[] cArr = this.b;
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            c = cArr[i];
            if (c == '\n') {
                this.l++;
                this.m = i2;
                return;
            }
        } while (c != '\r');
    }

    private final boolean v(int i) {
        int i2;
        char[] cArr = this.b;
        int i3 = this.m;
        int i4 = this.c;
        this.m = i3 - i4;
        int i5 = this.k;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.k = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.k = 0;
        }
        this.c = 0;
        do {
            Reader reader = this.j;
            int i7 = this.k;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.k + read;
            this.k = i2;
            if (this.l == 0 && this.m == 0 && i2 > 0 && cArr[0] == 65279) {
                this.c++;
                this.m = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean w(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        s();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0220, code lost:
        if (w(r1) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019f, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0224, code lost:
        if (r9 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0226, code lost:
        if (r15 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x022c, code lost:
        if (r11 != Long.MIN_VALUE) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x022e, code lost:
        if (r16 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0237, code lost:
        if (r11 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0239, code lost:
        if (r14 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023f, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0240, code lost:
        r19.e = r11;
        r19.c += r10;
        r19.d = 15;
        r14 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x023c, code lost:
        if (r14 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0231, code lost:
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x024e, code lost:
        r1 = 2;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0250, code lost:
        if (r9 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0253, code lost:
        if (r9 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0256, code lost:
        if (r9 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0258, code lost:
        r19.f = r10;
        r19.d = 16;
        r14 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0287 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mov.a():int");
    }

    public final int b() {
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        if (i == 15) {
            long j = this.e;
            int i2 = (int) j;
            if (j == i2) {
                this.d = 0;
                int[] iArr = this.i;
                int i3 = this.h - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.e + e());
        }
        if (i == 16) {
            char[] cArr = this.b;
            int i4 = this.c;
            int i5 = this.f;
            this.g = new String(cArr, i4, i5);
            this.c = i4 + i5;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.g = i();
            } else {
                this.g = g(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.g);
                this.d = 0;
                int[] iArr2 = this.i;
                int i6 = this.h - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + ((Object) msc.h(p())) + e());
        }
        this.d = 11;
        double parseDouble = Double.parseDouble(this.g);
        int i7 = (int) parseDouble;
        if (i7 == parseDouble) {
            this.g = null;
            this.d = 0;
            int[] iArr3 = this.i;
            int i8 = this.h - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        }
        throw new NumberFormatException("Expected an int but was " + this.g + e());
    }

    public final long c() {
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        if (i == 15) {
            this.d = 0;
            int[] iArr = this.i;
            int i2 = this.h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.e;
        }
        if (i == 16) {
            char[] cArr = this.b;
            int i3 = this.c;
            int i4 = this.f;
            this.g = new String(cArr, i3, i4);
            this.c = i3 + i4;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.g = i();
            } else {
                this.g = g(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.g);
                this.d = 0;
                int[] iArr2 = this.i;
                int i5 = this.h - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + ((Object) msc.h(p())) + e());
        }
        this.d = 11;
        double parseDouble = Double.parseDouble(this.g);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.g = null;
            this.d = 0;
            int[] iArr3 = this.i;
            int i6 = this.h - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.g + e());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d = 0;
        this.n[0] = 8;
        this.h = 1;
        this.j.close();
    }

    public final String d() {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.h; i++) {
            int i2 = this.n[i];
            if (i2 == 1 || i2 == 2) {
                int i3 = this.i[i];
                sb.append('[');
                sb.append(i3);
                sb.append(']');
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                sb.append('.');
                String str = this.o[i];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final String e() {
        int i = this.l;
        int i2 = this.c;
        int i3 = this.m;
        return " at line " + (i + 1) + " column " + ((i2 - i3) + 1) + " path " + d();
    }

    public final String f() {
        String g;
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        if (i == 14) {
            g = i();
        } else if (i == 12) {
            g = g('\'');
        } else if (i == 13) {
            g = g('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + ((Object) msc.h(p())) + e());
        }
        this.d = 0;
        this.o[this.h - 1] = g;
        return g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x011c, code lost:
        if (r1 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x011e, code lost:
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x012b, code lost:
        r1.append(r0, r3, r2 - r3);
        r10.c = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e5, code lost:
        throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(r5, r10.c, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g(char r11) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mov.g(char):java.lang.String");
    }

    public final String h() {
        String str;
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        if (i == 10) {
            str = i();
        } else if (i == 8) {
            str = g('\'');
        } else if (i == 9) {
            str = g('\"');
        } else if (i == 11) {
            str = this.g;
            this.g = null;
        } else if (i == 15) {
            str = Long.toString(this.e);
        } else if (i == 16) {
            str = new String(this.b, this.c, this.f);
            this.c += this.f;
        } else {
            throw new IllegalStateException("Expected a string but was " + ((Object) msc.h(p())) + e());
        }
        this.d = 0;
        int[] iArr = this.i;
        int i2 = this.h - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0048, code lost:
        s();
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r5.c
            int r3 = r3 + r2
            int r4 = r5.k
            if (r3 >= r4) goto L4c
            char[] r4 = r5.b
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.s()
            goto L58
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r5.v(r3)
            if (r3 != 0) goto L3
        L58:
            r1 = r2
            goto L7a
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            char[] r3 = r5.b
            int r4 = r5.c
            r0.append(r3, r4, r2)
            int r3 = r5.c
            int r3 = r3 + r2
            r5.c = r3
            r2 = 1
            boolean r2 = r5.v(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L86
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.b
            int r3 = r5.c
            r0.<init>(r2, r3, r1)
            goto L91
        L86:
            char[] r2 = r5.b
            int r3 = r5.c
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L91:
            int r2 = r5.c
            int r2 = r2 + r1
            r5.c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mov.i():java.lang.String");
    }

    public final void j() {
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        if (i == 3) {
            t(1);
            this.i[this.h - 1] = 0;
            this.d = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ((Object) msc.h(p())) + e());
    }

    public final void k() {
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        if (i == 1) {
            t(3);
            this.d = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ((Object) msc.h(p())) + e());
    }

    public final void l() {
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        if (i == 4) {
            int i2 = this.h - 1;
            this.h = i2;
            int[] iArr = this.i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.d = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + ((Object) msc.h(p())) + e());
    }

    public final void m() {
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        if (i == 2) {
            int i2 = this.h - 1;
            this.h = i2;
            this.o[i2] = null;
            int[] iArr = this.i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.d = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + ((Object) msc.h(p())) + e());
    }

    public final boolean n() {
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean o() {
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        if (i == 5) {
            this.d = 0;
            int[] iArr = this.i;
            int i2 = this.h - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.d = 0;
            int[] iArr2 = this.i;
            int i3 = this.h - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + ((Object) msc.h(p())) + e());
        }
    }

    public final int p() {
        int i = this.d;
        if (i == 0) {
            i = a();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(e());
    }
}
