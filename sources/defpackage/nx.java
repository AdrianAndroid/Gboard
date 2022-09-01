package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: nvt  reason: default package */
/* loaded from: classes2.dex */
final class nvt implements nul {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    private static boolean c(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    @Override // defpackage.nul
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length) {
                return new String(bArr, 0);
            }
            byte b = bArr[i];
            if (b < 32 || b >= 126 || (b == 37 && i + 2 < length)) {
                break;
            }
            i++;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        int i2 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i2 < length2) {
                if (bArr[i2] == 37 && i2 + 2 < length2) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i2 + 1, 2, lel.a), 16));
                        i2 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i2]);
                i2++;
            } else {
                return new String(allocate.array(), 0, allocate.position(), lel.b);
            }
        }
    }

    @Override // defpackage.nul
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        byte[] bytes = ((String) obj).getBytes(lel.b);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i < length) {
                if (c(bytes[i])) {
                    byte[] bArr = new byte[((length - i) * 3) + i];
                    if (i != 0) {
                        System.arraycopy(bytes, 0, bArr, 0, i);
                    }
                    int i2 = i;
                    while (i < bytes.length) {
                        byte b = bytes[i];
                        if (c(b)) {
                            bArr[i2] = 37;
                            byte[] bArr2 = a;
                            bArr[i2 + 1] = bArr2[(b >> 4) & 15];
                            bArr[i2 + 2] = bArr2[b & 15];
                            i2 += 3;
                        } else {
                            bArr[i2] = b;
                            i2++;
                        }
                        i++;
                    }
                    return Arrays.copyOf(bArr, i2);
                }
                i++;
            } else {
                return bytes;
            }
        }
    }
}
