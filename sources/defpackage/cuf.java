package defpackage;

/* compiled from: PG */
/* renamed from: cuf  reason: default package */
/* loaded from: classes.dex */
public final class cuf {
    public final String a;
    public final Float b;

    public cuf(String str, Float f) {
        if (str != null) {
            this.a = str;
            this.b = f;
            return;
        }
        throw new NullPointerException("Null packId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuf) {
            cuf cufVar = (cuf) obj;
            if (this.a.equals(cufVar.a) && this.b.equals(cufVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        Float f = this.b;
        return "PackIdScore{packId=" + str + ", score=" + f + "}";
    }

    public cuf() {
    }
}
