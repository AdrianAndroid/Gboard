package defpackage;

import java.io.EOFException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: arx  reason: default package */
/* loaded from: classes.dex */
final class arx extends arw {
    private static final ouu f = ouu.h("'\\");
    private static final ouu g = ouu.h("\"\\");
    private static final ouu h = ouu.h("{}[]:, \n\t\r\f/\\;#=");
    private static final ouu i = ouu.h("\n\r");
    private static final ouu j = ouu.h("*/");
    private final out k;
    private final our l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    public arx(out outVar) {
        this.k = outVar;
        this.l = ((ovj) outVar).b;
        l(6);
    }

    private final void A() {
        long j2 = this.k.j(h);
        our ourVar = this.l;
        if (j2 == -1) {
            j2 = ourVar.b;
        }
        ourVar.B(j2);
    }

    private final boolean B(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        x();
        return false;
    }

    private final int C(String str, azp azpVar) {
        int length = ((String[]) azpVar.a).length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(((String[]) azpVar.a)[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private final char s() {
        int i2;
        if (!this.k.D(1L)) {
            throw c("Unterminated escape sequence");
        }
        byte d = this.l.d();
        if (d == 10 || d == 34 || d == 39 || d == 47 || d == 92) {
            return (char) d;
        }
        if (d == 98) {
            return '\b';
        }
        if (d == 102) {
            return '\f';
        }
        if (d == 110) {
            return '\n';
        }
        if (d == 114) {
            return '\r';
        }
        if (d == 116) {
            return '\t';
        }
        if (d == 117) {
            if (this.k.D(4L)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte c2 = this.l.c(i3);
                    char c3 = (char) (c << 4);
                    if (c2 >= 48 && c2 <= 57) {
                        i2 = c2 - 48;
                    } else if (c2 >= 97 && c2 <= 102) {
                        i2 = c2 - 87;
                    } else if (c2 < 65 || c2 > 70) {
                        throw c("\\u".concat(this.l.o(4L)));
                    } else {
                        i2 = c2 - 55;
                    }
                    c = (char) (c3 + i2);
                }
                this.l.B(4L);
                return c;
            }
            throw new EOFException("Unterminated escape sequence at path ".concat(e()));
        }
        throw c("Invalid escape sequence: \\" + ((char) d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dc, code lost:
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01dd, code lost:
        r16.n = r5;
        r16.l.B(r4);
        r16.m = 16;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d9, code lost:
        if (r3 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cf, code lost:
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ed, code lost:
        if (r2 == 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f0, code lost:
        if (r2 == 4) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f2, code lost:
        if (r2 != 7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f4, code lost:
        r16.o = r4;
        r16.m = 17;
        r3 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bd, code lost:
        if (B(r11) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c1, code lost:
        if (r2 != 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c3, code lost:
        if (r7 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c9, code lost:
        if (r5 != Long.MIN_VALUE) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cb, code lost:
        if (r9 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cd, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d4, code lost:
        if (r5 != 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d6, code lost:
        if (r3 != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int t() {
        /*
            Method dump skipped, instructions count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arx.t():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        r9.l.B(r2 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
        x();
        z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
        if (r9.k.D(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
        x();
        r1 = r9.l.c(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r1 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
        r9.l.d();
        r9.l.d();
        r1 = r9.k;
        r2 = defpackage.arx.j;
        r3 = r1.h(r2);
        r1 = r9.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r3 == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r7 = r2.b() + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r1.B(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r3 == (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        throw c("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        r7 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004c, code lost:
        if (r1 == 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
        r9.l.d();
        r9.l.d();
        z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004e, code lost:
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003c, code lost:
        return 47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int u(boolean r10) {
        /*
            r9 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            int r2 = r1 + 1
            out r3 = r9.k
            long r4 = (long) r2
            boolean r3 = r3.D(r4)
            if (r3 == 0) goto La0
            our r3 = r9.l
            long r4 = (long) r1
            byte r1 = r3.c(r4)
            r3 = 10
            if (r1 == r3) goto L9d
            r3 = 32
            if (r1 == r3) goto L9d
            r3 = 13
            if (r1 == r3) goto L9d
            r3 = 9
            if (r1 != r3) goto L26
            goto L9d
        L26:
            our r3 = r9.l
            int r2 = r2 + (-1)
            long r4 = (long) r2
            r3.B(r4)
            r2 = 47
            if (r1 != r2) goto L90
            out r1 = r9.k
            r3 = 2
            boolean r1 = r1.D(r3)
            if (r1 != 0) goto L3d
            return r2
        L3d:
            r9.x()
            our r1 = r9.l
            r3 = 1
            byte r1 = r1.c(r3)
            r3 = 42
            if (r1 == r3) goto L5d
            if (r1 == r2) goto L4f
            return r2
        L4f:
            our r1 = r9.l
            r1.d()
            our r1 = r9.l
            r1.d()
            r9.z()
            goto L1
        L5d:
            our r1 = r9.l
            r1.d()
            our r1 = r9.l
            r1.d()
            out r1 = r9.k
            ouu r2 = defpackage.arx.j
            long r3 = r1.h(r2)
            our r1 = r9.l
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L7e
            int r2 = r2.b()
            long r7 = (long) r2
            long r7 = r7 + r3
            goto L80
        L7e:
            long r7 = r1.b
        L80:
            r1.B(r7)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L89
            goto L1
        L89:
            java.lang.String r10 = "Unterminated comment"
            arv r10 = r9.c(r10)
            throw r10
        L90:
            r2 = 35
            if (r1 != r2) goto L9c
            r9.x()
            r9.z()
            goto L1
        L9c:
            return r1
        L9d:
            r1 = r2
            goto L2
        La0:
            if (r10 != 0) goto La4
            r10 = -1
            return r10
        La4:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r10.<init>(r0)
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arx.u(boolean):int");
    }

    private final String v(ouu ouuVar) {
        StringBuilder sb = null;
        while (true) {
            long j2 = this.k.j(ouuVar);
            if (j2 != -1) {
                if (this.l.c(j2) != 92) {
                    if (sb == null) {
                        String o = this.l.o(j2);
                        this.l.d();
                        return o;
                    }
                    sb.append(this.l.o(j2));
                    this.l.d();
                    return sb.toString();
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.l.o(j2));
                this.l.d();
                sb.append(s());
            } else {
                throw c("Unterminated string");
            }
        }
    }

    private final String w() {
        long j2 = this.k.j(h);
        return j2 != -1 ? this.l.o(j2) : this.l.n();
    }

    private final void x() {
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void y(ouu ouuVar) {
        while (true) {
            long j2 = this.k.j(ouuVar);
            if (j2 != -1) {
                if (this.l.c(j2) == 92) {
                    this.l.B(j2 + 1);
                    s();
                } else {
                    this.l.B(j2 + 1);
                    return;
                }
            } else {
                throw c("Unterminated string");
            }
        }
    }

    private final void z() {
        long j2 = this.k.j(i);
        our ourVar = this.l;
        ourVar.B(j2 != -1 ? j2 + 1 : ourVar.b);
    }

    @Override // defpackage.arw
    public final double a() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 17) {
            this.p = this.l.o(this.o);
        } else if (i2 == 9) {
            this.p = v(g);
        } else if (i2 == 8) {
            this.p = v(f);
        } else if (i2 == 10) {
            this.p = w();
        } else if (i2 != 11) {
            int q = q();
            throw new aru("Expected a double but was " + xl.b(q) + " at path " + e());
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new arv("JSON forbids NaN and infinities: " + parseDouble + " at path " + e());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new aru("Expected a double but was " + this.p + " at path " + e());
        }
    }

    @Override // defpackage.arw
    public final int b() {
        String v;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 16) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.m = 0;
                int[] iArr = this.e;
                int i4 = this.b - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new aru("Expected an int but was " + j2 + " at path " + e());
        }
        if (i2 == 17) {
            this.p = this.l.o(this.o);
        } else {
            if (i2 == 9) {
                v = v(g);
            } else if (i2 == 8) {
                v = v(f);
            } else if (i2 != 11) {
                int q = q();
                throw new aru("Expected an int but was " + xl.b(q) + " at path " + e());
            }
            this.p = v;
            try {
                int parseInt = Integer.parseInt(v);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            int i6 = (int) parseDouble;
            if (i6 == parseDouble) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new aru("Expected an int but was " + this.p + " at path " + e());
        } catch (NumberFormatException unused2) {
            throw new aru("Expected an int but was " + this.p + " at path " + e());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.y();
        this.k.close();
    }

    @Override // defpackage.arw
    public final String f() {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 14) {
            str = w();
        } else if (i2 == 13) {
            str = v(g);
        } else if (i2 == 12) {
            str = v(f);
        } else if (i2 != 15) {
            int q = q();
            String e = e();
            throw new aru("Expected a name but was " + xl.b(q) + " at path " + e);
        } else {
            str = this.p;
        }
        this.m = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    @Override // defpackage.arw
    public final String g() {
        String o;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 10) {
            o = w();
        } else if (i2 == 9) {
            o = v(g);
        } else if (i2 == 8) {
            o = v(f);
        } else if (i2 == 11) {
            o = this.p;
            this.p = null;
        } else if (i2 == 16) {
            o = Long.toString(this.n);
        } else if (i2 == 17) {
            o = this.l.o(this.o);
        } else {
            int q = q();
            throw new aru("Expected a string but was " + xl.b(q) + " at path " + e());
        }
        this.m = 0;
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        return o;
    }

    @Override // defpackage.arw
    public final void h() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 3) {
            l(1);
            this.e[this.b - 1] = 0;
            this.m = 0;
            return;
        }
        int q = q();
        String e = e();
        throw new aru("Expected BEGIN_ARRAY but was " + xl.b(q) + " at path " + e);
    }

    @Override // defpackage.arw
    public final void i() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 1) {
            l(3);
            this.m = 0;
            return;
        }
        int q = q();
        String e = e();
        throw new aru("Expected BEGIN_OBJECT but was " + xl.b(q) + " at path " + e);
    }

    @Override // defpackage.arw
    public final void j() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 4) {
            int i3 = this.b - 1;
            this.b = i3;
            int[] iArr = this.e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        int q = q();
        throw new aru("Expected END_ARRAY but was " + xl.b(q) + " at path " + e());
    }

    @Override // defpackage.arw
    public final void k() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 2) {
            int i3 = this.b - 1;
            this.b = i3;
            this.d[i3] = null;
            int[] iArr = this.e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        int q = q();
        throw new aru("Expected END_OBJECT but was " + xl.b(q) + " at path " + e());
    }

    @Override // defpackage.arw
    public final void m() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 14) {
            A();
        } else if (i2 == 13) {
            y(g);
        } else if (i2 == 12) {
            y(f);
        } else if (i2 != 15) {
            int q = q();
            String e = e();
            throw new aru("Expected a name but was " + xl.b(q) + " at path " + e);
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.arw
    public final void n() {
        int i2 = 0;
        do {
            int i3 = this.m;
            if (i3 == 0) {
                i3 = t();
            }
            if (i3 == 3) {
                l(1);
            } else if (i3 != 1) {
                if (i3 == 4) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        int q = q();
                        throw new aru("Expected a value but was " + xl.b(q) + " at path " + e());
                    }
                } else if (i3 == 2) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        int q2 = q();
                        throw new aru("Expected a value but was " + xl.b(q2) + " at path " + e());
                    }
                } else if (i3 == 14 || i3 == 10) {
                    A();
                } else if (i3 == 9 || i3 == 13) {
                    y(g);
                } else if (i3 == 8 || i3 == 12) {
                    y(f);
                } else if (i3 == 17) {
                    this.l.B(this.o);
                } else if (i3 == 18) {
                    int q3 = q();
                    throw new aru("Expected a value but was " + xl.b(q3) + " at path " + e());
                }
                this.m = 0;
            } else {
                l(3);
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i4 = this.b - 1;
        iArr[i4] = iArr[i4] + 1;
        this.d[i4] = "null";
    }

    @Override // defpackage.arw
    public final boolean o() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // defpackage.arw
    public final boolean p() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            int q = q();
            throw new aru("Expected a boolean but was " + xl.b(q) + " at path " + e());
        }
    }

    @Override // defpackage.arw
    public final int q() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        switch (i2) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    @Override // defpackage.arw
    public final int r(azp azpVar) {
        int c;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = t();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return C(this.p, azpVar);
        }
        out outVar = this.k;
        Object obj = azpVar.b;
        ovj ovjVar = (ovj) outVar;
        if (ovjVar.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            ovc ovcVar = (ovc) obj;
            c = ovt.c(ovjVar.b, ovcVar);
            if (c == -2) {
                if (ovjVar.a.b(ovjVar.b, 8192L) == -1) {
                    break;
                }
            } else if (c != -1) {
                ovjVar.b.B(ovcVar.a[c].b());
            }
        }
        c = -1;
        if (c != -1) {
            this.m = 0;
            this.d[this.b - 1] = ((String[]) azpVar.a)[c];
            return c;
        }
        String str = this.d[this.b - 1];
        String f2 = f();
        int C = C(f2, azpVar);
        if (C != -1) {
            return C;
        }
        this.m = 15;
        this.p = f2;
        this.d[this.b - 1] = str;
        return -1;
    }

    public final String toString() {
        String obj = this.k.toString();
        return "JsonReader(" + obj + ")";
    }
}
