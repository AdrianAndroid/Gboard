package defpackage;

/* compiled from: PG */
/* renamed from: jvw  reason: default package */
/* loaded from: classes.dex */
public abstract class jvw {
    public static jvv g() {
        jvv jvvVar = new jvv();
        jvvVar.e(0L);
        jvvVar.b(0);
        jvvVar.d(1);
        jvvVar.a = jrp.a;
        return jvvVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract jrp d();

    public abstract jsr e();

    public int f() {
        throw null;
    }

    public String toString() {
        String obj = e().toString();
        long c = c();
        return "{" + obj + ": " + c + " bytes}";
    }
}
