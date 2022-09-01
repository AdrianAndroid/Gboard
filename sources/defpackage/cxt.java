package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxt  reason: default package */
/* loaded from: classes.dex */
public final class cxt extends cyi {
    public final String a;
    public final lfb b;
    public final lfb c;
    public final lfb d;
    public final lfb e;
    public final long f;
    public final int g;

    public cxt(String str, lfb lfbVar, lfb lfbVar2, lfb lfbVar3, lfb lfbVar4, long j, int i) {
        this.a = str;
        this.b = lfbVar;
        this.c = lfbVar2;
        this.d = lfbVar3;
        this.e = lfbVar4;
        this.f = j;
        this.g = i;
    }

    @Override // defpackage.cyi, defpackage.cyw
    public final long a() {
        return this.f;
    }

    @Override // defpackage.cyi, defpackage.cyu
    public final /* bridge */ /* synthetic */ cyt b() {
        return new cxs(this);
    }

    @Override // defpackage.cyi
    public final lfb c() {
        return this.c;
    }

    @Override // defpackage.cyi
    public final lfb d() {
        return this.d;
    }

    @Override // defpackage.cyi
    public final lfb e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyi) {
            cyi cyiVar = (cyi) obj;
            if (this.a.equals(cyiVar.g()) && this.b.equals(cyiVar.f()) && this.c.equals(cyiVar.c()) && this.d.equals(cyiVar.d()) && this.e.equals(cyiVar.e()) && this.f == cyiVar.a() && this.g == cyiVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cyi
    public final lfb f() {
        return this.b;
    }

    @Override // defpackage.cyi, defpackage.cyw
    public final String g() {
        return this.a;
    }

    @Override // defpackage.cyi, defpackage.cyw
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.d.hashCode();
        int hashCode5 = this.e.hashCode();
        long j = this.f;
        int i = this.g;
        iin.f(i);
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        long j = this.f;
        int i = this.g;
        return "TenorFeaturedImageRequest{baseUrl=" + str + ", query=" + valueOf + ", collection=" + valueOf2 + ", component=" + valueOf3 + ", position=" + valueOf4 + ", cacheExpirationTimeInSeconds=" + j + ", priority=" + iin.e(i) + "}";
    }
}
