package defpackage;

/* compiled from: PG */
/* renamed from: nav  reason: default package */
/* loaded from: classes2.dex */
public final class nav implements nbj {
    private final nau a;
    private final nap b;

    public nav(nau nauVar, nap napVar) {
        oll.e(nauVar, "source");
        oll.e(napVar, "having");
        this.a = nauVar;
        this.b = napVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nav)) {
            return false;
        }
        nav navVar = (nav) obj;
        return oll.g(this.a, navVar.a) && oll.g(this.b, navVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        nau nauVar = this.a;
        nap napVar = this.b;
        return "HavingClause(source=" + nauVar + ", having=" + napVar + ")";
    }
}
