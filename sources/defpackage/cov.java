package defpackage;

/* compiled from: PG */
/* renamed from: cov  reason: default package */
/* loaded from: classes.dex */
public final class cov {
    public final coq a;
    public final llp b;
    public final cox c;
    public final llp d;

    public cov() {
    }

    public cov(coq coqVar, llp llpVar, cox coxVar, llp llpVar2) {
        this.a = coqVar;
        this.b = llpVar;
        this.c = coxVar;
        this.d = llpVar2;
    }

    public static emv a() {
        emv emvVar = new emv();
        emvVar.j(cox.a);
        return emvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cov) {
            cov covVar = (cov) obj;
            coq coqVar = this.a;
            if (coqVar != null ? coqVar.equals(covVar.a) : covVar.a == null) {
                if (lre.I(this.b, covVar.b) && this.c.equals(covVar.c) && lre.I(this.d, covVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        return "ElementGroup{start=" + valueOf + ", middle=" + valueOf2 + ", initialSelectedPosition=" + valueOf3 + ", end=" + valueOf4 + "}";
    }

    public final int hashCode() {
        coq coqVar = this.a;
        return (((((((coqVar == null ? 0 : coqVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
