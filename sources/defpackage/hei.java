package defpackage;

/* compiled from: PG */
/* renamed from: hei  reason: default package */
/* loaded from: classes.dex */
public final class hei {
    public static final hei a = a("");
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final llp f;
    public final boolean g;

    public hei(String str, int i, int i2, int i3, llp llpVar, boolean z) {
        if (str != null) {
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = i3;
            if (llpVar != null) {
                this.f = llpVar;
                this.g = z;
                return;
            }
            throw new NullPointerException("Null variants");
        }
        throw new NullPointerException("Null emoji");
    }

    public static hei a(String str) {
        return b(str, -1, -1, -1);
    }

    public static hei b(String str, int i, int i2, int i3) {
        return c(str, i, i2, i3, llp.q(), false);
    }

    public static hei c(String str, int i, int i2, int i3, llp llpVar, boolean z) {
        return new hei(str, i, i2, i3, llpVar, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hei) {
            hei heiVar = (hei) obj;
            if (this.b.equals(heiVar.b) && this.c == heiVar.c && this.d == heiVar.d && this.e == heiVar.e && lre.I(this.f, heiVar.f) && this.g == heiVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String obj = this.f.toString();
        boolean z = this.g;
        return "EmojiViewItem{emoji=" + str + ", positionInCategory=" + i + ", categoryIndex=" + i2 + ", categorySize=" + i3 + ", variants=" + obj + ", inVariantsPopup=" + z + "}";
    }

    public hei() {
    }
}
