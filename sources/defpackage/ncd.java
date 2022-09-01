package defpackage;

/* compiled from: PG */
/* renamed from: ncd  reason: default package */
/* loaded from: classes2.dex */
public final class ncd implements nbk {
    private final nao a;
    private final nap b;

    public ncd(nao naoVar, nap napVar) {
        oll.e(naoVar, "source");
        oll.e(napVar, "where");
        this.a = naoVar;
        this.b = napVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncd)) {
            return false;
        }
        ncd ncdVar = (ncd) obj;
        return oll.g(this.a, ncdVar.a) && oll.g(this.b, ncdVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        nao naoVar = this.a;
        nap napVar = this.b;
        return "WhereClause(source=" + naoVar + ", where=" + napVar + ")";
    }
}
