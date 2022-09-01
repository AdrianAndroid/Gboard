package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nau  reason: default package */
/* loaded from: classes2.dex */
public final class nau implements nbj {
    private final nbk a;
    private final List b;

    public nau(nbk nbkVar, List list) {
        oll.e(nbkVar, "source");
        oll.e(list, "expressions");
        this.a = nbkVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nau)) {
            return false;
        }
        nau nauVar = (nau) obj;
        return oll.g(this.a, nauVar.a) && oll.g(this.b, nauVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        nbk nbkVar = this.a;
        List list = this.b;
        return "GroupByClause(source=" + nbkVar + ", expressions=" + list + ")";
    }
}
