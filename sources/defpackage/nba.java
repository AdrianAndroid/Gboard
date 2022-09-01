package defpackage;

/* compiled from: PG */
/* renamed from: nba  reason: default package */
/* loaded from: classes2.dex */
public final class nba {
    private final nap a;
    private final nap b;

    public nba(nap napVar, nap napVar2) {
        oll.e(napVar, "limit");
        this.a = napVar;
        this.b = napVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nba)) {
            return false;
        }
        nba nbaVar = (nba) obj;
        return oll.g(this.a, nbaVar.a) && oll.g(this.b, nbaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nap napVar = this.b;
        return hashCode + (napVar == null ? 0 : napVar.hashCode());
    }

    public final String toString() {
        nap napVar = this.a;
        nap napVar2 = this.b;
        return "LimitClause(limit=" + napVar + ", offset=" + napVar2 + ")";
    }
}
