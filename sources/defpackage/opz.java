package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: opz  reason: default package */
/* loaded from: classes2.dex */
public final class opz {
    public static final /* synthetic */ int f = 0;
    private static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final int c;
    public final List d;
    public final String e;
    private final String h;
    private final String i;
    private final String j;

    public opz(opy opyVar) {
        this.a = opyVar.a;
        this.h = g(opyVar.b, false);
        this.i = g(opyVar.c, false);
        this.b = opyVar.d;
        this.c = opyVar.a();
        u(opyVar.f, false);
        List list = opyVar.g;
        String str = null;
        this.d = list != null ? u(list, true) : null;
        String str2 = opyVar.h;
        this.j = str2 != null ? g(str2, false) : str;
        this.e = opyVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return s(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    static String g(String str, boolean z) {
        return h(str, 0, str.length(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt != '%') {
                if (charAt != '+' || !z) {
                    i3++;
                } else {
                    z = true;
                }
            }
            our ourVar = new our();
            ourVar.R(str, i, i3);
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt == 37) {
                    int i4 = i3 + 2;
                    if (i4 < i2) {
                        int a = oqs.a(str.charAt(i3 + 1));
                        int a2 = oqs.a(str.charAt(i4));
                        if (a == -1 || a2 == -1) {
                            codePointAt = 37;
                            ourVar.S(codePointAt);
                            i3 += Character.charCount(codePointAt);
                        } else {
                            ourVar.N((a << 4) + a2);
                            i3 = i4;
                            codePointAt = 37;
                            i3 += Character.charCount(codePointAt);
                        }
                    } else {
                        codePointAt = 37;
                    }
                }
                if (codePointAt == 43 && z) {
                    ourVar.N(32);
                    i3 += Character.charCount(codePointAt);
                }
                ourVar.S(codePointAt);
                i3 += Character.charCount(codePointAt);
            }
            return ourVar.n();
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List l(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public static opz n(String str) {
        opy opyVar = new opy();
        opyVar.e(null, str);
        return opyVar.c();
    }

    public static opz o(String str) {
        try {
            return n(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void p(StringBuilder sb, List list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static boolean r(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && oqs.a(str.charAt(i + 1)) != -1 && oqs.a(str.charAt(i3)) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String s(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z && (!z2 || r(str, i3, i2))))) {
                    if (codePointAt != 43 || !z3) {
                        i3 += Character.charCount(codePointAt);
                    } else {
                        z5 = true;
                        our ourVar = new our();
                        ourVar.R(str, i, i3);
                        t(ourVar, str, i3, i2, str2, z, z2, z5, z4);
                        return ourVar.n();
                    }
                }
            }
            z5 = z3;
            our ourVar2 = new our();
            ourVar2.R(str, i, i3);
            t(ourVar2, str, i3, i2, str2, z, z2, z5, z4);
            return ourVar2.n();
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0050, code lost:
        if (r(r7, r8, r9) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void t(defpackage.our r6, java.lang.String r7, int r8, int r9, java.lang.String r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            r0 = 0
        L1:
            if (r8 >= r9) goto L8a
            int r1 = r7.codePointAt(r8)
            if (r11 == 0) goto L1d
            r2 = 9
            if (r1 == r2) goto L83
            r2 = 10
            if (r1 == r2) goto L83
            r2 = 12
            if (r1 == r2) goto L83
            r2 = 13
            if (r1 != r2) goto L1d
            r1 = 13
            goto L83
        L1d:
            r2 = 43
            if (r1 != r2) goto L2f
            if (r13 == 0) goto L2f
            r2 = 1
            if (r2 == r11) goto L29
            java.lang.String r2 = "%2B"
            goto L2b
        L29:
            java.lang.String r2 = "+"
        L2b:
            r6.W(r2)
            goto L83
        L2f:
            r2 = 32
            r3 = 37
            if (r1 < r2) goto L59
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 == r2) goto L59
            r2 = 128(0x80, float:1.794E-43)
            if (r1 < r2) goto L3f
            if (r14 != 0) goto L59
        L3f:
            int r2 = r10.indexOf(r1)
            r4 = -1
            if (r2 != r4) goto L59
            if (r1 != r3) goto L53
            if (r11 == 0) goto L59
            if (r12 == 0) goto L54
            boolean r2 = r(r7, r8, r9)
            if (r2 != 0) goto L54
            goto L59
        L53:
            r3 = r1
        L54:
            r6.S(r1)
            r1 = r3
            goto L83
        L59:
            if (r0 != 0) goto L60
            our r0 = new our
            r0.<init>()
        L60:
            r0.S(r1)
        L63:
            boolean r2 = r0.C()     // Catch: java.io.EOFException -> L83
            if (r2 != 0) goto L83
            byte r2 = r0.d()     // Catch: java.io.EOFException -> L83
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6.N(r3)     // Catch: java.io.EOFException -> L83
            char[] r4 = defpackage.opz.g     // Catch: java.io.EOFException -> L83
            int r5 = r2 >> 4
            char r5 = r4[r5]     // Catch: java.io.EOFException -> L83
            r6.N(r5)     // Catch: java.io.EOFException -> L83
            r2 = r2 & 15
            char r2 = r4[r2]     // Catch: java.io.EOFException -> L83
            r6.N(r2)     // Catch: java.io.EOFException -> L83
            goto L63
        L83:
            int r1 = java.lang.Character.charCount(r1)
            int r8 = r8 + r1
            goto L1
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opz.t(our, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    private static final List u(List list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? g(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String c() {
        if (this.i.isEmpty()) {
            return "";
        }
        int indexOf = this.e.indexOf(58, this.a.length() + 3);
        return this.e.substring(indexOf + 1, this.e.indexOf(64));
    }

    public final String d() {
        int indexOf = this.e.indexOf(47, this.a.length() + 3);
        String str = this.e;
        return this.e.substring(indexOf, oqs.c(str, indexOf, str.length(), "?#"));
    }

    public final String e() {
        if (this.d == null) {
            return null;
        }
        int indexOf = this.e.indexOf(63) + 1;
        String str = this.e;
        return this.e.substring(indexOf, oqs.b(str, indexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof opz) && ((opz) obj).e.equals(this.e);
    }

    public final String f() {
        if (this.h.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.e;
        return this.e.substring(length, oqs.c(str, length, str.length(), ":@"));
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final URI i() {
        opy opyVar = new opy();
        opyVar.a = this.a;
        opyVar.b = f();
        opyVar.c = c();
        opyVar.d = this.b;
        opyVar.e = this.c != a(this.a) ? this.c : -1;
        opyVar.f.clear();
        opyVar.f.addAll(k());
        opyVar.d(e());
        opyVar.h = this.j == null ? null : this.e.substring(this.e.indexOf(35) + 1);
        int size = opyVar.f.size();
        for (int i = 0; i < size; i++) {
            opyVar.f.set(i, b((String) opyVar.f.get(i), "[]", true, true, false, true));
        }
        List list = opyVar.g;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) opyVar.g.get(i2);
                if (str != null) {
                    opyVar.g.set(i2, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = opyVar.h;
        if (str2 != null) {
            opyVar.h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String opyVar2 = opyVar.toString();
        try {
            return new URI(opyVar2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(opyVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL j() {
        try {
            return new URL(this.e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final List k() {
        int indexOf = this.e.indexOf(47, this.a.length() + 3);
        String str = this.e;
        int c = oqs.c(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < c) {
            int i = indexOf + 1;
            int b = oqs.b(this.e, i, c, '/');
            arrayList.add(this.e.substring(i, b));
            indexOf = b;
        }
        return arrayList;
    }

    public final opy m(String str) {
        try {
            opy opyVar = new opy();
            opyVar.e(this, str);
            return opyVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean q() {
        return this.a.equals("https");
    }

    public final String toString() {
        return this.e;
    }
}
