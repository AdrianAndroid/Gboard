package defpackage;

/* compiled from: PG */
/* renamed from: jtw  reason: default package */
/* loaded from: classes.dex */
public abstract class jtw {
    public static final jtw f = g(jrp.a, 0, 0, 0, 0, 0);

    public static jtw g(jrp jrpVar, int i, int i2, int i3, int i4, int i5) {
        return new jts(jrpVar, i, i2, i3, i4, i5);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract jrp f();

    public final boolean h(boolean z) {
        int c = c();
        if (c != 1) {
            if (c == 2) {
                return false;
            }
            return z;
        }
        return true;
    }

    public String toString() {
        String b = jtq.b(c(), b(), d(), a());
        String m = jtq.m(e());
        String obj = f().toString();
        return "{" + b + ", " + m + ", p " + obj + "}";
    }
}
