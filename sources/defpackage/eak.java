package defpackage;

/* compiled from: PG */
/* renamed from: eak  reason: default package */
/* loaded from: classes.dex */
public final class eak {
    public final llp a;
    public final llp b;
    public final llp c;

    public eak(llp llpVar, llp llpVar2, llp llpVar3) {
        if (llpVar != null) {
            this.a = llpVar;
            if (llpVar2 != null) {
                this.b = llpVar2;
                if (llpVar3 != null) {
                    this.c = llpVar3;
                    return;
                }
                throw new NullPointerException("Null curatedResults");
            }
            throw new NullPointerException("Null contextualResults");
        }
        throw new NullPointerException("Null recents");
    }

    public final boolean a() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eak) {
            eak eakVar = (eak) obj;
            if (lre.I(this.a, eakVar.a) && lre.I(this.b, eakVar.b) && lre.I(this.c, eakVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        String obj3 = this.c.toString();
        return "ZeroStateResults{recents=" + obj + ", contextualResults=" + obj2 + ", curatedResults=" + obj3 + "}";
    }

    public eak() {
    }
}
