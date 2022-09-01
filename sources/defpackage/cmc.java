package defpackage;

/* compiled from: PG */
/* renamed from: cmc  reason: default package */
/* loaded from: classes.dex */
public final class cmc {
    public final String a;
    public final lfb b;
    public final lfb c;
    public final int d;

    public cmc() {
    }

    public cmc(String str, lfb lfbVar, lfb lfbVar2, int i) {
        this.a = str;
        this.b = lfbVar;
        this.c = lfbVar2;
        this.d = i;
    }

    public static hfg a() {
        hfg hfgVar = new hfg(null);
        hfgVar.b = lfb.g(20);
        hfgVar.a = 4;
        return hfgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmc) {
            cmc cmcVar = (cmc) obj;
            if (this.a.equals(cmcVar.a) && this.b.equals(cmcVar.b) && this.c.equals(cmcVar.c)) {
                int i = this.d;
                int i2 = cmcVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int i = this.d;
        iin.f(i);
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        return "GifSearchRequest{query=" + str + ", component=" + valueOf + ", limit=" + valueOf2 + ", priority=" + iin.e(i) + "}";
    }
}
