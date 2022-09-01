package defpackage;

/* compiled from: PG */
/* renamed from: egd  reason: default package */
/* loaded from: classes.dex */
public final class egd {
    public final cvv a;
    public final llp b;

    public egd(cvv cvvVar, llp llpVar) {
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

    public static egd a(cvv cvvVar, llp llpVar) {
        return new egd(cvvVar, llpVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egd) {
            egd egdVar = (egd) obj;
            if (this.a.equals(egdVar.a) && lre.I(this.b, egdVar.b)) {
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

    public egd() {
    }
}
