package defpackage;

/* compiled from: PG */
/* renamed from: juj  reason: default package */
/* loaded from: classes.dex */
public final class juj extends juw {
    public final String a;
    public final jtr b;
    public final int c;
    public final llp d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final String k;
    public final long l;
    public volatile transient jsr m;
    private volatile transient String n;
    private volatile transient String o;

    public juj(String str, jtr jtrVar, int i, llp llpVar, long j, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str2, long j2) {
        if (str != null) {
            this.a = str;
            this.b = jtrVar;
            this.c = i;
            if (llpVar != null) {
                this.d = llpVar;
                this.e = j;
                this.f = z;
                this.g = z2;
                this.h = z3;
                this.i = z4;
                this.j = i2;
                if (str2 != null) {
                    this.k = str2;
                    this.l = j2;
                    return;
                }
                throw new NullPointerException("Null filePath");
            }
            throw new NullPointerException("Null urls");
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.juw
    public final int a() {
        return this.c;
    }

    @Override // defpackage.juw
    public final int b() {
        return this.j;
    }

    @Override // defpackage.juw
    public final long c() {
        return this.e;
    }

    @Override // defpackage.juw
    public final long d() {
        return this.l;
    }

    @Override // defpackage.juw
    public final jtr e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        jtr jtrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof juw) {
            juw juwVar = (juw) obj;
            if (this.a.equals(juwVar.h()) && ((jtrVar = this.b) != null ? jtrVar.equals(juwVar.e()) : juwVar.e() == null) && this.c == juwVar.a() && lre.I(this.d, juwVar.f()) && this.e == juwVar.c() && this.f == juwVar.l() && this.g == juwVar.j() && this.h == juwVar.k() && this.i == juwVar.i() && this.j == juwVar.b() && this.k.equals(juwVar.g()) && this.l == juwVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.juw
    public final llp f() {
        return this.d;
    }

    @Override // defpackage.juw
    public final String g() {
        return this.k;
    }

    @Override // defpackage.juw
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        jtr jtrVar = this.b;
        int hashCode2 = jtrVar == null ? 0 : jtrVar.hashCode();
        int i = this.c;
        int hashCode3 = this.d.hashCode();
        long j = this.e;
        int i2 = (((((((hashCode ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i3 = 1237;
        int i4 = (((((i2 ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        if (true == this.i) {
            i3 = 1231;
        }
        int i5 = this.j;
        int hashCode4 = this.k.hashCode();
        long j2 = this.l;
        return ((((((i4 ^ i3) * 1000003) ^ i5) * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // defpackage.juw
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.juw
    public final boolean j() {
        return this.g;
    }

    @Override // defpackage.juw
    public final boolean k() {
        return this.h;
    }

    @Override // defpackage.juw
    public final boolean l() {
        return this.f;
    }

    @Override // defpackage.juw
    public final String m() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    String c = jtq.c(this.f, this.g, this.h, this.i);
                    String m = jtq.m(this.j);
                    this.n = "{" + c + ", " + m + "}";
                    if (this.n == null) {
                        throw new NullPointerException("paramsString() cannot return null");
                    }
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.juw
    public final String toString() {
        if (this.o == null) {
            synchronized (this) {
                if (this.o == null) {
                    lfa T = jdg.T("");
                    T.d();
                    T.b("id", this.a);
                    T.b("params", m());
                    T.b("urls", this.d);
                    T.f("prio", this.c);
                    long j = this.l;
                    T.b("ttl", j == 0 ? "never" : jtq.e(this.e + j));
                    this.o = T.toString();
                    if (this.o == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.o;
    }
}
