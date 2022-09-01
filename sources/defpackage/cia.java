package defpackage;

/* compiled from: PG */
/* renamed from: cia  reason: default package */
/* loaded from: classes.dex */
final class cia extends cid {
    private final cja a;

    public cia(cja cjaVar) {
        this.a = cjaVar;
    }

    @Override // defpackage.cjd
    public final int b() {
        return 3;
    }

    @Override // defpackage.cid, defpackage.cjd
    public final cja c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cjd) {
            cjd cjdVar = (cjd) obj;
            if (cjdVar.b() == 3 && this.a.equals(cjdVar.c())) {
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
        return "ExpressionCandidateResponse{success=" + obj + "}";
    }
}
