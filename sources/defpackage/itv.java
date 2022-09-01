package defpackage;

/* compiled from: PG */
/* renamed from: itv  reason: default package */
/* loaded from: classes.dex */
public final class itv {
    public final String a;
    public final String b;
    public final leq c;
    public final llp d;

    public itv() {
    }

    public itv(String str, String str2, leq leqVar, llp llpVar) {
        this.a = str;
        this.b = str2;
        this.c = leqVar;
        this.d = llpVar;
    }

    public static itu a() {
        itu ituVar = new itu();
        ituVar.c(llp.q());
        return ituVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof itv) {
            itv itvVar = (itv) obj;
            if (this.a.equals(itvVar.a) && this.b.equals(itvVar.b) && this.c.equals(itvVar.c) && lre.I(this.d, itvVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        return "MaterializerInfo{materializerId=" + str + ", collectionNamePattern=" + str2 + ", materializerProvider=" + valueOf + ", componentTags=" + valueOf2 + "}";
    }
}
