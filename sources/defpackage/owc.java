package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: owc  reason: default package */
/* loaded from: classes2.dex */
public final class owc {
    private static final byte[] a = new byte[4096];

    public static int a(InputStream inputStream, byte[] bArr) {
        return c(inputStream, bArr, bArr.length);
    }

    public static long b(InputStream inputStream, long j) {
        int c;
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip == 0) {
                break;
            }
            j2 -= skip;
        }
        while (j2 > 0 && (c = c(inputStream, a, (int) Math.min(j2, 4096L))) > 0) {
            j2 -= c;
        }
        return j - j2;
    }

    public static int c(InputStream inputStream, byte[] bArr, int i) {
        if (i < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = 0;
        while (i2 != i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        return i2;
    }
}
