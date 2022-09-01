package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: osi  reason: default package */
/* loaded from: classes2.dex */
public final class osi {
    static final ouu a = ouu.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] b = new String[64];
    static final String[] c = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = c;
            int length = strArr.length;
            if (i2 >= 256) {
                break;
            }
            strArr[i2] = oqs.i("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = b;
            strArr3[i4 | 8] = String.valueOf(strArr3[i4]).concat("|PADDED");
        }
        String[] strArr4 = b;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                int i9 = i8 | i6;
                String[] strArr5 = b;
                strArr5[i9] = strArr5[i8] + "|" + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + "|" + strArr5[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = b;
            int length2 = strArr6.length;
            if (i < 64) {
                if (strArr6[i] == null) {
                    strArr6[i] = c[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private osi() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException a(String str, Object... objArr) {
        throw new IOException(oqs.i(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IllegalArgumentException b(String str, Object... objArr) {
        throw new IllegalArgumentException(oqs.i(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String[] strArr = d;
        int length = strArr.length;
        String i3 = b2 < 10 ? strArr[b2] : oqs.i("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            if (b2 != 2 && b2 != 3) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : c[b3];
                } else if (b2 != 7 && b2 != 8) {
                    String[] strArr2 = b;
                    int length2 = strArr2.length;
                    String str2 = b3 < 64 ? strArr2[b3] : c[b3];
                    if (b2 == 5) {
                        if ((b3 & 4) != 0) {
                            str = str2.replace("HEADERS", "PUSH_PROMISE");
                        }
                        str = str2;
                    } else {
                        if (b2 == 0 && (b3 & 32) != 0) {
                            str = str2.replace("PRIORITY", "COMPRESSED");
                        }
                        str = str2;
                    }
                }
            }
            str = c[b3];
        }
        Object[] objArr = new Object[5];
        objArr[0] = true != z ? ">>" : "<<";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = i3;
        objArr[4] = str;
        return oqs.i("%s 0x%08x %5d %-13s %s", objArr);
    }
}
