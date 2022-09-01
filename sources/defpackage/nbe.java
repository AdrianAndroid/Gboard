package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: nbe  reason: default package */
/* loaded from: classes2.dex */
public final class nbe {
    private final List a;

    public nbe(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbe) && oll.g(this.a, ((nbe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        List list = this.a;
        return "OrderByClause(expressions=" + list + ")";
    }
}
