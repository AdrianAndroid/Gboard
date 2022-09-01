package defpackage;

/* compiled from: PG */
/* renamed from: ebt  reason: default package */
/* loaded from: classes.dex */
final class ebt {
    public static final ebt a = a("", llp.q());
    public final String b;
    public final llp c;

    public ebt(String str, llp llpVar) {
        this.b = str;
        if (llpVar != null) {
            this.c = llpVar;
            return;
        }
        throw new NullPointerException("Null predictions");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ebt a(String str, llp llpVar) {
        return new ebt(str, llpVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebt) {
            ebt ebtVar = (ebt) obj;
            if (this.b.equals(ebtVar.b) && lre.I(this.c, ebtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String obj = this.c.toString();
        return "CachedPredictions{chat=" + str + ", predictions=" + obj + "}";
    }

    public ebt() {
    }
}
