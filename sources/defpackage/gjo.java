package defpackage;

/* compiled from: PG */
/* renamed from: gjo  reason: default package */
/* loaded from: classes.dex */
public final class gjo {
    private final lfb a;

    public gjo() {
    }

    public gjo(lfb lfbVar) {
        this.a = lfbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gjo)) {
            return false;
        }
        return this.a.equals(((gjo) obj).a);
    }

    public final int hashCode() {
        return 2041338095;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return "CollectionBasisResolverConditions{accountNames=" + valueOf + "}";
    }
}
