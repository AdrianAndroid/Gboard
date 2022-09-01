package defpackage;

/* compiled from: PG */
/* renamed from: lyh  reason: default package */
/* loaded from: classes.dex */
final class lyh extends lyj {
    private lyh(lyf lyfVar, Character ch) {
        super(lyfVar, ch);
        jdg.v(lyfVar.b.length == 64);
    }

    @Override // defpackage.lyj, defpackage.lyk
    public final int a(byte[] bArr, CharSequence charSequence) {
        jdg.u(bArr);
        CharSequence g = g(charSequence);
        if (this.b.c(g.length())) {
            int i = 0;
            int i2 = 0;
            while (i < g.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int b = (this.b.b(g.charAt(i)) << 18) | (this.b.b(g.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (b >>> 16);
                if (i4 < g.length()) {
                    int i6 = i4 + 1;
                    int b2 = b | (this.b.b(g.charAt(i4)) << 6);
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((b2 >>> 8) & 255);
                    if (i6 < g.length()) {
                        bArr[i7] = (byte) ((b2 | this.b.b(g.charAt(i6))) & 255);
                        i = i6 + 1;
                        i2 = i7 + 1;
                    } else {
                        i = i6;
                        i2 = i7;
                    }
                } else {
                    i2 = i5;
                    i = i4;
                }
            }
            return i2;
        }
        throw new lyi("Invalid input length " + g.length());
    }

    @Override // defpackage.lyj, defpackage.lyk
    public final void b(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        jdg.E(0, i, bArr.length);
        int i3 = i;
        while (i3 >= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            appendable.append(this.b.a(i6 >>> 18));
            appendable.append(this.b.a((i6 >>> 12) & 63));
            appendable.append(this.b.a((i6 >>> 6) & 63));
            appendable.append(this.b.a(i6 & 63));
            i3 -= 3;
            i2 = i5 + 1;
        }
        if (i2 < i) {
            h(appendable, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.lyj
    public final lyk c(lyf lyfVar) {
        return new lyh(lyfVar, null);
    }

    public lyh(String str, String str2, Character ch) {
        this(new lyf(str, str2.toCharArray()), ch);
    }
}
