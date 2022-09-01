package defpackage;

/* compiled from: PG */
/* renamed from: itu  reason: default package */
/* loaded from: classes.dex */
public final class itu {
    public String a;
    public String b;
    private leq c;
    private llp d;

    public final itv a() {
        String str;
        leq leqVar;
        llp llpVar;
        String str2 = this.a;
        if (str2 == null || (str = this.b) == null || (leqVar = this.c) == null || (llpVar = this.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" materializerId");
            }
            if (this.b == null) {
                sb.append(" collectionNamePattern");
            }
            if (this.c == null) {
                sb.append(" materializerProvider");
            }
            if (this.d == null) {
                sb.append(" componentTags");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new itv(str2, str, leqVar, llpVar);
    }

    public final void b(leq leqVar) {
        if (leqVar != null) {
            this.c = leqVar;
            return;
        }
        throw new NullPointerException("Null materializerProvider");
    }

    public final void c(llp llpVar) {
        if (llpVar != null) {
            this.d = llpVar;
            return;
        }
        throw new NullPointerException("Null componentTags");
    }

    public final void d(iiy... iiyVarArr) {
        c(llp.p(iiyVarArr));
    }
}
