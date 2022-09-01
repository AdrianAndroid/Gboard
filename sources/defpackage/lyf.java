package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lyf  reason: default package */
/* loaded from: classes.dex */
final class lyf {
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final byte[] g;
    private final boolean[] h;

    public lyf(String str, char[] cArr) {
        int numberOfLeadingZeros;
        this.a = str;
        this.b = (char[]) jdg.u(cArr);
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (mhc.a[roundingMode.ordinal()]) {
                    case 1:
                        mhq.s(((length + (-1)) & length) == 0);
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        break;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        break;
                    default:
                        throw new AssertionError();
                }
                this.d = numberOfLeadingZeros;
                int min = Math.min(8, Integer.lowestOneBit(numberOfLeadingZeros));
                try {
                    this.e = 8 / min;
                    this.f = numberOfLeadingZeros / min;
                    this.c = length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        jdg.x(c < 128, "Non-ASCII character: %s", c);
                        jdg.x(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.g = bArr;
                    boolean[] zArr = new boolean[this.e];
                    for (int i2 = 0; i2 < this.f; i2++) {
                        zArr[mhq.v(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                    }
                    this.h = zArr;
                    return;
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Illegal alphabet ".concat(new String(cArr)), e);
                }
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char a(int i) {
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(char c) {
        if (c <= 127) {
            byte b = this.g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new lyi("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
            }
            throw new lyi("Unrecognized character: " + c);
        }
        throw new lyi("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(int i) {
        return this.h[i % this.e];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lyf) {
            return Arrays.equals(this.b, ((lyf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return this.a;
    }
}
