package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final CountDownLatch f = new CountDownLatch(1);
    private byte[] g;
    private byte[] h;
    private static final byte[] b = {42};
    private static final String[] c = new String[0];
    private static final String[] d = {"*"};
    public static final PublicSuffixDatabase a = new PublicSuffixDatabase();

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0042, code lost:
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String b(byte[] r12, byte[][] r13, int r14) {
        /*
            int r0 = r12.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L7f
            int r3 = r2 + r0
            int r3 = r3 / 2
        L9:
            r4 = 10
            if (r3 < 0) goto L14
            r5 = r12[r3]
            if (r5 == r4) goto L14
            int r3 = r3 + (-1)
            goto L9
        L14:
            int r3 = r3 + 1
            r5 = 1
            r6 = 1
        L18:
            int r7 = r3 + r6
            r8 = r12[r7]
            if (r8 == r4) goto L21
            int r6 = r6 + 1
            goto L18
        L21:
            int r4 = r7 - r3
            r8 = r14
            r6 = 0
            r9 = 0
            r10 = 0
        L27:
            if (r6 == 0) goto L2c
            r6 = 46
            goto L32
        L2c:
            r6 = r13[r8]
            r6 = r6[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
        L32:
            int r11 = r3 + r10
            r11 = r12[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r6 = r6 - r11
            if (r6 == 0) goto L3c
            goto L4f
        L3c:
            int r10 = r10 + 1
            int r9 = r9 + 1
            if (r10 != r4) goto L44
        L42:
            r6 = 0
            goto L4f
        L44:
            r6 = r13[r8]
            int r6 = r6.length
            if (r6 != r9) goto L7d
            int r6 = r13.length
            r11 = -1
            int r6 = r6 + r11
            if (r8 != r6) goto L78
            goto L42
        L4f:
            if (r6 >= 0) goto L55
        L51:
            int r3 = r3 + (-1)
            r0 = r3
            goto L3
        L55:
            if (r6 <= 0) goto L5a
        L57:
            int r2 = r7 + 1
            goto L3
        L5a:
            int r5 = r4 - r10
            r6 = r13[r8]
            int r6 = r6.length
            int r6 = r6 - r9
        L60:
            int r8 = r8 + 1
            int r9 = r13.length
            if (r8 >= r9) goto L6a
            r9 = r13[r8]
            int r9 = r9.length
            int r6 = r6 + r9
            goto L60
        L6a:
            if (r6 >= r5) goto L6d
            goto L51
        L6d:
            if (r6 <= r5) goto L70
            goto L57
        L70:
            java.lang.String r13 = new java.lang.String
            java.nio.charset.Charset r14 = defpackage.oqs.i
            r13.<init>(r12, r3, r4, r14)
            goto L80
        L78:
            int r8 = r8 + 1
            r6 = 1
            r9 = -1
            goto L27
        L7d:
            r6 = 0
            goto L27
        L7f:
            r13 = 0
        L80:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(byte[], byte[][], int):java.lang.String");
    }

    private final void c() {
        InputStream resourceAsStream;
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } finally {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (IOException e) {
                    otu.c.h(5, "Failed to read public suffix list", e);
                    if (!z) {
                        return;
                    }
                }
            } catch (InterruptedIOException unused) {
                Thread.interrupted();
                z = true;
            }
        }
        if (resourceAsStream != null) {
            out e2 = oix.e(new ouy(ovb.f(resourceAsStream)));
            try {
                byte[] bArr = new byte[e2.f()];
                e2.z(bArr);
                byte[] bArr2 = new byte[e2.f()];
                e2.z(bArr2);
                synchronized (this) {
                    this.g = bArr;
                    this.h = bArr2;
                }
                this.f.countDown();
            } finally {
                oqs.r(e2);
            }
        }
    }

    private final String[] d(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i = 0;
        if (this.e.get() || !this.e.compareAndSet(false, true)) {
            try {
                this.f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            c();
        }
        synchronized (this) {
            if (this.g == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(oqs.i);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = b(this.g, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = b;
                str3 = b(this.g, bArr2, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String b2 = b(this.h, bArr, i);
                if (b2 != null) {
                    str = b2;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return "!".concat(str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return d;
        }
        String[] split = str2 != null ? str2.split("\\.") : c;
        String[] split2 = str3 != null ? str3.split("\\.") : c;
        return split.length > split2.length ? split : split2;
    }

    public final String a(String str) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] d2 = d(split);
        int length = split.length;
        int length2 = d2.length;
        if (length == length2 && d2[0].charAt(0) != '!') {
            return null;
        }
        if (d2[0].charAt(0) != '!') {
            length2++;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i = length - length2; i < split2.length; i++) {
            sb.append(split2[i]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
