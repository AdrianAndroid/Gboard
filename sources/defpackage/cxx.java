package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxx  reason: default package */
/* loaded from: classes.dex */
public final class cxx extends cze {
    public final String a;
    public final String b;
    public final String c;
    public final lfb d;
    public final lfb e;
    public final int f;

    public cxx(String str, String str2, String str3, lfb lfbVar, lfb lfbVar2, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lfbVar;
        this.e = lfbVar2;
        this.f = i;
    }

    @Override // defpackage.cze, defpackage.cyu
    public final /* bridge */ /* synthetic */ cyt b() {
        return new cxw(this);
    }

    @Override // defpackage.cze
    public final lfb c() {
        return this.e;
    }

    @Override // defpackage.cze
    public final lfb d() {
        return this.d;
    }

    @Override // defpackage.cze
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cze) {
            cze czeVar = (cze) obj;
            if (this.a.equals(czeVar.g()) && this.b.equals(czeVar.f()) && this.c.equals(czeVar.e()) && this.d.equals(czeVar.d()) && this.e.equals(czeVar.c())) {
                int i = this.f;
                int h = czeVar.h();
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

    @Override // defpackage.cze
    public final String f() {
        return this.b;
    }

    @Override // defpackage.cze, defpackage.cyw
    public final String g() {
        return this.a;
    }

    @Override // defpackage.cze, defpackage.cyw
    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.d.hashCode();
        int hashCode5 = this.e.hashCode();
        int i = this.f;
        iin.f(i);
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        return "TenorStickerSearchRequest{baseUrl=" + str + ", query=" + str2 + ", contentFilterLevel=" + str3 + ", position=" + valueOf + ", anonId=" + valueOf2 + ", priority=" + iin.e(i) + "}";
    }
}
