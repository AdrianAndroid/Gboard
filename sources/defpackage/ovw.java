package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ovw  reason: default package */
/* loaded from: classes2.dex */
public final class ovw {
    public String a;
    public long b;
    public byte c;
    public boolean d;
    public List e;
    public final Map f = new HashMap();

    public ovw(byte[] bArr, owa owaVar) {
        this.a = "";
        this.b = 0L;
        String property = System.getProperty("user.name", "");
        if (property.length() > 31) {
            property.substring(0, 31);
        }
        this.e = new ArrayList();
        this.a = ovy.c(bArr, 0, 100, owaVar);
        ovy.b(bArr, 100, 8);
        ovy.b(bArr, 108, 8);
        ovy.b(bArr, 116, 8);
        this.b = ovy.b(bArr, 124, 12);
        ovy.b(bArr, 136, 12);
        ovy.a(bArr, 148, 8);
        for (byte b : bArr) {
        }
        this.c = bArr[156];
        ovy.c(bArr, 157, 100, owaVar);
        ovy.e(bArr, 257, 6);
        ovy.e(bArr, 263, 2);
        ovy.c(bArr, 265, 32, owaVar);
        ovy.c(bArr, 297, 32, owaVar);
        byte b2 = this.c;
        if (b2 == 51 || b2 == 52) {
            ovy.b(bArr, 329, 8);
            ovy.b(bArr, 337, 8);
        }
        if (oll.q("ustar ", bArr, 257, 6)) {
            int i = 386;
            for (int i2 = 0; i2 < 4; i2++) {
                oll r = oll.r(bArr, i);
                if (r != null) {
                    this.e.add(r);
                }
                i += 24;
            }
            this.d = ovy.d(bArr, 482);
            ovy.b(bArr, 483, 12);
        } else if (!oll.q("ustar\u0000", bArr, 257, 6) || !oll.q("tar\u0000", bArr, 508, 4)) {
            String c = ovy.c(bArr, 345, 155, owaVar);
            if (b() && !this.a.endsWith("/")) {
                this.a = String.valueOf(this.a).concat("/");
            }
            if (c.length() <= 0) {
                return;
            }
            this.a = c + "/" + this.a;
        } else {
            String c2 = ovy.c(bArr, 345, 131, owaVar);
            if (c2.length() <= 0) {
                return;
            }
            this.a = c2 + "/" + this.a;
        }
    }

    public final void a(String str) {
        int indexOf;
        String lowerCase = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
        if (lowerCase != null) {
            if (lowerCase.startsWith("windows")) {
                if (str.length() > 2) {
                    char charAt = str.charAt(0);
                    if (str.charAt(1) == ':' && ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                        str = str.substring(2);
                    }
                }
            } else if (lowerCase.contains("netware") && (indexOf = str.indexOf(58)) != -1) {
                str = str.substring(indexOf + 1);
            }
        }
        String replace = str.replace(File.separatorChar, '/');
        while (replace.startsWith("/")) {
            replace = replace.substring(1);
        }
        this.a = replace;
    }

    public final boolean b() {
        if (this.c == 53) {
            return true;
        }
        return !d() && !c() && this.a.endsWith("/");
    }

    public final boolean c() {
        return this.c == 103;
    }

    public final boolean d() {
        byte b = this.c;
        return b == 120 || b == 88;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.a.equals(((ovw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
