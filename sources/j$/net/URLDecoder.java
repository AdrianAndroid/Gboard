package j$.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;

/* loaded from: classes3.dex */
public class URLDecoder {
    static {
        BitSet bitSet = URLEncoder.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dd, code lost:
        r14 = r14.substring(r3, r3 + 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
        throw new java.lang.IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern : " + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fa, code lost:
        if (r3 >= r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fe, code lost:
        if (r5 == '%') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0108, code lost:
        throw new java.lang.IllegalArgumentException("URLDecoder: Incomplete trailing escape (%) pattern");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0109, code lost:
        r1.append(new java.lang.String(r2, 0, r4, r15));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r14, java.nio.charset.Charset r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.net.URLDecoder.a(java.lang.String, java.nio.charset.Charset):java.lang.String");
    }

    public static String decode(String str, String str2) {
        if (!str2.isEmpty()) {
            try {
                return a(str, Charset.forName(str2));
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
                throw new UnsupportedEncodingException(str2);
            }
        }
        throw new UnsupportedEncodingException("URLDecoder: empty string enc parameter");
    }
}
