package defpackage;

/* compiled from: PG */
/* renamed from: jrj  reason: default package */
/* loaded from: classes.dex */
public final class jrj extends jsv {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final llp h;
    public final jsq i;
    private volatile transient String j;

    public jrj(String str, String str2, int i, int i2, int i3, int i4, int i5, llp llpVar, jsq jsqVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        if (llpVar != null) {
            this.h = llpVar;
            if (jsqVar != null) {
                this.i = jsqVar;
                return;
            }
            throw new NullPointerException("Null extras");
        }
        throw new NullPointerException("Null validationSchemes");
    }

    @Override // defpackage.jsv
    public final int a() {
        return this.f;
    }

    @Override // defpackage.jsv
    public final int b() {
        return this.d;
    }

    @Override // defpackage.jsv
    public final int c() {
        return this.c;
    }

    @Override // defpackage.jsv
    public final int d() {
        return this.e;
    }

    @Override // defpackage.jsv
    public final int e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsv) {
            jsv jsvVar = (jsv) obj;
            String str = this.a;
            if (str != null ? str.equals(jsvVar.i()) : jsvVar.i() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(jsvVar.h()) : jsvVar.h() == null) {
                    if (this.c == jsvVar.c() && this.d == jsvVar.b() && this.e == jsvVar.d() && this.f == jsvVar.a() && this.g == jsvVar.e() && lre.I(this.h, jsvVar.g()) && this.i.equals(jsvVar.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jsv
    public final jsq f() {
        return this.i;
    }

    @Override // defpackage.jsv
    public final llp g() {
        return this.h;
    }

    @Override // defpackage.jsv
    public final String h() {
        return this.b;
    }

    @Override // defpackage.jsv
    public final String i() {
        return this.a;
    }

    @Override // defpackage.jsv
    public final String toString() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    lfa T = jdg.T("");
                    T.d();
                    T.b("url", this.a);
                    T.b("const", jtq.b(this.c, this.d, this.e, this.f));
                    T.b("flags", jtq.m(this.g));
                    T.b("scheme", this.b);
                    T.b("val", this.h);
                    T.f("extras", this.i.d().size());
                    this.j = T.toString();
                    if (this.j == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.j;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((((((((hashCode ^ i) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }
}
