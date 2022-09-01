package defpackage;

/* compiled from: PG */
/* renamed from: gjp  reason: default package */
/* loaded from: classes.dex */
public final class gjp {
    public final gjo a;
    public final ieq b;

    public gjp() {
    }

    public gjp(gjo gjoVar, ieq ieqVar) {
        this.a = gjoVar;
        this.b = ieqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gjp) {
            gjp gjpVar = (gjp) obj;
            if (this.a.equals(gjpVar.a) && this.b.equals(gjpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1923371780;
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "CollectionBasisResolverHolder{conditions=" + obj + ", resolver=" + obj2 + "}";
    }
}
