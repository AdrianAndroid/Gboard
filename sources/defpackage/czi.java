package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: czi  reason: default package */
/* loaded from: classes.dex */
public final class czi implements cyw {
    static final iil a = iil.r;
    private static final Integer b = 30;
    private final String c;
    private final long d;
    private final lfb e;
    private final int f;

    public czi() {
    }

    public czi(String str, long j, lfb lfbVar, int i) {
        this.c = str;
        this.d = j;
        this.e = lfbVar;
        this.f = i;
    }

    public static czh f() {
        czh czhVar = new czh(null);
        String str = (String) cyj.j.c();
        if (str != null) {
            czhVar.a = str;
            czhVar.b = ((Long) cyj.p.c()).longValue();
            czhVar.d = (byte) 1;
            czhVar.c = lfb.g(b);
            czhVar.e = 4;
            return czhVar;
        }
        throw new NullPointerException("Null baseUrl");
    }

    @Override // defpackage.cyw
    public final long a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czi) {
            czi cziVar = (czi) obj;
            if (this.c.equals(cziVar.c) && this.d == cziVar.d && this.e.equals(cziVar.e)) {
                int i = this.f;
                int i2 = cziVar.f;
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

    @Override // defpackage.cyw
    public final String g() {
        return this.c;
    }

    @Override // defpackage.cyw
    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        long j = this.d;
        int hashCode2 = this.e.hashCode();
        int i = this.f;
        iin.f(i);
        return ((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ hashCode2) * 1000003) ^ i;
    }

    @Override // defpackage.cyw
    public final /* synthetic */ Uri m() {
        return dip.q(this);
    }

    @Override // defpackage.cyw
    public final /* synthetic */ iih n() {
        return dip.r(this);
    }

    @Override // defpackage.cyw
    public final iil o() {
        return a;
    }

    @Override // defpackage.cyw
    public final llw p() {
        cyx a2 = cyy.a(true);
        a2.b("limit", this.e);
        a2.e(cyy.b());
        return a2.l();
    }

    public final String toString() {
        String str = this.c;
        long j = this.d;
        String valueOf = String.valueOf(this.e);
        int i = this.f;
        return "TenorTrendingSearchRequest{baseUrl=" + str + ", cacheExpirationTimeInSeconds=" + j + ", limit=" + valueOf + ", priority=" + iin.e(i) + "}";
    }
}
