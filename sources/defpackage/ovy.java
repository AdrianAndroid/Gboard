package defpackage;

import java.io.IOException;
import java.math.BigInteger;

/* compiled from: PG */
/* renamed from: ovy  reason: default package */
/* loaded from: classes2.dex */
public final class ovy {
    static final owa a = owb.a(null);
    static final owa b = new ovx();

    public static long a(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        long j = 0;
        if (bArr[i] != 0) {
            int i4 = i;
            while (i4 < i3 && bArr[i4] == 32) {
                i4++;
            }
            byte b2 = bArr[i3 - 1];
            while (i4 < i3 && (b2 == 0 || b2 == 32)) {
                i3--;
                b2 = bArr[i3 - 1];
            }
            while (i4 < i3) {
                byte b3 = bArr[i4];
                if (b3 < 48 || b3 > 55) {
                    throw new IllegalArgumentException("Invalid byte " + ((int) b3) + " at offset " + (i4 - i) + " in '" + new String(bArr, i, i2).replaceAll("\u0000", "{NUL}") + "' len=" + i2);
                }
                j = (j << 3) + (b3 - 48);
                i4++;
            }
        }
        return j;
    }

    public static long b(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        if ((b2 & 128) == 0) {
            return a(bArr, i, i2);
        }
        if (i2 < 9) {
            long j = 0;
            for (int i3 = 1; i3 < 8; i3++) {
                j = (j << 8) + (bArr[i + i3] & 255);
            }
            if (b2 == -1) {
                j = (j - 1) ^ (((long) Math.pow(2.0d, 56.0d)) - 1);
            }
            return b2 == -1 ? -j : j;
        }
        int i4 = i2 - 1;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i + 1, bArr2, 0, i4);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (b2 == -1) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() <= 63) {
            return b2 == -1 ? -bigInteger.longValue() : bigInteger.longValue();
        }
        throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
    }

    public static String c(byte[] bArr, int i, int i2, owa owaVar) {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        if (i3 > 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            return owaVar.a(bArr2);
        }
        return "";
    }

    public static boolean d(byte[] bArr, int i) {
        return bArr[i] == 1;
    }

    public static void e(byte[] bArr, int i, int i2) {
        try {
            try {
                c(bArr, i, i2, a);
            } catch (IOException unused) {
                c(bArr, i, i2, b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
