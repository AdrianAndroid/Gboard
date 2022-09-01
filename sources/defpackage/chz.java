package defpackage;

/* compiled from: PG */
/* renamed from: chz  reason: default package */
/* loaded from: classes.dex */
public final class chz extends cid {
    private final llp a;

    public chz(llp llpVar) {
        this.a = llpVar;
    }

    @Override // defpackage.cid, defpackage.cjd
    public final llp a() {
        return this.a;
    }

    @Override // defpackage.cjd
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cjd) {
            cjd cjdVar = (cjd) obj;
            if (cjdVar.b() == 2 && lre.I(this.a, cjdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        return "ExpressionCandidateResponse{dropAll=" + obj + "}";
    }
}
