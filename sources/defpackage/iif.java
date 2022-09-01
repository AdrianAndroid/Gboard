package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* renamed from: iif  reason: default package */
/* loaded from: classes.dex */
public final class iif {
    public final opq a;
    public final long b;

    public iif() {
    }

    public iif(opq opqVar, long j) {
        this.a = opqVar;
        this.b = j;
    }

    public static iif a() {
        iie iieVar = new iie();
        iieVar.b(Duration.ofDays(1L).getSeconds());
        return iieVar.a();
    }

    public final iie b() {
        return new iie(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iif) {
            iif iifVar = (iif) obj;
            opq opqVar = this.a;
            if (opqVar != null ? opqVar.equals(iifVar.a) : iifVar.a == null) {
                if (this.b == iifVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        opq opqVar = this.a;
        int hashCode = opqVar == null ? 0 : opqVar.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        return "HttpClientOptions{cookieJar=" + valueOf + ", cacheExpirationTimeInSeconds=" + j + "}";
    }
}
