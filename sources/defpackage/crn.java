package defpackage;

/* compiled from: PG */
/* renamed from: crn  reason: default package */
/* loaded from: classes.dex */
public final class crn {
    public final String a;
    public final llp b;
    public final llp c;

    public crn() {
    }

    public crn(String str, llp llpVar, llp llpVar2) {
        this.a = str;
        this.b = llpVar;
        this.c = llpVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crn) {
            crn crnVar = (crn) obj;
            if (this.a.equals(crnVar.a) && lre.I(this.b, crnVar.b) && lre.I(this.c, crnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return "SponsoredData{sourceId=" + str + ", viewPixels=" + valueOf + ", sharePixels=" + valueOf2 + "}";
    }
}
