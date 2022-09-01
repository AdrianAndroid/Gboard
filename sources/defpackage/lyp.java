package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: lyp  reason: default package */
/* loaded from: classes.dex */
public final class lyp {
    static {
        new lyn();
    }

    public static int a(InputStream inputStream, byte[] bArr, int i, int i2) {
        jdg.u(inputStream);
        jdg.u(bArr);
        int i3 = 0;
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i2)));
        }
        jdg.E(i, i + i2, bArr.length);
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        jdg.u(inputStream);
        jdg.u(outputStream);
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static InputStream c(InputStream inputStream, long j) {
        return new lyo(inputStream, j);
    }

    public static void d(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int a = a(inputStream, bArr, 0, length);
        if (a == length) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + a + " bytes; " + length + " bytes expected");
    }

    public static byte[] e(InputStream inputStream) {
        jdg.u(inputStream);
        return h(inputStream, new ArrayDeque(20), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] f(InputStream inputStream, long j) {
        jdg.z(j >= 0, "expectedSize (%s) must be non-negative", j);
        if (j > 2147483639) {
            throw new OutOfMemoryError(j + " bytes is too large to fit in a byte array");
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) read2});
        return h(inputStream, arrayDeque, i + 1);
    }

    private static byte[] g(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        int i2 = i - length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - i2, min);
            i2 -= min;
        }
        return copyOf;
    }

    private static byte[] h(InputStream inputStream, Queue queue, int i) {
        int highestOneBit = Integer.highestOneBit(i);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return g(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = mhq.m(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return g(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
