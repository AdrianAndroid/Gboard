package defpackage;

/* compiled from: PG */
/* renamed from: jts  reason: default package */
/* loaded from: classes.dex */
public final class jts extends jtw {
    public final jrp a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    private final int g;
    private volatile transient String h;

    public jts(jrp jrpVar, int i, int i2, int i3, int i4, int i5) {
        this.a = jrpVar;
        this.g = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    @Override // defpackage.jtw
    public final int a() {
        return this.d;
    }

    @Override // defpackage.jtw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.jtw
    public final int c() {
        return this.g;
    }

    @Override // defpackage.jtw
    public final int d() {
        return this.c;
    }

    @Override // defpackage.jtw
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtw) {
            jtw jtwVar = (jtw) obj;
            if (this.a.equals(jtwVar.f()) && this.g == jtwVar.c() && this.b == jtwVar.b() && this.c == jtwVar.d() && this.d == jtwVar.a() && this.e == jtwVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jtw
    public final jrp f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    @Override // defpackage.jtw
    public final String toString() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    String b = jtq.b(this.g, this.b, this.c, this.d);
                    String m = jtq.m(this.e);
                    String obj = this.a.toString();
                    this.h = "{" + b + ", " + m + ", p " + obj + "}";
                    if (this.h == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }
}
