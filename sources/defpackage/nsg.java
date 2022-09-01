package defpackage;

/* compiled from: PG */
/* renamed from: nsg  reason: default package */
/* loaded from: classes2.dex */
public final class nsg {
    public final nsa a;
    private final int b;
    private final boolean c;

    public nsg(nsa nsaVar, int i, boolean z) {
        this.a = nsaVar;
        this.b = i;
        this.c = z;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("callOptions", this.a);
        S.f("previousAttempts", this.b);
        S.h("isTransparentRetry", this.c);
        return S.toString();
    }
}
