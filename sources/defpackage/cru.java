package defpackage;

/* compiled from: PG */
/* renamed from: cru  reason: default package */
/* loaded from: classes.dex */
public final class cru {
    public static final lex a = lex.c(',');
    public final String b;
    public final int c;
    public final int d;

    public cru() {
    }

    public cru(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public static hew a() {
        hew hewVar = new hew();
        hewVar.f(0);
        hewVar.b = 4;
        return hewVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cru) {
            cru cruVar = (cru) obj;
            if (this.b.equals(cruVar.b) && this.c == cruVar.c) {
                int i = this.d;
                int i2 = cruVar.d;
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
        int hashCode = this.b.hashCode();
        int i = this.c;
        int i2 = this.d;
        iin.f(i2);
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2;
    }

    public final String toString() {
        String str = this.b;
        int i = this.c;
        int i2 = this.d;
        return "ImageSearchRequest{query=" + str + ", page=" + i + ", priority=" + iin.e(i2) + "}";
    }
}
