package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxv  reason: default package */
/* loaded from: classes.dex */
public final class cxv extends cyl {
    public final String a;
    public final String b;
    public final lfb c;
    public final lfb d;
    public final lfb e;
    public final lfb f;
    public final String g;
    public final lfb h;
    public final int i;

    public cxv(String str, String str2, lfb lfbVar, lfb lfbVar2, lfb lfbVar3, lfb lfbVar4, String str3, lfb lfbVar5, int i) {
        this.a = str;
        this.b = str2;
        this.c = lfbVar;
        this.d = lfbVar2;
        this.e = lfbVar3;
        this.f = lfbVar4;
        this.g = str3;
        this.h = lfbVar5;
        this.i = i;
    }

    @Override // defpackage.cyl, defpackage.cyu
    public final /* bridge */ /* synthetic */ cyt b() {
        return new cxu(this);
    }

    @Override // defpackage.cyl
    public final lfb c() {
        return this.h;
    }

    @Override // defpackage.cyl
    public final lfb d() {
        return this.d;
    }

    @Override // defpackage.cyl
    public final lfb e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyl) {
            cyl cylVar = (cyl) obj;
            if (this.a.equals(cylVar.g()) && this.b.equals(cylVar.k()) && this.c.equals(cylVar.e()) && this.d.equals(cylVar.d()) && this.e.equals(cylVar.i()) && this.f.equals(cylVar.f()) && this.g.equals(cylVar.j()) && this.h.equals(cylVar.c())) {
                int i = this.i;
                int h = cylVar.h();
                if (i == 0) {
                    throw null;
                }
                if (i == h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyl
    public final lfb f() {
        return this.f;
    }

    @Override // defpackage.cyl, defpackage.cyw
    public final String g() {
        return this.a;
    }

    @Override // defpackage.cyl, defpackage.cyw
    public final int h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        int hashCode6 = this.g.hashCode();
        int hashCode7 = this.h.hashCode();
        int i = this.i;
        iin.f(i);
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ 2040732332) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ i;
    }

    @Override // defpackage.cyl
    public final lfb i() {
        return this.e;
    }

    @Override // defpackage.cyl
    public final String j() {
        return this.g;
    }

    @Override // defpackage.cyl
    public final String k() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String str3 = this.g;
        String valueOf5 = String.valueOf(this.h);
        int i = this.i;
        return "TenorGifSearchRequest{baseUrl=" + str + ", query=" + str2 + ", component=" + valueOf + ", aspectRatioRange=" + valueOf2 + ", position=" + valueOf3 + ", limit=" + valueOf4 + ", contentFilterLevel=" + str3 + ", anonId=" + valueOf5 + ", priority=" + iin.e(i) + "}";
    }
}
