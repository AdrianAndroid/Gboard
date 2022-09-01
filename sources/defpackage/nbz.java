package defpackage;

/* compiled from: PG */
/* renamed from: nbz  reason: default package */
/* loaded from: classes2.dex */
public final class nbz implements nap {
    private final String a;

    public nbz(String str) {
        oll.e(str, "value");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbz) && oll.g(this.a, ((nbz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return "StringLiteral(value=" + str + ")";
    }
}
