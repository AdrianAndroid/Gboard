package defpackage;

/* compiled from: PG */
/* renamed from: nbc  reason: default package */
/* loaded from: classes2.dex */
public final class nbc implements nap {
    private final String a;

    public nbc(String str) {
        oll.e(str, "token");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbc) && oll.g(this.a, ((nbc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return "NumericLiteral(token=" + str + ")";
    }
}
