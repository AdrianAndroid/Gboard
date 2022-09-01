package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: lgo  reason: default package */
/* loaded from: classes.dex */
public final class lgo {
    static final lgb a = jdg.o(new jez());
    static final lgh b = new lgl();
    private static final Logger q = Logger.getLogger(lgo.class.getName());
    lil g;
    lho h;
    lho i;
    lep l;
    lep m;
    lij n;
    lgh o;
    boolean c = true;
    int d = -1;
    long e = -1;
    long f = -1;
    long j = -1;
    long k = -1;
    final lgb p = a;

    static {
        new lgp();
    }

    private lgo() {
    }

    public static lgo b() {
        return new lgo();
    }

    public final lgk a() {
        boolean z = false;
        if (this.g == null) {
            if (this.f == -1) {
                z = true;
            }
            jdg.G(z, "maximumWeight requires weigher");
        } else if (this.c) {
            if (this.f != -1) {
                z = true;
            }
            jdg.G(z, "weigher requires maximumWeight");
        } else if (this.f == -1) {
            q.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
        jdg.G(true, "refreshAfterWrite requires a LoadingCache");
        return new lhj(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lho c() {
        return (lho) jdg.U(this.h, lho.STRONG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lho d() {
        return (lho) jdg.U(this.i, lho.STRONG);
    }

    public final void e(int i) {
        int i2 = this.d;
        boolean z = true;
        jdg.H(i2 == -1, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z = false;
        }
        jdg.v(z);
        this.d = i;
    }

    public final void f(long j, TimeUnit timeUnit) {
        long j2 = this.j;
        boolean z = true;
        jdg.I(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        if (j < 0) {
            z = false;
        }
        jdg.M(z, j, timeUnit);
        this.j = timeUnit.toNanos(j);
    }

    public final void g(long j) {
        long j2 = this.e;
        boolean z = false;
        jdg.I(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f;
        jdg.I(j3 == -1, "maximum weight was already set to %s", j3);
        if (this.g == null) {
            z = true;
        }
        jdg.G(z, "maximum size can not be combined with weigher");
        jdg.w(true, "maximum size must not be negative");
        this.e = j;
    }

    public final void h(lij lijVar) {
        jdg.F(this.n == null);
        jdg.u(lijVar);
        this.n = lijVar;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        int i = this.d;
        if (i != -1) {
            S.f("concurrencyLevel", i);
        }
        long j = this.e;
        if (j != -1) {
            S.g("maximumSize", j);
        }
        long j2 = this.f;
        if (j2 != -1) {
            S.g("maximumWeight", j2);
        }
        if (this.j != -1) {
            S.b("expireAfterWrite", this.j + "ns");
        }
        if (this.k != -1) {
            S.b("expireAfterAccess", this.k + "ns");
        }
        lho lhoVar = this.h;
        if (lhoVar != null) {
            S.b("keyStrength", jdg.X(lhoVar.toString()));
        }
        lho lhoVar2 = this.i;
        if (lhoVar2 != null) {
            S.b("valueStrength", jdg.X(lhoVar2.toString()));
        }
        if (this.l != null) {
            S.a("keyEquivalence");
        }
        if (this.m != null) {
            S.a("valueEquivalence");
        }
        if (this.n != null) {
            S.a("removalListener");
        }
        return S.toString();
    }
}
