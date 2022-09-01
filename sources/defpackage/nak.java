package defpackage;

/* compiled from: PG */
/* renamed from: nak  reason: default package */
/* loaded from: classes2.dex */
public final class nak implements nap {
    private final nap a;
    private final nbx b;

    public nak(nap napVar, nbx nbxVar) {
        oll.e(napVar, "expr");
        oll.e(nbxVar, "type");
        this.a = napVar;
        this.b = nbxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nak)) {
            return false;
        }
        nak nakVar = (nak) obj;
        return oll.g(this.a, nakVar.a) && this.b == nakVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        nap napVar = this.a;
        nbx nbxVar = this.b;
        return "CastExpression(expr=" + napVar + ", type=" + nbxVar + ")";
    }
}
