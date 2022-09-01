package defpackage;

/* compiled from: PG */
/* renamed from: mhj  reason: default package */
/* loaded from: classes.dex */
public final class mhj {
    public final int a;
    private final String b;

    public mhj(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public final int a() {
        return this.a + this.b.length();
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("key", this.b);
        S.f("start", this.a);
        S.f("end", a());
        return S.toString();
    }
}
