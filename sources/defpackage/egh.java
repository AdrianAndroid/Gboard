package defpackage;

/* compiled from: PG */
/* renamed from: egh  reason: default package */
/* loaded from: classes.dex */
public final class egh {
    public final cvv a;
    public final llp b;

    public egh(cvv cvvVar, llp llpVar) {
        if (cvvVar != null) {
            this.a = cvvVar;
            if (llpVar != null) {
                this.b = llpVar;
                return;
            }
            throw new NullPointerException("Null stickers");
        }
        throw new NullPointerException("Null bitmojiStatus");
    }

    public static egh a(cvv cvvVar, llp llpVar) {
        return new egh(cvvVar, llpVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egh) {
            egh eghVar = (egh) obj;
            if (this.a.equals(eghVar.a) && lre.I(this.b, eghVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "BitmojiStatusStickerTuple{bitmojiStatus=" + obj + ", stickers=" + obj2 + "}";
    }

    public egh() {
    }
}
