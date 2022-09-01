package defpackage;

import java.util.Date;

/* compiled from: PG */
/* renamed from: jtt  reason: default package */
/* loaded from: classes.dex */
public final class jtt extends juc {
    public final jtr a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final llp h;
    public final llp i;
    public final String j;
    public final boolean k;
    public final Date l;
    public final llw m;
    public volatile transient String n;
    private volatile transient jsq r;
    private volatile transient jsr s;

    public jtt(jtr jtrVar, String str, String str2, long j, long j2, int i, int i2, llp llpVar, llp llpVar2, String str3, boolean z, Date date, llw llwVar) {
        this.a = jtrVar;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.d = j;
                this.e = j2;
                this.f = i;
                this.g = i2;
                if (llpVar != null) {
                    this.h = llpVar;
                    if (llpVar2 != null) {
                        this.i = llpVar2;
                        this.j = str3;
                        this.k = z;
                        if (date != null) {
                            this.l = date;
                            if (llwVar != null) {
                                this.m = llwVar;
                                return;
                            }
                            throw new NullPointerException("Null extraMap");
                        }
                        throw new NullPointerException("Null expiryDate");
                    }
                    throw new NullPointerException("Null validationSchemes");
                }
                throw new NullPointerException("Null downloadUrls");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null namespace");
    }

    @Override // defpackage.juc
    public final int a() {
        return this.g;
    }

    @Override // defpackage.juc
    public final int b() {
        return this.f;
    }

    @Override // defpackage.juc
    public final long c() {
        return this.e;
    }

    @Override // defpackage.juc
    public final long d() {
        return this.d;
    }

    @Override // defpackage.juc
    public final jtr e() {
        return this.a;
    }

    @Override // defpackage.juc
    public final jub f() {
        return new jub(this);
    }

    @Override // defpackage.juc
    public final llp g() {
        return this.h;
    }

    @Override // defpackage.juc
    public final llp h() {
        return this.i;
    }

    @Override // defpackage.juc
    public final String i() {
        return this.c;
    }

    @Override // defpackage.juc
    public final String j() {
        return this.b;
    }

    @Override // defpackage.juc
    public final String k() {
        return this.j;
    }

    @Override // defpackage.juc
    public final Date l() {
        return this.l;
    }

    @Override // defpackage.juc
    public final boolean m() {
        return this.k;
    }

    @Override // defpackage.juc
    public final jsq n() {
        if (this.r == null) {
            synchronized (this) {
                if (this.r == null) {
                    jyu g = jsq.g();
                    g.d(this.m);
                    this.r = g.b();
                    if (this.r == null) {
                        throw new NullPointerException("extras() cannot return null");
                    }
                }
            }
        }
        return this.r;
    }

    @Override // defpackage.juc
    public final jsr o() {
        if (this.s == null) {
            synchronized (this) {
                if (this.s == null) {
                    this.s = jsr.d(this.b, this.c);
                    if (this.s == null) {
                        throw new NullPointerException("qualifiedName() cannot return null");
                    }
                }
            }
        }
        return this.s;
    }
}
