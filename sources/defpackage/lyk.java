package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: lyk  reason: default package */
/* loaded from: classes.dex */
public abstract class lyk {
    public static final lyk d = new lyh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final lyk e = new lyh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final lyk f = new lyg(new lyf("base16()", "0123456789ABCDEF".toCharArray()));

    static {
        new lyj("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new lyj("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void b(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract lyk f();

    public CharSequence g(CharSequence charSequence) {
        throw null;
    }

    public final String i(byte[] bArr) {
        int length = bArr.length;
        jdg.E(0, length, length);
        StringBuilder sb = new StringBuilder(e(length));
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] j(CharSequence charSequence) {
        try {
            CharSequence g = g(charSequence);
            int d2 = d(g.length());
            byte[] bArr = new byte[d2];
            int a = a(bArr, g);
            if (a == d2) {
                return bArr;
            }
            byte[] bArr2 = new byte[a];
            System.arraycopy(bArr, 0, bArr2, 0, a);
            return bArr2;
        } catch (lyi e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
