package defpackage;

/* compiled from: PG */
/* renamed from: nax  reason: default package */
/* loaded from: classes2.dex */
public final class nax extends ndb {
    private final nap a;

    public nax(nap napVar) {
        oll.e(napVar, "predicate");
        this.a = napVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nax) && oll.g(this.a, ((nax) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        nap napVar = this.a;
        return "OnConstraint(predicate=" + napVar + ")";
    }
}
