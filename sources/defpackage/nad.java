package defpackage;

/* compiled from: PG */
/* renamed from: nad  reason: default package */
/* loaded from: classes2.dex */
public final class nad {
    private final nap a;
    private final String b;

    public nad(nap napVar, String str) {
        oll.e(napVar, "expression");
        this.a = napVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nad)) {
            return false;
        }
        nad nadVar = (nad) obj;
        return oll.g(this.a, nadVar.a) && oll.g(this.b, nadVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        nap napVar = this.a;
        String str = this.b;
        return "AliasedExpression(expression=" + napVar + ", alias=" + str + ")";
    }
}
