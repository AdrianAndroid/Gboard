package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: juw  reason: default package */
/* loaded from: classes.dex */
public abstract class juw {
    private static final long a = TimeUnit.DAYS.toMillis(1);

    public static juv n() {
        juv juvVar = new juv();
        juvVar.l(llp.q());
        juvVar.d(0);
        juvVar.j(System.currentTimeMillis());
        juvVar.h(true);
        juvVar.f(false);
        juvVar.g(false);
        juvVar.e(false);
        juvVar.k(a);
        juvVar.i(2);
        return juvVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    public abstract jtr e();

    public abstract llp f();

    public abstract String g();

    public abstract String h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public String m() {
        throw null;
    }

    public String toString() {
        lfa T = jdg.T("");
        T.d();
        T.b("id", h());
        T.b("params", m());
        T.b("urls", f());
        T.f("prio", a());
        T.b("ttl", d() == 0 ? "never" : jtq.e(c() + d()));
        return T.toString();
    }
}
