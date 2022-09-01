package defpackage;

/* compiled from: PG */
/* renamed from: ozg  reason: default package */
/* loaded from: classes2.dex */
public final class ozg implements ozh {
    private static final int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
    private int b;

    public ozg(int i) {
        this.b = i;
    }

    @Override // defpackage.ozh
    public final int a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        ozg ozgVar = this;
        int i5 = (i + i2) - 16;
        int i6 = i;
        while (i6 <= i5) {
            int i7 = a[bArr[i6] & 31];
            int i8 = 5;
            int i9 = 0;
            while (i9 < 3) {
                if (((i7 >>> i9) & 1) == 0) {
                    i4 = i5;
                    i3 = i8;
                } else {
                    int i10 = i8 >>> 3;
                    int i11 = i8 & 7;
                    long j = 0;
                    int i12 = 0;
                    while (i12 < 6) {
                        j |= (bArr[(i6 + i10) + i12] & 255) << (i12 * 8);
                        i12++;
                        i8 = i8;
                    }
                    i3 = i8;
                    long j2 = j >>> i11;
                    if (((j2 >>> 37) & 15) == 5 && ((j2 >>> 9) & 7) == 0) {
                        long j3 = (((((((int) (j2 >>> 36)) & 1) << 20) | ((int) ((j2 >>> 13) & 1048575))) << 4) - ((ozgVar.b + i6) - i)) >>> 4;
                        i4 = i5;
                        long j4 = (((1 << i11) - 1) & j) | ((((j2 & (-77309403137L)) | ((j3 & 1048575) << 13)) | ((j3 & 1048576) << 16)) << i11);
                        for (int i13 = 0; i13 < 6; i13++) {
                            bArr[i6 + i10 + i13] = (byte) (j4 >>> (i13 * 8));
                        }
                    } else {
                        i4 = i5;
                    }
                }
                i9++;
                i8 = i3 + 41;
                ozgVar = this;
                i5 = i4;
            }
            i6 += 16;
            ozgVar = this;
        }
        int i14 = i6 - i;
        this.b += i14;
        return i14;
    }
}
