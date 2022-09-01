package defpackage;

/* compiled from: PG */
/* renamed from: lxb  reason: default package */
/* loaded from: classes.dex */
public final class lxb implements lwx {
    protected final Object[] c;
    public final StringBuilder d;
    private final lvo f;
    public int a = 0;
    public int b = -1;
    public int e = 0;

    protected lxb(lvo lvoVar, Object[] objArr, StringBuilder sb) {
        lxj.b(lvoVar, "context");
        this.f = lvoVar;
        this.c = (Object[]) lxj.b(objArr, "arguments");
        this.d = sb;
    }

    public static void d(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(lup.b(obj));
        sb.append("]");
    }

    public static void e(lum lumVar, StringBuilder sb) {
        lww lwvVar;
        if (lumVar.n() != null) {
            lxb lxbVar = new lxb(lumVar.n(), lumVar.R(), sb);
            String c = lxbVar.c();
            int b = lxe.b(c, 0);
            int i = 0;
            int i2 = -1;
            while (b >= 0) {
                int i3 = b + 1;
                int i4 = i3;
                int i5 = 0;
                while (i4 < c.length()) {
                    int i6 = i4 + 1;
                    char charAt = c.charAt(i4);
                    char c2 = (char) (charAt - '0');
                    if (c2 >= '\n') {
                        if (charAt == '$') {
                            if ((i6 - 1) - i3 != 0) {
                                if (c.charAt(i3) != '0') {
                                    int i7 = i5 - 1;
                                    if (i6 != c.length()) {
                                        c.charAt(i6);
                                        i3 = i6;
                                        i6++;
                                        i2 = i7;
                                    } else {
                                        throw lxd.c("unterminated parameter", c, b);
                                    }
                                } else {
                                    throw lxd.b("index has leading zero", c, b, i6);
                                }
                            } else {
                                throw lxd.b("missing index", c, b, i6);
                            }
                        } else if (charAt != '<') {
                            i2 = i;
                            i++;
                        } else if (i2 != -1) {
                            if (i6 != c.length()) {
                                c.charAt(i6);
                                i6++;
                                i3 = i6;
                            } else {
                                throw lxd.c("unterminated parameter", c, b);
                            }
                        } else {
                            throw lxd.b("invalid relative parameter", c, b, i6);
                        }
                        for (int i8 = i6 - 1; i8 < c.length(); i8++) {
                            if (((char) ((c.charAt(i8) & 65503) - 65)) < 26) {
                                int i9 = i8 + 1;
                                char charAt2 = c.charAt(i8);
                                int i10 = charAt2 & ' ';
                                luj b2 = luj.b(c, i3, i8, i10 == 0);
                                lui luiVar = lui.k[lui.a(charAt2)];
                                if (i10 == 0 && (luiVar == null || (luiVar.n & 128) == 0)) {
                                    luiVar = null;
                                }
                                if (luiVar != null) {
                                    if (b2.e(luiVar.n, luiVar.m.f)) {
                                        lwvVar = lwy.b(i2, luiVar, b2);
                                    } else {
                                        throw lxd.b("invalid format specifier", c, b, i9);
                                    }
                                } else if (charAt2 == 't' || charAt2 == 'T') {
                                    if (b2.e(160, false)) {
                                        int i11 = i9 + 1;
                                        if (i11 <= c.length()) {
                                            lwu lwuVar = (lwu) lwu.F.get(Character.valueOf(c.charAt(i9)));
                                            if (lwuVar != null) {
                                                lwvVar = new lwv(b2, i2, lwuVar);
                                                i9 = i11;
                                            } else {
                                                throw lxd.a("illegal date/time conversion", c, i9);
                                            }
                                        } else {
                                            throw lxd.a("truncated format specifier", c, b);
                                        }
                                    } else {
                                        throw lxd.b("invalid format specification", c, b, i9);
                                    }
                                } else if (charAt2 == 'h' || charAt2 == 'H') {
                                    if (b2.e(160, false)) {
                                        lwvVar = new lwz(b2, i2);
                                    } else {
                                        throw lxd.b("invalid format specification", c, b, i9);
                                    }
                                } else {
                                    throw lxd.b("invalid format specification", c, b, i9);
                                }
                                int i12 = lwvVar.a;
                                if (i12 < 32) {
                                    lxbVar.a = (1 << i12) | lxbVar.a;
                                }
                                lxbVar.b = Math.max(lxbVar.b, i12);
                                lxbVar.b().a(lxbVar.d, lxbVar.c(), lxbVar.e, b);
                                Object[] objArr = lxbVar.c;
                                int i13 = lwvVar.a;
                                if (i13 >= objArr.length) {
                                    lxbVar.d.append("[ERROR: MISSING LOG ARGUMENT]");
                                } else {
                                    Object obj = objArr[i13];
                                    if (obj == null) {
                                        lxbVar.d.append("null");
                                    } else {
                                        lwvVar.a(lxbVar, obj);
                                    }
                                }
                                lxbVar.e = i9;
                                b = lxe.b(c, i9);
                            }
                        }
                        throw lxd.c("unterminated parameter", c, b);
                    }
                    i5 = (i5 * 10) + c2;
                    if (i5 >= 1000000) {
                        throw lxd.b("index too large", c, b, i6);
                    }
                    i4 = i6;
                }
                throw lxd.c("unterminated parameter", c, b);
            }
            int i14 = lxbVar.a;
            if (((i14 + 1) & i14) != 0 || (lxbVar.b > 31 && i14 != -1)) {
                throw new lxd(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(i14 ^ (-1)))));
            }
            lxbVar.b().a(lxbVar.d, lxbVar.c(), lxbVar.e, lxbVar.c().length());
            StringBuilder sb2 = lxbVar.d;
            if (lumVar.R().length <= lxbVar.b + 1) {
                return;
            }
            sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
            return;
        }
        sb.append(lup.b(lumVar.o()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if ((r8 instanceof java.math.BigDecimal) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
        if ((r8 instanceof java.math.BigInteger) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    @Override // defpackage.lwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r8, defpackage.lui r9, defpackage.luj r10) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxb.a(java.lang.Object, lui, luj):void");
    }

    public final lxc b() {
        return this.f.a;
    }

    public final String c() {
        return this.f.b;
    }
}
