package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxz  reason: default package */
/* loaded from: classes.dex */
public final class cxz extends czg {
    public final String a;
    public final String b;
    public final long c;
    public final lfb d;
    public final int e;

    public cxz(String str, String str2, long j, lfb lfbVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = lfbVar;
        this.e = i;
    }

    @Override // defpackage.czg, defpackage.cyw
    public final long a() {
        return this.c;
    }

    @Override // defpackage.czg, defpackage.cyu
    public final /* bridge */ /* synthetic */ cyt b() {
        return new cxy(this);
    }

    @Override // defpackage.czg
    public final lfb c() {
        return this.d;
    }

    @Override // defpackage.czg
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czg) {
            czg czgVar = (czg) obj;
            if (this.a.equals(czgVar.g()) && this.b.equals(czgVar.d()) && this.c == czgVar.a() && this.d.equals(czgVar.c()) && this.e == czgVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.czg, defpackage.cyw
    public final String g() {
        return this.a;
    }

    @Override // defpackage.czg, defpackage.cyw
    public final int h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        long j = this.c;
        int hashCode3 = this.d.hashCode();
        int i = this.e;
        iin.f(i);
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ hashCode3) * 1000003) ^ i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        String valueOf = String.valueOf(this.d);
        int i = this.e;
        return "TenorTrendingGifRequest{baseUrl=" + str + ", contentFilterLevel=" + str2 + ", cacheExpirationTimeInSeconds=" + j + ", position=" + valueOf + ", priority=" + iin.e(i) + "}";
    }
}
