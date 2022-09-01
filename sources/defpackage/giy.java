package defpackage;

/* compiled from: PG */
/* renamed from: giy  reason: default package */
/* loaded from: classes.dex */
public final class giy {
    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static byte[] a(CharSequence charSequence) {
        byte[] bArr = new byte[(charSequence.length() + 1) / 2];
        if (charSequence.length() == 0) {
            return bArr;
        }
        bArr[0] = 0;
        int length = charSequence.length() % 2;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            jdg.w((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f') || (charAt >= 'A' && charAt <= 'F'), "string contains non-hex chars");
            if (length % 2 == 0) {
                bArr[length >> 1] = (byte) (b(charAt) << 4);
            } else {
                int i2 = length >> 1;
                bArr[i2] = (byte) (bArr[i2] + ((byte) b(charAt)));
            }
            length++;
        }
        return bArr;
    }

    private static int b(char c) {
        return (c < '0' || c > '9') ? (c < 'a' || c > 'f') ? c - '7' : c - 'W' : c - '0';
    }
}
