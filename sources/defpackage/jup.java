package defpackage;

/* compiled from: PG */
/* renamed from: jup  reason: default package */
/* loaded from: classes.dex */
public abstract class jup {
    public static juo i() {
        juo juoVar = new juo();
        juoVar.b(0);
        juoVar.c(0L);
        juoVar.e(0);
        juoVar.g(0);
        juoVar.f(0L);
        return juoVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();

    public abstract jsr f();

    public abstract jtr g();

    public abstract String h();

    public String toString() {
        lfa T = jdg.T("");
        T.d();
        T.b("name", f());
        T.b("state", jtq.l(b()));
        T.g("size", e());
        T.f("priority", a());
        T.b("last access", jtq.e(d()));
        T.b("source", h());
        T.f("validation failure", c());
        return T.toString();
    }
}
