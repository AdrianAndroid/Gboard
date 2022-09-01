package defpackage;

/* compiled from: PG */
/* renamed from: nan  reason: default package */
/* loaded from: classes2.dex */
public final class nan implements nbi {
    private final nbi a;
    private final nbi b;
    private final nam c;

    public nan(nbi nbiVar, nbi nbiVar2, nam namVar) {
        oll.e(nbiVar, "lhs");
        oll.e(nbiVar2, "rhs");
        oll.e(namVar, "operator");
        this.a = nbiVar;
        this.b = nbiVar2;
        this.c = namVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nan)) {
            return false;
        }
        nan nanVar = (nan) obj;
        return oll.g(this.a, nanVar.a) && oll.g(this.b, nanVar.b) && this.c == nanVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        nbi nbiVar = this.a;
        nbi nbiVar2 = this.b;
        nam namVar = this.c;
        return "CompoundSelect(lhs=" + nbiVar + ", rhs=" + nbiVar2 + ", operator=" + namVar + ")";
    }
}
