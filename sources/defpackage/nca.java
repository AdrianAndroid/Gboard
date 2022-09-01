package defpackage;

/* compiled from: PG */
/* renamed from: nca  reason: default package */
/* loaded from: classes2.dex */
public final class nca implements nao {
    private final String a;
    private final String b;

    public nca(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nca)) {
            return false;
        }
        nca ncaVar = (nca) obj;
        return oll.g(this.a, ncaVar.a) && oll.g(this.b, ncaVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return nxp.w(nxp.z(new String[]{this.a, this.b}), ".", null, null, null, 62);
    }
}
