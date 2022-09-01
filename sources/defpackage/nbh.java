package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nbh  reason: default package */
/* loaded from: classes2.dex */
public final class nbh implements nbi {
    private final List a;
    private final nbj b;

    public nbh(List list, nbj nbjVar) {
        oll.e(list, "select");
        this.a = list;
        this.b = nbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbh)) {
            return false;
        }
        nbh nbhVar = (nbh) obj;
        return oll.g(this.a, nbhVar.a) && oll.g(this.b, nbhVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nbj nbjVar = this.b;
        return hashCode + (nbjVar == null ? 0 : nbjVar.hashCode());
    }

    public final String toString() {
        List list = this.a;
        nbj nbjVar = this.b;
        return "SelectCore(select=" + list + ", from=" + nbjVar + ")";
    }
}
