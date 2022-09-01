package defpackage;

/* compiled from: PG */
/* renamed from: czc  reason: default package */
/* loaded from: classes.dex */
public final class czc implements ihs {
    public final llp a;
    private final iij b;

    public czc(llp llpVar, iij iijVar) {
        if (llpVar != null) {
            this.a = llpVar;
            if (iijVar != null) {
                this.b = iijVar;
                return;
            }
            throw new NullPointerException("Null httpResponse");
        }
        throw new NullPointerException("Null results");
    }

    public static czc b(llp llpVar, iij iijVar) {
        return new czc(llpVar, iijVar);
    }

    @Override // defpackage.ihs
    public final iij a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czc) {
            czc czcVar = (czc) obj;
            if (lre.I(this.a, czcVar.a) && this.b.equals(czcVar.b)) {
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
        return "TenorSearchTermResponse{results=" + obj + ", httpResponse=" + obj2 + "}";
    }

    public czc() {
    }
}
