package defpackage;

/* compiled from: PG */
/* renamed from: nfa  reason: default package */
/* loaded from: classes2.dex */
final class nfa {
    private final Object a;
    private final int b;

    public nfa(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nfa)) {
            return false;
        }
        nfa nfaVar = (nfa) obj;
        return this.a == nfaVar.a && this.b == nfaVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
