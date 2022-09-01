package defpackage;

/* compiled from: PG */
/* renamed from: dnb  reason: default package */
/* loaded from: classes.dex */
public final class dnb {
    public final hqt a;
    public final boolean b;
    public boolean c;

    public dnb(hqt hqtVar, boolean z) {
        this.a = hqtVar;
        this.b = z;
        this.c = z;
    }

    public final boolean a() {
        return this.c != this.b;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("inputMethodEntry", this.a);
        S.h("isEnabled", this.b);
        S.h("isSelected", this.c);
        return S.toString();
    }
}
