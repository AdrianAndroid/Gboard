package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: aia  reason: default package */
/* loaded from: classes.dex */
public abstract class aia {
    public float a(String str, float f) {
        throw null;
    }

    public int b(String str, int i) {
        throw null;
    }

    public long c(String str, long j) {
        throw null;
    }

    public String d(String str, String str2) {
        throw null;
    }

    public Set e(String str, Set set) {
        throw null;
    }

    public void f(String str, boolean z) {
        throw null;
    }

    public void g(String str, float f) {
        throw null;
    }

    public void h(String str, int i) {
        throw null;
    }

    public void i(String str, long j) {
        throw null;
    }

    public void j(String str, String str2) {
        throw null;
    }

    public void k(String str, Set set) {
        throw null;
    }

    public boolean l(String str, boolean z) {
        throw null;
    }

    public final float m(int i, float f) {
        return a(p(i), f);
    }

    public final int n(int i, int i2) {
        return b(p(i), i2);
    }

    public final long o(int i, long j) {
        return c(p(i), j);
    }

    public abstract String p(int i);

    public final void q(int i, boolean z) {
        f(p(i), z);
    }

    public final void r(int i, float f) {
        g(p(i), f);
    }

    public final void s(int i, int i2) {
        h(p(i), i2);
    }

    public final void t(int i, long j) {
        i(p(i), j);
    }

    public final void u(int i, String str) {
        j(p(i), str);
    }

    public final void v(int i) {
        w(p(i));
    }

    public abstract void w(String str);

    public final boolean x(int i, boolean z) {
        return l(p(i), z);
    }

    public final String y(int i) {
        return d(p(i), "");
    }
}
