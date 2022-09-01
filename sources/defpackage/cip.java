package defpackage;

/* compiled from: PG */
/* renamed from: cip  reason: default package */
/* loaded from: classes.dex */
public final class cip {
    public final leq a;
    public final lfb b;
    public final ckc c;
    public final int d;

    public cip() {
    }

    public cip(leq leqVar, int i, lfb lfbVar, ckc ckcVar) {
        this.a = leqVar;
        this.d = i;
        this.b = lfbVar;
        this.c = ckcVar;
    }

    public static hfg a() {
        return new hfg(null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cip) {
            cip cipVar = (cip) obj;
            if (this.a.equals(cipVar.a)) {
                int i = this.d;
                int i2 = cipVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(cipVar.b) && this.c.equals(cipVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.d;
        if (i != 0) {
            return ((((hashCode ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.d;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        return "ContentCacheSupplierParams{cacheQueryFn=" + valueOf + ", supportedDecoderCandidateType=" + num + ", imageContentType=" + valueOf2 + ", supplierType=" + valueOf3 + "}";
    }
}
