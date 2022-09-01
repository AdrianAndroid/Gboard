package defpackage;

/* compiled from: PG */
/* renamed from: hqk  reason: default package */
/* loaded from: classes.dex */
public final class hqk {
    public static final hqk a = new hqk("", 0, 0, -1, false);
    public final CharSequence b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public hqk(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        this.b = charSequence;
        if (i <= i2) {
            this.c = Math.max(i, 0);
            this.d = Math.max(i2, 0);
        } else {
            this.c = Math.max(i2, 0);
            this.d = Math.max(i, 0);
        }
        this.e = i3;
        this.f = z;
    }

    public static hqk a(hqk hqkVar) {
        return hqkVar == null ? a : hqkVar;
    }

    public final CharSequence b() {
        return this.b.subSequence(this.c, this.d);
    }

    public final CharSequence c() {
        CharSequence charSequence = this.b;
        return charSequence.subSequence(this.d, charSequence.length());
    }

    public final CharSequence d() {
        return this.b.subSequence(0, this.c);
    }

    public final boolean e() {
        return this.c < this.d;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("surroundingText", this.b);
        S.f("selectionStart", this.c);
        S.f("selectionEnd", this.d);
        S.f("offset", this.e);
        return S.toString();
    }

    public hqk(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        this.b = jbt.p(charSequence, charSequence3, jbt.q(charSequence2));
        int length = charSequence.length();
        this.c = length;
        this.d = length + charSequence3.length();
        this.e = i;
        this.f = true;
    }
}
