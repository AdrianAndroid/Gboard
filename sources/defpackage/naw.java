package defpackage;

/* compiled from: PG */
/* renamed from: naw  reason: default package */
/* loaded from: classes2.dex */
public final class naw implements nao {
    private final nao a;
    private final nao b;
    private final naz c;
    private final ndb d;

    public naw(nao naoVar, nao naoVar2, naz nazVar, ndb ndbVar, byte[] bArr, byte[] bArr2) {
        oll.e(naoVar, "lhs");
        oll.e(naoVar2, "rhs");
        oll.e(nazVar, "operator");
        this.a = naoVar;
        this.b = naoVar2;
        this.c = nazVar;
        this.d = ndbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof naw)) {
            return false;
        }
        naw nawVar = (naw) obj;
        return oll.g(this.a, nawVar.a) && oll.g(this.b, nawVar.b) && this.c == nawVar.c && oll.g(this.d, nawVar.d);
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        ndb ndbVar = this.d;
        return hashCode + (ndbVar == null ? 0 : ndbVar.hashCode());
    }

    public final String toString() {
        nao naoVar = this.a;
        nao naoVar2 = this.b;
        naz nazVar = this.c;
        ndb ndbVar = this.d;
        return "JoinClause(lhs=" + naoVar + ", rhs=" + naoVar2 + ", operator=" + nazVar + ", constraint=" + ndbVar + ")";
    }
}
