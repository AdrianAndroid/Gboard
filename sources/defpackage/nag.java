package defpackage;

/* compiled from: PG */
/* renamed from: nag  reason: default package */
/* loaded from: classes2.dex */
public final class nag implements nap {
    private final nap a;
    private final nap b;
    private final nah c;

    public nag(nap napVar, nap napVar2, nah nahVar) {
        oll.e(napVar, "lhs");
        oll.e(napVar2, "rhs");
        oll.e(nahVar, "operator");
        this.a = napVar;
        this.b = napVar2;
        this.c = nahVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nag)) {
            return false;
        }
        nag nagVar = (nag) obj;
        return oll.g(this.a, nagVar.a) && oll.g(this.b, nagVar.b) && this.c == nagVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        nap napVar = this.a;
        nap napVar2 = this.b;
        nah nahVar = this.c;
        return "BinaryExpression(lhs=" + napVar + ", rhs=" + napVar2 + ", operator=" + nahVar + ")";
    }
}
