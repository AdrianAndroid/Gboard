package defpackage;

/* compiled from: PG */
/* renamed from: ncb  reason: default package */
/* loaded from: classes2.dex */
public final class ncb implements nap {
    private final nap a;
    private final ncc b;

    public ncb(nap napVar, ncc nccVar) {
        oll.e(napVar, "expr");
        oll.e(nccVar, "operator");
        this.a = napVar;
        this.b = nccVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncb)) {
            return false;
        }
        ncb ncbVar = (ncb) obj;
        return oll.g(this.a, ncbVar.a) && this.b == ncbVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        nap napVar = this.a;
        ncc nccVar = this.b;
        return "UnaryExpression(expr=" + napVar + ", operator=" + nccVar + ")";
    }
}
