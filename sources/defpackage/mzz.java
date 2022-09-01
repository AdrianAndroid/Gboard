package defpackage;

/* compiled from: PG */
/* renamed from: mzz  reason: default package */
/* loaded from: classes2.dex */
public final class mzz {
    public static final mzz a = new mzz(0, 0, 0);
    public final int b;
    public final int c;
    public final int d;

    public mzz(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final mzz a(String str) {
        oll.e(str, "str");
        int i = this.c;
        int i2 = this.d;
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '\n') {
                i++;
                i2 = 0;
            } else {
                i2++;
            }
        }
        return new mzz(this.b + str.length(), i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzz)) {
            return false;
        }
        mzz mzzVar = (mzz) obj;
        return this.b == mzzVar.b && this.c == mzzVar.c && this.d == mzzVar.d;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        return "SourcePosition(offset=" + i + ", line=" + i2 + ", column=" + i3 + ")";
    }
}
