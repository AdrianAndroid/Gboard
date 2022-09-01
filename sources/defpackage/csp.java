package defpackage;

/* compiled from: PG */
/* renamed from: csp  reason: default package */
/* loaded from: classes.dex */
public final class csp extends csr {
    private final Throwable a;

    public csp(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.cst
    public final int b() {
        return 2;
    }

    @Override // defpackage.csr, defpackage.cst
    public final Throwable c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cst) {
            cst cstVar = (cst) obj;
            if (cstVar.b() == 2 && this.a.equals(cstVar.c())) {
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
        return "FutureResult{failure=" + obj + "}";
    }
}
