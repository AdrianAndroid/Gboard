package defpackage;

/* compiled from: PG */
/* renamed from: nbg  reason: default package */
/* loaded from: classes2.dex */
public final class nbg implements nap, nao {
    private final nbi a;
    private final nbe b;
    private final nba c;

    public nbg(nbi nbiVar, nbe nbeVar, nba nbaVar) {
        oll.e(nbiVar, "source");
        this.a = nbiVar;
        this.b = nbeVar;
        this.c = nbaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbg)) {
            return false;
        }
        nbg nbgVar = (nbg) obj;
        return oll.g(this.a, nbgVar.a) && oll.g(this.b, nbgVar.b) && oll.g(this.c, nbgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nbe nbeVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (nbeVar == null ? 0 : nbeVar.hashCode())) * 31;
        nba nbaVar = this.c;
        if (nbaVar != null) {
            i = nbaVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        nbi nbiVar = this.a;
        nbe nbeVar = this.b;
        nba nbaVar = this.c;
        return "SelectClause(source=" + nbiVar + ", orderBy=" + nbeVar + ", limit=" + nbaVar + ")";
    }
}
