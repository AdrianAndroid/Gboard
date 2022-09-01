package defpackage;

/* compiled from: PG */
/* renamed from: cib  reason: default package */
/* loaded from: classes.dex */
final class cib extends cid {
    private final cjc a;

    public cib(cjc cjcVar) {
        this.a = cjcVar;
    }

    @Override // defpackage.cjd
    public final int b() {
        return 4;
    }

    @Override // defpackage.cid, defpackage.cjd
    public final cjc d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cjd) {
            cjd cjdVar = (cjd) obj;
            if (cjdVar.b() == 4 && this.a.equals(cjdVar.d())) {
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
        return "ExpressionCandidateResponse{successExpressionMoment=" + obj + "}";
    }
}
