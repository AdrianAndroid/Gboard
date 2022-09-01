package defpackage;

/* compiled from: PG */
/* renamed from: ipq  reason: default package */
/* loaded from: classes.dex */
public final class ipq {
    public final ipl a;
    public final llw b;
    public final boolean c;
    public final String d;
    public final ipe e;
    public final int f;

    public ipq() {
    }

    public ipq(ipl iplVar, llw llwVar, boolean z, String str, int i, ipe ipeVar) {
        this.a = iplVar;
        this.b = llwVar;
        this.c = z;
        this.d = str;
        this.f = i;
        this.e = ipeVar;
    }

    public static ipp a(ipl iplVar) {
        ipp ippVar = new ipp();
        if (iplVar == null) {
            throw new NullPointerException("Null tableDef");
        }
        ippVar.a = iplVar;
        ippVar.d(false);
        ippVar.c(ipe.a);
        ippVar.c = (byte) (ippVar.c | 2);
        return ippVar;
    }

    public final boolean equals(Object obj) {
        String str;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ipq) {
            ipq ipqVar = (ipq) obj;
            if (this.a.equals(ipqVar.a) && lre.z(this.b, ipqVar.b) && this.c == ipqVar.c && ((str = this.d) != null ? str.equals(ipqVar.d) : ipqVar.d == null) && ((i = this.f) != 0 ? i == ipqVar.f : ipqVar.f == 0) && this.e.equals(ipqVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        String str = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i2 = this.f;
        if (i2 != 0) {
            i = i2;
        }
        return ((((hashCode2 ^ i) * 1000003) ^ 1237) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        String str = this.d;
        int i = this.f;
        String str2 = i != 1 ? i != 2 ? "null" : "CONFLICT_REPLACE" : "CONFLICT_IGNORE";
        String valueOf3 = String.valueOf(this.e);
        return "TableConfig{tableDef=" + valueOf + ", extraFields=" + valueOf2 + ", indexQueryableFields=" + z + ", uniqueField=" + str + ", uniquePolicy=" + str2 + ", dropDataIfUpdated=false, dataPolicy=" + valueOf3 + "}";
    }
}
