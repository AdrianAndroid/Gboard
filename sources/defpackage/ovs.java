package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ovs  reason: default package */
/* loaded from: classes2.dex */
public final class ovs {
    public static final byte[] a = oix.g("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").b;

    static {
        ouu ouuVar = ouu.a;
        oix.g("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    public static final byte[] a(String str) {
        int i;
        int i2;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length = i2;
        }
        int i3 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt2 = str.charAt(i7);
            if (charAt2 >= 'A' && charAt2 < '[') {
                i = charAt2 - 'A';
            } else if (charAt2 >= 'a' && charAt2 < '{') {
                i = charAt2 - 'G';
            } else if (charAt2 >= '0' && charAt2 < ':') {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i6 = (i6 << 6) | i;
            i4++;
            if (i4 % 4 == 0) {
                int i8 = i5 + 1;
                bArr[i5] = (byte) (i6 >> 16);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (i6 >> 8);
                bArr[i9] = (byte) i6;
                i5 = i9 + 1;
            }
        }
        int i10 = i4 % 4;
        if (i10 != 1) {
            if (i10 == 2) {
                bArr[i5] = (byte) ((i6 << 12) >> 16);
                i5++;
            } else if (i10 == 3) {
                int i11 = i6 << 6;
                int i12 = i5 + 1;
                bArr[i5] = (byte) (i11 >> 16);
                i5 = i12 + 1;
                bArr[i12] = (byte) (i11 >> 8);
            }
            if (i5 == i3) {
                return bArr;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i5);
            oll.d(copyOf, "copyOf(this, newSize)");
            return copyOf;
        }
        return null;
    }
}
