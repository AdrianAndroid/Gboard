package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: PG */
/* renamed from: obc  reason: default package */
/* loaded from: classes2.dex */
public final class obc {
    public int a;
    public int b;
    public Object c;

    public obc() {
        this.b = 0;
        this.a = -1;
    }

    public obc(int i, int i2) {
        k(i, i2);
    }

    public obc(List list) {
        this.c = list;
    }

    public obc(byte[] bArr) {
        this.a = 0;
        this.b = 0;
        this.c = null;
    }

    private final String n(int i, String str) {
        int length;
        char[] cArr;
        int length2;
        char[] cArr2;
        if (!j()) {
            return str;
        }
        char c = 0;
        int i2 = 1;
        if (i == 1) {
            Object obj = this.c;
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            int i3 = 0;
            while (true) {
                length2 = charArray.length;
                if (i3 >= length2 - 1) {
                    break;
                }
                btn btnVar = (btn) obj;
                ewj ewjVar = btnVar.c;
                char c2 = charArray[i3];
                int i4 = i3 + 1;
                char c3 = charArray[i4];
                int f = ewjVar.f() - 1;
                int i5 = 0;
                while (i5 <= f) {
                    int i6 = (i5 + f) >> i2;
                    short s = ((short[]) ewjVar.a)[i6];
                    char[] h = ewjVar.h(s);
                    char c4 = h[c];
                    if (c4 >= c2 && (c4 != c2 || h[1] >= c3)) {
                        if (c4 <= c2 && (c4 != c2 || h[1] <= c3)) {
                            cArr2 = ewjVar.g(s);
                            break;
                        }
                        f = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                    c = 0;
                    i2 = 1;
                }
                cArr2 = null;
                if (cArr2 != null) {
                    sb.append(cArr2);
                    i3 += 2;
                } else {
                    sb.append(btnVar.b.s(charArray[i3]));
                    i3 = i4;
                }
                c = 0;
                i2 = 1;
            }
            if (i3 < length2) {
                sb.append(((btn) obj).b.s(charArray[i3]));
            }
            return sb.toString();
        }
        Object obj2 = this.c;
        StringBuilder sb2 = new StringBuilder();
        char[] charArray2 = str.toCharArray();
        int i7 = 0;
        while (true) {
            length = charArray2.length;
            if (i7 >= length - 1) {
                break;
            }
            btn btnVar2 = (btn) obj2;
            ewj ewjVar2 = btnVar2.c;
            char c5 = charArray2[i7];
            int i8 = i7 + 1;
            char c6 = charArray2[i8];
            int f2 = ewjVar2.f() - 1;
            int i9 = 0;
            while (i9 <= f2) {
                int i10 = (i9 + f2) >> 1;
                char[] g = ewjVar2.g(i10);
                char c7 = g[0];
                if (c7 >= c5 && (c7 != c5 || g[1] >= c6)) {
                    if (c7 <= c5 && (c7 != c5 || g[1] <= c6)) {
                        cArr = ewjVar2.h(i10);
                        break;
                    }
                    f2 = i10 - 1;
                } else {
                    i9 = i10 + 1;
                }
            }
            cArr = null;
            if (cArr != null) {
                sb2.append(cArr);
                i7 += 2;
            } else {
                sb2.append(btnVar2.b.r(charArray2[i7]));
                i7 = i8;
            }
        }
        if (i7 < length) {
            sb2.append(((btn) obj2).b.r(charArray2[i7]));
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final SocketAddress a() {
        return (SocketAddress) ((nsz) this.c.get(this.a)).b.get(this.b);
    }

    public final void b() {
        this.a = 0;
        this.b = 0;
    }

    public final String c() {
        return new String((char[]) this.c, this.b, this.a);
    }

    public final void d() {
        this.b += this.a + 1;
        this.a = -1;
    }

    public final boolean e() {
        if (this.a >= 0) {
            return true;
        }
        int i = this.b;
        if (i >= ((char[]) this.c).length) {
            return false;
        }
        while (true) {
            char[] cArr = (char[]) this.c;
            if (i >= cArr.length || cArr[i] == '-') {
                break;
            }
            i++;
        }
        this.a = i - this.b;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        r9.e = new java.lang.String((char[]) r8.c, r0, r2 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.jau r9) {
        /*
            r8 = this;
            boolean r0 = r8.e()
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.Object r0 = r8.c
            int r2 = r8.b
            int r3 = r8.a
            android.os.Parcelable$Creator r4 = defpackage.jav.CREATOR
            r4 = 1
            if (r3 != r4) goto L79
            char[] r0 = (char[]) r0
            char r0 = r0[r2]
            boolean r0 = defpackage.jav.A(r0)
            if (r0 == 0) goto L79
            int r0 = r8.b
            r8.d()
            r2 = r0
        L22:
            boolean r3 = r8.e()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r8.c
            int r5 = r8.b
            int r6 = r8.a
            if (r6 <= 0) goto L54
            r7 = 8
            if (r6 > r7) goto L54
            char[] r3 = (char[]) r3
            boolean r3 = defpackage.jav.w(r3, r5, r6)
            if (r3 == 0) goto L54
            int r2 = r8.b
            int r3 = r8.a
            int r5 = r2 + r3
            int r1 = r1 + r4
            if (r1 <= r4) goto L4f
            r6 = 2
            if (r3 != r6) goto L4f
            java.lang.Object r3 = r8.c
            char[] r3 = (char[]) r3
            defpackage.jbs.g(r3, r2, r6)
        L4f:
            r8.d()
            r2 = r5
            goto L22
        L54:
            if (r0 == r2) goto L63
            java.lang.String r1 = new java.lang.String
            java.lang.Object r3 = r8.c
            char[] r3 = (char[]) r3
            int r2 = r2 - r0
            r1.<init>(r3, r0, r2)
            r9.e = r1
            return r4
        L63:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            int r0 = r8.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Incomplete privateUse subtag, error index: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obc.f(jau):boolean");
    }

    public final void g(int i) {
        int i2 = this.a + i;
        this.a = i2;
        int i3 = this.b + i;
        this.b = i3;
        if (i2 < 0) {
            i2 = 0;
            this.a = 0;
        }
        if (i3 < i2) {
            this.b = i2;
        }
    }

    public final String h(String str) {
        return n(this.b, str);
    }

    public final String i(String str) {
        return n(this.a, str);
    }

    public final boolean j() {
        return this.a != this.b;
    }

    public final void k(int i, int i2) {
        btn btnVar;
        this.a = i;
        this.b = i2;
        if (!j() || this.c != null) {
            return;
        }
        synchronized (btn.class) {
            btnVar = btn.a;
            if (btnVar == null) {
                btn.a = new btn();
                btnVar = btn.a;
            }
        }
        this.c = btnVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public final oth l() {
        return new oth(this.a, this.b, (List) this.c);
    }

    public final void m(oth othVar) {
        this.a = othVar.b;
        this.b = othVar.a;
        this.c = othVar.c;
    }
}
