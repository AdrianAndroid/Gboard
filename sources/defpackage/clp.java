package defpackage;

/* compiled from: PG */
/* renamed from: clp  reason: default package */
/* loaded from: classes.dex */
final class clp {
    static final clp a = a("", hiz.n(llp.q()));
    public final String b;
    public final hiz c;

    public clp(String str, hiz hizVar) {
        if (str != null) {
            this.b = str;
            if (hizVar != null) {
                this.c = hizVar;
                return;
            }
            throw new NullPointerException("Null predictQueriesFuture");
        }
        throw new NullPointerException("Null conversationContext");
    }

    public static clp a(String str, hiz hizVar) {
        return new clp(str, hizVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clp) {
            clp clpVar = (clp) obj;
            if (this.b.equals(clpVar.b) && this.c.equals(clpVar.c)) {
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
        return "Cache{conversationContext=" + str + ", predictQueriesFuture=" + obj + "}";
    }

    public clp() {
    }
}
