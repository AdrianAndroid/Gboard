package defpackage;

/* compiled from: PG */
/* renamed from: dvj  reason: default package */
/* loaded from: classes.dex */
public final class dvj {
    public static final dvj a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final int g;

    static {
        dvi a2 = a();
        a2.e("");
        a2.d("");
        a2.f("");
        a2.c(false);
        a2.a = 2;
        a = a2.a();
    }

    public dvj() {
    }

    public dvj(String str, String str2, String str3, boolean z, boolean z2, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = i;
    }

    public static dvi a() {
        dvi dviVar = new dvi();
        dviVar.b(false);
        return dviVar;
    }

    public final dvi b() {
        return new dvi(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvj) {
            dvj dvjVar = (dvj) obj;
            if (this.b.equals(dvjVar.b) && this.c.equals(dvjVar.c) && this.d.equals(dvjVar.d) && this.e == dvjVar.e && this.f == dvjVar.f) {
                int i = this.g;
                int i2 = dvjVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        int i2 = (hashCode ^ i) * 1000003;
        int i3 = this.g;
        if (i3 != 0) {
            return i2 ^ i3;
        }
        throw null;
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        int i = this.g;
        String num = i != 0 ? Integer.toString(cf.l(i)) : "null";
        return "NgaInputContext{textBefore=" + str + ", textToReplace=" + str2 + ", textAfter=" + str3 + ", replaceComposing=" + z + ", acceptsUndo=" + z2 + ", formattingType=" + num + "}";
    }
}
