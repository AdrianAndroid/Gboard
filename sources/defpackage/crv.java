package defpackage;

/* compiled from: PG */
/* renamed from: crv  reason: default package */
/* loaded from: classes.dex */
public final class crv implements ihs {
    public final llp a;
    public final int b;
    public final int c;
    private final iij d;

    public crv() {
    }

    public crv(llp llpVar, iij iijVar, int i, int i2) {
        this.a = llpVar;
        this.d = iijVar;
        this.b = i;
        this.c = i2;
    }

    public static kgo b() {
        kgo kgoVar = new kgo();
        kgoVar.g(0);
        kgoVar.f(llp.q());
        return kgoVar;
    }

    @Override // defpackage.ihs
    public final iij a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crv) {
            crv crvVar = (crv) obj;
            if (lre.I(this.a, crvVar.a) && this.d.equals(crvVar.d) && this.b == crvVar.b && this.c == crvVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.d);
        int i = this.b;
        int i2 = this.c;
        return "ImageSearchResponse{results=" + valueOf + ", httpResponse=" + valueOf2 + ", totalResults=" + i + ", page=" + i2 + "}";
    }
}
