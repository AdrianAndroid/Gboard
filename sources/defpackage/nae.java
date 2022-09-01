package defpackage;

/* compiled from: PG */
/* renamed from: nae  reason: default package */
/* loaded from: classes2.dex */
public final class nae implements nao {
    private final nao a;
    private final String b;

    public nae(nao naoVar, String str) {
        oll.e(naoVar, "source");
        this.a = naoVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nae)) {
            return false;
        }
        nae naeVar = (nae) obj;
        return oll.g(this.a, naeVar.a) && oll.g(this.b, naeVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        nao naoVar = this.a;
        String str = this.b;
        return "AliasedSource(source=" + naoVar + ", alias=" + str + ")";
    }
}
