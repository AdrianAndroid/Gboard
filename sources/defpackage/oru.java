package defpackage;

import java.net.ProtocolException;

/* compiled from: PG */
/* renamed from: oru  reason: default package */
/* loaded from: classes2.dex */
public final class oru {
    public final oqe a;
    public final int b;
    public final String c;

    public oru(oqe oqeVar, int i, String str) {
        this.a = oqeVar;
        this.b = i;
        this.c = str;
    }

    public static oru a(String str) {
        oqe oqeVar;
        int i;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                oqeVar = oqe.HTTP_1_0;
            } else if (charAt == 1) {
                oqeVar = oqe.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            oqeVar = oqe.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            } else {
                str2 = str.substring(i + 4);
            }
            return new oru(oqeVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == oqe.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}
