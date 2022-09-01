package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jzv  reason: default package */
/* loaded from: classes.dex */
final class jzv {
    private static final Charset d = Charset.forName("UTF-8");
    public final byte[] a;
    public int b;
    public int c;

    public jzv(byte[] bArr) {
        this.a = bArr;
    }

    public final int a() {
        e(1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i];
    }

    public final int b() {
        return this.c - this.b;
    }

    public final long c() {
        e(8);
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        this.b = i8 + 1;
        long j = (b2 & 255) << 48;
        return (bArr[i8] & 255) | j | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8);
    }

    public final String d() {
        while (true) {
            if (r1 >= this.c) {
                r1 = -1;
                break;
            } else if (this.a[r1] == 0) {
                break;
            } else {
                r1++;
            }
        }
        if (r1 >= 0) {
            int i = this.b;
            int i2 = r1 - i;
            String str = i2 == 0 ? "" : new String(this.a, i, i2, d);
            this.b = this.b + i2 + 1;
            return str;
        }
        throw new IndexOutOfBoundsException("Did not find end of string, pos: " + this.b);
    }

    public final void e(int i) {
        int b = b();
        if (b >= i) {
            return;
        }
        throw new IndexOutOfBoundsException(String.format(Locale.US, "Not enough available bytes to read: %d, requested: %d", Integer.valueOf(b), Integer.valueOf(i)));
    }

    public final void f(int i) {
        int i2 = 1024 - this.c;
        if (i2 >= i) {
            return;
        }
        throw new IndexOutOfBoundsException(String.format(Locale.US, "Not enough space available for write: %d, requested: %d", Integer.valueOf(i2), Integer.valueOf(i)));
    }

    public final void g() {
        this.c = 0;
        this.b = 0;
    }

    public final void h(int i) {
        f(1);
        byte[] bArr = this.a;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final void i(long j) {
        f(8);
        byte[] bArr = this.a;
        int i = this.c;
        int i2 = i + 1;
        bArr[i] = (byte) (j >>> 56);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        this.c = i8 + 1;
        bArr[i8] = (byte) (j & 255);
    }

    public final void j(String str) {
        char charAt;
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                h(charAt2);
                while (true) {
                    i++;
                    if (i < length && (charAt = str.charAt(i)) < 128) {
                        h(charAt);
                    }
                }
            } else {
                if (charAt2 < 2048) {
                    h((charAt2 >> 6) | 192);
                    h((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    h((charAt2 >> '\f') | 224);
                    h(((charAt2 >> 6) & 63) | 128);
                    h((charAt2 & '?') | 128);
                } else {
                    int i2 = i + 1;
                    char charAt3 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        h(63);
                        i = i2;
                    } else {
                        int i3 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        h((i3 >> 18) | 240);
                        h(((i3 >> 12) & 63) | 128);
                        h(((i3 >> 6) & 63) | 128);
                        h((i3 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        h(0);
    }
}
