package defpackage;

/* compiled from: PG */
/* renamed from: ozi  reason: default package */
/* loaded from: classes2.dex */
public final class ozi implements ozh {
    private static final boolean[] a = {true, true, true, false, true, false, false, false};
    private static final int[] b = {0, 1, 2, 2, 3, 3, 3, 3};
    private int c;
    private int d = 0;

    public ozi(int i) {
        this.c = i + 5;
    }

    private static boolean b(byte b2) {
        int i = b2 & 255;
        return i == 0 || i == 255;
    }

    @Override // defpackage.ozh
    public final int a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i - 1;
        int i7 = (i2 + i) - 5;
        int i8 = i;
        while (true) {
            i3 = 0;
            if (i8 > i7) {
                break;
            }
            if ((bArr[i8] & 254) == 232) {
                int i9 = i8 - i6;
                if ((i9 & (-4)) != 0) {
                    this.d = 0;
                } else {
                    i3 = (this.d << (i9 - 1)) & 7;
                    this.d = i3;
                    if (i3 != 0 && (!a[i3] || b(bArr[(i8 + 4) - b[i3]]))) {
                        this.d = (i3 + i3) | 1;
                        i6 = i8;
                    }
                }
                int i10 = i8 + 4;
                byte b2 = bArr[i10];
                if (b(b2)) {
                    int i11 = i8 + 1;
                    int i12 = i8 + 2;
                    int i13 = i8 + 3;
                    int i14 = ((b2 & 255) << 24) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16);
                    while (true) {
                        i4 = i14 - ((this.c + i8) - i);
                        int i15 = this.d;
                        if (i15 != 0) {
                            if (!b((byte) (i4 >>> (24 - (b[i15] * 8))))) {
                                break;
                            }
                            i14 = i4 ^ ((1 << (32 - i5)) - 1);
                        } else {
                            break;
                        }
                    }
                    bArr[i11] = (byte) i4;
                    bArr[i12] = (byte) (i4 >>> 8);
                    bArr[i13] = (byte) (i4 >>> 16);
                    bArr[i10] = (byte) ((((i4 >>> 24) & 1) - 1) ^ (-1));
                    int i16 = i8;
                    i8 = i10;
                    i6 = i16;
                } else {
                    this.d = (i3 + i3) | 1;
                    i6 = i8;
                }
            }
            i8++;
        }
        int i17 = i8 - i6;
        if ((i17 & (-4)) == 0) {
            i3 = this.d << (i17 - 1);
        }
        this.d = i3;
        int i18 = i8 - i;
        this.c += i18;
        return i18;
    }
}
