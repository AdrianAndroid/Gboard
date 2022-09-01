package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: nij  reason: default package */
/* loaded from: classes2.dex */
public final class nij {
    public static final ndb a = new ndb();

    static {
        boolean z = nih.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fb, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nij.a(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new nii(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int d(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int e(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b <= -12) {
                return b;
            }
            return -1;
        } else if (i3 == 1) {
            return c(b, bArr[i]);
        } else {
            if (i3 == 2) {
                return d(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(ByteBuffer byteBuffer, int i, int i2) {
        if (byteBuffer.hasArray()) {
            return ndb.al(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        } else if (!byteBuffer.isDirect()) {
            return ndb.ak(byteBuffer, i, i2);
        } else {
            return ndb.ak(byteBuffer, i, i2);
        }
    }

    public static String g(byte[] bArr, int i, int i2) {
        return ndb.al(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(byte[] bArr, int i, int i2) {
        return ndb.an(bArr, i, i2);
    }
}
