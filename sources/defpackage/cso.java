package defpackage;

/* compiled from: PG */
/* renamed from: cso  reason: default package */
/* loaded from: classes.dex */
public final class cso extends csr {
    private final Throwable a;

    public cso(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.csr, defpackage.cst
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.cst
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cst) {
            cst cstVar = (cst) obj;
            if (cstVar.b() == 3 && this.a.equals(cstVar.a())) {
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
        return "FutureResult{cancellation=" + obj + "}";
    }
}
