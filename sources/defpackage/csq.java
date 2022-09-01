package defpackage;

/* compiled from: PG */
/* renamed from: csq  reason: default package */
/* loaded from: classes.dex */
public final class csq extends csr {
    private final Object a;

    public csq(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cst
    public final int b() {
        return 1;
    }

    @Override // defpackage.csr, defpackage.cst
    public final Object d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cst) {
            cst cstVar = (cst) obj;
            if (cstVar.b() == 1 && this.a.equals(cstVar.d())) {
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
        return "FutureResult{success=" + obj + "}";
    }
}
