package defpackage;

/* compiled from: PG */
/* renamed from: nud  reason: default package */
/* loaded from: classes2.dex */
public abstract class nud extends ntu {
    public abstract String b();

    public abstract void c();

    public abstract void d();

    public nus e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("policy", b());
        S.f("priority", 5);
        S.h("available", true);
        return S.toString();
    }
}
