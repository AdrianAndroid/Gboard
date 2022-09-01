package defpackage;

/* compiled from: PG */
/* renamed from: jui  reason: default package */
/* loaded from: classes.dex */
public final class jui extends jup {
    public final jtr a;
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final String f;
    public final int g;
    private final jsr h;
    private volatile transient String i;

    public jui(jsr jsrVar, jtr jtrVar, long j, int i, int i2, long j2, String str, int i3) {
        this.h = jsrVar;
        this.a = jtrVar;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = str;
        this.g = i3;
    }

    @Override // defpackage.jup
    public final int a() {
        return this.c;
    }

    @Override // defpackage.jup
    public final int b() {
        return this.d;
    }

    @Override // defpackage.jup
    public final int c() {
        return this.g;
    }

    @Override // defpackage.jup
    public final long d() {
        return this.e;
    }

    @Override // defpackage.jup
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        jtr jtrVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jup) {
            jup jupVar = (jup) obj;
            if (this.h.equals(jupVar.f()) && ((jtrVar = this.a) != null ? jtrVar.equals(jupVar.g()) : jupVar.g() == null) && this.b == jupVar.e() && this.c == jupVar.a() && this.d == jupVar.b() && this.e == jupVar.d() && ((str = this.f) != null ? str.equals(jupVar.h()) : jupVar.h() == null) && this.g == jupVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jup
    public final jsr f() {
        return this.h;
    }

    @Override // defpackage.jup
    public final jtr g() {
        return this.a;
    }

    @Override // defpackage.jup
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() ^ 1000003) * 1000003;
        jtr jtrVar = this.a;
        int i = 0;
        int hashCode2 = jtrVar == null ? 0 : jtrVar.hashCode();
        long j = this.b;
        int i2 = this.c;
        int i3 = this.d;
        long j2 = this.e;
        int i4 = (((((((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return ((i4 ^ i) * 1000003) ^ this.g;
    }

    @Override // defpackage.jup
    public final String toString() {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    lfa T = jdg.T("");
                    T.d();
                    T.b("name", this.h);
                    T.b("state", jtq.l(this.d));
                    T.g("size", this.b);
                    T.f("priority", this.c);
                    T.b("last access", jtq.e(this.e));
                    T.b("source", this.f);
                    T.f("validation failure", this.g);
                    this.i = T.toString();
                    if (this.i == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.i;
    }
}
