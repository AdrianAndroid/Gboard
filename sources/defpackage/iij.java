package defpackage;

/* compiled from: PG */
/* renamed from: iij  reason: default package */
/* loaded from: classes.dex */
public final class iij {
    public static final iij a = a().a();
    public final int b;
    public final boolean c;
    public final Exception d;
    public final nem e;
    public final llr f;
    public final int g;
    public final boolean h;

    public iij() {
    }

    public iij(int i, boolean z, Exception exc, nem nemVar, llr llrVar, int i2, boolean z2) {
        this.b = i;
        this.c = z;
        this.d = exc;
        this.e = nemVar;
        this.f = llrVar;
        this.g = i2;
        this.h = z2;
    }

    public static iii a() {
        iii iiiVar = new iii();
        iiiVar.c(0);
        iiiVar.e(false);
        iiiVar.b(nem.b);
        iiiVar.f(0);
        iiiVar.b = lkq.a;
        iiiVar.d(false);
        return iiiVar;
    }

    public final boolean equals(Object obj) {
        Exception exc;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iij) {
            iij iijVar = (iij) obj;
            if (this.b == iijVar.b && this.c == iijVar.c && ((exc = this.d) != null ? exc.equals(iijVar.d) : iijVar.d == null) && this.e.equals(iijVar.e) && this.f.equals(iijVar.f) && this.g == iijVar.g && this.h == iijVar.h) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.b;
        boolean z = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        int i2 = this.g;
        boolean z2 = this.h;
        return "HttpResponse{code=" + i + ", success=" + z + ", exception=" + valueOf + ", body=" + valueOf2 + ", headers=" + valueOf3 + ", totalTimeInMillis=" + i2 + ", isFromCache=" + z2 + "}";
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((this.b ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        Exception exc = this.d;
        int hashCode = (((((((i2 ^ (exc == null ? 0 : exc.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003;
        if (true == this.h) {
            i = 1231;
        }
        return hashCode ^ i;
    }
}
