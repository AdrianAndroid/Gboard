package defpackage;

/* compiled from: PG */
/* renamed from: coo  reason: default package */
/* loaded from: classes.dex */
public final class coo {
    public final String a;
    public final String b;
    public final int c;

    public coo() {
    }

    public coo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public static con a() {
        con conVar = new con();
        conVar.c(0);
        return conVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof coo) {
            coo cooVar = (coo) obj;
            if (this.a.equals(cooVar.a) && this.b.equals(cooVar.b) && this.c == cooVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        return "TextInfo{text=" + str + ", contentDescription=" + str2 + ", drawableRes=" + i + "}";
    }
}
