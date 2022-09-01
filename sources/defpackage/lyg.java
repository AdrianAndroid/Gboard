package defpackage;

/* compiled from: PG */
/* renamed from: lyg  reason: default package */
/* loaded from: classes.dex */
final class lyg extends lyj {
    final char[] a = new char[512];

    public lyg(lyf lyfVar) {
        super(lyfVar, null);
        jdg.v(lyfVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = lyfVar.a(i >>> 4);
            this.a[i | 256] = lyfVar.a(i & 15);
        }
    }

    @Override // defpackage.lyj, defpackage.lyk
    public final int a(byte[] bArr, CharSequence charSequence) {
        jdg.u(bArr);
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.b.b(charSequence.charAt(i)) << 4) | this.b.b(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new lyi("Invalid input length " + charSequence.length());
    }

    @Override // defpackage.lyj, defpackage.lyk
    public final void b(Appendable appendable, byte[] bArr, int i) {
        jdg.E(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.a[i3]);
            appendable.append(this.a[i3 | 256]);
        }
    }

    @Override // defpackage.lyj
    public final lyk c(lyf lyfVar) {
        return new lyg(lyfVar);
    }
}
