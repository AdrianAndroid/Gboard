package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lyj  reason: default package */
/* loaded from: classes.dex */
class lyj extends lyk {
    final lyf b;
    final Character c;

    public lyj(lyf lyfVar, Character ch) {
        char charValue;
        this.b = lyfVar;
        boolean z = true;
        if (ch != null && (charValue = ch.charValue()) < 128 && lyfVar.g[charValue] != -1) {
            z = false;
        }
        jdg.A(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.lyk
    public int a(byte[] bArr, CharSequence charSequence) {
        lyf lyfVar;
        jdg.u(bArr);
        CharSequence g = g(charSequence);
        if (this.b.c(g.length())) {
            int i = 0;
            int i2 = 0;
            while (i < g.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    lyfVar = this.b;
                    if (i3 >= lyfVar.e) {
                        break;
                    }
                    j <<= lyfVar.d;
                    if (i + i3 < g.length()) {
                        j |= this.b.b(g.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = lyfVar.f;
                int i6 = (i5 * 8) - (i4 * lyfVar.d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.b.e;
            }
            return i2;
        }
        throw new lyi("Invalid input length " + g.length());
    }

    @Override // defpackage.lyk
    public void b(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        jdg.E(0, i, bArr.length);
        while (i2 < i) {
            h(appendable, bArr, i2, Math.min(this.b.f, i - i2));
            i2 += this.b.f;
        }
    }

    public lyk c(lyf lyfVar) {
        return new lyj(lyfVar, null);
    }

    @Override // defpackage.lyk
    public final int d(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.lyk
    public final int e(int i) {
        lyf lyfVar = this.b;
        return lyfVar.e * mhq.v(i, lyfVar.f, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lyj) {
            lyj lyjVar = (lyj) obj;
            if (this.b.equals(lyjVar.b) && jdg.W(this.c, lyjVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lyk
    public final lyk f() {
        return this.c == null ? this : c(this.b);
    }

    @Override // defpackage.lyk
    public final CharSequence g(CharSequence charSequence) {
        jdg.u(charSequence);
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == charValue);
        return charSequence.subSequence(0, length + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Appendable appendable, byte[] bArr, int i, int i2) {
        jdg.E(i, i + i2, bArr.length);
        int i3 = 0;
        jdg.v(i2 <= this.b.f);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.b.d;
        while (i3 < i2 * 8) {
            lyf lyfVar = this.b;
            appendable.append(lyfVar.a(((int) (j >>> (i5 - i3))) & lyfVar.c));
            i3 += this.b.d;
        }
        if (this.c != null) {
            while (i3 < this.b.f * 8) {
                appendable.append(this.c.charValue());
                i3 += this.b.d;
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Arrays.hashCode(new Object[]{this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b.a);
        if (8 % this.b.d != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public lyj(String str, String str2, Character ch) {
        this(new lyf(str, str2.toCharArray()), ch);
    }
}
