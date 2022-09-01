package defpackage;

/* compiled from: PG */
/* renamed from: cnz  reason: default package */
/* loaded from: classes.dex */
public final class cnz {
    public final String a;
    public final mba b;

    public cnz() {
    }

    public cnz(String str, mba mbaVar) {
        this.a = str;
        this.b = mbaVar;
    }

    public static djc a() {
        djc djcVar = new djc();
        djcVar.c(mba.UNKNOWN);
        return djcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cnz) {
            cnz cnzVar = (cnz) obj;
            if (this.a.equals(cnzVar.a) && this.b.equals(cnzVar.b)) {
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
        String valueOf = String.valueOf(this.b);
        return "GifCategory{categoryName=" + str + ", source=" + valueOf + "}";
    }
}
