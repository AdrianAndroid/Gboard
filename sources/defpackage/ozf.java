package defpackage;

/* compiled from: PG */
/* renamed from: ozf  reason: default package */
/* loaded from: classes2.dex */
public final class ozf implements ozh {
    private int a;
    private final /* synthetic */ int b;

    public ozf(int i, int i2) {
        this.b = i2;
        this.a = i + 4;
    }

    public ozf(int i, int i2, byte[] bArr) {
        this.b = i2;
        this.a = i + 8;
    }

    public ozf(int i, int i2, char[] cArr) {
        this.b = i2;
        this.a = i;
    }

    public ozf(int i, int i2, short[] sArr) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ozh
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        if (i3 == 0) {
            int i4 = (i2 + i) - 4;
            int i5 = i;
            while (i5 <= i4) {
                int i6 = i5 + 1;
                int i7 = bArr[i6];
                if ((i7 & 248) == 240) {
                    int i8 = i5 + 3;
                    int i9 = bArr[i8];
                    if ((i9 & 248) == 248) {
                        int i10 = i5 + 2;
                        int i11 = ((i7 & 7) << 19) | ((bArr[i5] & 255) << 11) | ((i9 & 7) << 8) | (bArr[i10] & 255);
                        int i12 = ((i11 + i11) - ((this.a + i5) - i)) >>> 1;
                        bArr[i6] = (byte) (240 | ((i12 >>> 19) & 7));
                        bArr[i5] = (byte) (i12 >>> 11);
                        bArr[i8] = (byte) (((i12 >>> 8) & 7) | 248);
                        bArr[i10] = (byte) i12;
                        i5 = i10;
                    }
                }
                i5 += 2;
            }
            int i13 = i5 - i;
            this.a += i13;
            return i13;
        } else if (i3 == 1) {
            int i14 = (i2 + i) - 4;
            int i15 = i;
            while (i15 <= i14) {
                if ((bArr[i15 + 3] & 255) == 235) {
                    int i16 = i15 + 2;
                    int i17 = i15 + 1;
                    int i18 = ((((((bArr[i16] & 255) << 16) | ((bArr[i17] & 255) << 8)) | (bArr[i15] & 255)) << 2) - ((this.a + i15) - i)) >>> 2;
                    bArr[i16] = (byte) (i18 >>> 16);
                    bArr[i17] = (byte) (i18 >>> 8);
                    bArr[i15] = (byte) i18;
                }
                i15 += 4;
            }
            int i19 = i15 - i;
            this.a += i19;
            return i19;
        } else if (i3 == 2) {
            int i20 = (i2 + i) - 4;
            int i21 = i;
            while (i21 <= i20) {
                int i22 = bArr[i21];
                if ((i22 & 252) == 72) {
                    int i23 = i21 + 3;
                    int i24 = bArr[i23];
                    if ((i24 & 3) == 1) {
                        int i25 = i21 + 1;
                        int i26 = i21 + 2;
                        int i27 = (((((i22 & 3) << 24) | ((bArr[i25] & 255) << 16)) | ((bArr[i26] & 255) << 8)) | (i24 & 252)) - ((this.a + i21) - i);
                        bArr[i21] = (byte) (72 | ((i27 >>> 24) & 3));
                        bArr[i25] = (byte) (i27 >>> 16);
                        bArr[i26] = (byte) (i27 >>> 8);
                        bArr[i23] = (byte) (i27 | (bArr[i23] & 3));
                    }
                }
                i21 += 4;
            }
            int i28 = i21 - i;
            this.a += i28;
            return i28;
        } else {
            int i29 = (i2 + i) - 4;
            int i30 = i;
            while (i30 <= i29) {
                int i31 = bArr[i30];
                int i32 = 64;
                if (i31 == 64) {
                    if ((bArr[i30 + 1] & 192) != 0) {
                        i31 = 64;
                    }
                    int i33 = i30 + 1;
                    int i34 = i30 + 2;
                    int i35 = i30 + 3;
                    int i36 = (((((((i32 & 255) << 24) | ((bArr[i33] & 255) << 16)) | ((bArr[i34] & 255) << 8)) | (bArr[i35] & 255)) << 2) - ((this.a + i30) - i)) >>> 2;
                    int i37 = (i36 & 4194303) | (((-((i36 >>> 22) & 1)) << 22) & 1073741823) | 1073741824;
                    bArr[i30] = (byte) (i37 >> 24);
                    bArr[i33] = (byte) (i37 >>> 16);
                    bArr[i34] = (byte) (i37 >>> 8);
                    bArr[i35] = (byte) i37;
                    i30 += 4;
                }
                if (i31 == 127 && (bArr[i30 + 1] & 192) == 192) {
                    i32 = i31;
                    int i332 = i30 + 1;
                    int i342 = i30 + 2;
                    int i352 = i30 + 3;
                    int i362 = (((((((i32 & 255) << 24) | ((bArr[i332] & 255) << 16)) | ((bArr[i342] & 255) << 8)) | (bArr[i352] & 255)) << 2) - ((this.a + i30) - i)) >>> 2;
                    int i372 = (i362 & 4194303) | (((-((i362 >>> 22) & 1)) << 22) & 1073741823) | 1073741824;
                    bArr[i30] = (byte) (i372 >> 24);
                    bArr[i332] = (byte) (i372 >>> 16);
                    bArr[i342] = (byte) (i372 >>> 8);
                    bArr[i352] = (byte) i372;
                }
                i30 += 4;
            }
            int i38 = i30 - i;
            this.a += i38;
            return i38;
        }
    }
}
