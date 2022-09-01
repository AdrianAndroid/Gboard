package defpackage;

/* compiled from: PG */
/* renamed from: hds  reason: default package */
/* loaded from: classes.dex */
public final class hds {
    public final String a;
    public final llp b;

    public hds(String str, llp llpVar) {
        if (str != null) {
            this.a = str;
            if (llpVar != null) {
                this.b = llpVar;
                return;
            }
            throw new NullPointerException("Null secondaries");
        }
        throw new NullPointerException("Null primary");
    }

    public static hds a(String str, llp llpVar) {
        return new hds(str, llpVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hds) {
            hds hdsVar = (hds) obj;
            if (this.a.equals(hdsVar.a) && lre.I(this.b, hdsVar.b)) {
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
        String obj = this.b.toString();
        return "EmojiVariantData{primary=" + str + ", secondaries=" + obj + "}";
    }

    public hds() {
    }
}
